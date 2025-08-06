// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoPornRecogJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIVideoPornRecogJobResponseBody body;

    public static ListAIVideoPornRecogJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoPornRecogJobResponse self = new ListAIVideoPornRecogJobResponse();
        return TeaModel.build(map, self);
    }

    public ListAIVideoPornRecogJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIVideoPornRecogJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIVideoPornRecogJobResponse setBody(ListAIVideoPornRecogJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIVideoPornRecogJobResponseBody getBody() {
        return this.body;
    }

}
