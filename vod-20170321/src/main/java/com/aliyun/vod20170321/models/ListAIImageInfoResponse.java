// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIImageInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIImageInfoResponseBody body;

    public static ListAIImageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIImageInfoResponse self = new ListAIImageInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListAIImageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIImageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIImageInfoResponse setBody(ListAIImageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIImageInfoResponseBody getBody() {
        return this.body;
    }

}
