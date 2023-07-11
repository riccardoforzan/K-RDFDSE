package search

import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser
import org.apache.lucene.queryparser.classic.QueryParser
import org.apache.lucene.search.BooleanClause
import org.apache.lucene.search.BooleanQuery
import org.apache.lucene.search.Query

class CustomQueryBuilder {

    companion object {

        fun buildBooleanQuery(fields: Array<String>, analyzer: Analyzer, queryText: String): Query {
            val booleanQueryBuilder = BooleanQuery.Builder()
            for (field in fields) {
                booleanQueryBuilder.add(
                    BooleanClause(
                        QueryParser(field, analyzer).parse(
                            QueryParser.escape(queryText)
                        ), BooleanClause.Occur.SHOULD
                    )
                )
            }
            return booleanQueryBuilder.build()
        }

        fun buildMultiFieldQuery(fields: Array<String>, analyzer: Analyzer, queryText: String): Query {
            val queryParser = MultiFieldQueryParser(fields, analyzer)
            return queryParser.parse(QueryParser.escape(queryText))
        }


    }

}