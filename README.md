# Jogo 2048

## Projeto do Jogo 2048 em Java com Reconhecimento de Imagem, usando "Example of TensorFlow", Reconhecimento de Voz, "Web Service" e Micro Serviços. 

### Descrição do Projeto
* O jogo 2048, consiste num jogo de uma matriz 4×4 quadrados e começa com dois dos espaços completos com o número 2, no decorrer do jogo, continua aparecendo quadrados aleatórios na matriz sendo de 2 ou 4, tendo 20% apenas de chance de aparecer o 4. Se o bloco encostar em outro com o mesmo número eles se somam, transformar apenas em um bloco de número maior e aparece uma animação indicando qual é o resultado dessa soma, sendo sempre potência de 2, e automaticamente já é comutado o seu ponto no quadro de pontuação. Se caso não somarem, indicaram que os blocos possuem valores diferentes. O objetivo do jogo é alcançar um bloco com a soma de 2048, não importando tanto a sua pontuação.
* Adaptamos o jogo para que possa realizar movimentações de diferentes maneiras, conforme o usuário preferir, podendo primeiramente ser através do teclado, clicando com o mouse nas setas na tela. E também, com o uso do aplicativo que desenvolvendo, pressionando botões na tela do aplicativo, virando o celular indicando a movimentação da tela (só sendo possível com celular que tem acelerômetro), reconhecimento de imagem, no qual selecionamos 4 objetos que definem cada respectivo movimento, e por fim, através da voz.

* **Tela inicial do jogo**, disponibilizando ao usuário, a opção de *BOTÕES* que direciona para tela de controle manual do jogo, selecionando uma direção através de botão ou virando o celular através do acelerômetro. Opção *CÂMERA*, onde é possível estar fotografando objetos para realizar a detecção e o reconhecimento da imagem, podendo realizar um dos quatro movimentos se for um dos quatro objetivos que definimos para respectivo movimento. A opção de *VOZ*, podendo reconhecer a voz e realizar a movimentação dos blocos, e por último, a opção de *SAIR DO JOGO*:

### Pré-requisitos

#### Sistema Operacional
* Foi utilizado o Windows 10, mas pode ser realizado em outro sistema operacional, necessita instalar o compilador compatível com o sistema operacional.

 #### Ambiente de Desenvolvimento Integrado (IDE) Java
* Foi utilizado o NetBeans, que é um ambiente de desenvolvimento integrado (IDE) Java desenvolvido pela empresa Sun Microsystems.
* <a> [Obter informações sobre o NetBeans](https://www.oficinadanet.com.br/artigo/1061/o_que_e_o_netbeans)
  
* Foi utilizado também o Android Studio, que é um Ambiente de desenvolvimento integrado (IDE) oficial para o desenvolvimento de apps Android e é baseado no IntelliJ IDEA.
* <a> [Obter informações sobre o Android Studio](https://developer.android.com/studio/intro?hl=pt-br)

* **Observação:** Para desenvolver este projeto, precisa apenas de conhecimentos básicos sobre lógica de programação, criação de aplicativo no Android Studio e linguagem Java.

### Guia de Instalação
* Para executar o programa na linguagem Java, no qual o algoritmo foi realizado, necessita apenas de um ambiente de desenvolvimento integrado (IDE) Java, no caso do projeto, foi utilizado o NetBeans, mas pode ser usado outra plataforma, precisando também estar instalando o aplicativo no celular, no qual estará sendo disponibilizado neste repositório. Para instalar o NetBeans, é necessário instalar o JDK, abaixo pode ser observado um tutorial, de como instalar o JDK e depois o NetBeans em relação a compatibilidade do seu sistema operacional:

* <a> [Tutorial de como instalar o JDK e o NetBeans: Necessário para o desenvolvimento do projeto](https://www.oficinadanet.com.br/post/16771-netbeans-requisitos-e-como-instalar)
  
* Também será necessário instalar o Android Studio para devolver o aplicativo do zero, abaixo estará sendo disponibilizado um tutorial de como estar instalando em relação a compatibilidade do seu sistema operacional:

* <a> [Tutorial de como instalar o Android Studio: Necessário para o desenvolvimento do projeto](https://developer.android.com/studio/install?hl=pt-br)
  
  
Para executar o jogo, deve-se primeiro clonar o arquivo, e abrir o projeto no Netbeans, e compilá-lo.

Ao executa-lo, há 3 opções no menu, "Iniciar" que iniciara o jogo com sua real funcionalidade, "Créditos" onde será redicionado para  página onde encontrará o link para nosso git e os produtores do jogo, "Sair" o fechará.

Em game: O jogo funciona com as teclas WASD e SETAS, no mouse, basta clicar nas setas indicadas na tela, o botão de reiniciar resetará o jogo com 2 quadrados, a seta indicando retorno, voltará 1 jogada, há também 1 easteregg que cabe ao jogador descobri-lo. 

Quando não tiver mais movimento ou formar 1 bloco de 2048 abrirá uma nova aba que obtém mais 2 botões para jogar novamente ou fechar o jogo.

### Desenvolvedores
* Giuliano Sanfins.
* Murilo de Paula Araujo.
* Victor Reis. 

Bom jogo e divirta-se.

![Telainicial](https://user-images.githubusercontent.com/48132623/65742028-d3045880-e0c4-11e9-83fb-03c46b847c3c.png)
