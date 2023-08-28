# Aplicação Mulesoft Varejo

Codificação de aplicação de Varejo usando Java com Mulesoft foi desenvolvida para gerenciar os processos de varejo usei o banco de dados MySQ e para implementação de fluxos incluindo checkout, gestão de clientes, inventário e mais.

## Fluxos

### 1. checkout-flow.xml
Este fluxo é responsável pelo processo de checkout, incluindo a validação do carrinho, aplicação de descontos e finalização da compra.

### 2. customer-flow.xml
Este fluxo gerencia as operações relacionadas aos clientes, como criação, atualização, exclusão e consulta de informações do cliente.

### 3. inventory-flow.xml
O fluxo de inventário lida com o gerenciamento de estoque, incluindo a adição de novos produtos ao estoque, atualização de quantidades e monitoramento de níveis de estoque.

### 4. main-flow.xml
Este é o fluxo principal da aplicação, que coordena e direciona as chamadas para os outros fluxos conforme necessário.

### 5. Produto.xml
Este fluxo é dedicado ao gerenciamento de produtos, incluindo criação, atualização, exclusão e consulta de informações do produto.

### 6. varejo-mulesoft.xml
Este fluxo é uma visão geral do processo de varejo, integrando todos os outros fluxos e garantindo uma operação suave.

## Configuração de Ambiente

### Ambiente de Desenvolvimento (Dev)

1. Clone o repositório: `git clone [URL_DO_REPOSITORIO]`.
2. Navegue até a pasta do projeto: `cd pasta_do_projeto`.
3. Configure as variáveis de ambiente conforme necessário para o ambiente de desenvolvimento.
4. Inicie a aplicação Mulesoft em modo de desenvolvimento.

### Ambiente de Produção (Prod)

1. Clone o repositório: `git clone [URL_DO_REPOSITORIO]`.
2. Navegue até a pasta do projeto: `cd pasta_do_projeto`.
3. Configure as variáveis de ambiente conforme necessário para o ambiente de produção.
4. Inicie a aplicação Mulesoft em modo de produção.



### Autor:
Emerson Amorim

