// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListJobPlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobPlansResponseBody body;

    public static ListJobPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobPlansResponse self = new ListJobPlansResponse();
        return TeaModel.build(map, self);
    }

    public ListJobPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobPlansResponse setBody(ListJobPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobPlansResponseBody getBody() {
        return this.body;
    }

}
