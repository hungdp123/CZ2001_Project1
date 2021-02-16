# CZ2001_Project1: Searching Algorithm

Problem:

DNA and protein sequence searching is one of fundamental problems in bioinformatics research. A nucleic
acid sequence is a series of a set of five letters that indicate the order of nucleotides forming alleles within a
DNA (G, A, C, T) or RNA (G, A, C, U) molecule. The range of sequences in size is from a few nucleotides to
billions of base pairs. Searching for a query sequence in a nucleic acid sequence is a time-consuming process.

In this project, we first would like to study the time complexity of a brute force sequential search for exact
occurrences of a query sequence in a nucleic acid sequence. As an example, we would like to search for a
query sequence (TTTATACCTTCC) in the corovirus genome sequence below:

>NC 045512.2 Severe acute respiratory syndrome coronavirus 2 isolate Wuhan-Hu-1, complete genome
ATTAAAGGTTTATACCTTCCCAGGTAACAAACCAACCAACTTTCGATCTCTTGTAGATCTGTT
CTCTAAACGAACTTTAAAATCTGTGTGGCTGTCACTCGGCTGCATGCTTAGTGCACTCACGCA
GTATAATTAATAACTAATTACTGTCGTTGACAGGACACGAGTAACTCGTCTATCTTCTGCAGG
CTGCTTACGGTTTCGTCCGTGTTGCAGCCGATCATCAGCACATCTAGGTTTCGTCCGGGTGTG
ACCGAAAGGTAAGATGGAGAGCCTTGTCCCTGGTTTCAACGAGAAAACACACGTCCAACTCAG
TTTGCCTGTTTTACAGGTTCGCGACGTGCTCGTACGTGGCTTTGGAGACTCCGTGGAGGAGGT
CTTATCAGAGGCACGTCAACATCTTAAAGATGGCACTTGTGGCTTAGTAGAAGTTGAAAAAGG
CGTTTTGCCTCAACTTGAACAGCCCTATGTGTTCATCAAACGTTCGGATGCTCGAACTGCACC
TCATGGTCATGTTATGGTTGAGCTGGTAGCAGAACTCGAAGGCATTCAGTACGGTCGTAGTGG
TGAGACACTTGGTGTCCTTGTCCCTCATGTGGGCGAAATACCAGTGGCTTACCGCAAGGTTCT
TCTTCGTAAGAACGGTAATAAAGGAGCTGGTGGCCATAGTTACGGCGCCGATCTAAAGTCATT
TGACTTAGGCGACGAGCTTGGCACTGATCCTTATGAAGATTTTCAAGAAAACTGGAACACTAA
ACATAGCAGTGGTGTTACCCGTGAACTCATGCGTGAGCTTAACGGAGGGGCATACACTCGCTA
....

The algorithm should return all the positions (indexes) of exact occurrences of the query in the genome
sequence. In this example, there is only an occurrence at the 9th position. If there is no any exact match,
the algorithm should also return an indicator like “empty” or “no occurrence” etc.

It is not surprising that the brute force searching is very slow especially searching in a long genome sequence.
Next, each group is free to propose up to two other algorithms for the searching process. The time complexity
of the proposed algorithms has to be better than the brute-force searching’s. In the evaluation, lab supervisor
will use the brute-force searching as a baseline.

In this project, students are not only required to implement algorithms, but also analyse the time complexity
of their algorithms. The design and analysis of the algorithms have to be correct and complete. The
implementation program has to be the same algorithm proposed in the report.
