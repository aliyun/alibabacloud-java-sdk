// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddAKSNodeTaintResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAKSNodeTaintResponseBody body;

    public static AddAKSNodeTaintResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAKSNodeTaintResponse self = new AddAKSNodeTaintResponse();
        return TeaModel.build(map, self);
    }

    public AddAKSNodeTaintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAKSNodeTaintResponse setBody(AddAKSNodeTaintResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAKSNodeTaintResponseBody getBody() {
        return this.body;
    }

}
