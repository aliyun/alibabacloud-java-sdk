// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class ListAiStoreBucketsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListAiStoreBucketsResponse setBody(ListAiStoreBucketsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAiStoreBucketsResponseBody getBody() {
        return this.body;
    }

}
