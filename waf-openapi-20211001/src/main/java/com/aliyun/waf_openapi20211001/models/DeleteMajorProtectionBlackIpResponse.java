// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteMajorProtectionBlackIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMajorProtectionBlackIpResponseBody body;

    public static DeleteMajorProtectionBlackIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMajorProtectionBlackIpResponse self = new DeleteMajorProtectionBlackIpResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMajorProtectionBlackIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMajorProtectionBlackIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMajorProtectionBlackIpResponse setBody(DeleteMajorProtectionBlackIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMajorProtectionBlackIpResponseBody getBody() {
        return this.body;
    }

}
