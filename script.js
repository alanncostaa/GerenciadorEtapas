function mostrarDetalhes(empresaId) {
    // Redireciona para a página de detalhes com base no ID da empresa
    window.location.href = 'detalhes-empresa.html?id=' + empresaId;
}

function mudarStatusEmpresa(select, empresaId) {
    const empresa = document.getElementById(empresaId);
    const novoStatus = select.value;
    const novoProcesso = document.getElementById(novoStatus);

    // Move a empresa para o novo processo
    novoProcesso.querySelector('.empresas').appendChild(empresa);

    // Opcionalmente, você pode descomentar a seguinte linha para habilitar novamente o dropdown
    // select.disabled = false;
}

function anexarArquivos() {
    const inputArquivos = document.getElementById('arquivo');
    const arquivosAnexadosDiv = document.getElementById('arquivosAnexados');
    const statusDropdown = document.getElementById('statusAnexarArquivos');

    // Verifica se há arquivos selecionados
    if (inputArquivos.files.length > 0) {
        for (const arquivo of inputArquivos.files) {
            // Simula o envio para o servidor (ajuste conforme a integração com seu backend)
            // Aqui você pode salvar o arquivo e registrar a data/hora do anexo
            const dataHoraAnexo = new Date().toLocaleString();
            const mensagem = `Arquivo: ${arquivo.name}, Data/Hora do Anexo: ${dataHoraAnexo}`;
            const p = document.createElement('p');
            p.textContent = mensagem;
            arquivosAnexadosDiv.appendChild(p);
        }

        // Limpa o campo de seleção de arquivos
        inputArquivos.value = '';

    }
}

function adicionarComentario(etapa) {
    const comentarioInput = document.getElementById(`comentarioAnexarArquivos`);
    const comentariosDiv = document.getElementById(`comentariosApresentar`);

    // Simula o envio para o servidor (ajuste conforme a integração com seu backend)
    // Aqui você pode salvar o comentário e registrar a data/hora do comentário
    const dataHoraComentario = new Date().toLocaleString();
    
        const comentario = `${comentarioInput.value.trim()} - ${dataHoraComentario}`;
        const p = document.createElement('p');
        p.textContent = comentario;
        comentariosDiv.appendChild(p);

        // Limpa o campo de comentário
        comentarioInput.value = '';
    
}
