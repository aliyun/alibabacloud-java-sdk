// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateMajorProtectionBlackIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMajorProtectionBlackIpResponseBody body;

    public static CreateMajorProtectionBlackIpResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMajorProtectionBlackIpResponse self = new CreateMajorProtectionBlackIpResponse();
        return TeaModel.build(map, self);
    }

    public CreateMajorProtectionBlackIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMajorProtectionBlackIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMajorProtectionBlackIpResponse setBody(CreateMajorProtectionBlackIpResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMajorProtectionBlackIpResponseBody getBody() {
        return this.body;
    }

}
