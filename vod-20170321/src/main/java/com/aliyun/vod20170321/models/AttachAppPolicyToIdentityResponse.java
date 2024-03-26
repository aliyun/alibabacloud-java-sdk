// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AttachAppPolicyToIdentityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachAppPolicyToIdentityResponseBody body;

    public static AttachAppPolicyToIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachAppPolicyToIdentityResponse self = new AttachAppPolicyToIdentityResponse();
        return TeaModel.build(map, self);
    }

    public AttachAppPolicyToIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachAppPolicyToIdentityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachAppPolicyToIdentityResponse setBody(AttachAppPolicyToIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachAppPolicyToIdentityResponseBody getBody() {
        return this.body;
    }

}
