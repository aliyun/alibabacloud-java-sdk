// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListHivesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHivesResponseBody body;

    public static ListHivesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHivesResponse self = new ListHivesResponse();
        return TeaModel.build(map, self);
    }

    public ListHivesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHivesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHivesResponse setBody(ListHivesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHivesResponseBody getBody() {
        return this.body;
    }

}
