// Smooth scrolling for navigation links
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function (e) {
        e.preventDefault();
        document.querySelector(this.getAttribute('href')).scrollIntoView({
            behavior: 'smooth'
        });
    });
});

// Scroll to top button
const scrollToTopButton = document.querySelector('.scroll-to-top');
window.addEventListener('scroll', () => {
    if (window.pageYOffset > 100) {
        scrollToTopButton.classList.add('visible');
    } else {
        scrollToTopButton.classList.remove('visible');
    }
});

scrollToTopButton.addEventListener('click', () => {
    window.scrollTo({
        top: 0,
        behavior: 'smooth'
    });
});

const lightbox = document.getElementById('lightbox');
const lightboxClose = document.getElementById('lightbox-close');

function closeLightbox() {
    console.log('Closing lightbox'); // Add logging for debugging
    lightbox.classList.add('hidden');
    lightbox.style.display = "none"; // Ensure display none is applied
}

lightboxClose.addEventListener('click', closeLightbox);
