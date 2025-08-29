// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GenerateAlgorithmCustomizationScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateAlgorithmCustomizationScriptResponseBody body;

    public static GenerateAlgorithmCustomizationScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAlgorithmCustomizationScriptResponse self = new GenerateAlgorithmCustomizationScriptResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAlgorithmCustomizationScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAlgorithmCustomizationScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateAlgorithmCustomizationScriptResponse setBody(GenerateAlgorithmCustomizationScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAlgorithmCustomizationScriptResponseBody getBody() {
        return this.body;
    }

}
