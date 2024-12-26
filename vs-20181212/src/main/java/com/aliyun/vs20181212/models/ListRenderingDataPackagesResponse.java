// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingDataPackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRenderingDataPackagesResponseBody body;

    public static ListRenderingDataPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingDataPackagesResponse self = new ListRenderingDataPackagesResponse();
        return TeaModel.build(map, self);
    }

    public ListRenderingDataPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRenderingDataPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRenderingDataPackagesResponse setBody(ListRenderingDataPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRenderingDataPackagesResponseBody getBody() {
        return this.body;
    }

}
