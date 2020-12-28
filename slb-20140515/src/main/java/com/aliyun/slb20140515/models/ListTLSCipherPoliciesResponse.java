// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ListTLSCipherPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListTLSCipherPoliciesResponse setBody(ListTLSCipherPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTLSCipherPoliciesResponseBody getBody() {
        return this.body;
    }

}
