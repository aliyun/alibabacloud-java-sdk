// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CheckAIInstanceNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckAIInstanceNameResponseBody body;

    public static CheckAIInstanceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAIInstanceNameResponse self = new CheckAIInstanceNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckAIInstanceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAIInstanceNameResponse setBody(CheckAIInstanceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAIInstanceNameResponseBody getBody() {
        return this.body;
    }

}
