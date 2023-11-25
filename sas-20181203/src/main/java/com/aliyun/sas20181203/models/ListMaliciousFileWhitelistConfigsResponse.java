// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListMaliciousFileWhitelistConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMaliciousFileWhitelistConfigsResponseBody body;

    public static ListMaliciousFileWhitelistConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMaliciousFileWhitelistConfigsResponse self = new ListMaliciousFileWhitelistConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListMaliciousFileWhitelistConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMaliciousFileWhitelistConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMaliciousFileWhitelistConfigsResponse setBody(ListMaliciousFileWhitelistConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMaliciousFileWhitelistConfigsResponseBody getBody() {
        return this.body;
    }

}
