window.onload = function () {
    var app = new Vue({
        el: "#app",
        data: {
            items: [
                {header: 'Header'},
                {
                    title: 'Parent',
                    group: '/company',
                    items: [
                        {title: 'Home', href: '/company/home', action: 'link'},
                        {title: 'About', href: '/company/about', action: 'link'},
                        {title: 'Contact', href: '/company/contact', action: 'link'}
                    ]
                },
                {title: 'Link', href: "#!"},
                {title: 'Link', href: "#!"},
                {header: 'Another Header'},
                {title: 'Link', href: "#!"}
            ]
        },
        mounted() {
            this.$vuetify.init();
        }
    });

};