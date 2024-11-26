// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class ListClusterImagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterImagesResponseBody body;

    public static ListClusterImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterImagesResponse self = new ListClusterImagesResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterImagesResponse setBody(ListClusterImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterImagesResponseBody getBody() {
        return this.body;
    }

}
