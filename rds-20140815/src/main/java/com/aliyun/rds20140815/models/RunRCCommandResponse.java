// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RunRCCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunRCCommandResponseBody body;

    public static RunRCCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        RunRCCommandResponse self = new RunRCCommandResponse();
        return TeaModel.build(map, self);
    }

    public RunRCCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunRCCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunRCCommandResponse setBody(RunRCCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public RunRCCommandResponseBody getBody() {
        return this.body;
    }

}
