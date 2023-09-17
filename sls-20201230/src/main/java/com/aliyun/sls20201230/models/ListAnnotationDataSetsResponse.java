// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListAnnotationDataSetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAnnotationDataSetsResponseBody body;

    public static ListAnnotationDataSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnnotationDataSetsResponse self = new ListAnnotationDataSetsResponse();
        return TeaModel.build(map, self);
    }

    public ListAnnotationDataSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnnotationDataSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAnnotationDataSetsResponse setBody(ListAnnotationDataSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnnotationDataSetsResponseBody getBody() {
        return this.body;
    }

}
