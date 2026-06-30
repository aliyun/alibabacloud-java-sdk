// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class ListTranslationTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTranslationTasksResponseBody body;

    public static ListTranslationTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTranslationTasksResponse self = new ListTranslationTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListTranslationTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTranslationTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTranslationTasksResponse setBody(ListTranslationTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTranslationTasksResponseBody getBody() {
        return this.body;
    }

}
