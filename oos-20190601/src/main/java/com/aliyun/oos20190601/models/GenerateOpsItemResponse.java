// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GenerateOpsItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateOpsItemResponseBody body;

    public static GenerateOpsItemResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateOpsItemResponse self = new GenerateOpsItemResponse();
        return TeaModel.build(map, self);
    }

    public GenerateOpsItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateOpsItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateOpsItemResponse setBody(GenerateOpsItemResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateOpsItemResponseBody getBody() {
        return this.body;
    }

}
