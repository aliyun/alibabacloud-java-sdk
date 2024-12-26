// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RecoverRenderingDataPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoverRenderingDataPackageResponseBody body;

    public static RecoverRenderingDataPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverRenderingDataPackageResponse self = new RecoverRenderingDataPackageResponse();
        return TeaModel.build(map, self);
    }

    public RecoverRenderingDataPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverRenderingDataPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverRenderingDataPackageResponse setBody(RecoverRenderingDataPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverRenderingDataPackageResponseBody getBody() {
        return this.body;
    }

}
