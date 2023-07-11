# RESULTS

Run performed on the downloaded collection with modifications (without performing tuple deduplication) **without indexing datasets for which no file have been used by any RDF parser**:
- Deleted all unparsable files
- Decompressed archives
- Assign extensions to unknown files

Analyzer used: StandardAnalyzer without any stoplist

### ALL QUERIES

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0,4645 |        0,4893 |      0,2784 |       0,3683 |
| TF-IDF [m]   | CS-META-ONLY-ALL-QUERIES         |       0,4484 |        0,4613 |      0,2675 |       0,3460 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-ALL-QUERIES    |       0,0853 |        0,0988 |      0,0490 |       0,0614 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0,4600 |        0,4915 |      0,2761 |       0,3636 |
| BM25 [m]     | BM25-META-ONLY-ALL-QUERIES       |       0,4836 |        0,5035 |      0,2880 |       0,3786 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-ALL-QUERIES  |       0,1162 |        0,1281 |      0,0713 |       0,0840 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0,2183 |        0,2445 |      0,1350 |       0,1650 |
| LDM [m]      | LMD-META-ONLY-ALL-QUERIES        |       0,4325 |        0,4476 |      0,2680 |       0,3390 |
| LDM [d]      | LMD-EXTRACTED-ONLY-ALL-QUERIES   |       0,1027 |        0,1196 |      0,0629 |       0,0759 |

# RESULTS

|PAPER RUN NAME| RUN NAME                         |       NDCG@5 |       NDCG@10 |       MAP@5 |       MAP@10 |
|--------------|----------------------------------|--------------|---------------|-------------|--------------|
| BM25 [d]     | BM25-EXTRACTED-ONLY-ALL-QUERIES  |       0,1162 |        0,1281 |      0,0713 |       0,0840 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-SYN-QUERIES  |       0,0717 |        0,0792 |      0,0420 |       0,0503 |
| BM25 [d]     | BM25-EXTRACTED-ONLY-TREC-QUERIES |       0,0445 |        0,0489 |      0,0292 |       0,0337 |
| BM25         | BM25-META+EXTRACTED-ALL-QUERIES  |       0,4600 |        0,4915 |      0,2761 |       0,3636 |
| BM25         | BM25-META+EXTRACTED-SYN-QUERIES  |       0,2718 |        0,2813 |      0,1622 |       0,2094 |
| BM25         | BM25-META+EXTRACTED-TREC-QUERIES |       0,1889 |        0,2106 |      0,1144 |       0,1546 |
| BM25 [m]     | BM25-META-ONLY-ALL-QUERIES       |       0,4836 |        0,5035 |      0,2880 |       0,3786 |
| BM25 [m]     | BM25-META-ONLY-SYN-QUERIES       |       0,2827 |        0,2855 |      0,1652 |       0,2146 |
| BM25 [m]     | BM25-META-ONLY-TREC-QUERIES      |       0,2009 |        0,2180 |      0,1228 |       0,1640 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-ALL-QUERIES    |       0,0853 |        0,0988 |      0,0490 |       0,0614 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-SYN-QUERIES    |       0,0524 |        0,0608 |      0,0279 |       0,0367 |
| TF-IDF [d]   | CS-EXTRACTED-ONLY-TREC-QUERIES   |       0,0329 |        0,0380 |      0,0212 |       0,0247 |
| TF-IDF       | CS-META+EXTRACTED-ALL-QUERIES    |       0,4645 |        0,4893 |      0,2784 |       0,3683 |
| TF-IDF       | CS-META+EXTRACTED-SYN-QUERIES    |       0,2647 |        0,2742 |      0,1545 |       0,2041 |
| TF-IDF       | CS-META+EXTRACTED-TREC-QUERIES   |       0,1997 |        0,2151 |      0,1239 |       0,1642 |
| TF-IDF [m]   | CS-META-ONLY-ALL-QUERIES         |       0,4484 |        0,4613 |      0,2675 |       0,3460 |
| TF-IDF [m]   | CS-META-ONLY-SYN-QUERIES         |       0,2560 |        0,2585 |      0,1490 |       0,1909 |
| TF-IDF [m]   | CS-META-ONLY-TREC-QUERIES        |       0,1924 |        0,2028 |      0,1186 |       0,1551 |
| LDM [d]      | LMD-EXTRACTED-ONLY-ALL-QUERIES   |       0,1027 |        0,1196 |      0,0629 |       0,0759 |
| LDM [d]      | LMD-EXTRACTED-ONLY-SYN-QUERIES   |       0,0663 |        0,0757 |      0,0395 |       0,0471 |
| LDM [d]      | LMD-EXTRACTED-ONLY-TREC-QUERIES  |       0,0364 |        0,0439 |      0,0234 |       0,0288 |
| LDM          | LMD-META+EXTRACTED-ALL-QUERIES   |       0,2183 |        0,2445 |      0,1350 |       0,1650 |
| LDM          | LMD-META+EXTRACTED-SYN-QUERIES   |       0,1478 |        0,1571 |      0,0936 |       0,1103 |
| LDM          | LMD-META+EXTRACTED-TREC-QUERIES  |       0,0705 |        0,0874 |      0,0414 |       0,0547 |
| LDM [m]      | LMD-META-ONLY-ALL-QUERIES        |       0,4325 |        0,4476 |      0,2680 |       0,3390 |
| LDM [m]      | LMD-META-ONLY-SYN-QUERIES        |       0,2457 |        0,2481 |      0,1490 |       0,1868 |
| LDM [m]      | LMD-META-ONLY-TREC-QUERIES       |       0,1868 |        0,1994 |      0,1190 |       0,1522 |