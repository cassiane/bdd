$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/banco.feature");
formatter.feature({
  "line": 2,
  "name": "Testar as operacoes basicas de banco",
  "description": "O sistema deve prover operações básicas de banco de forma correta.",
  "id": "testar-as-operacoes-basicas-de-banco",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BancoTeste"
    }
  ]
});
formatter.background({
  "line": 6,
  "name": "cria todas as contas e associa ao banco",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "que as contas sao do \"Banco do Brasil\"",
  "rows": [
    {
      "cells": [
        "dono",
        "numero",
        "saldo"
      ],
      "line": 8
    },
    {
      "cells": [
        "Abias Corpus Da Silva",
        "111",
        "100"
      ],
      "line": 9
    },
    {
      "cells": [
        "Antônio Morrendo das Dores",
        "222",
        "200"
      ],
      "line": 10
    },
    {
      "cells": [
        "Carabino Tiro Certo",
        "333",
        "200"
      ],
      "line": 11
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Banco do Brasil",
      "offset": 22
    }
  ],
  "location": "BancoTestePassos.que_as_contas_sao_do(String,Conta\u003e)"
});
formatter.result({
  "duration": 9399226,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "scenario description",
  "description": "",
  "id": "testar-as-operacoes-basicas-de-banco;scenario-description",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "o calculo do total de contas criadas",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "o total de contas e 3",
  "keyword": "Then "
});
formatter.match({
  "location": "BancoTestePassos.o_calculo_do_total_de_contas_criadas()"
});
formatter.result({
  "duration": 61251,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 20
    }
  ],
  "location": "BancoTestePassos.o_total_de_contas_e(int)"
});
formatter.result({
  "duration": 135083,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "cria todas as contas e associa ao banco",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "que as contas sao do \"Banco do Brasil\"",
  "rows": [
    {
      "cells": [
        "dono",
        "numero",
        "saldo"
      ],
      "line": 8
    },
    {
      "cells": [
        "Abias Corpus Da Silva",
        "111",
        "100"
      ],
      "line": 9
    },
    {
      "cells": [
        "Antônio Morrendo das Dores",
        "222",
        "200"
      ],
      "line": 10
    },
    {
      "cells": [
        "Carabino Tiro Certo",
        "333",
        "200"
      ],
      "line": 11
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Banco do Brasil",
      "offset": 22
    }
  ],
  "location": "BancoTestePassos.que_as_contas_sao_do(String,Conta\u003e)"
});
formatter.result({
  "duration": 2240134,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "scenario description",
  "description": "",
  "id": "testar-as-operacoes-basicas-de-banco;scenario-description",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "o calculo do total de dinheiro",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "o total de dinheiro no banco e 500",
  "keyword": "Then "
});
formatter.match({
  "location": "BancoTestePassos.o_calculo_do_total_de_dinheiro()"
});
formatter.result({
  "duration": 46478311,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 31
    }
  ],
  "location": "BancoTestePassos.o_total_de_dinheiro_no_banco_e(Double)"
});
formatter.result({
  "duration": 110583,
  "status": "passed"
});
});