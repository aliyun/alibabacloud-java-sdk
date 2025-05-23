// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetTaskByUuidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskByUuidResponseBody body;

    public static GetTaskByUuidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskByUuidResponse self = new GetTaskByUuidResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskByUuidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskByUuidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskByUuidResponse setBody(GetTaskByUuidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskByUuidResponseBody getBody() {
        return this.body;
    }

}
