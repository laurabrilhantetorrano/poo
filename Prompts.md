# PROMPTS: Grupo POO 3B TI

**Integrantes:**

1. Anajulia Biscassi
2. Laura Brilhante
3. Vinicius Brazão

**Prova:** POO

**Usamos IA?** (X) Sim  ( ) Não

**Qual ferramenta e modelo (se usaram):** Chat gpt

> Quem não usou IA: troque "prompt" por "passo". Em cada bloco abaixo, descreva o que vocês fizeram naquele passo, na ordem em que aconteceu, e preencha os outros campos do mesmo jeito.

## Registro, na ordem

Copie o bloco abaixo para cada prompt. Escreva o prompt exatamente como foi enviado.

### Prompt 1

**O prompt (cópia exata):**

>  Pessoal, na segunda-feira, 26/10, na nossa aula, das 07h15 às 08h05, teremos a prova prática de POO.

Local: Laboratório 3. Cheguem e vão direto para o laboratório. A prova dura 45 minutos e começa no início do horário da nossa aula, então não se atrasem.

Como será:

Em grupo de até 3 alunos.

O uso de IA é liberado, mas opcional. Quem fizer sem IA não perde nada por isso.

A nota tem duas partes: Produto (6,0), o código entregue, e Processo (4,0), o caminho que vocês seguiram.

Preencham o arquivo PROMPTS.md durante a prova, não depois. Quem não usar IA descreve cada passo na ordem em que foi feito.

Entrega: pelo Classapp, nesta própria atividade. Enviem um único arquivo .zip com a pasta do grupo, contendo as pastas model e app, o README.md (com os nomes dos integrantes e a saída do programa) e o PROMPTS.md. Só um integrante de cada grupo precisa enviar.
…

**O que a IA devolveu (uma ou duas linhas):**

O que você precisa fazer na prova
- Criar um projeto Java organizado em duas pastas: model e app.
- Implementar uma locadora com carro, moto e carro elétrico.
- Utilizar herança, classe abstrata, sobrescrita e interface.
- Criar uma lista com os três tipos de veículos e demonstrar o polimorfismo.
- Calcular corretamente os valores de aluguel e recarga.
- Preencher o README.md com os nomes dos integrantes e a saída do programa.
- Preencher o PROMPTS.md durante a prova, registrando os prompts e as etapas realizadas. 
E MANDOU TAMBÉM OS VALORES QUE PRECISAVA COLOCAR.

**O que fizemos com a resposta:** ( ) usamos como veio  (X) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):**

Corrigimos os dias de aluguel da Honda CG: inicialmente apareciam 3 dias, mas o correto era 4 dias, totalizando R$ 320,00., ajustamos a compilação do projeto: corrigimos os comandos do terminal para compilar os arquivos Java dentro das pastas model e app, conferimos os cálculos: verificamos os valores do Corolla, da Honda CG, da Yamaha Fazer e do Tesla, além do custo da recarga e formatamos a saída do programa: ajustamos a exibição dos valores para aparecerem com duas casas decimais, como R$ 495,00.

### Prompt 2

**O prompt (cópia exata):**

> 

**O que a IA devolveu (uma ou duas linhas):**

**O que fizemos com a resposta:** (x) usamos como veio  ( ) alteramos  ( ) descartamos

**Por quê (o que conferimos, o que mudamos):**

(continuem com quantos blocos precisarem)

## Como conferimos

Com a ajuda da IA e do professor, instalamos  Java e tivemos que compilar para rodar pelo terminal, pois pelo run não estava funcionando. 

## Onde a IA errou, ou onde nós erramos

Um erro que ela cometeu foi passar o comando de compilação com o caminho src\model\*.java mesmo depois da gente já ter entrado na pasta src. Isso causou um erro no terminal porque o caminho estava incorreto.

## Respostas finais, sem consultar a IA

Respondam com as suas palavras, nos últimos 5 minutos. Não copiem de lugar nenhum.

**Pergunta 1:**  Não dá para criar um Veiculo diretamente porque ele é uma classe abstrata. Isso faz sentido porque precisamos saber qual é o tipo de veículo que está sendo alugado, como um carro ou uma moto, já que cada um tem suas próprias regras.

**Pergunta 2:** Isso funciona porque todos os veículos herdam da classe Veiculo, mas cada um calcula o aluguel de uma forma diferente. Assim, o programa consegue usar o mesmo laço para todos. Esse conceito se chama polimorfismo.

**Pergunta 3:** O cálculo de recarga fica numa interface porque só os carros elétricos precisam desse recurso. Se estivesse na classe Veiculo, carros comuns e motos também teriam esse método, mesmo sem precisar dele. A interface permite separar esse comportamento e usar a recarga apenas nos veículos elétricos.
