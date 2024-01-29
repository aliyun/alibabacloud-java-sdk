// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListPolicyVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPolicyVersionsResponseBody body;

    public static ListPolicyVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyVersionsResponse self = new ListPolicyVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListPolicyVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPolicyVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPolicyVersionsResponse setBody(ListPolicyVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPolicyVersionsResponseBody getBody() {
        return this.body;
    }

}
