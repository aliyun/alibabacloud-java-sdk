// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMessagesResponseBody body;

    public static ListMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMessagesResponse self = new ListMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMessagesResponse setBody(ListMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMessagesResponseBody getBody() {
        return this.body;
    }

}
