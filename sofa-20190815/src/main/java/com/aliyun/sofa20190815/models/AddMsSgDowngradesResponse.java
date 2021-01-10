// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsSgDowngradesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsSgDowngradesResponseBody body;

    public static AddMsSgDowngradesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsSgDowngradesResponse self = new AddMsSgDowngradesResponse();
        return TeaModel.build(map, self);
    }

    public AddMsSgDowngradesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsSgDowngradesResponse setBody(AddMsSgDowngradesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsSgDowngradesResponseBody getBody() {
        return this.body;
    }

}
