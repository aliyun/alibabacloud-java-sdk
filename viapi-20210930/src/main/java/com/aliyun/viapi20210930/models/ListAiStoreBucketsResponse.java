// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class ListAiStoreBucketsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAiStoreBucketsResponseBody body;

    public static ListAiStoreBucketsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAiStoreBucketsResponse self = new ListAiStoreBucketsResponse();
        return TeaModel.build(map, self);
    }

    public ListAiStoreBucketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAiStoreBucketsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAiStoreBucketsResponse setBody(ListAiStoreBucketsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAiStoreBucketsResponseBody getBody() {
        return this.body;
    }

}
