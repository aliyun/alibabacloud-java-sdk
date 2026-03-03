// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AuthorizeProductsRequest extends TeaModel {
    @NameInMap("body")
    public AuthorizeProductsCmd body;

    public static AuthorizeProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeProductsRequest self = new AuthorizeProductsRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeProductsRequest setBody(AuthorizeProductsCmd body) {
        this.body = body;
        return this;
    }
    public AuthorizeProductsCmd getBody() {
        return this.body;
    }

}
