# RESULTS

Run performed on the downloaded collection with modifications (without performing tuple deduplication):
- Deleted all unparsable files
- Decompressed archives
- Assign extensions to unknown files

Analyzer used: StandardAnalyzer with [Big stoplist](https://www,kaggle,com/datasets/rowhitswami/stopwords) 

For large files reservoir sampling has been used to not exceed Lucene limitations

### ALL

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0,4925 |        0,5190 |      0,2806 |       0,3803 |
| TF-IDF [m]   | CS-META-ONLY-ALL-QUERIES         |       0,4721 |        0,4956 |      0,2653 |       0,3609 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-ALL-QUERIES    |       0,0866 |        0,0956 |      0,0469 |       0,0573 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0,4936 |        0,5198 |      0,2806 |       0,3731 |
| BM25 [m]     | BM25-META-ONLY-ALL-QUERIES       |       0,5079 |        0,5251 |      0,2875 |       0,3844 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-ALL-QUERIES  |       0,1202 |        0,1297 |      0,0730 |       0,0842 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0,2153 |        0,2350 |      0,1261 |       0,1526 |
| LDM [m]      | LMD-META-ONLY-ALL-QUERIES        |       0,4540 |        0,4702 |      0,2687 |       0,3468 |
| LDM [d]      | LMD-EXTRACTED-ONLY-ALL-QUERIES   |       0,1055 |        0,1178 |      0,0645 |       0,0755 |

# RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ONLY-ALL-QUERIES  |       0,1202 |        0,1297 |      0,0730 |       0,0842 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-SYN-QUERIES  |       0,0749 |        0,0800 |      0,0435 |       0,0504 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-TREC-QUERIES |       0,0453 |        0,0497 |      0,0295 |       0,0339 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0,4936 |        0,5198 |      0,2806 |       0,3731 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0,2909 |        0,2994 |      0,1644 |       0,2156 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0,2035 |        0,2212 |      0,1169 |       0,1582 |
| BM25 [m]     | BM25-META-ONLY-ALL-QUERIES       |       0,5079 |        0,5251 |      0,2875 |       0,3844 |
| BM25 [m]     | BM25-META-ONLY-SYN-QUERIES       |       0,2990 |        0,2993 |      0,1668 |       0,2177 |
| BM25 [m]     | BM25-META-ONLY-TREC-QUERIES      |       0,2089 |        0,2258 |      0,1207 |       0,1667 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-ALL-QUERIES    |       0,0866 |        0,0956 |      0,0469 |       0,0573 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-SYN-QUERIES    |       0,0531 |        0,0586 |      0,0265 |       0,0338 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-TREC-QUERIES   |       0,0335 |        0,0370 |      0,0203 |       0,0235 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0,4925 |        0,5190 |      0,2806 |       0,3803 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0,2830 |        0,2887 |      0,1573 |       0,2080 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0,2095 |        0,2303 |      0,1234 |       0,1723 |
| TF-IDF [m]   | CS-META-ONLY-ALL-QUERIES         |       0,4721 |        0,4956 |      0,2653 |       0,3609 |
| TF-IDF [m]   | CS-META-ONLY-SYN-QUERIES         |       0,2727 |        0,2774 |      0,1492 |       0,1992 |
| TF-IDF [m]   | CS-META-ONLY-TREC-QUERIES        |       0,1994 |        0,2182 |      0,1160 |       0,1617 |
| LDM [d]      | LMD-EXTRACTED-ONLY-ALL-QUERIES   |       0,1055 |        0,1178 |      0,0645 |       0,0755 |
| LDM [d]      | LMD-EXTRACTED-ONLY-SYN-QUERIES   |       0,0684 |        0,0748 |      0,0408 |       0,0473 |
| LDM [d]      | LMD-EXTRACTED-ONLY-TREC-QUERIES  |       0,0371 |        0,0430 |      0,0237 |       0,0282 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0,2153 |        0,2350 |      0,1261 |       0,1526 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0,1417 |        0,1504 |      0,0839 |       0,1000 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0,0736 |        0,0846 |      0,0423 |       0,0526 |
| LDM [m]      | LMD-META-ONLY-ALL-QUERIES        |       0,4540 |        0,4702 |      0,2687 |       0,3468 |
| LDM [m]      | LMD-META-ONLY-SYN-QUERIES        |       0,2590 |        0,2606 |      0,1508 |       0,1906 |
| LDM [m]      | LMD-META-ONLY-TREC-QUERIES       |       0,1951 |        0,2096 |      0,1179 |       0,1562 |
