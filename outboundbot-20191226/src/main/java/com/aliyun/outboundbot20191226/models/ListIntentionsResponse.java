// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListIntentionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntentionsResponseBody body;

    public static ListIntentionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntentionsResponse self = new ListIntentionsResponse();
        return TeaModel.build(map, self);
    }

    public ListIntentionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntentionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntentionsResponse setBody(ListIntentionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntentionsResponseBody getBody() {
        return this.body;
    }

}
