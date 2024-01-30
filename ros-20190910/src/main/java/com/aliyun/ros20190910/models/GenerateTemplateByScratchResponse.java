// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplateByScratchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateTemplateByScratchResponseBody body;

    public static GenerateTemplateByScratchResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateTemplateByScratchResponse self = new GenerateTemplateByScratchResponse();
        return TeaModel.build(map, self);
    }

    public GenerateTemplateByScratchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateTemplateByScratchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateTemplateByScratchResponse setBody(GenerateTemplateByScratchResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateTemplateByScratchResponseBody getBody() {
        return this.body;
    }

}
