# RESULTS

Run performed on the downloaded collection with modifications (without performing tuple deduplication):
- Deleted all unparsable files
- Decompressed archives
- Assign extensions to unknown files

Analyzer used: StandardAnalyzer without any stoplist


### SYNTHETIC QUERIES

| PAPER RUN NAME | RUN NAME                                 | NDCG@5  | NDCG@10 | MAP@5   | MAP@10 |
|----------------|------------------------------------------|---------|---------|---------|--------|
| TF-IDF         | CS-META+EXTRACTED-SYN-QUERIES-trec.txt   | 0.5616  | 0.5755  | 0.3114  | 0.4142 |
| TF-IDF [m]     | CS-META-ONLY-SYN-QUERIES-trec.txt        | 0.5408  | 0.5443  | 0.2960  | 0.3869 |
| TF-IDF [d]     | CS-EXTRACTED-ONLY-SYN-QUERIES-trec.txt   | 0.1524  | 0.1637  | 0.0796  | 0.0934 |
| BM25F          | BM25-META+EXTRACTED-SYN-QUERIES-trec.txt | 0.4633  | 0.4981  | 0.2587  | 0.3397 |
| BM25F [m]      | BM25-META-ONLY-SYN-QUERIES-trec.txt      | 0.6130  | 0.6128  | 0.3434  | 0.4469 |
| BM25F [d]      | BM25-EXTRACTED-ONLY-SYN-QUERIES-trec.txt | 0.1552  | 0.1739  | 0.0832  | 0.1052 |
| LMD            | LMD-META+EXTRACTED-SYN-QUERIES-trec.txt  | 0.3608  | 0.3783  | 0.2102  | 0.2529 |
| LMD [m]        | LMD-META-ONLY-SYN-QUERIES-trec.txt       | 0.5317  | 0.5357  | 0.3093  | 0.3897 |
| LMD [d]        | LMD-EXTRACTED-ONLY-SYN-QUERIES-trec.txt  | 0.1989  | 0.2102  | 0.1028  | 0.1270 |

### TREC QUERIES

| PAPER RUN NAME | RUN NAME                                  | NDCG@5  | NDCG@10 | MAP@5  | MAP@10 |
|----------------|-------------------------------------------|---------|---------|--------|--------|
| TF-IDF         | CS-META+EXTRACTED-TREC-QUERIES-trec.txt   | 0.3925  | 0.4359  | 0.2286 | 0.3213 |
| TF-IDF [m]     | CS-META-ONLY-TREC-QUERIES-trec.txt        | 0.3983  | 0.4236  | 0.2314 | 0.3147 |
| TF-IDF [d]     | CS-EXTRACTED-ONLY-TREC-QUERIES-trec.txt   | 0.1047  | 0.1100  | 0.0543 | 0.0650 |
| BM25F          | BM25-META+EXTRACTED-TREC-QUERIES-trec.txt | 0.2814  | 0.3255  | 0.1538 | 0.2135 |
| BM25F [m]      | BM25-META-ONLY-TREC-QUERIES-trec.txt      | 0.4201  | 0.4535  | 0.2417 | 0.3331 |
| BM25F [d]      | BM25-EXTRACTED-ONLY-TREC-QUERIES-trec.txt | 0.0987  | 0.1043  | 0.0621 | 0.0716 |
| LMD            | LMD-META+EXTRACTED-TREC-QUERIES-trec.txt  | 0.1979  | 0.2244  | 0.1100 | 0.1399 |
| LMD [m]        | LMD-META-ONLY-TREC-QUERIES-trec.txt       | 0.3951  | 0.4239  | 0.2377 | 0.3138 |
| LMD [d]        | LMD-EXTRACTED-ONLY-TREC-QUERIES-trec.txt  | 0.0994  | 0.1166  | 0.0580 | 0.0726 |


### ALL QUERIES

| PAPER RUN NAME | RUN NAME                                 | NDCG@5  | NDCG@10 | MAP@5  | MAP@10 |
|----------------|------------------------------------------|---------|---------|--------|--------|
| TF-IDF         | CS-META+EXTRACTED-ALL-QUERIES-trec.txt   | 0.4751  | 0.5042  | 0.2691 | 0.3667 |
| TF-IDF [m]     | CS-META-ONLY-ALL-QUERIES-trec.txt        | 0.4694  | 0.4839  | 0.2636 | 0.3507 |
| TF-IDF [d]     | CS-EXTRACTED-ONLY-ALL-QUERIES-trec.txt   | 0.1280  | 0.1362  | 0.0667 | 0.0789 |
| BM25F          | BM25-META+EXTRACTED-ALL-QUERIES-trec.txt | 0.3704  | 0.4099  | 0.2051 | 0.2752 |
| BM25F [m]      | BM25-META-ONLY-ALL-QUERIES-trec.txt      | 0.5164  | 0.5330  | 0.2925 | 0.3899 |
| BM25F [d]      | BM25-EXTRACTED-ONLY-ALL-QUERIES-trec.txt | 0.1263  | 0.1383  | 0.0724 | 0.0880 |
| LMD            | LMD-META+EXTRACTED-ALL-QUERIES-trec.txt  | 0.2775  | 0.2997  | 0.1590 | 0.1952 |
| LMD [m]        | LMD-META-ONLY-ALL-QUERIES-trec.txt       | 0.4632  | 0.4797  | 0.2734 | 0.3517 |
| LMD [d]        | LMD-EXTRACTED-ONLY-ALL-QUERIES-trec.txt  | 0.1481  | 0.1624  | 0.0799 | 0.0992 |
