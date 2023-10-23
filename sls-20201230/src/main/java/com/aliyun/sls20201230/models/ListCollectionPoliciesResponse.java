// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListCollectionPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCollectionPoliciesResponseBody body;

    public static ListCollectionPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCollectionPoliciesResponse self = new ListCollectionPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListCollectionPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCollectionPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCollectionPoliciesResponse setBody(ListCollectionPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCollectionPoliciesResponseBody getBody() {
        return this.body;
    }

}
