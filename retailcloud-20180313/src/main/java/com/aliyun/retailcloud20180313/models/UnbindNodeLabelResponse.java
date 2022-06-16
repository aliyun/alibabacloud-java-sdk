// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UnbindNodeLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindNodeLabelResponseBody body;

    public static UnbindNodeLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindNodeLabelResponse self = new UnbindNodeLabelResponse();
        return TeaModel.build(map, self);
    }

    public UnbindNodeLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindNodeLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindNodeLabelResponse setBody(UnbindNodeLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindNodeLabelResponseBody getBody() {
        return this.body;
    }

}
