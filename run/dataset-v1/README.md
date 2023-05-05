# RESULTS

Run performed on the downloaded collection as it is:
- without considering the almost 700 non parsable files
- without performing tuple deduplication

Analyzer used: StandardAnalyzer without any stoplist


### SYNTHETIC QUERIES

| PAPER RUN NAME | RUN NAME                        | MAP    | NDCG    | NDCG@5  | NDCG@10 | MAP@5   | MAP@10  | RECALL |
|----------------|---------------------------------|--------|---------|---------|---------|---------|---------|--------|
| BM25F [d]      | BM25-EXTRACTED-ONLY-SYN-QUERIES | 0.1332 | 0.2420	 | 0.1650	 | 0.1825	 | 0.0887	 | 0.1101	 | 0.3831 |
| BM25F          | BM25-META+EXTRACTED-SYN-QUERIES | 0.4464 | 0.6231	 | 0.4676	 | 0.5030	 | 0.2609	 | 0.3438	 | 0.8550 |
| BM25F [m]      | BM25-META-ONLY-SYN-QUERIES      | 0.5333 | 0.6853	 | 0.6130	 | 0.6128	 | 0.3434	 | 0.4469	 | 0.8280 |
| TF-IDF [d]     | CS-EXTRACTED-ONLY-SYN-QUERIES   | 0.1244 | 0.2409	 | 0.1569	 | 0.1673	 | 0.0816	 | 0.0957	 | 0.3805 |
| TF-IDF         | CS-META+EXTRACTED-SYN-QUERIES   | 0.5110 | 0.6668	 | 0.5625	 | 0.5750	 | 0.3118	 | 0.4139	 | 0.8485 |
| TF-IDF [m]     | CS-META-ONLY-SYN-QUERIES        | 0.4723 | 0.6269	 | 0.5408	 | 0.5443	 | 0.2960	 | 0.3869	 | 0.7941 |
| LMD [m]        | LMD-EXTRACTED-ONLY-SYN-QUERIES  | 0.1585 | 0.2862	 | 0.2016	 | 0.2166	 | 0.1056	 | 0.1310	 | 0.4438 |
| LMD            | LMD-META+EXTRACTED-SYN-QUERIES  | 0.3133 | 0.4871	 | 0.3581	 | 0.3801	 | 0.2101	 | 0.2542	 | 0.6905 |
| LMD [d]        | LMD-META-ONLY-SYN-QUERIES       | 0.4683 | 0.6267	 | 0.5317	 | 0.5357	 | 0.3093	 | 0.3897	 | 0.7863 |

### TREC QUERIES

| PAPER RUN NAME | RUN NAME                         | MAP    | NDCG    | NDCG@5  | NDCG@10 | MAP@5   | MAP@10  | RECALL |
|----------------|----------------------------------|--------|---------|---------|---------|---------|---------|--------|
| BM25F [d]      | BM25-EXTRACTED-ONLY-TREC-QUERIES | 0.0853 | 0.1556	 | 0.0977	 | 0.1055	 | 0.0613	 | 0.0719	 | 0.2874 |
| BM25F          | BM25-META+EXTRACTED-TREC-QUERIES | 0.3040 | 0.4721	 | 0.2878	 | 0.3289	 | 0.1588	 | 0.2176	 | 0.8197 |
| BM25F [m]      | BM25-META-ONLY-TREC-QUERIES      | 0.4035 | 0.5376	 | 0.4201	 | 0.4535	 | 0.2417	 | 0.3331	 | 0.7560 |
| TF-IDF [d]     | CS-EXTRACTED-ONLY-TREC-QUERIES   | 0.0834 | 0.1671	 | 0.1050	 | 0.1108	 | 0.0545	 | 0.0655	 | 0.2993 |
| TF-IDF         | CS-META+EXTRACTED-TREC-QUERIES   | 0.3923 | 0.5263	 | 0.3925	 | 0.4364	 | 0.2286	 | 0.3219	 | 0.7735 |
| TF-IDF [m]     | CS-META-ONLY-TREC-QUERIES        | 0.3780 | 0.5045	 | 0.3983	 | 0.4236	 | 0.2314	 | 0.3147	 | 0.7138 |
| LMD [m]        | LMD-EXTRACTED-ONLY-TREC-QUERIES  | 0.0886 | 0.1783	 | 0.1001	 | 0.1167	 | 0.0556	 | 0.0700	 | 0.3416 |
| LMD            | LMD-META+EXTRACTED-TREC-QUERIES  | 0.1862 | 0.3498	 | 0.1886	 | 0.2198	 | 0.1021	 | 0.1337	 | 0.6720 |
| LMD [d]        | LMD-META-ONLY-TREC-QUERIES       | 0.3800 | 0.5247	 | 0.3951	 | 0.4239	 | 0.2377	 | 0.3138	 | 0.7549 |

### ALL QUERIES

| PAPER RUN NAME | RUN NAME                        | MAP    | NDCG    | NDCG@5  | NDCG@10 | MAP@5   | MAP@10  | RECALL |
|----------------|---------------------------------|--------|---------|---------|---------|---------|---------|--------|
| BM25F [d]      | BM25-EXTRACTED-ONLY-ALL-QUERIES | 0.1087 | 0.1979	 | 0.1306	 | 0.1431	 | 0.0747	 | 0.0906	 | 0.3342 |
| BM25F          | BM25-META+EXTRACTED-ALL-QUERIES | 0.3736 | 0.5459	 | 0.3757	 | 0.4140	 | 0.2087	 | 0.2793	 | 0.8370 |
| BM25F [m]      | BM25-META-ONLY-ALL-QUERIES      | 0.4682 | 0.6113	 | 0.5164	 | 0.5330	 | 0.2925	 | 0.3899	 | 0.7919 |
| TF-IDF [d]     | CS-EXTRACTED-ONLY-ALL-QUERIES   | 0.1035 | 0.2032	 | 0.1304	 | 0.1384	 | 0.0677	 | 0.0802	 | 0.3390 |
| TF-IDF         | CS-META+EXTRACTED-ALL-QUERIES   | 0.4503 | 0.5950	 | 0.4756	 | 0.5042	 | 0.2692	 | 0.3669	 | 0.8102 |
| TF-IDF [m]     | CS-META-ONLY-ALL-QUERIES        | 0.4250 | 0.5655	 | 0.4694	 | 0.4839	 | 0.2636	 | 0.3507	 | 0.7539 |
| LMD [m]        | LMD-EXTRACTED-ONLY-ALL-QUERIES  | 0.1228 | 0.2310	 | 0.1497	 | 0.1655	 | 0.0801	 | 0.0998	 | 0.3915 |
| LMD            | LMD-META+EXTRACTED-ALL-QUERIES  | 0.2483 | 0.4169	 | 0.2715	 | 0.2982	 | 0.1549	 | 0.1926	 | 0.6810 |
| LMD [d]        | LMD-META-ONLY-ALL-QUERIES       | 0.4240 | 0.5756	 | 0.4632	 | 0.4797	 | 0.2734	 | 0.3517	 | 0.7706 |