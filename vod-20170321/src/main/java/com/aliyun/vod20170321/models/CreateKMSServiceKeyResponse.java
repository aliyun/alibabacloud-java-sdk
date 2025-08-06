// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateKMSServiceKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKMSServiceKeyResponseBody body;

    public static CreateKMSServiceKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKMSServiceKeyResponse self = new CreateKMSServiceKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateKMSServiceKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKMSServiceKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKMSServiceKeyResponse setBody(CreateKMSServiceKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKMSServiceKeyResponseBody getBody() {
        return this.body;
    }

}
