package search

import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.queryparser.classic.QueryParser
import org.apache.lucene.search.BooleanClause
import org.apache.lucene.search.BooleanQuery

class CustomBooleanQueryBuilder {

    companion object {

        fun buildQuery(fields: Array<String>, analyzer: Analyzer, queryText: String): BooleanQuery {

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

    }

}