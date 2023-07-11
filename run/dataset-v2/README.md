# RESULTS

Run performed on the downloaded collection with modifications (without performing tuple deduplication):
- Deleted all unparsable files
- Decompressed archives
- Assign extensions to unknown files

Analyzer used: StandardAnalyzer without any stoplist

For large files reservoir sampling has been used to not exceed Lucene limitations

### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0,4761 |        0,4989 |      0,2693 |       0,3634 |
| TF-IDF [m]   | CS-META-ONLY-ALL-QUERIES         |       0,4602 |        0,4744 |      0,2584 |       0,3439 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-ALL-QUERIES    |       0,0822 |        0,0935 |      0,0445 |       0,0555 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0,4673 |        0,4966 |      0,2642 |       0,3525 |
| BM25 [m]     | BM25-META-ONLY-ALL-QUERIES       |       0,5055 |        0,5222 |      0,2865 |       0,3820 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-ALL-QUERIES  |       0,1128 |        0,1223 |      0,0666 |       0,0780 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0,2173 |        0,2403 |      0,1289 |       0,1571 |
| LDM [m]      | LMD-META-ONLY-ALL-QUERIES        |       0,4533 |        0,4695 |      0,2677 |       0,3443 |
| LDM [d]      | LMD-EXTRACTED-ONLY-ALL-QUERIES   |       0,0996 |        0,1142 |      0,0592 |       0,0707 |

### RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ONLY-ALL-QUERIES  |       0,1128 |        0,1223 |      0,0666 |       0,0780 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-SYN-QUERIES  |       0,0701 |        0,0767 |      0,0393 |       0,0468 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-TREC-QUERIES |       0,0427 |        0,0456 |      0,0272 |       0,0312 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0,4673 |        0,4966 |      0,2642 |       0,3525 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0,2778 |        0,2859 |      0,1558 |       0,2025 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0,1902 |        0,2110 |      0,1088 |       0,1504 |
| BM25 [m]     | BM25-META-ONLY-ALL-QUERIES       |       0,5055 |        0,5222 |      0,2865 |       0,3820 |
| BM25 [m]     | BM25-META-ONLY-SYN-QUERIES       |       0,2993 |        0,2994 |      0,1678 |       0,2184 |
| BM25 [m]     | BM25-META-ONLY-TREC-QUERIES      |       0,2062 |        0,2228 |      0,1187 |       0,1637 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-ALL-QUERIES    |       0,0822 |        0,0935 |      0,0445 |       0,0555 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-SYN-QUERIES    |       0,0500 |        0,0575 |      0,0248 |       0,0327 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-TREC-QUERIES   |       0,0322 |        0,0360 |      0,0197 |       0,0228 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0,4761 |        0,4989 |      0,2693 |       0,3634 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0,2726 |        0,2789 |      0,1495 |       0,1997 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0,2036 |        0,2200 |      0,1198 |       0,1637 |
| TF-IDF [m]   | CS-META-ONLY-ALL-QUERIES         |       0,4602 |        0,4744 |      0,2584 |       0,3439 |
| TF-IDF [m]   | CS-META-ONLY-SYN-QUERIES         |       0,2644 |        0,2662 |      0,1447 |       0,1892 |
| TF-IDF [m]   | CS-META-ONLY-TREC-QUERIES        |       0,1958 |        0,2082 |      0,1137 |       0,1547 |
| LDM [d]      | LMD-EXTRACTED-ONLY-ALL-QUERIES   |       0,0996 |        0,1142 |      0,0592 |       0,0707 |
| LDM [d]      | LMD-EXTRACTED-ONLY-SYN-QUERIES   |       0,0646 |        0,0732 |      0,0374 |       0,0442 |
| LDM [d]      | LMD-EXTRACTED-ONLY-TREC-QUERIES  |       0,0349 |        0,0409 |      0,0219 |       0,0265 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0,2173 |        0,2403 |      0,1289 |       0,1571 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0,1456 |        0,1539 |      0,0875 |       0,1036 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0,0717 |        0,0864 |      0,0414 |       0,0536 |
| LDM [m]      | LMD-META-ONLY-ALL-QUERIES        |       0,4533 |        0,4695 |      0,2677 |       0,3443 |
| LDM [m]      | LMD-META-ONLY-SYN-QUERIES        |       0,2593 |        0,2614 |      0,1511 |       0,1903 |
| LDM [m]      | LMD-META-ONLY-TREC-QUERIES       |       0,1939 |        0,2081 |      0,1167 |       0,1540 |
