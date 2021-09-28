"# projetociss"
/*Desenvolva um software comercial. O qual permite manter o cadastro de clientes, fornecedores e vendedores, o mesmo deve manter o cadastro de usuários, deve também permitir a realização de compras e vendas.
O software deve imprimir uma espécie de relatório com as vendas e compras realizadas.

        Ao iniciar o sistema deve-se realizar o login (deve-se possuir um usuário default cadastrado no banco de dados), caso o login seja aprovado apresentar o seguinte menu ao usuário.

        Cliente
        Cadastrar
        Pesquisar
        Editar
        Excluir

        Vendedor
        Cadastrar
        Pesquisar
        Editar
        Excluir

        Fornecedor
        Cadastrar
        Pesquisar
        Editar
        Excluir

        Usuário
        Cadastrar
        Pesquisar
        Editar
        Excluir

        Produto
        Cadastrar
        Pesquisar
        Editar
        Excluir

        Compras
        Realizar Compra
        Pesquisar Compras pelo código do Fornecedor
        Editar Compra
        Excluir Compra

        Vendas
        Realizar Venda
        Pesquisar Vendas pelo código do Cliente
        Editar Venda
        Excluir Venda

        Relatório
        Compras
        Vendas


        Devem ser desenvolvidas todas as funções apresentadas no menu.
        A atualização do estoque do produto vai ser gerida através das compras e vendas realizadas no sistema. Caso seja realizada uma compra o saldo atual de estoque do produto irá aumentar, caso seja realizada uma venda o saldo atual de estoque do produto irá diminuir. Caso uma compra ou venda seja excluída ou editada também deverá atualizar o saldo de estoque atual do produto (se necessário).

        Classes e seus atributos:

        Cliente:
        id
        nome
        cpf
        email
        telefone
        rua
        numero
        complemento
        bairro
        cidade
        uf

        Vendedor:
        id
        nome
        cpf
        email
        telefone
        rua
        numero
        complemento
        bairro
        cidade
        uf

        Usuario:
        id
        usuario
        senha
        idVendedor

        Fornecedor:
        id
        razaoSocial
        cnpj
        email
        telefone
        rua
        numero
        complemento
        bairro
        cidade
        uf

        Produto:
        id
        descricao
        codigoBarras
        fabricante
        qtdEstoque
        preco

        Compra:
        id
        idFornecedor
        dtCompra
        produtos[ ]
        idProduto
        qtd

        Venda:
        id
        idCliente
        idVendedor
        dtVenda
        produtos[ ]
        idProduto
        qtd

        Clientes, vendedores e fornecedores deverão ser gravados na tabela PESSOA, para identificar o tipo do cadastro, na coluna TIPO deve-se usar:
        C - Cliente;
        V - Vendedor;
        F - Fornecedor;

        As compras serão gravadas na tabela COMPRA e os produtos na tabela ITEM_COMPRA.
        As vendas serão gravadas na tabela VENDA e os produtos na tabela ITEM_VENDA.

        TABELAS:

        CREATE TABLE PESSOA(
        ID INTEGER  NOT NULL GENERATED ALWAYS AS
        IDENTITY (START WITH 1 INCREMENT BY 1),
        NOME VARCHAR(250),
        CPFCNPJ VARCHAR(20),
        EMAIL VARCHAR(250),
        TELEFONE VARCHAR(20),
        RUA VARCHAR(250),
        NUMERO VARCHAR(20),
        COMPLEMENTO VARCHAR(250),
        BAIRRO VARCHAR(250),
        CIDADE VARCHAR(250),
        UF VARCHAR(2),
        TIPO VARCHAR(1)
        );

        CREATE TABLE USUARIO(
        ID INTEGER  NOT NULL GENERATED ALWAYS AS
        IDENTITY (START WITH 1 INCREMENT BY 1),
        USUARIO VARCHAR(250),
        SENHA VARCHAR(250),
        IDVENDEDOR INTEGER
        );

        CREATE TABLE PRODUTO(
        ID INTEGER  NOT NULL GENERATED ALWAYS AS
        IDENTITY (START WITH 1 INCREMENT BY 1),
        DESCRICAO VARCHAR(250),
        CODIGOBARRAS VARCHAR(13),
        FABRICANTE VARCHAR(250),
        QTDESTOQUE INTEGER,
        PRECO INTEGER
        );

        CREATE TABLE COMPRA(
        ID INTEGER  NOT NULL GENERATED ALWAYS AS
        IDENTITY (START WITH 1 INCREMENT BY 1),
        IDFORNECEDOR INTEGER,
        DTCOMPRA TIMESTAMP
        );

        CREATE TABLE ITEM_COMPRA(
        IDCOMPRA INTEGER  NOT NULL ,
        IDPRODUTO INTEGER,
        QTDPRODUTO INTEGER
        );

        CREATE TABLE VENDA(
        ID INTEGER  NOT NULL GENERATED ALWAYS AS
        IDENTITY (START WITH 1 INCREMENT BY 1),
        IDCLIENTE INTEGER,
        IDVENDEDOR INTEGER,
        DTVENDA TIMESTAMP
        );

        CREATE TABLE ITEM_VENDA(
        IDVENDA INTEGER  NOT NULL ,
        IDPRODUTO INTEGER,
        QTDPRODUTO INTEGER
        );*/