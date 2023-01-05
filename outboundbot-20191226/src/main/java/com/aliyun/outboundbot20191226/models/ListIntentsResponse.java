// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListIntentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListIntentsResponseBody body;

    public static ListIntentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntentsResponse self = new ListIntentsResponse();
        return TeaModel.build(map, self);
    }

    public ListIntentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntentsResponse setBody(ListIntentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntentsResponseBody getBody() {
        return this.body;
    }

}
