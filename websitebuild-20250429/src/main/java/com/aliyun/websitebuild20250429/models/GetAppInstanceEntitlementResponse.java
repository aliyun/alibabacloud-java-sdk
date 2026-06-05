// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppInstanceEntitlementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppInstanceEntitlementResponseBody body;

    public static GetAppInstanceEntitlementResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstanceEntitlementResponse self = new GetAppInstanceEntitlementResponse();
        return TeaModel.build(map, self);
    }

    public GetAppInstanceEntitlementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppInstanceEntitlementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppInstanceEntitlementResponse setBody(GetAppInstanceEntitlementResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppInstanceEntitlementResponseBody getBody() {
        return this.body;
    }

}
