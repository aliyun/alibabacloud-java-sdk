// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class GetSDKInstanceDebugInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSDKInstanceDebugInfoResponseBody body;

    public static GetSDKInstanceDebugInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSDKInstanceDebugInfoResponse self = new GetSDKInstanceDebugInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSDKInstanceDebugInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSDKInstanceDebugInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSDKInstanceDebugInfoResponse setBody(GetSDKInstanceDebugInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSDKInstanceDebugInfoResponseBody getBody() {
        return this.body;
    }

}
