// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListDistillationTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDistillationTemplatesResponseBody body;

    public static ListDistillationTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDistillationTemplatesResponse self = new ListDistillationTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListDistillationTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDistillationTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDistillationTemplatesResponse setBody(ListDistillationTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDistillationTemplatesResponseBody getBody() {
        return this.body;
    }

}
