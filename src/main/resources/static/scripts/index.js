const init = () => {
    console.log("hi");
    const listNode = document.getElementById("productList");
    fetch("/api/products")
            .then(response => response.json())
            .then(products => products.forEach(product => {
                const listElement = document.createElement("li");
                listElement.innerHTML = `${product.title} (${product.description})`;

                const imgElement = document.createElement("img");
                imgElement.setAttribute("alt","book cover");
                imgElement.setAttribute("src",product.coverUrl);

                listElement.appendChild(imgElement);
                listNode.appendChild(listElement);
            }));
}

document.addEventListener("DOMContentLoaded", init)