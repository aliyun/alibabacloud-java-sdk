// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClustersResponseBody body;

    public static DescribeClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersResponse self = new DescribeClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClustersResponse setBody(DescribeClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClustersResponseBody getBody() {
        return this.body;
    }

}
