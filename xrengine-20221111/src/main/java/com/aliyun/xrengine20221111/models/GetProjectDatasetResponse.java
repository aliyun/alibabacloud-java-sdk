// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetProjectDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProjectDatasetResponseBody body;

    public static GetProjectDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectDatasetResponse self = new GetProjectDatasetResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectDatasetResponse setBody(GetProjectDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectDatasetResponseBody getBody() {
        return this.body;
    }

}
