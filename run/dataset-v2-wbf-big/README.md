# RESULTS

Run performed on the downloaded collection with modifications (without performing tuple deduplication):
- Deleted all unparsable files
- Decompressed archives
- Assign extensions to unknown files

Analyzer used: StandardAnalyzer with [Big stoplist](https://www.kaggle.com/datasets/rowhitswami/stopwords) 

For large files reservoir sampling has been used to not exceed Lucene limitations

### SYNTHETIC QUERIES
| PAPER RUN NAME | RUN NAME                              |   NDCG@5 |   NDCG@10 |   MAP@5 |   MAP@10 |
|----------------|---------------------------------------|----------|-----------|---------|----------|
| TF-IDF         | CS-META+EXTRACTED-SYN-QUERIES-trec    |   0.5790 |    0.5905 |  0.3217 |   0.4255 |
| TF-IDF [m]     | CS-META-ONLY-SYN-QUERIES-trec         |   0.5578 |    0.5675 |  0.3053 |   0.4076 |
| TF-IDF [d]     | CS-EXTRACTED-ONLY-SYN-QUERIES-trec    |   0.1086 |    0.1198 |  0.0543 |   0.0692 |
| BM25F          | BM25-META+EXTRACTED-SYN-QUERIES-trec  |   0.5951 |    0.6125 |  0.3363 |   0.4410 |
| BM25F [m]      | BM25-META-ONLY-SYN-QUERIES-trec       |   0.6116 |    0.6122 |  0.3413 |   0.4454 |
| BM25F [d]      | BM25-EXTRACTED-ONLY-SYN-QUERIES-trec  |   0.1532 |    0.1636 |  0.0890 |   0.1030 |
| LMD            | LMD-META+EXTRACTED-SYN-QUERIES-trec   |   0.2899 |    0.3076 |  0.1715 |   0.2045 |
| LMD [m]        | LMD-META-ONLY-SYN-QUERIES-trec        |   0.5298 |    0.5331 |  0.3085 |   0.3899 |
| LMD [d]        | LMD-EXTRACTED-ONLY-SYN-QUERIES-trec   |   0.1399 |    0.1530 |  0.0834 |   0.0968 |


### TREC QUERIES
| PAPER RUN NAME | RUN NAME                              |   NDCG@5 |   NDCG@10 |   MAP@5 |   MAP@10 |
|----------------|---------------------------------------|----------|-----------|---------|----------|
| TF-IDF         | CS-META+EXTRACTED-TREC-QUERIES-trec   |   0.4098 |    0.4506 |  0.2413 |   0.3371 |
| TF-IDF [m]     | CS-META-ONLY-TREC-QUERIES-trec        |   0.4063 |    0.4444 |  0.2364 |   0.3293 |
| TF-IDF [d]     | CS-EXTRACTED-ONLY-TREC-QUERIES-trec   |   0.0656 |    0.0724 |  0.0398 |   0.0459 |
| BM25F          | BM25-META+EXTRACTED-TREC-QUERIES-trec |   0.3980 |    0.4327 |  0.2287 |   0.3096 |
| BM25F [m]      | BM25-META-ONLY-TREC-QUERIES-trec      |   0.4256 |    0.4600 |  0.2459 |   0.3396 |
| BM25F [d]      | BM25-EXTRACTED-ONLY-TREC-QUERIES-trec |   0.0886 |    0.0973 |  0.0576 |   0.0663 |
| LMD            | LMD-META+EXTRACTED-TREC-QUERIES-trec  |   0.1439 |    0.1655 |  0.0827 |   0.1029 |
| LMD [m]        | LMD-META-ONLY-TREC-QUERIES-trec       |   0.3974 |    0.4270 |  0.2401 |   0.3182 |
| LMD [d]        | LMD-EXTRACTED-ONLY-TREC-QUERIES-trec  |   0.0725 |    0.0842 |  0.0463 |   0.0551 |


### ALL QUERIES

| PAPER RUN NAME | RUN NAME                              |   NDCG@5 | NDCG@10 | MAP@5  |   MAP@10 |
|----------------|---------------------------------------|----------|---------|--------|----------|
| TF-IDF         | CS-META+EXTRACTED-ALL-QUERIES-trec    |   0.4925 | 0.5190  | 0.2806 |   0.3803 |
| TF-IDF [m]     | CS-META-ONLY-ALL-QUERIES-trec         |   0.4819 | 0.5058  | 0.2708 |   0.3684 |
| TF-IDF [d]     | CS-EXTRACTED-ONLY-ALL-QUERIES-trec    |   0.0866 | 0.0956  | 0.0469 |   0.0573 |
| BM25F          | BM25-META+EXTRACTED-ALL-QUERIES-trec  |   0.4936 | 0.5198  | 0.2806 |   0.3731 |
| BM25F [m]      | BM25-META-ONLY-ALL-QUERIES-trec       |   0.5184 | 0.5359  | 0.2935 |   0.3923 |
| BM25F [d]      | BM25-EXTRACTED-ONLY-ALL-QUERIES-trec  |   0.1202 | 0.1297  | 0.0730 |   0.0842 |
| LMD            | LMD-META+EXTRACTED-ALL-QUERIES-trec   |   0.2153 | 0.2350  | 0.1261 |   0.1526 |
| LMD [m]        | LMD-META-ONLY-ALL-QUERIES-trec        |   0.4634 | 0.4800  | 0.2743 |   0.3540 |
| LMD [d]        | LMD-EXTRACTED-ONLY-ALL-QUERIES-trec   |   0.1055 | 0.1178  | 0.0645 |   0.0755 |
