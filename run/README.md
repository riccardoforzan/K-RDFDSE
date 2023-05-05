# Results of the runs

It seems that it's necessary to set the correct similarity that will be used at query time, while indexing.
This is due to the fact that some metrics are computed while indexing, and then are used at retrieve time while
assigning the score to documents [StackOverflow Source](https://stackoverflow.com/questions/64755809/why-do-we-set-the-similarity-function-at-index-time-in-lucene)


- Dataset version:
  - V1: raw downloaded dataset
  - V2: cleaned up dataset (removed HTML / unusable files, manual parsing of zip)
  - V3: cleaned up dataset + cleanup of extracted data

- Similarity used:
  - TF-IDF (`org.apache.lucene.search.similarities.ClassicSimilarity`)
  - BM25 (`org.apache.lucene.search.similarities.BM25Similarity`)
  - LMDirichletSimilarity (`org.apache.lucene.search.similarities.LMDirichletSimilarity`)

