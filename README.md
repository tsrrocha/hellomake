# hellomake
Projeto simples destinado a orientar os estudantes do curso de **Introdução ao Desenvolvimento para Linux Embarcado usando o Yocto Project** a criarem uma receita de um simples aplicativo, fazer a compilação através da ferramenta *make*, e instalação em uma distribuição customizada para linux embarcado utilizando o *Yocto Project*.

Este projeto é uma receita (recipes) de software a ser utilizado pelo Yocto Project. Ele contem o arquivo *metadata* **hellomake_1.0.bb** de receita, com as informações necessárias para o *OpenEmbedded Build System* construir o pacote de software e instalá-lo na distribuição customizada para linux embarcado.

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
  
### Como gerar o código-fonte compactado?
Considerando que você, utilizando o console de comandos do linux, esteja dentro da pasta raiz do projeto: *hellomake*, execute os seguintes comandos (sem o carácter "**$**" ) para compactar o código-fonte que será utilizado pela receita ***hello_1.0.bb***.

`$ rm -f ./hellomake-1.0/hellomake-1.0.tar.gz` <br/>
`$ tar -czf hellomake-1.0.tar.gz ./hellomake-1.0`<br/>
`$ mv ./hellomake-1.0.tar.gz ./hellomake-1.0/`<br/>

**Observação:** Sempre que você alterar qualquer informação nos arquivos do projeto você deverá recompactar o código-fonte utilizando os comandos acima.

---

### Arquivo de receita **hellomake_1.0.bb**
#### do_install()
Esta tarefa será executada no momento da instalação do nosso software **Hellomake** no *Sistema de Arquivo Principal* do sistema, o **rootfs**.
Então, o *OpenEmbedded Build Sistem* irá instalar o nosso executável em ***/usr/bin/hellomake*** através do comando:<br/> 
`$ oe_runmake install DESTDIR=${D} BINDIR=${bindir} SBINDIR=${sbindir} MANDIR=${mandir} INCLUDEDIR=${includedir}`.<br/>
Com isso, o nosso software estará pronto para ser utilizado.


---


Para clonar o repositório basta executar o seguinte comando:
`$ git clone https://github.com/tsrrocha/hellomake.goe_runmake install DESTDIR=${D} BINDIR=${bindir} SBINDIR=${sbindir} MANDIR=${mandir} INCLUDEDIR=${includedir}oe_runmake install DESTDIR=${D} BINDIR=${bindir} SBINDIR=${sbindir} MANDIR=${mandir} INCLUDEDIR=${includedir}oe_runmake install DESTDIR=${D} BINDIR=${bindir} SBINDIR=${sbindir} MANDIR=${mandir} INCLUDEDIR=${includedir}oe_runmake install DESTDIR=${D} BINDIR=${bindir} SBINDIR=${sbindir} MANDIR=${mandir} INCLUDEDIR=${includedir}it`

---

Desenvolvedor: **Tiago Sousa Rocha** < <tsrrocha@gmail.com> > <br/>
Whatsapp: **(83) 9 8111-5793**