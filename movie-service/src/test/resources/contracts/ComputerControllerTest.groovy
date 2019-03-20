package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        method 'GET'
        url '/movie'
    }
    response {
        status OK()
        body([
                id  : 100,
                name: "Titan"
        ])
    }
}
