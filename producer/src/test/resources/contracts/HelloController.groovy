import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url('/hello') {
            queryParameters {
                parameter("name", "sandyforawhile")
            }
        }

    }
    response {
        status 200
        body("""
                {
                    "name": "sandyforawhile",
                    "message": "success"
                }
            """)
        headers {
            header('Content-Type': 'application/json;charset=UTF-8')
        }
    }
}