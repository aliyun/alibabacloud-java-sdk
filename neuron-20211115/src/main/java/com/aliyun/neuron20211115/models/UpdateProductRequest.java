// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateProductRequest extends TeaModel {
    @NameInMap("body")
    public ProductUpdateCmd body;

    public static UpdateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductRequest self = new UpdateProductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductRequest setBody(ProductUpdateCmd body) {
        this.body = body;
        return this;
    }
    public ProductUpdateCmd getBody() {
        return this.body;
    }

}
