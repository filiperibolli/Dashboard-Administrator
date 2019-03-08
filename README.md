# Sistema Cesta de Serviços
**Dashboard-Administrator** Dashboard e log viwer do sistema baseado em BigData cesta de serviços

### Menu do dashboard
**Menu** Menu onde podemos facilmente escolher entre ver o dashboard com as estatísticas obtidas a partir das análises dos dados
**Tecnologias Utilizadas**
* Java 8
* Spring MVC
* Maven
* HTML 5
* Bootstrap
* Jquery
![Menu PrintScreen](https://i.imgur.com/Wno9jE9.png)

### Robô gerador do log para análise da stream BigData

**Funcionamento do robô** Quando startamos a aplicação Dashboard-Administrator um bean inicializar cria uma schadule com um timelapse
que cria uma linha de log a cada 5 segundos.

**Documento de log**
1.Random UUID for id
2.Agency Number
3.Account Number
4.ServiceBasketType
5.Transaction value
6.Balance after transaction
7.Midia
8.Security device
9.Holder
10.Pessoa fisica ou juridica

**Exemplo de log:**
bc17a0bf-5142-4058-9954-e8a10482bda6	11	22	2	92615	478043	1	1	2	2
25860b40-ff88-4747-8d02-4cd5228020f7	16	7	2	2053	810733	2	4	2	1
7d7cdf12-9734-4026-aa3b-dbab25e8d1f6	9	16	1	25470	653309	2	5	2	2
d35d2291-7ef1-4c7e-be77-2ee8032f9ade	11	12	2	57327	119922	2	4	2	2
39b89b39-bf87-4e0b-8991-944ff4caeff5	3	25	1	55029	553937	3	3	1	2
0371abc0-4ba7-4c50-91e6-c65dcda795e5	6	29	1	23025	57782	3	3	2	1

