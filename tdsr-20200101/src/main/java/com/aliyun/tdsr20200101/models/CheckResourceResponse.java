// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CheckResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckResourceResponseBody body;

    public static CheckResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceResponse self = new CheckResourceResponse();
        return TeaModel.build(map, self);
    }

    public CheckResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckResourceResponse setBody(CheckResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckResourceResponseBody getBody() {
        return this.body;
    }

}
