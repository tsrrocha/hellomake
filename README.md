# hellomake
Projeto simples destinado a orientar os estudantes do curso de **Introdução ao Desenvolvimento para Linux Embarcado usando o Yocto Project** a criarem uma receita de um simples aplicativo, fazer a compilação através da ferramenta *make*, e instalação em uma distribuição customizada para linux embarcado utilizando o *Yocto Project*.

Este projeto é uma receita (recipes) de software a ser utilizado pelo Yocto Project, Ele contem o arquivo *metadata* **hellomake_1.0.bb** de receita para o *OpenEmbedded Build System* construir o pacote de software e instalá-lo na distribuição customizada do linux embarcado.

---

### O código fonte do aplicativo
O código fonte do aplicativo está na pasta *hellomake-1.0* e será utilizado na receita de forma compactada ***.tar.gz*** para fins didático. este código será compilado automaticamente pelo *OpenEmbedded Build System* na tarefa **do_compile**.

### O que este aplicativo faz?
Este aplicativo apenas escreve na saída padrão **stdout** uma simples mensagem.

### Árvore de arquivos do projeto:
+ **[hellomake](https://github.com/tsrrocha/hello)**<br />
  |  *[hellomake_1.0.bb](https://github.com/tsrrocha/hellomake/blob/master/hellomake_1.0.bb)*<br/>
  +  **[hellomake-1.0](https://github.com/tsrrocha/hellomake/tree/master/hellomake-1.0)**<br/>
  |  *[hellomake.c](https://github.com/tsrrocha/hellomake/blob/master/hellomake-1.0/hellomake.c)*<br/>
  |  *[hellomake.h](https://github.com/tsrrocha/hellomake/blob/master/hellomake-1.0/hellomake.h)*<br/>
  |  *[hellomakeprint.c](https://github.com/tsrrocha/hellomake/blob/master/hellomake-1.0/hellomakeprint.c)*<br/>
  |  *[hellomakeprint.h](https://github.com/tsrrocha/hellomake/blob/master/hellomake-1.0/hellomakeprint.h)*<br/>
  |  *[hellomake-1.0.tar.gz](https://github.com/tsrrocha/hellomake/blob/master/hellomake-1.0/hellomake-1.0.tar.gz)*<br/>
  
  ---
  
