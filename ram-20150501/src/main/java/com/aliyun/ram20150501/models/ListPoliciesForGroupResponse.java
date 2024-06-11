// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPoliciesForGroupResponseBody body;

    public static ListPoliciesForGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForGroupResponse self = new ListPoliciesForGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPoliciesForGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPoliciesForGroupResponse setBody(ListPoliciesForGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPoliciesForGroupResponseBody getBody() {
        return this.body;
    }

}
