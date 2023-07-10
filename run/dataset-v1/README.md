# RESULTS

Run performed on the downloaded collection as it is:
- without considering the almost 700 non parsable files
- without performing tuple deduplication

Analyzer used: StandardAnalyzer without any stoplist

### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0,4756 |        0,5042 |      0,2692 |       0,3669 |
| TF-IDF [m]   | CS-META-ONLY-ALL-QUERIES         |       0,4599 |        0,4740 |      0,2583 |       0,3436 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-ALL-QUERIES    |       0,1304 |        0,1384 |      0,0677 |       0,0802 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0,3757 |        0,4140 |      0,2087 |       0,2793 |
| BM25 [m]     | BM25-META-ONLY-ALL-QUERIES       |       0,5059 |        0,5222 |      0,2865 |       0,3820 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-ALL-QUERIES  |       0,1306 |        0,1431 |      0,0747 |       0,0906 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0,2715 |        0,2982 |      0,1549 |       0,1926 |
| LDM [m]      | LMD-META-ONLY-ALL-QUERIES        |       0,4538 |        0,4699 |      0,2679 |       0,3446 |
| LDM [d]      | LMD-EXTRACTED-ONLY-ALL-QUERIES   |       0,1497 |        0,1655 |      0,0801 |       0,0998 |

# RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ONLY-ALL-QUERIES  |       0,1306 |        0,1431 |      0,0747 |       0,0906 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-SYN-QUERIES  |       0,0806 |        0,0892 |      0,0434 |       0,0538 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-TREC-QUERIES |       0,0500 |        0,0539 |      0,0314 |       0,0368 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0,3757 |        0,4140 |      0,2087 |       0,2793 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0,2286 |        0,2459 |      0,1275 |       0,1680 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0,1471 |        0,1681 |      0,0812 |       0,1112 |
| BM25 [m]     | BM25-META-ONLY-ALL-QUERIES       |       0,5059 |        0,5222 |      0,2865 |       0,3820 |
| BM25 [m]     | BM25-META-ONLY-SYN-QUERIES       |       0,2997 |        0,2996 |      0,1679 |       0,2185 |
| BM25 [m]     | BM25-META-ONLY-TREC-QUERIES      |       0,2062 |        0,2226 |      0,1186 |       0,1635 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-ALL-QUERIES    |       0,1304 |        0,1384 |      0,0677 |       0,0802 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-SYN-QUERIES    |       0,0767 |        0,0818 |      0,0399 |       0,0468 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-TREC-QUERIES   |       0,0537 |        0,0567 |      0,0278 |       0,0335 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0,4756 |        0,5042 |      0,2692 |       0,3669 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0,2750 |        0,2811 |      0,1524 |       0,2024 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0,2006 |        0,2231 |      0,1168 |       0,1646 |
| TF-IDF [m]   | CS-META-ONLY-ALL-QUERIES         |       0,4599 |        0,4740 |      0,2583 |       0,3436 |
| TF-IDF [m]   | CS-META-ONLY-SYN-QUERIES         |       0,2644 |        0,2661 |      0,1447 |       0,1891 |
| TF-IDF [m]   | CS-META-ONLY-TREC-QUERIES        |       0,1955 |        0,2079 |      0,1136 |       0,1545 |
| LDM [d]      | LMD-EXTRACTED-ONLY-ALL-QUERIES   |       0,1497 |        0,1655 |      0,0801 |       0,0998 |
| LDM [d]      | LMD-EXTRACTED-ONLY-SYN-QUERIES   |       0,0986 |        0,1059 |      0,0516 |       0,0640 |
| LDM [d]      | LMD-EXTRACTED-ONLY-TREC-QUERIES  |       0,0512 |        0,0597 |      0,0284 |       0,0358 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0,2715 |        0,2982 |      0,1549 |       0,1926 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0,1751 |        0,1858 |      0,1027 |       0,1243 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0,0964 |        0,1124 |      0,0522 |       0,0683 |
| LDM [m]      | LMD-META-ONLY-ALL-QUERIES        |       0,4538 |        0,4699 |      0,2679 |       0,3446 |
| LDM [m]      | LMD-META-ONLY-SYN-QUERIES        |       0,2599 |        0,2619 |      0,1512 |       0,1905 |
| LDM [m]      | LMD-META-ONLY-TREC-QUERIES       |       0,1939 |        0,2081 |      0,1167 |       0,1540 |
