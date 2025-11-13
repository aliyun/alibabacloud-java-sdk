// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterScannerYamlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterScannerYamlResponseBody body;

    public static GetClusterScannerYamlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterScannerYamlResponse self = new GetClusterScannerYamlResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterScannerYamlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterScannerYamlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterScannerYamlResponse setBody(GetClusterScannerYamlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterScannerYamlResponseBody getBody() {
        return this.body;
    }

}
