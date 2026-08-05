// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLakebaseS3AccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLakebaseS3AccountResponseBody body;

    public static DescribeLakebaseS3AccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakebaseS3AccountResponse self = new DescribeLakebaseS3AccountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLakebaseS3AccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLakebaseS3AccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLakebaseS3AccountResponse setBody(DescribeLakebaseS3AccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLakebaseS3AccountResponseBody getBody() {
        return this.body;
    }

}
