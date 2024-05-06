// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetControlPolicyResponseBody body;

    public static GetControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetControlPolicyResponse self = new GetControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetControlPolicyResponse setBody(GetControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetControlPolicyResponseBody getBody() {
        return this.body;
    }

}
