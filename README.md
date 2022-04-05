# Atividade-3-ED
Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células.
Lista [1, 2, 3, 4, 5]
Pilha []
Fila []

Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista.
Lista []
Pilha [5, 4, 3, 2, 1]
Fila []

Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células.
Lista []
Pilha []
Fila [5, 4, 3, 2, 1]

Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista.
Lista [6, 7, 8, 9, 10]
Pilha []
Fila [5, 4, 3, 2, 1]

Passo 5.2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista.
Lista []
Pilha [10, 9, 8, 7, 6]
Fila [5, 4, 3, 2, 1]

Passo 5.3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células.
Lista []
Pilha []
Fila [5, 4, 3, 2, 1, 10, 9, 8, 7, 6]

Passo 6: Exiba todos os números que foram inseridos na fila.
Fila final:
[5, 4, 3, 2, 1, 10, 9, 8, 7, 6]



Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido.

Os números se encontram em uma ordem diferente ao que foi adicionado inicialmente. Caso os números tivessem sido inseridos diretamente da lista para a fila, a ordem seria a mesma, no entanto, ao passarmos os números por uma pilha que tem o comportamento de LiFo(last-in first-out), a ordem de inserção dos números na fila é invertido, ou seja, os últimos números a entrarem na pilha são os primeiros a serem enviados para a fila.
