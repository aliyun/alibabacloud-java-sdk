// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAppPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppPolicyResponseBody body;

    public static UpdateAppPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppPolicyResponse self = new UpdateAppPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppPolicyResponse setBody(UpdateAppPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppPolicyResponseBody getBody() {
        return this.body;
    }

}
