// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRayHistoryServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRayHistoryServerResponseBody body;

    public static GetRayHistoryServerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRayHistoryServerResponse self = new GetRayHistoryServerResponse();
        return TeaModel.build(map, self);
    }

    public GetRayHistoryServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRayHistoryServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRayHistoryServerResponse setBody(GetRayHistoryServerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRayHistoryServerResponseBody getBody() {
        return this.body;
    }

}
