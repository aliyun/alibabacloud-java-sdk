// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitRemakeScriptJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitRemakeScriptJobResponseBody body;

    public static SubmitRemakeScriptJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitRemakeScriptJobResponse self = new SubmitRemakeScriptJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitRemakeScriptJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitRemakeScriptJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitRemakeScriptJobResponse setBody(SubmitRemakeScriptJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitRemakeScriptJobResponseBody getBody() {
        return this.body;
    }

}
