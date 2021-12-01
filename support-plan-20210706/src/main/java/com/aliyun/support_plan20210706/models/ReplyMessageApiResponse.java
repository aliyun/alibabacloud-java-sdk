// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ReplyMessageApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ReplyMessageApiResponse setBody(ReplyMessageApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplyMessageApiResponseBody getBody() {
        return this.body;
    }

}
