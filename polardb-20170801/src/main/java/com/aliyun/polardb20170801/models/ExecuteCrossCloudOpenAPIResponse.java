// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ExecuteCrossCloudOpenAPIResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteCrossCloudOpenAPIResponseBody body;

    public static ExecuteCrossCloudOpenAPIResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteCrossCloudOpenAPIResponse self = new ExecuteCrossCloudOpenAPIResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteCrossCloudOpenAPIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteCrossCloudOpenAPIResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteCrossCloudOpenAPIResponse setBody(ExecuteCrossCloudOpenAPIResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteCrossCloudOpenAPIResponseBody getBody() {
        return this.body;
    }

}
