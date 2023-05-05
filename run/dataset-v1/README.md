# TF-IDF

Run with:
- Standard analyzer
- Classic similarity (TF-IDF)

Run performed on the downloaded collection as it is:
- without considering the almost 700 non parsable files
- without performing tuple deduplication


Reference results

|ALL QUERIES |NDCG@5 |NDCG@10|MAP@5  |MAP@10 |
|---         |---	 |---	 |---	 |---	 |
|TF-IDF      |0.5088 |0.5452 |0.2871 |0.3976 |
|TF-IDF[m]   |0.4743 |0.5019 |0.2676 |0.3685 |
|TF-IDF[d]   |0.1910 |0.1963 |0.0998 |0.1199 |

Obtained

|ALL QUERIES |RUN NAME       |NDCG@5 |NDCG@10|MAP@5  |MAP@10 |
|---         |---            |---	 |---	 |---	 |---	 |
|TF-IDF      |META+EXTRACTED |0.4756 |0.5042 |0.2692 |0.3669 |
|TF-IDF[m]   |META-ONLY      |0.4694 |0.4839 |0.2636 |0.3507 |
|TF-IDF[d]   |EXTRACTED-ONLY |0.1304 |0.1384 |0.0677 |0.0802 |
