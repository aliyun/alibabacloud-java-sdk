// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class UpdateJobScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateJobScriptResponseBody body;

    public static UpdateJobScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobScriptResponse self = new UpdateJobScriptResponse();
        return TeaModel.build(map, self);
    }

    public UpdateJobScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateJobScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateJobScriptResponse setBody(UpdateJobScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateJobScriptResponseBody getBody() {
        return this.body;
    }

}
