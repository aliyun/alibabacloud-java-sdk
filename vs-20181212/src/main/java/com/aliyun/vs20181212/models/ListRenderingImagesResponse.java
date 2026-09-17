// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingImagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRenderingImagesResponseBody body;

    public static ListRenderingImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingImagesResponse self = new ListRenderingImagesResponse();
        return TeaModel.build(map, self);
    }

    public ListRenderingImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRenderingImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRenderingImagesResponse setBody(ListRenderingImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRenderingImagesResponseBody getBody() {
        return this.body;
    }

}
