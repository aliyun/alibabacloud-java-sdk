// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeCreditPackageAgentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCreditPackageAgentsResponseBody body;

    public static DescribeCreditPackageAgentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditPackageAgentsResponse self = new DescribeCreditPackageAgentsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCreditPackageAgentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCreditPackageAgentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCreditPackageAgentsResponse setBody(DescribeCreditPackageAgentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCreditPackageAgentsResponseBody getBody() {
        return this.body;
    }

}
