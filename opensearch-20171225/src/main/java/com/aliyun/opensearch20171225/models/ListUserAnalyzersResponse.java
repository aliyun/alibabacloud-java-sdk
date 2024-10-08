// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListUserAnalyzersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserAnalyzersResponseBody body;

    public static ListUserAnalyzersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserAnalyzersResponse self = new ListUserAnalyzersResponse();
        return TeaModel.build(map, self);
    }

    public ListUserAnalyzersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserAnalyzersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserAnalyzersResponse setBody(ListUserAnalyzersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserAnalyzersResponseBody getBody() {
        return this.body;
    }

}
