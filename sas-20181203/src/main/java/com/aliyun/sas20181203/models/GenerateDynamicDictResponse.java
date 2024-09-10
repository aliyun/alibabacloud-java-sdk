// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateDynamicDictResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateDynamicDictResponseBody body;

    public static GenerateDynamicDictResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDynamicDictResponse self = new GenerateDynamicDictResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDynamicDictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDynamicDictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateDynamicDictResponse setBody(GenerateDynamicDictResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDynamicDictResponseBody getBody() {
        return this.body;
    }

}
