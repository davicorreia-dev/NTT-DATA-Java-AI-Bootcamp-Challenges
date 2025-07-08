document.addEventListener('DOMContentLoaded', function () {
    const buttons = document.querySelectorAll('table tbody button');
    buttons.forEach(function (button) {
        button.addEventListener('click', function () {
            const row = button.closest('tr');
            const modelo = row.children[0].textContent;
            const ano = row.children[1].textContent;
            const cor = row.children[2].textContent;
            alert(`Carro vendido!\nModelo: ${modelo}\nAno: ${ano}\nCor: ${cor}`);
        });
    });
});