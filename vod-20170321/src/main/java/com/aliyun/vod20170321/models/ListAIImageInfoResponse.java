// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIImageInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
