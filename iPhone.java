interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos das interfaces

    @Override
    public void tocar() {
        // Lógica para tocar música
    }

    @Override
    public void pausar() {
        // Lógica para pausar música
    }

    @Override
    public void selecionarMusica(String musica) {
        // Lógica para selecionar uma música específica
    }

    @Override
    public void ligar(String numero) {
        // Lógica para fazer uma ligação
    }

    @Override
    public void atender() {
        // Lógica para atender uma chamada
    }

    @Override
    public void iniciarCorreioVoz() {
        // Lógica para iniciar o correio de voz
    }

    @Override
    public void exibirPagina(String url) {
        // Lógica para exibir uma página na internet
    }

    @Override
    public void adicionarNovaAba() {
        // Lógica para adicionar uma nova aba no navegador
    }

    @Override
    public void atualizarPagina() {
        // Lógica para atualizar a página exibida
    }
}
