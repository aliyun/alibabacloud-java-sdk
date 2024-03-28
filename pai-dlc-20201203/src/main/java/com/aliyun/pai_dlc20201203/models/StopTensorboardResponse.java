// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StopTensorboardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopTensorboardResponseBody body;

    public static StopTensorboardResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTensorboardResponse self = new StopTensorboardResponse();
        return TeaModel.build(map, self);
    }

    public StopTensorboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTensorboardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopTensorboardResponse setBody(StopTensorboardResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTensorboardResponseBody getBody() {
        return this.body;
    }

}
