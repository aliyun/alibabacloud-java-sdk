// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAuthorizedAgentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizedAgentsResponseBody body;

    public static ListAuthorizedAgentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedAgentsResponse self = new ListAuthorizedAgentsResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedAgentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedAgentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizedAgentsResponse setBody(ListAuthorizedAgentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedAgentsResponseBody getBody() {
        return this.body;
    }

}
