// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListOnlineConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOnlineConfigsResponseBody body;

    public static ListOnlineConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineConfigsResponse self = new ListOnlineConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListOnlineConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOnlineConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOnlineConfigsResponse setBody(ListOnlineConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOnlineConfigsResponseBody getBody() {
        return this.body;
    }

}
