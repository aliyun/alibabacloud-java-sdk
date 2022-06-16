// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListNodeLabelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListNodeLabelsResponseBody body;

    public static ListNodeLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeLabelsResponse self = new ListNodeLabelsResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodeLabelsResponse setBody(ListNodeLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeLabelsResponseBody getBody() {
        return this.body;
    }

}
