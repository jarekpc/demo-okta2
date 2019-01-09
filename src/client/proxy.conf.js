const PROXY_CONFIG = [
    {
        context: [
            "/cool-cars"
            // "/coinbase",
            // "/itbit",
            // "/bitfinex",
            // "/myuser"
        ],
        target: "http://localhost:8081",//?
        // target: "http://registration0.us-east-1.elasticbeanstalk.com",
        secure: false
    }
]

module.exports = PROXY_CONFIG;