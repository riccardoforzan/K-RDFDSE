# RESULTS

Run performed on the downloaded collection with modifications (without performing tuple deduplication):
- Deleted all unparsable files
- Decompressed archives
- Assign extensions to unknown files

Analyzer used: StandardAnalyzer with [NLTK stoplist](https://gist,github,com/sebleier/554280) 

For large files reservoir sampling has been used to not exceed Lucene limitations


### ALL

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0,4892 |        0,5182 |      0,2780 |       0,3813 |
| TF-IDF [m]   | CS-META-ONLY-ALL-QUERIES         |       0,4717 |        0,4932 |      0,2649 |       0,3616 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-ALL-QUERIES    |       0,0860 |        0,0964 |      0,0457 |       0,0568 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0,4951 |        0,5217 |      0,2806 |       0,3741 |
| BM25 [m]     | BM25-META-ONLY-ALL-QUERIES       |       0,5108 |        0,5299 |      0,2914 |       0,3894 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-ALL-QUERIES  |       0,1201 |        0,1289 |      0,0726 |       0,0838 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0,2166 |        0,2364 |      0,1268 |       0,1541 |
| LDM [m]      | LMD-META-ONLY-ALL-QUERIES        |       0,4541 |        0,4712 |      0,2693 |       0,3477 |
| LDM [d]      | LMD-EXTRACTED-ONLY-ALL-QUERIES   |       0,1052 |        0,1167 |      0,0642 |       0,0746 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ONLY-ALL-QUERIES  |       0,1201 |        0,1289 |      0,0726 |       0,0838 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-SYN-QUERIES  |       0,0758 |        0,0804 |      0,0435 |       0,0504 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-TREC-QUERIES |       0,0443 |        0,0485 |      0,0291 |       0,0334 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0,4951 |        0,5217 |      0,2806 |       0,3741 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0,2917 |        0,3003 |      0,1641 |       0,2153 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0,2041 |        0,2221 |      0,1171 |       0,1594 |
| BM25 [m]     | BM25-META-ONLY-ALL-QUERIES       |       0,5108 |        0,5299 |      0,2914 |       0,3894 |
| BM25 [m]     | BM25-META-ONLY-SYN-QUERIES       |       0,3006 |        0,3011 |      0,1690 |       0,2200 |
| BM25 [m]     | BM25-META-ONLY-TREC-QUERIES      |       0,2101 |        0,2288 |      0,1224 |       0,1695 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-ALL-QUERIES    |       0,0860 |        0,0964 |      0,0457 |       0,0568 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-SYN-QUERIES    |       0,0530 |        0,0586 |      0,0257 |       0,0333 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-TREC-QUERIES   |       0,0330 |        0,0378 |      0,0200 |       0,0236 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0,4892 |        0,5182 |      0,2780 |       0,3813 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0,2814 |        0,2883 |      0,1561 |       0,2088 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0,2078 |        0,2299 |      0,1219 |       0,1725 |
| TF-IDF [m]   | CS-META-ONLY-ALL-QUERIES         |       0,4717 |        0,4932 |      0,2649 |       0,3616 |
| TF-IDF [m]   | CS-META-ONLY-SYN-QUERIES         |       0,2712 |        0,2751 |      0,1490 |       0,1990 |
| TF-IDF [m]   | CS-META-ONLY-TREC-QUERIES        |       0,2005 |        0,2181 |      0,1159 |       0,1627 |
| LDM [d]      | LMD-EXTRACTED-ONLY-ALL-QUERIES   |       0,1052 |        0,1167 |      0,0642 |       0,0746 |
| LDM [d]      | LMD-EXTRACTED-ONLY-SYN-QUERIES   |       0,0687 |        0,0745 |      0,0407 |       0,0468 |
| LDM [d]      | LMD-EXTRACTED-ONLY-TREC-QUERIES  |       0,0365 |        0,0422 |      0,0235 |       0,0278 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0,2166 |        0,2364 |      0,1268 |       0,1541 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0,1438 |        0,1519 |      0,0847 |       0,1009 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0,0728 |        0,0845 |      0,0422 |       0,0532 |
| LDM [m]      | LMD-META-ONLY-ALL-QUERIES        |       0,4541 |        0,4712 |      0,2693 |       0,3477 |
| LDM [m]      | LMD-META-ONLY-SYN-QUERIES        |       0,2593 |        0,2608 |      0,1513 |       0,1910 |
| LDM [m]      | LMD-META-ONLY-TREC-QUERIES       |       0,1948 |        0,2104 |      0,1180 |       0,1567 |