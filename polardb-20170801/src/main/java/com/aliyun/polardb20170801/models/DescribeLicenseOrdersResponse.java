// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLicenseOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLicenseOrdersResponseBody body;

    public static DescribeLicenseOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLicenseOrdersResponse self = new DescribeLicenseOrdersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLicenseOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLicenseOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLicenseOrdersResponse setBody(DescribeLicenseOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLicenseOrdersResponseBody getBody() {
        return this.body;
    }

}
