// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class SetWfInstanceSuccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetWfInstanceSuccessResponseBody body;

    public static SetWfInstanceSuccessResponse build(java.util.Map<String, ?> map) throws Exception {
        SetWfInstanceSuccessResponse self = new SetWfInstanceSuccessResponse();
        return TeaModel.build(map, self);
    }

    public SetWfInstanceSuccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetWfInstanceSuccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetWfInstanceSuccessResponse setBody(SetWfInstanceSuccessResponseBody body) {
        this.body = body;
        return this;
    }
    public SetWfInstanceSuccessResponseBody getBody() {
        return this.body;
    }

}
