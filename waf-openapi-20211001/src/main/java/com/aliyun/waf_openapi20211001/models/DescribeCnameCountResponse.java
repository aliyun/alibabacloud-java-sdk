// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCnameCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCnameCountResponseBody body;

    public static DescribeCnameCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCnameCountResponse self = new DescribeCnameCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCnameCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCnameCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCnameCountResponse setBody(DescribeCnameCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCnameCountResponseBody getBody() {
        return this.body;
    }

}
