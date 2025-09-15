// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateHybridCloudClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHybridCloudClusterResponseBody body;

    public static CreateHybridCloudClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridCloudClusterResponse self = new CreateHybridCloudClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateHybridCloudClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHybridCloudClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHybridCloudClusterResponse setBody(CreateHybridCloudClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHybridCloudClusterResponseBody getBody() {
        return this.body;
    }

}
