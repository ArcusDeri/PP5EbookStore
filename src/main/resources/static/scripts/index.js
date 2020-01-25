const init = () => {
    console.log("hi");
    const listNode = document.getElementById("productList");
    fetch("/api/products")
            .then(response => response.json())
            .then(products => products.forEach(product => {
                const listElement = document.createElement("li");
                const h1Element = document.createElement("h1");
                const paragraphElement = document.createElement("p");
                const imgElement = document.createElement("img");

                h1Element.innerText = product.title;
                paragraphElement.innerText = product.description;

                imgElement.setAttribute("alt","book cover");
                imgElement.setAttribute("src",product.coverUrl);

                listElement.appendChild(h1Element);
                listElement.appendChild(paragraphElement);
                listElement.appendChild(document.createElement("br"));
                listElement.appendChild(imgElement);
                listNode.appendChild(listElement);
            }));
}

document.addEventListener("DOMContentLoaded", init)