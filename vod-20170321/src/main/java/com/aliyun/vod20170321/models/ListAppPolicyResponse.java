// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppPolicyResponseBody body;

    public static ListAppPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppPolicyResponse self = new ListAppPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListAppPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppPolicyResponse setBody(ListAppPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppPolicyResponseBody getBody() {
        return this.body;
    }

}
