// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCheckPoliciesResponseBody body;

    public static ListCheckPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCheckPoliciesResponse self = new ListCheckPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListCheckPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCheckPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCheckPoliciesResponse setBody(ListCheckPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCheckPoliciesResponseBody getBody() {
        return this.body;
    }

}
