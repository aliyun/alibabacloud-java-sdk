// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListSecurityPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSecurityPolicyResponseBody body;

    public static ListSecurityPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityPolicyResponse self = new ListSecurityPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListSecurityPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecurityPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSecurityPolicyResponse setBody(ListSecurityPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecurityPolicyResponseBody getBody() {
        return this.body;
    }

}
