// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class AddImageLabelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddImageLabelsResponseBody body;

    public static AddImageLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddImageLabelsResponse self = new AddImageLabelsResponse();
        return TeaModel.build(map, self);
    }

    public AddImageLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddImageLabelsResponse setBody(AddImageLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddImageLabelsResponseBody getBody() {
        return this.body;
    }

}
