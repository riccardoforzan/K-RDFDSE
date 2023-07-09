# RESULTS

Run performed on the downloaded collection as it is:
- without considering the almost 700 non parsable files
- without performing tuple deduplication

Analyzer used: StandardAnalyzer without any stoplist


### SYNTHETIC QUERIES

| PAPER RUN NAME | RUN NAME                        | NDCG@5  | NDCG@10 | MAP@5   | MAP@10  |
|----------------|---------------------------------|---------|---------|---------|---------|
| TF-IDF         | CS-META+EXTRACTED-SYN-QUERIES   | 0.5625	 | 0.5750  | 0.3118	 | 0.4139  |
| TF-IDF [m]     | CS-META-ONLY-SYN-QUERIES        | 0.5408	 | 0.5443  | 0.2960	 | 0.3869  |
| TF-IDF [d]     | CS-EXTRACTED-ONLY-SYN-QUERIES   | 0.1569	 | 0.1673  | 0.0816	 | 0.0957  |
| BM25F          | BM25-META+EXTRACTED-SYN-QUERIES | 0.4676	 | 0.5030  | 0.2609	 | 0.3438  |
| BM25F [m]      | BM25-META-ONLY-SYN-QUERIES      | 0.6130	 | 0.6128  | 0.3434	 | 0.4469  |
| BM25F [d]      | BM25-EXTRACTED-ONLY-SYN-QUERIES | 0.1650	 | 0.1825  | 0.0887	 | 0.1101  |
| LMD            | LMD-META+EXTRACTED-SYN-QUERIES  | 0.3581	 | 0.3801  | 0.2101	 | 0.2542  |
| LMD [m]        | LMD-META-ONLY-SYN-QUERIES       | 0.5317	 | 0.5357  | 0.3093	 | 0.3897  |
| LMD [d]        | LMD-EXTRACTED-ONLY-SYN-QUERIES  | 0.2016	 | 0.2166  | 0.1056	 | 0.1310  |

### TREC QUERIES

| PAPER RUN NAME | RUN NAME                         | NDCG@5  | NDCG@10 | MAP@5   | MAP@10  |
|----------------|----------------------------------|---------|---------|---------|---------|
| TF-IDF         | CS-META+EXTRACTED-TREC-QUERIES   | 0.3925  | 0.4364	| 0.2286  | 0.3219	|
| TF-IDF [m]     | CS-META-ONLY-TREC-QUERIES        | 0.3983  | 0.4236	| 0.2314  | 0.3147	|
| TF-IDF [d]     | CS-EXTRACTED-ONLY-TREC-QUERIES   | 0.1050  | 0.1108	| 0.0545  | 0.0655	|
| BM25F          | BM25-META+EXTRACTED-TREC-QUERIES | 0.2878  | 0.3289	| 0.1588  | 0.2176	|
| BM25F [m]      | BM25-META-ONLY-TREC-QUERIES      | 0.4201  | 0.4535	| 0.2417  | 0.3331	|
| BM25F [d]      | BM25-EXTRACTED-ONLY-TREC-QUERIES | 0.0977  | 0.1055	| 0.0613  | 0.0719	|
| LMD            | LMD-META+EXTRACTED-TREC-QUERIES  | 0.1886  | 0.2198	| 0.1021  | 0.1337	|
| LMD [m]        | LMD-META-ONLY-TREC-QUERIES       | 0.3951  | 0.4239	| 0.2377  | 0.3138	|
| LMD [d]        | LMD-EXTRACTED-ONLY-TREC-QUERIES  | 0.1001  | 0.1167	| 0.0556  | 0.0700	|

### ALL QUERIES

| PAPER RUN NAME | RUN NAME                        | NDCG@5  | NDCG@10 | MAP@5   | MAP@10  |
|----------------|---------------------------------|---------|---------|---------|---------|
| TF-IDF         | CS-META+EXTRACTED-ALL-QUERIES   | 0.4756	 | 0.5042  | 0.2692	 | 0.3669  |
| TF-IDF [m]     | CS-META-ONLY-ALL-QUERIES        | 0.4694	 | 0.4839  | 0.2636	 | 0.3507  |
| TF-IDF [d]     | CS-EXTRACTED-ONLY-ALL-QUERIES   | 0.1304	 | 0.1384  | 0.0677	 | 0.0802  |
| BM25F          | BM25-META+EXTRACTED-ALL-QUERIES | 0.3757	 | 0.4140  | 0.2087	 | 0.2793  |
| BM25F [m]      | BM25-META-ONLY-ALL-QUERIES      | 0.5164	 | 0.5330  | 0.2925	 | 0.3899  |
| BM25F [d]      | BM25-EXTRACTED-ONLY-ALL-QUERIES | 0.1306	 | 0.1431  | 0.0747	 | 0.0906  |
| LMD            | LMD-META+EXTRACTED-ALL-QUERIES  | 0.2715	 | 0.2982  | 0.1549	 | 0.1926  |
| LMD [m]        | LMD-META-ONLY-ALL-QUERIES       | 0.4632	 | 0.4797  | 0.2734	 | 0.3517  |
| LMD [d]        | LMD-EXTRACTED-ONLY-ALL-QUERIES  | 0.1497	 | 0.1655  | 0.0801	 | 0.0998  |