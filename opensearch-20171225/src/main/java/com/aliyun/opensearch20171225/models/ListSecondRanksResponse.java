// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSecondRanksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSecondRanksResponseBody body;

    public static ListSecondRanksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecondRanksResponse self = new ListSecondRanksResponse();
        return TeaModel.build(map, self);
    }

    public ListSecondRanksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecondRanksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSecondRanksResponse setBody(ListSecondRanksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecondRanksResponseBody getBody() {
        return this.body;
    }

}
