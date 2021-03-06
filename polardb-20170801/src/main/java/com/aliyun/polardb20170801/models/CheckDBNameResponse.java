// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckDBNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckDBNameResponseBody body;

    public static CheckDBNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDBNameResponse self = new CheckDBNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckDBNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDBNameResponse setBody(CheckDBNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDBNameResponseBody getBody() {
        return this.body;
    }

}
