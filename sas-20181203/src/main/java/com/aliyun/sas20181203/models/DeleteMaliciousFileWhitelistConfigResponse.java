// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteMaliciousFileWhitelistConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMaliciousFileWhitelistConfigResponseBody body;

    public static DeleteMaliciousFileWhitelistConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaliciousFileWhitelistConfigResponse self = new DeleteMaliciousFileWhitelistConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMaliciousFileWhitelistConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMaliciousFileWhitelistConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMaliciousFileWhitelistConfigResponse setBody(DeleteMaliciousFileWhitelistConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMaliciousFileWhitelistConfigResponseBody getBody() {
        return this.body;
    }

}
