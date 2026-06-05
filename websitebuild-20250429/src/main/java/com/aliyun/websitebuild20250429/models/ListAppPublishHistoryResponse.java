// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppPublishHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppPublishHistoryResponseBody body;

    public static ListAppPublishHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppPublishHistoryResponse self = new ListAppPublishHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListAppPublishHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppPublishHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppPublishHistoryResponse setBody(ListAppPublishHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppPublishHistoryResponseBody getBody() {
        return this.body;
    }

}
