// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateProductRequest extends TeaModel {
    @NameInMap("body")
    public ProductCreateCmd body;

    public static CreateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductRequest self = new CreateProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductRequest setBody(ProductCreateCmd body) {
        this.body = body;
        return this;
    }
    public ProductCreateCmd getBody() {
        return this.body;
    }

}
