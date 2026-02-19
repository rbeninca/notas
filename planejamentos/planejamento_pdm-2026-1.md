


| # | Conteúdo                                                                                   | Carga Horária  |Data      | Link |
|---|--------------------------------------------------------------------------------------------|----------------|----------|------|
| 1 | [Plano de Ensino, Arquitetura Android,API, Estrutura Projeto,Iternacionalização](#1-aula-1) | 2h            |11/02/2026|      |
| 2 | [Ambiente de desenvolvimento, Ferramenta de Design e Tratamento Click](#2-aula-2)           | 2h            |25/02/2026|      |
| 3 | [Revisão aula 2](#3-aula-3)                                                                 | 2h            |//2026|      |
| 4 | [Eventos na interface, Activitys, ciclo de vida e  métodos de callback](#4-aula-4)          | 2h            |//2026|      |
| 5 | [Layouts e Organização Visual com ViewGroups](#5-aula-5)                                    | 2h            |//2026|      |
| 6 | [Intents, Navegação entre Activities e Ciclo de Vida](#6-aula-6)                            | 2h            |//2026|      |
| 7 | [Listagens ](#7-aula-7)                                                                     | 2h            |//2026|      |
| 8 | [Listagens ](#8-aula-8)                                                                     | 3h            |//2026|      |
| 9 | [Listagens ](#9-aula-9)                                                                     | 3h            |//2026|      |
|   | [Armazenamento Local com SharedPreferences e SQLite]                                        | 4h            |//2026|      |
|   | Permissões em Tempo de Execução e Acesso a Recursos do Sistema                              | 4h            |//2026|      |
|   | Multimídia: Áudio, Vídeo e Câmera                                                           | 4h            |//2026|      |
|   | Sensores e SensorManager                                                                    | 4h            |//2026|      |
|   | Geolocalização e Mapas com LocationManager                                                  | 4h            |//2026|      |
| Total|                                                                                          | 40h                  |      |

# Planejamento das Aulas
## 1. Aula 1 
### Plano de Ensino, Arquitetura Android, API, Estrutura Projeto, Iternacionalização
#### Tópicos
* **Plano de Ensino**: Apresentação dos conteúdos, avaliação, recuperação e cronograma.
* **História do Android**: Evolução do sistema operacional, principais versões e marcos.
* **Arquitetura do Android**: Camadas de software do Android (API).
* **Ambiente de Desenvolvimento Android Studio**: Criação de um projeto, configuração API, estrutura de pastas e arquivos de um projeto Android:Manifesto, Código Java/Kotlin, recursos RES, Emulador  e Ferramenta de Design de interface por XML.
* **Estrutura do projeto android pasta main/src**: Organização dos arquivos de código-fonte, incluindo pacotes, classes e recurso (res).
* **Internacionalização (i18n)**: Conceitos e práticas para tornar aplicativos acessíveis a diferentes idiomas e regiões.
### Objetivos
* Apresentar o plano de ensino e os conteúdos que serão abordados ao longo do curso
* Introduzir o desenvolvimento de aplicativos móveis, focando no Android
* Compreender a história do Android e sua evolução
* Familiarizar-se com a arquitetura do Android e o ambiente de desenvolvimento Android Studio
### Aplicações
* **Hello World**: Criação do primeiro aplicativo simples que exibe "Hello World" na tela.
* **Hello World Internacionalizado**: Criação de um aplicativo que exibe "Hello World" em diferentes idiomas, utilizando recursos de internacionalização.
<!--* **Contador de Cliques**: Aplicativo que conta cliques na tela e exibe o número centralizado.
* **Sorteio de Números Aleatórios**: Aplicativo que sorteia um número aleatório entre 0 e 100, exibindo o resultado na tela.  -->
<!--### Atividades
* **Atividade 1**: Criar um aplicativo que exiba "Hello World" na tela e permita a internacionalização para pelo menos dois idiomas diferentes.
 * **Atividade 2**: Desenvolver um contador de cliques que exiba o número de cliques em um TextView centralizado na tela.
* **Atividade 3**: Criar um aplicativo que sorteie um número aleatório entre 0 e 100 e exiba o resultado na tela.  -->

## 2. Aula 2
### Ambiente de desenvolvimento, Ferramenta de Design e Tratamento Click
#### Tópicos
- Associação de view declarada no XML com o código Java.
- Eventos de clique e interação do usuário;
### Objetivos
* Entender como associar views declaradas no XML com o código Java
* Aprender a capturar e responder a eventos de clique e interação do usuário
* Compreender o ciclo de vida das Activities e como gerenciar estados
* Compreender como os eventos de clique e interação do usuário funcionam no Android
* Entender o ciclo de vida das Activities e como gerenciar estados
* Aprender a utilizar métodos de callback para manipular eventos de forma eficiente
### Aplicações
* **Contador de Cliques**: Aplicativo que conta cliques na tela e exibe o número centralizado.
### Atividades
* **Atividade 1**: Criar um aplicativo que exiba um contador de cliques, onde cada clique em um botão incrementa o contador e exibe o número centralizado na tela.

## 3. Aula 3
## Revisão Aula anterior 
### Tópicos
- Recuperação do repósitório de código com *git clone*.
- Criação de *branchs* locais vínculadas as branchs remotas com *git checkout -b nomeBranch   nomeRemoto/nomeBranch.
- Navegação entre as *branchs* do repositório com *git checkout branch*.
- Movimentação da referência de uma branch com *git reset --hard*
- Edição elemento TextView por meio da ferramenta de design. 

## 4. Aula 4
### Ciclo de Vida das Activities 
- Ciclo de vida das Activities;
- Métodos de callback e manipulação de eventos;
    - onCreate
    - onStart
    - onResume
    - onPause
    - onStop
    - onDestroy
### Métodos de Callback
- Definição e importância dos métodos de callback
- Exemplos de uso de métodos de callback no ciclo de vida das Activities

### Atividades
* **Atividade 1**: Criar um aplicativo que utilize métodos de callback para gerenciar eventos de clique em botões.
* **Atividade 2**: Implementar um aplicativo que demonstre o ciclo de vida das Activities, utilizando os métodos de callback para gerenciar estados.
* **Ciclo de Vida das Activities**: Aplicativo que demonstra o ciclo de vida das Activities, salvando e restaurando o estado do contador de cliques ao girar a tela ou mudar de atividade.
* **Sorteio de Números Aleatórios**: Aplicativo que sorteia um número aleatório entre 0 e 100, exibindo o resultado na tela.



## 4. Aula 4.
### Layouts e Recursos
#### Tópicos
- Estruturas de layout no Android (LinearLayout, RelativeLayout, ConstraintLayout)
- Criação de layouts XML
- Utilização de recursos (strings, cores, dimensões)
### Objetivos
* Compreender as diferentes estruturas de layout disponíveis no Android
* Aprender a criar e modificar layouts XML
* Entender como utilizar recursos para tornar o aplicativo mais flexível e adaptável
### Conteúdo
* **Estruturas de Layout**: Comparação entre LinearLayout, RelativeLayout e ConstraintLayout
* **Criação de Layouts XML**: Como criar e modificar arquivos de layout XML
* **Utilização de Recursos**: Como utilizar recursos de strings, cores e dimensões em um aplicativo
### Aplicações
* **Contador de Cliques**: Aplicativo que conta cliques na tela e exibe o número centralizado.
* **Sorteio de Números Aleatórios**: Aplicativo que sorteia um número aleatório entre 0 e 100, exibindo o resultado na tela.
* **Ciclo de Vida das Activities**: Aplicativo que demonstra o ciclo de vida das Activities, salvando e restaurando o estado do contador de cliques ao girar a tela ou mudar de atividade.

### Atividades
* **Atividade 1**: Criar um aplicativo que exiba um contador de cliques, onde cada clique em um botão incrementa o contador e exibe o número centralizado na tela.
* **Atividade 2**: Implementar um aplicativo que utilize o  ciclo de vida das Activities para salvar e restaurar o estado do contador de cliques ao girar a tela ou mudar de atividade.
* **Atividade 3**: Desenvolver um aplicativo que sorteie um número aleatório entre 0 e 100 e exiba o resultado na tela, com um botão para gerar um novo sorteio.
