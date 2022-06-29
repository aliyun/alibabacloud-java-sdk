// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListPoliciesForTargetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPoliciesForTargetResponseBody body;

    public static ListPoliciesForTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForTargetResponse self = new ListPoliciesForTargetResponse();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPoliciesForTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPoliciesForTargetResponse setBody(ListPoliciesForTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPoliciesForTargetResponseBody getBody() {
        return this.body;
    }

}
