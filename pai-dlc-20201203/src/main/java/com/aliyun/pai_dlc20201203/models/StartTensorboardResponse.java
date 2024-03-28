// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StartTensorboardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartTensorboardResponseBody body;

    public static StartTensorboardResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTensorboardResponse self = new StartTensorboardResponse();
        return TeaModel.build(map, self);
    }

    public StartTensorboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTensorboardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartTensorboardResponse setBody(StartTensorboardResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTensorboardResponseBody getBody() {
        return this.body;
    }

}
