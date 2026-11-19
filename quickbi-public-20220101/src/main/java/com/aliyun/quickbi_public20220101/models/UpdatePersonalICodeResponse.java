// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdatePersonalICodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePersonalICodeResponseBody body;

    public static UpdatePersonalICodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePersonalICodeResponse self = new UpdatePersonalICodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePersonalICodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePersonalICodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePersonalICodeResponse setBody(UpdatePersonalICodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePersonalICodeResponseBody getBody() {
        return this.body;
    }

}
