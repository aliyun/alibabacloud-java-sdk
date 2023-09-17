// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAnnotationDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAnnotationDataResponseBody body;

    public static ListAnnotationDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnnotationDataResponse self = new ListAnnotationDataResponse();
        return TeaModel.build(map, self);
    }

    public ListAnnotationDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnnotationDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAnnotationDataResponse setBody(ListAnnotationDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnnotationDataResponseBody getBody() {
        return this.body;
    }

}
