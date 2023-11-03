// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCustinsResourceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCustinsResourceInfoResponseBody body;

    public static DescribeCustinsResourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustinsResourceInfoResponse self = new DescribeCustinsResourceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustinsResourceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustinsResourceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustinsResourceInfoResponse setBody(DescribeCustinsResourceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustinsResourceInfoResponseBody getBody() {
        return this.body;
    }

}
