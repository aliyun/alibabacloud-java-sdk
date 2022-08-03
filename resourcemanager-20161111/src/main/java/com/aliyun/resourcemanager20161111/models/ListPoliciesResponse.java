// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class ListPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPoliciesResponseBody body;

    public static ListPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesResponse self = new ListPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPoliciesResponse setBody(ListPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPoliciesResponseBody getBody() {
        return this.body;
    }

}
