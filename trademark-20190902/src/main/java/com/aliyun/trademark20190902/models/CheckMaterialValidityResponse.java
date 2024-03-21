// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckMaterialValidityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckMaterialValidityResponseBody body;

    public static CheckMaterialValidityResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMaterialValidityResponse self = new CheckMaterialValidityResponse();
        return TeaModel.build(map, self);
    }

    public CheckMaterialValidityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMaterialValidityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckMaterialValidityResponse setBody(CheckMaterialValidityResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMaterialValidityResponseBody getBody() {
        return this.body;
    }

}
