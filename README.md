Teste de Integração
Prof. Bernardo Copstein

Exercício sobre teste de integração

Imagine um computador hipotético onde as únicas operações disponíveis sobre números inteiros são “+1” e “-1”. Neste computador deve ser desenvolvido um conjunto de classes que permitam que se façam operações mais complexas. A classe “Numero” é a classe mais básica encapsula as operações básicas de incremento e decremento. A classe “Somador” oferece as operações de soma e subtração. A classe “Multiplicador” oferece multiplicação e divisão a partir de somas e subtrações sucessivas. As classes “Fatorial”, “Fibonnaci” e “Potencia” oferecem as operações de mesmo nome a partir de um somador ou de um multiplicador. Outras poderiam depender de ambas (veja o diagrama de classes da figura).
 
 <img src="https://user-images.githubusercontent.com/39394861/83958563-a6a2fd80-a849-11ea-9687-47d0c9e297c6.png">

O código das classes “Numero” e “Somador” é fornecido pelo professor. Analise o código destas classes e a interface pública de todas a faça o que se pede:
a)	Crie um projeto Java/Maven/GitHub para este projeto. Use o “.pom” fornecido pelo professor.
b)	Inclua o código das classes “Numero” e “Somador” no projeto e crie o “esqueleto” das demais conforme o diagrama de classes.
c)	Crie um conjunto de casos de teste unitário para cada uma das classes.
d)	Defina a ordem de integração das classes.
e)	Defina um conjunto de casos de teste de integração para cada par/trio de classes que serão integradas.
f)	Implemente todas as classes.
g)	Submeta seu código ao “Sonnar Cloud”: teste as classes, anote os defeitos encontrados, anote as demais “issues” detectadas, remova os eventuais defeitos, code smells e outras “issues” encontrados e teste novamente até que não restem defeitos.
h)	Faça a análise de cobertura dos casos de teste, crie casos se necessário e repita o processo de teste e eliminação de defeitos.
i)	Gere um relatório contendo todos os artefatos e descrevendo o processo completo.
j)	Submeta no Moodle o relatório na forma de texto (não arquivo). O relatório deve conter os links para o projeto tanto no GitHub como no Sonnar Cloud.


