// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddAKSNodeLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAKSNodeLabelResponseBody body;

    public static AddAKSNodeLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAKSNodeLabelResponse self = new AddAKSNodeLabelResponse();
        return TeaModel.build(map, self);
    }

    public AddAKSNodeLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAKSNodeLabelResponse setBody(AddAKSNodeLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAKSNodeLabelResponseBody getBody() {
        return this.body;
    }

}
