# RESULTS

Run performed on the downloaded collection with modifications (without performing tuple deduplication):
- Deleted all unparsable files
- Decompressed archives
- Assign extensions to unknown files

Analyzer used: StandardAnalyzer with [NLTK stoplist](https://gist.github.com/sebleier/554280) 

For large files reservoir sampling has been used to not exceed Lucene limitations


### SYNTHETIC QUERIES

| PAPER RUN NAME | RUN NAME                              |   NDCG@5 |   NDCG@10 |   MAP@5 |   MAP@10 |
|----------------|---------------------------------------|----------|-----------|---------|----------|
| TF-IDF         | CS-META+EXTRACTED-SYN-QUERIES-trec    |   0.5576 |    0.5705 |  0.3059 |   0.4085 |
| TF-IDF [m]     | CS-META-ONLY-SYN-QUERIES-trec         |   0.5408 |    0.5446 |  0.296  |   0.387  |
| TF-IDF [d]     | CS-EXTRACTED-ONLY-SYN-QUERIES-trec    |   0.1022 |    0.1177 |  0.0507 |   0.0668 |
| BM25F          | BM25-META+EXTRACTED-SYN-QUERIES-trec  |   0.5682 |    0.5849 |  0.3188 |   0.4143 |
| BM25F [m]      | BM25-META-ONLY-SYN-QUERIES-trec       |   0.6122 |    0.6125 |  0.3432 |   0.4467 |
| BM25F [d]      | BM25-EXTRACTED-ONLY-SYN-QUERIES-trec  |   0.1434 |    0.1569 |  0.0805 |   0.0958 |
| LMD            | LMD-META+EXTRACTED-SYN-QUERIES-trec   |   0.2979 |    0.3149 |  0.1790 |   0.2118 |
| LMD [m]        | LMD-META-ONLY-SYN-QUERIES-trec        |   0.5305 |    0.5348 |  0.3090 |   0.3892 |
| LMD [d]        | LMD-EXTRACTED-ONLY-SYN-QUERIES-trec   |   0.1322 |    0.1498 |  0.0764 |   0.0904 |


### TREC QUERIES

| PAPER RUN NAME | RUN NAME                              |   NDCG@5 |   NDCG@10 |   MAP@5 |   MAP@10 |
|----------------|---------------------------------------|----------|-----------|---------|----------|
| TF-IDF         | CS-META+EXTRACTED-TREC-QUERIES-trec   |   0.3983 |    0.4305 |  0.2343 |   0.3203 |
| TF-IDF [m]     | CS-META-ONLY-TREC-QUERIES-trec        |   0.3990 |    0.4241 |  0.2317 |   0.3151 |
| TF-IDF [d]     | CS-EXTRACTED-ONLY-TREC-QUERIES-trec   |   0.0630 |    0.0703 |  0.0386 |   0.0446 |
| BM25F          | BM25-META+EXTRACTED-TREC-QUERIES-trec |   0.3722 |    0.4128 |  0.2129 |   0.2941 |
| BM25F [m]      | BM25-META-ONLY-TREC-QUERIES-trec      |   0.4201 |    0.4539 |  0.2419 |   0.3334 |
| BM25F [d]      | BM25-EXTRACTED-ONLY-TREC-QUERIES-trec |   0.0835 |    0.0892 |  0.0533 |   0.0610 |
| LMD            | LMD-META+EXTRACTED-TREC-QUERIES-trec  |   0.1402 |    0.1690 |  0.0809 |   0.1048 |
| LMD [m]        | LMD-META-ONLY-TREC-QUERIES-trec       |   0.3951 |    0.4239 |  0.2377 |   0.3138 |
| LMD [d]        | LMD-EXTRACTED-ONLY-TREC-QUERIES-trec  |   0.0683 |    0.0801 |  0.0428 |   0.0518 |


### ALL QUERIES

| PAPER RUN NAME | RUN NAME                              |   NDCG@5 |   NDCG@10 |   MAP@5 |   MAP@10 |
|----------------|---------------------------------------|----------|-----------|---------|----------|
| TF-IDF         | CS-META+EXTRACTED-ALL-QUERIES-trec    |   0.4761 |    0.4989 |  0.2693 |   0.3634 |
| TF-IDF [m]     | CS-META-ONLY-ALL-QUERIES-trec         |   0.4697 |    0.4842 |  0.2638 |   0.3510 |
| TF-IDF [d]     | CS-EXTRACTED-ONLY-ALL-QUERIES-trec    |   0.0822 |    0.0935 |  0.0445 |   0.0555 |
| BM25F          | BM25-META+EXTRACTED-ALL-QUERIES-trec  |   0.4673 |    0.4966 |  0.2642 |   0.3525 |
| BM25F [m]      | BM25-META-ONLY-ALL-QUERIES-trec       |   0.5160 |    0.5330 |  0.2924 |   0.3899 |
| BM25F [d]      | BM25-EXTRACTED-ONLY-ALL-QUERIES-trec  |   0.1128 |    0.1223 |  0.0666 |   0.0780 |
| LMD            | LMD-META+EXTRACTED-ALL-QUERIES-trec   |   0.2173 |    0.2403 |  0.1289 |   0.1571 |
| LMD [m]        | LMD-META-ONLY-ALL-QUERIES-trec        |   0.4626 |    0.4792 |  0.2733 |   0.3514 |
| LMD [d]        | LMD-EXTRACTED-ONLY-ALL-QUERIES-trec   |   0.0996 |    0.1142 |  0.0592 |   0.0707 |
