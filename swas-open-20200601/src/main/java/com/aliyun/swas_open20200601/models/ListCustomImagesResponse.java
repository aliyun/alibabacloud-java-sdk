// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListCustomImagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCustomImagesResponseBody body;

    public static ListCustomImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomImagesResponse self = new ListCustomImagesResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomImagesResponse setBody(ListCustomImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomImagesResponseBody getBody() {
        return this.body;
    }

}
