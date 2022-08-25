// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DetachAppPolicyFromIdentityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetachAppPolicyFromIdentityResponseBody body;

    public static DetachAppPolicyFromIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachAppPolicyFromIdentityResponse self = new DetachAppPolicyFromIdentityResponse();
        return TeaModel.build(map, self);
    }

    public DetachAppPolicyFromIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachAppPolicyFromIdentityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachAppPolicyFromIdentityResponse setBody(DetachAppPolicyFromIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachAppPolicyFromIdentityResponseBody getBody() {
        return this.body;
    }

}
