// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListGlobalQuestionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGlobalQuestionsResponseBody body;

    public static ListGlobalQuestionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalQuestionsResponse self = new ListGlobalQuestionsResponse();
        return TeaModel.build(map, self);
    }

    public ListGlobalQuestionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGlobalQuestionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGlobalQuestionsResponse setBody(ListGlobalQuestionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGlobalQuestionsResponseBody getBody() {
        return this.body;
    }

}
