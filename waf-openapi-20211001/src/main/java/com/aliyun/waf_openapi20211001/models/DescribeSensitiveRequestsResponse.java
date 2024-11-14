// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveRequestsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSensitiveRequestsResponseBody body;

    public static DescribeSensitiveRequestsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveRequestsResponse self = new DescribeSensitiveRequestsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveRequestsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSensitiveRequestsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSensitiveRequestsResponse setBody(DescribeSensitiveRequestsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSensitiveRequestsResponseBody getBody() {
        return this.body;
    }

}
