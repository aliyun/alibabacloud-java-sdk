// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BatchUpdateMaliciousFileWhitelistConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdateMaliciousFileWhitelistConfigResponseBody body;

    public static BatchUpdateMaliciousFileWhitelistConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateMaliciousFileWhitelistConfigResponse self = new BatchUpdateMaliciousFileWhitelistConfigResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateMaliciousFileWhitelistConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateMaliciousFileWhitelistConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateMaliciousFileWhitelistConfigResponse setBody(BatchUpdateMaliciousFileWhitelistConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateMaliciousFileWhitelistConfigResponseBody getBody() {
        return this.body;
    }

}
