// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListEntitiesForPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEntitiesForPolicyResponseBody body;

    public static ListEntitiesForPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesForPolicyResponse self = new ListEntitiesForPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListEntitiesForPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEntitiesForPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEntitiesForPolicyResponse setBody(ListEntitiesForPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEntitiesForPolicyResponseBody getBody() {
        return this.body;
    }

}
