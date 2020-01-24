# Jogo 2048

## Projeto do Jogo 2048 em Java com Reconhecimento de Imagem, usando "Example of TensorFlow", Reconhecimento de Voz, "Web Service" e Micro Serviços. 

### Descrição do Projeto
* O jogo 2048, consiste num jogo de uma matriz 4×4 quadrados e começa com dois dos espaços completos com o número 2, no decorrer do jogo, continua aparecendo quadrados aleatórios na matriz sendo de 2 ou 4, tendo 20% apenas de chance de aparecer o 4. Se o bloco encostar em outro com o mesmo número eles se somam, transformar apenas em um bloco de número maior e aparece uma animação indicando qual é o resultado dessa soma, sendo sempre potência de 2, e automaticamente já é comutado o seu ponto no quadro de pontuação. Se caso não somarem, indicaram que os blocos possuem valores diferentes. O objetivo do jogo é alcançar um bloco com a soma de 2048, não importando tanto a sua pontuação. No nosso jogo, quando não tiver mais movimento ou formar 1 bloco de 2048 abrirá uma nova aba que obtém mais 2 botões para jogar novamente ou fechar o jogo.
* Adaptamos o jogo para que possa realizar movimentações de diferentes maneiras, conforme o usuário preferir, podendo primeiramente ser através do teclado, clicando com o mouse nas setas na tela. E também, com o uso do aplicativo que desenvolvendo, pressionando botões na tela do aplicativo, virando o celular indicando a movimentação da tela (só sendo possível com celular que tem acelerômetro), reconhecimento de imagem, no qual selecionamos 4 objetos que definem cada respectivo movimento, e por fim, através da voz.  

