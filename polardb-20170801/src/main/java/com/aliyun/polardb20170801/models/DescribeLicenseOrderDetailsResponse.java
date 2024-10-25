// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLicenseOrderDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLicenseOrderDetailsResponseBody body;

    public static DescribeLicenseOrderDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLicenseOrderDetailsResponse self = new DescribeLicenseOrderDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLicenseOrderDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLicenseOrderDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLicenseOrderDetailsResponse setBody(DescribeLicenseOrderDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLicenseOrderDetailsResponseBody getBody() {
        return this.body;
    }

}
