# RESULTS

Run performed on the downloaded collection with modifications (without performing tuple deduplication):
- Deleted all unparsable files
- Decompressed archives
- Assign extensions to unknown files

Analyzer used: StandardAnalyzer without any stoplist

### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0,4751 |        0,5042 |      0,2691 |       0,3667 |
| TF-IDF [m]   | CS-META-ONLY-ALL-QUERIES         |       0,4599 |        0,4740 |      0,2583 |       0,3436 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-ALL-QUERIES    |       0,1280 |        0,1362 |      0,0667 |       0,0789 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0,3704 |        0,4099 |      0,2051 |       0,2752 |
| BM25 [m]     | BM25-META-ONLY-ALL-QUERIES       |       0,5059 |        0,5222 |      0,2865 |       0,3820 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-ALL-QUERIES  |       0,1263 |        0,1383 |      0,0724 |       0,0880 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0,2775 |        0,2997 |      0,1590 |       0,1952 |
| LDM [m]      | LMD-META-ONLY-ALL-QUERIES        |       0,4538 |        0,4699 |      0,2679 |       0,3446 |
| LDM [d]      | LMD-EXTRACTED-ONLY-ALL-QUERIES   |       0,1481 |        0,1624 |      0,0799 |       0,0992 |

# RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ONLY-ALL-QUERIES  |       0,1263 |        0,1383 |      0,0724 |       0,0880 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-SYN-QUERIES  |       0,0759 |        0,0850 |      0,0407 |       0,0514 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-TREC-QUERIES |       0,0504 |        0,0533 |      0,0317 |       0,0366 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0,3704 |        0,4099 |      0,2051 |       0,2752 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0,2265 |        0,2435 |      0,1265 |       0,1661 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0,1439 |        0,1664 |      0,0786 |       0,1091 |
| BM25 [m]     | BM25-META-ONLY-ALL-QUERIES       |       0,5059 |        0,5222 |      0,2865 |       0,3820 |
| BM25 [m]     | BM25-META-ONLY-SYN-QUERIES       |       0,2997 |        0,2996 |      0,1679 |       0,2185 |
| BM25 [m]     | BM25-META-ONLY-TREC-QUERIES      |       0,2062 |        0,2226 |      0,1186 |       0,1635 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-ALL-QUERIES    |       0,1280 |        0,1362 |      0,0667 |       0,0789 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-SYN-QUERIES    |       0,0745 |        0,0800 |      0,0389 |       0,0457 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-TREC-QUERIES   |       0,0535 |        0,0562 |      0,0277 |       0,0332 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0,4751 |        0,5042 |      0,2691 |       0,3667 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0,2745 |        0,2814 |      0,1522 |       0,2025 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0,2006 |        0,2228 |      0,1168 |       0,1642 |
| TF-IDF [m]   | CS-META-ONLY-ALL-QUERIES         |       0,4599 |        0,4740 |      0,2583 |       0,3436 |
| TF-IDF [m]   | CS-META-ONLY-SYN-QUERIES         |       0,2644 |        0,2661 |      0,1447 |       0,1891 |
| TF-IDF [m]   | CS-META-ONLY-TREC-QUERIES        |       0,1955 |        0,2079 |      0,1136 |       0,1545 |
| LDM [d]      | LMD-EXTRACTED-ONLY-ALL-QUERIES   |       0,1481 |        0,1624 |      0,0799 |       0,0992 |
| LDM [d]      | LMD-EXTRACTED-ONLY-SYN-QUERIES   |       0,0972 |        0,1028 |      0,0503 |       0,0621 |
| LDM [d]      | LMD-EXTRACTED-ONLY-TREC-QUERIES  |       0,0508 |        0,0596 |      0,0297 |       0,0371 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0,2775 |        0,2997 |      0,1590 |       0,1952 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0,1764 |        0,1850 |      0,1028 |       0,1236 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0,1012 |        0,1147 |      0,0562 |       0,0715 |
| LDM [m]      | LMD-META-ONLY-ALL-QUERIES        |       0,4538 |        0,4699 |      0,2679 |       0,3446 |
| LDM [m]      | LMD-META-ONLY-SYN-QUERIES        |       0,2599 |        0,2619 |      0,1512 |       0,1905 |
| LDM [m]      | LMD-META-ONLY-TREC-QUERIES       |       0,1939 |        0,2081 |      0,1167 |       0,1540 |
