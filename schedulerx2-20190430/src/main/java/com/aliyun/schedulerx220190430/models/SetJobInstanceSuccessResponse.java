// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class SetJobInstanceSuccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetJobInstanceSuccessResponseBody body;

    public static SetJobInstanceSuccessResponse build(java.util.Map<String, ?> map) throws Exception {
        SetJobInstanceSuccessResponse self = new SetJobInstanceSuccessResponse();
        return TeaModel.build(map, self);
    }

    public SetJobInstanceSuccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetJobInstanceSuccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetJobInstanceSuccessResponse setBody(SetJobInstanceSuccessResponseBody body) {
        this.body = body;
        return this;
    }
    public SetJobInstanceSuccessResponseBody getBody() {
        return this.body;
    }

}
