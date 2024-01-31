// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileProtectEventResponseBody body;

    public static GetFileProtectEventResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectEventResponse self = new GetFileProtectEventResponse();
        return TeaModel.build(map, self);
    }

    public GetFileProtectEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileProtectEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileProtectEventResponse setBody(GetFileProtectEventResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileProtectEventResponseBody getBody() {
        return this.body;
    }

}
