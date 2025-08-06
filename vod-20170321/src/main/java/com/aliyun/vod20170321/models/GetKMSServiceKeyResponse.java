// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetKMSServiceKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKMSServiceKeyResponseBody body;

    public static GetKMSServiceKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKMSServiceKeyResponse self = new GetKMSServiceKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetKMSServiceKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKMSServiceKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKMSServiceKeyResponse setBody(GetKMSServiceKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKMSServiceKeyResponseBody getBody() {
        return this.body;
    }

}
