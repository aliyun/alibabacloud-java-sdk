// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ReleaseRenderingDataPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseRenderingDataPackageResponseBody body;

    public static ReleaseRenderingDataPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseRenderingDataPackageResponse self = new ReleaseRenderingDataPackageResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseRenderingDataPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseRenderingDataPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseRenderingDataPackageResponse setBody(ReleaseRenderingDataPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseRenderingDataPackageResponseBody getBody() {
        return this.body;
    }

}
