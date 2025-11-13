// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateClusterScannerWebhookYamlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateClusterScannerWebhookYamlResponseBody body;

    public static GenerateClusterScannerWebhookYamlResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateClusterScannerWebhookYamlResponse self = new GenerateClusterScannerWebhookYamlResponse();
        return TeaModel.build(map, self);
    }

    public GenerateClusterScannerWebhookYamlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateClusterScannerWebhookYamlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateClusterScannerWebhookYamlResponse setBody(GenerateClusterScannerWebhookYamlResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateClusterScannerWebhookYamlResponseBody getBody() {
        return this.body;
    }

}
