// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFileDetectResponseBody body;

    public static CreateFileDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileDetectResponse self = new CreateFileDetectResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFileDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFileDetectResponse setBody(CreateFileDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFileDetectResponseBody getBody() {
        return this.body;
    }

}
