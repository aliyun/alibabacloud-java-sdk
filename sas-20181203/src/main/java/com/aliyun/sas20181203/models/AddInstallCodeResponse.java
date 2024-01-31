// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddInstallCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddInstallCodeResponseBody body;

    public static AddInstallCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddInstallCodeResponse self = new AddInstallCodeResponse();
        return TeaModel.build(map, self);
    }

    public AddInstallCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddInstallCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddInstallCodeResponse setBody(AddInstallCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddInstallCodeResponseBody getBody() {
        return this.body;
    }

}
