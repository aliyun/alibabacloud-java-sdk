// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspiciousUUIDConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSuspiciousUUIDConfigResponseBody body;

    public static DescribeSuspiciousUUIDConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspiciousUUIDConfigResponse self = new DescribeSuspiciousUUIDConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspiciousUUIDConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspiciousUUIDConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSuspiciousUUIDConfigResponse setBody(DescribeSuspiciousUUIDConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspiciousUUIDConfigResponseBody getBody() {
        return this.body;
    }

}
