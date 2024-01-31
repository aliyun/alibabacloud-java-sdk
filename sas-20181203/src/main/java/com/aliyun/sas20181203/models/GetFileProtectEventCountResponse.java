// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectEventCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileProtectEventCountResponseBody body;

    public static GetFileProtectEventCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectEventCountResponse self = new GetFileProtectEventCountResponse();
        return TeaModel.build(map, self);
    }

    public GetFileProtectEventCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileProtectEventCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileProtectEventCountResponse setBody(GetFileProtectEventCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileProtectEventCountResponseBody getBody() {
        return this.body;
    }

}
