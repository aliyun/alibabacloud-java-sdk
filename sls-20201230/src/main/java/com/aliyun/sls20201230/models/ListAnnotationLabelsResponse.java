// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAnnotationLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAnnotationLabelsResponseBody body;

    public static ListAnnotationLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnnotationLabelsResponse self = new ListAnnotationLabelsResponse();
        return TeaModel.build(map, self);
    }

    public ListAnnotationLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnnotationLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAnnotationLabelsResponse setBody(ListAnnotationLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnnotationLabelsResponseBody getBody() {
        return this.body;
    }

}
