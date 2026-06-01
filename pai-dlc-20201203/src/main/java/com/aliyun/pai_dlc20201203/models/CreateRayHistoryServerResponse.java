// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateRayHistoryServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRayHistoryServerResponseBody body;

    public static CreateRayHistoryServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRayHistoryServerResponse self = new CreateRayHistoryServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateRayHistoryServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRayHistoryServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRayHistoryServerResponse setBody(CreateRayHistoryServerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRayHistoryServerResponseBody getBody() {
        return this.body;
    }

}