### Aplicativo
* **Tela inicial de controle**, disponibilizando ao usuário, a opção de *BOTÕES*, *CÂMERA*, *VOZ*, e por último, a opção de *SAIR DO JOGO*.  
![image](https://user-images.githubusercontent.com/56207941/73106283-d6281d80-3ed9-11ea-9e20-efbfc19ad38b.png)

* **Tela de controle de setas e por acelerômetro**, como o nome já diz, é a tela de controle manual do jogo, selecionando uma direção através de botão ou virando o celular através do acelerômetro, tendo um switch que possibilita ativação ou não do acelerômetro, no canto superior esquerdo.  
![image](https://user-images.githubusercontent.com/56207941/73106339-f35cec00-3ed9-11ea-9bee-8a8b110d3df5.png)  

* **Tela da câmera**, onde inicialmente pede permissão para acessar a câmera do dispositivo. Essa opção é possível estar fotografando objetos para realizar a detecção e o reconhecimento da imagem, podendo realizar um dos quatro movimentos se for um dos quatro objetivos que definimos para respectivo movimento.  
![image](https://user-images.githubusercontent.com/56207941/73106390-125b7e00-3eda-11ea-81ea-e16e9692155a.png)  

* **Tela de voz**, podendo reconhecer a voz e realizar a movimentação dos blocos conforme é falado a direção desejada.  
![image](https://user-images.githubusercontent.com/56207941/73106415-28693e80-3eda-11ea-9416-53ee7a50625a.png)  

### Jogo no computador
* **Tela inicial do jogo**, há 3 opções no menu, *INICIAR* que iniciará o jogo com sua real funcionalidade, *CRÉDITOS* onde será redirecionado para  página onde encontrará o link para nosso *GIT* e os produtores do jogo, e por fim, a opção *SAIR*, que fechará o jogo, *Não precisando do aplicativo para jogar o jogo no computador, movimentando pelo teclado*.   
![Telainicial](https://user-images.githubusercontent.com/48132623/65742028-d3045880-e0c4-11e9-83fb-03c46b847c3c.png)  

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
  
* Também será necessário instalar o Android Studio para devolver o aplicativo do zero, e também, para compilar, gerar o *APK* e instalar no dispositivo móvel. Abaixo estará sendo disponibilizado um tutorial de como estar instalando em relação a compatibilidade do seu sistema operacional:  

* <a> [Tutorial de como instalar o Android Studio: Necessário para o desenvolvimento do projeto](https://developer.android.com/studio/install?hl=pt-br)  
  
### Desenvolvimento
* Git clone https://github.com/giulysanfins/2048-Java.git  
* Se realizar "Download ZIP", necessita de um descompactado de arquivos.  
* Após ter instalado o NetBeans ou outro programa similar, execute-o e selecione "arquivo" e depois "abrir projeto".  
* Abrir arquivo do aplicativo no Android Studio, compilar, gerar o APK e instalar aplicativo no celular.  
* Selecione o diretório que deseja executar onde está salvo o arquivo e depois selecione a opção abrir.  
* Logo em seguida, selecione a opção executar e o jogo começará a ser executado e o usuário poderá estar jogando.  

### Controles no computador
* **W / A / S / D** - Controlam as direções Cima, Esquerda, Direita e Baixo, respectivamente;  
* **Clique do mouse nas setas na tela** - Controlam as direções Cima, Esquerda, Direita e Baixo, respectivamente, em relação ao gesto realizado;  
* **↑, ←, →, ↓** - Controlam as direções Cima, Esquerda, Direita e Baixo, respectivamente.  

### Controles no Aplicativo
* Na tela seta, é possível estar pressionando a tecla em relação a direção desejada. E também, pelo acelerômetro do dispositivo, podendo verificar na tela através de um *TextView* as direções conforme vira o celular e movimenta-o, tendo um switch que possibilita ativação ou não do acelerômetro, no canto superior esquerdo.  

* Na tela da câmera, é possível realizar as movimentações através de reconhecimento de imagem, onde selecionamos e já definimos quatro imagens para respectivo movimento, abaixo é possível verificar a detecção e reconhecimento do objeto, onde foi realizado o movimento no jogo simultaneamente.  

* Detecção do *notebook* e a realização do movimento para cima:  
![image](https://user-images.githubusercontent.com/56207941/73106626-99a8f180-3eda-11ea-9766-eaa6d5a5cba5.png)  

* Detecção do *wallet* e a realização do movimento para baixo:  
![image](https://user-images.githubusercontent.com/56207941/73106646-a75e7700-3eda-11ea-8d65-fc56a5c3d143.png)  

* Detecção do *iPod* e a realização do movimento para esquerda:  
![image](https://user-images.githubusercontent.com/56207941/73106672-b47b6600-3eda-11ea-83f8-f45fc0e10d7a.png)  

* Detecção do objeto que consideramos um *rubber eraser* e a realização do movimento para direita:  
![image](https://user-images.githubusercontent.com/56207941/73106697-c230eb80-3eda-11ea-8996-da1ae32615c1.png)  

### Interface Do Usuário no computador e aplicativo
* Contém um Score que mostra a pontuação em tempo de execução;
* Contém um Recorde, onde fica salvo a pontuação de maior valor, foi utilizado *Arquivo* (escrita e leitura de dados em arquivos *.txt*) para realizar esse método. Esse arquivo foi salvo no diretório: “2048-Java/2048_Game/build/classes/", que se encontra nesse repositório, podendo estar alterando o recorde do jogo através do valor na sua primeira linha, do arquivo *SaveHighScore.txt*, iniciado com 0 como padrão.
* Opção de começar um novo jogo, clicando no quadrado *REINICIAR*;
* Opção para retornar a última jogada, clicando no quadrado que tem uma seta indicando retornar.
* Se o usuário conseguir juntar um bloco com 2048, indica que venceu o jogo, aparecendo uma nova tela que mostra que o usuário venceu, e permite que selecione a opção *JOGAR NOVAMENTE* ou a *SAIR*.
* Se o usuário não tiver mais movimentações, ou seja, todos os blocos ocupados, e sem nenhum bloco vizinho semelhante, indica que perdeu o jogo, aparecendo uma nova tela que mostra que o usuário perdeu, e permite que selecione a opção *JOGAR NOVAMENTE* ou a *SAIR*.

### Bibliotecas Utilizadas
* Precisa estar instalando e importando no NetBeans, as bibliotecas necessárias do projeto, pode estar sendo encontrado no diretório *Bibliotecas necessárias* neste repositório do GitHub.
 
### *Easter Egg* do Jogo
* Se clicar na *Hello Kitty* que fica em movimento no programa no computador ou na *Hello Kitty* central entre as setas na tela de controle manual do seu smartphone, aparece uma possibilidade direta de ganhar, aparecendo 2 blocos de 1024, quando somados você ganha!

### Dicas Para Vencer O *JOGO 2048*
* <a> [Dicas do site *RachaCuca* para vencer o jogo](https://rachacuca.com.br/raciocinio/2048/)
 
### Desenvolvedores
* Giuliano Sanfins.
* Murilo de Paula Araujo.
* Victor Reis. 

### Contribuições
- Contribuições e possíveis melhorias, no nosso ponto de vista são sempre bem-vindas. Bom jogo e divirta-se!
