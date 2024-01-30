// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStackResponseBody body;

    public static UpdateStackResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackResponse self = new UpdateStackResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStackResponse setBody(UpdateStackResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStackResponseBody getBody() {
        return this.body;
    }

}
