// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddSagCidrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSagCidrResponseBody body;

    public static AddSagCidrResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSagCidrResponse self = new AddSagCidrResponse();
        return TeaModel.build(map, self);
    }

    public AddSagCidrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSagCidrResponse setBody(AddSagCidrResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSagCidrResponseBody getBody() {
        return this.body;
    }

}
