// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateMaliciousFileWhitelistConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMaliciousFileWhitelistConfigResponseBody body;

    public static UpdateMaliciousFileWhitelistConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaliciousFileWhitelistConfigResponse self = new UpdateMaliciousFileWhitelistConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMaliciousFileWhitelistConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMaliciousFileWhitelistConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMaliciousFileWhitelistConfigResponse setBody(UpdateMaliciousFileWhitelistConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMaliciousFileWhitelistConfigResponseBody getBody() {
        return this.body;
    }

}
