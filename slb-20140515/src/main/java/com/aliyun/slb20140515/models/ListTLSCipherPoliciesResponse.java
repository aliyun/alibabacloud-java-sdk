// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ListTLSCipherPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTLSCipherPoliciesResponseBody body;

    public static ListTLSCipherPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTLSCipherPoliciesResponse self = new ListTLSCipherPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListTLSCipherPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTLSCipherPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTLSCipherPoliciesResponse setBody(ListTLSCipherPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTLSCipherPoliciesResponseBody getBody() {
        return this.body;
    }

}
