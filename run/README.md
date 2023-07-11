# Analysis

- Dataset v1 = Raw downloaded dataset
- Dataset v2 = Dataset v1 without JSON and HTML error files, with decompressed archives and correct extensions assigned to files
    - dataset-v2: Dataset v2 with big files
    - dataset-v2-big: Dataset v2 with big files using the big stoplist from Kaggle
    - dataset-v2-nltk: Dataset v2 with big files using the NLTK stoplist
    - dataset-v2-no-bf: Dataset v2 wihtout indexing big files
    - dataset-v2-no-empty: Dataset v2 (with big files) without indexing empty datasets (datasets with zero files parsable from RDFLib, for these datasets neither metadata have been indexed)