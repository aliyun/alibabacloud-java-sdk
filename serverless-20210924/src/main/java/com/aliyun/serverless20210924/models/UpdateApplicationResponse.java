// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class UpdateApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Application body;

    public static UpdateApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationResponse self = new UpdateApplicationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationResponse setBody(Application body) {
        this.body = body;
        return this;
    }
    public Application getBody() {
        return this.body;
    }

}
