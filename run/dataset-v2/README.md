# RESULTS

Run performed on the downloaded collection with modifications (without performing tuple deduplication):
- Deleted all unparsable files
- Decompressed archives
- Assign extensions to unknown files

Analyzer used: StandardAnalyzer without any stoplist


### SYNTHETIC QUERIES

| PAPER RUN NAME | RUN NAME                        | NDCG@5  | NDCG@10 | MAP@5   | MAP@10  | MAP    | NDCG    | RECALL |
|----------------|---------------------------------|---------|---------|---------|---------|--------|---------|--------|
| TF-IDF        |CS-META+EXTRACTED-SYN-QUERIES-trec.txt           | 0.5109	 | 0.6664  | 0.5616	 | 0.5755  | 0.3114	| 0.4142  | 0.8478 |
| TF-IDF [m]    |CS-META-ONLY-SYN-QUERIES-trec.txt                | 0.4723	 | 0.6269  | 0.5408	 | 0.5443  | 0.2960	| 0.3869  | 0.7941 |
| TF-IDF [d]    |CS-EXTRACTED-ONLY-SYN-QUERIES-trec.txt           | 0.1223	 | 0.2364  | 0.1524	 | 0.1637  | 0.0796	| 0.0934  | 0.3746 |
| BM25F         |BM25-META+EXTRACTED-SYN-QUERIES-trec.txt         | 0.4425	 | 0.6192  | 0.4633	 | 0.4981  | 0.2587	| 0.3397  | 0.8522 |
| BM25F [m]     |BM25-META-ONLY-SYN-QUERIES-trec.txt              | 0.5333	 | 0.6853  | 0.6130	 | 0.6128  | 0.3434	| 0.4469  | 0.8280 |
| BM25F [d]     |BM25-EXTRACTED-ONLY-SYN-QUERIES-trec.txt         | 0.1291	 | 0.2376  | 0.1552	 | 0.1739  | 0.0832	| 0.1052  | 0.3828 |
| LMD           |LMD-META+EXTRACTED-SYN-QUERIES-trec.txt          | 0.3127	 | 0.4871  | 0.3608	 | 0.3783  | 0.2102	| 0.2529  | 0.6898 |
| LMD [m]       |LMD-META-ONLY-SYN-QUERIES-trec.txt               | 0.4683	 | 0.6267  | 0.5317	 | 0.5357  | 0.3093	| 0.3897  | 0.7863 |
| LMD [d]       |LMD-EXTRACTED-ONLY-SYN-QUERIES-trec.txt          | 0.1550	 | 0.2827  | 0.1989	 | 0.2102  | 0.1028	| 0.1270  | 0.4424 |

### TREC QUERIES

| PAPER RUN NAME | RUN NAME                        | NDCG@5  | NDCG@10 | MAP@5   | MAP@10  | MAP    | NDCG    | RECALL |
|----------------|---------------------------------|---------|---------|---------|---------|--------|---------|--------|
| TF-IDF        |CS-META+EXTRACTED-TREC-QUERIES-trec.txt          | 0.3922	 | 0.5263  | 0.3925	 | 0.4359  | 0.2286	| 0.3213  | 0.7735 |
| TF-IDF [m]    |CS-META-ONLY-TREC-QUERIES-trec.txt               | 0.3780	 | 0.5045  | 0.3983	 | 0.4236  | 0.2314	| 0.3147  | 0.7138 |
| TF-IDF [d]    |CS-EXTRACTED-ONLY-TREC-QUERIES-trec.txt          | 0.0831	 | 0.1660  | 0.1047	 | 0.1100  | 0.0543	| 0.0650  | 0.2953 |
| BM25F         |BM25-META+EXTRACTED-TREC-QUERIES-trec.txt        | 0.2997	 | 0.4683  | 0.2814	 | 0.3255  | 0.1538	| 0.2135  | 0.8150 |
| BM25F [m]     |BM25-META-ONLY-TREC-QUERIES-trec.txt             | 0.4035	 | 0.5376  | 0.4201	 | 0.4535  | 0.2417	| 0.3331  | 0.7560 |
| BM25F [d]     |BM25-EXTRACTED-ONLY-TREC-QUERIES-trec.txt        | 0.0850	 | 0.1552  | 0.0987	 | 0.1043  | 0.0621	| 0.0716  | 0.2870 |
| LMD           |LMD-META+EXTRACTED-TREC-QUERIES-trec.txt         | 0.1929	 | 0.3559  | 0.1979	 | 0.2244  | 0.1100	| 0.1399  | 0.6727 |
| LMD [m]       |LMD-META-ONLY-TREC-QUERIES-trec.txt              | 0.3800	 | 0.5247  | 0.3951	 | 0.4239  | 0.2377	| 0.3138  | 0.7549 |
| LMD [d]       |LMD-EXTRACTED-ONLY-TREC-QUERIES-trec.txt         | 0.0913	 | 0.1797  | 0.0994	 | 0.1166  | 0.0580	| 0.0726  | 0.3401 |


### ALL QUERIES

| PAPER RUN NAME | RUN NAME                        | NDCG@5  | NDCG@10 | MAP@5   | MAP@10  | MAP    | NDCG    | RECALL |
|----------------|---------------------------------|---------|---------|---------|---------|--------|---------|--------|
| TF-IDF        |CS-META+EXTRACTED-ALL-QUERIES-trec.txt           | 0.4502	 | 0.5948  | 0.4751	 | 0.5042  | 0.2691	| 0.3667  | 0.8098 |
| TF-IDF [m]    |CS-META-ONLY-ALL-QUERIES-trec.txt                | 0.4250	 | 0.5655  | 0.4694	 | 0.4839  | 0.2636	| 0.3507  | 0.7539 |
| TF-IDF [d]    |CS-EXTRACTED-ONLY-ALL-QUERIES-trec.txt           | 0.1023	 | 0.2004  | 0.1280	 | 0.1362  | 0.0667	| 0.0789  | 0.3341 |
| BM25F         |BM25-META+EXTRACTED-ALL-QUERIES-trec.txt         | 0.3695	 | 0.5421  | 0.3704	 | 0.4099  | 0.2051	| 0.2752  | 0.8332 |
| BM25F [m]     |BM25-META-ONLY-ALL-QUERIES-trec.txt              | 0.4682	 | 0.6113  | 0.5164	 | 0.5330  | 0.2925	| 0.3899  | 0.7919 |
| BM25F [d]     |BM25-EXTRACTED-ONLY-ALL-QUERIES-trec.txt         | 0.1066	 | 0.1955  | 0.1263	 | 0.1383  | 0.0724	| 0.0880  | 0.3338 |
| LMD           |LMD-META+EXTRACTED-ALL-QUERIES-trec.txt          | 0.2515	 | 0.4200  | 0.2775	 | 0.2997  | 0.1590	| 0.1952  | 0.6811 |
| LMD [m]       |LMD-META-ONLY-ALL-QUERIES-trec.txt               | 0.4240	 | 0.5756  | 0.4632	 | 0.4797  | 0.2734	| 0.3517  | 0.7706 |
| LMD [d]       |LMD-EXTRACTED-ONLY-ALL-QUERIES-trec.txt          | 0.1224	 | 0.2301  | 0.1481	 | 0.1624  | 0.0799	| 0.0992  | 0.3901 |
