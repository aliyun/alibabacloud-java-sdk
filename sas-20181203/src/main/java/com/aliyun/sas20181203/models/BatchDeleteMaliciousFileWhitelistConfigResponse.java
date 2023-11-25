// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BatchDeleteMaliciousFileWhitelistConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDeleteMaliciousFileWhitelistConfigResponseBody body;

    public static BatchDeleteMaliciousFileWhitelistConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteMaliciousFileWhitelistConfigResponse self = new BatchDeleteMaliciousFileWhitelistConfigResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteMaliciousFileWhitelistConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteMaliciousFileWhitelistConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteMaliciousFileWhitelistConfigResponse setBody(BatchDeleteMaliciousFileWhitelistConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteMaliciousFileWhitelistConfigResponseBody getBody() {
        return this.body;
    }

}
