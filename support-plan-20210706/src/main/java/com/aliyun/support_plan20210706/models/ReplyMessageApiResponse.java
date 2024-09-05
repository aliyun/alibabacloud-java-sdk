// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ReplyMessageApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplyMessageApiResponseBody body;

    public static ReplyMessageApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplyMessageApiResponse self = new ReplyMessageApiResponse();
        return TeaModel.build(map, self);
    }

    public ReplyMessageApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplyMessageApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplyMessageApiResponse setBody(ReplyMessageApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplyMessageApiResponseBody getBody() {
        return this.body;
    }

}
