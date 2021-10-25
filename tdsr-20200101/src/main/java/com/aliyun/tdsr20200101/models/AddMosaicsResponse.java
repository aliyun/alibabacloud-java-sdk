// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddMosaicsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMosaicsResponseBody body;

    public static AddMosaicsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMosaicsResponse self = new AddMosaicsResponse();
        return TeaModel.build(map, self);
    }

    public AddMosaicsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMosaicsResponse setBody(AddMosaicsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMosaicsResponseBody getBody() {
        return this.body;
    }

}
