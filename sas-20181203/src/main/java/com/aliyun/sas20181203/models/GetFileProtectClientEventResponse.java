// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectClientEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileProtectClientEventResponseBody body;

    public static GetFileProtectClientEventResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectClientEventResponse self = new GetFileProtectClientEventResponse();
        return TeaModel.build(map, self);
    }

    public GetFileProtectClientEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileProtectClientEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileProtectClientEventResponse setBody(GetFileProtectClientEventResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileProtectClientEventResponseBody getBody() {
        return this.body;
    }

}
