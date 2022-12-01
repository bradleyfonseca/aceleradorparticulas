# Desafio: Acelerador de partículas

Em um acelerador de partículas existem K regiões energéticas onde átomos percorrem livremente. Os átomos são inicialmente jogados na região zero e são acelerados.

Quando o número de átomos na região zero é estritamente maior que N, esses N+1 átomos são forçados a colidir e sobem para a próxima região energética (1), se fundindo em um único átomo mais denso. A região zero fica então vazia.

O mesmo ocorre com as regiões seguintes: no momento em que a região 1 acumula N+1 átomos, eles são acelerados, se fundem e sobem para a região 2.

Se por algum caso o átomo chegar em uma região K, ele não tem mais para onde ir e é perdido.

Dado K, N e o número total de átomos que serão arremessados A, encontre a distribuição final nos níveis energéticos após a conclusão de todas as acelerações e fusões.

**Entrada**
A entrada consiste em uma linha contendo os números A, N e K separados por espaço. O acelerador começa vazio, ou seja, com 0 átomos em cada um de seus K níveis.

**Saída**
A resposta consiste no número final de átomos em cada região (0...K-1). Ou seja, o primeiro número representará os átomos da região 0, o segundo representará a quantidade de átomos na região 1 e assim sucessivamente.

**Restrições**
1 <= A <= 1000000000
1 <= N <= 100
1 <= K <= 100

**Exemplo**
Entrada "3 1 3"
Saída "1 1 0"
