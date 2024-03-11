1. Implemente uma corrida entre dois corredores usando thread e números aleatórios, não é
necessário criar interface gráfica, use o console. Inicialmente o programa deve perguntar quantos
corredores irão participar da corrida, após isso deve solicitar o nome. Então as threads lançadas devem
atualizar a posição de cada uma dos corredores, até que cada um chegue ao final do percursso.

2. Faça um programa que peça ao usuário um número maior que 5000. Após isso você deve fazer o
lançamento de X threads que façam essa contagem, a saída dos números no console não deve estar
ordenada, porém nenhum número deve ser exibido mais do que uma vez.

3. Crie um sistema básico de semáforos de transito para atender um cruzamento (4 vias) onde
somente uma via estará aberta por vez, não é necessário usar interface gráfica, atualize o console com
a situação de cada semáforo.

4. Crie uma aplicação contendo dois contadores distintos, com as funcionalidade de start, pause e stop
conforme o modelo de tela abaixo, cada contador ao ser iniciado deve incrementar +1 ao número ao
lado do botão Stop.

5. Criar um contador que será compartilhado entre dois botões, um incrementa o contador e outro
decrementa, o valor usado para as funções é gerado através de um número aleatório. Existe a
possibilidade do usuário selecionar o botão de incremento e depois o botão de decremento.

6. Implemente uma busca num array de inteiros. Deve cria nThreads, que devem compartilhar o
objeto array. Cada thread busca pelo inteiro x em uma parte do array, por exemplo: da posição 0 até a
10, outra da 11 a 20, … Se uma das threads encontra x, então retorna-se o índice i, tal que A[i] = x,
caso contrário, o método retorna -1. Quando uma das threads encontra o número x, as outras devem
parar a busca.
