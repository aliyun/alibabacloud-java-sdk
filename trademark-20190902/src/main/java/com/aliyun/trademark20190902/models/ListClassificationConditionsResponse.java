// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListClassificationConditionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClassificationConditionsResponseBody body;

    public static ListClassificationConditionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClassificationConditionsResponse self = new ListClassificationConditionsResponse();
        return TeaModel.build(map, self);
    }

    public ListClassificationConditionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClassificationConditionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClassificationConditionsResponse setBody(ListClassificationConditionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClassificationConditionsResponseBody getBody() {
        return this.body;
    }

}
