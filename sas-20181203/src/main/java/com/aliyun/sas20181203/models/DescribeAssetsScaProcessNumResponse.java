// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetsScaProcessNumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAssetsScaProcessNumResponseBody body;

    public static DescribeAssetsScaProcessNumResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetsScaProcessNumResponse self = new DescribeAssetsScaProcessNumResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssetsScaProcessNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssetsScaProcessNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAssetsScaProcessNumResponse setBody(DescribeAssetsScaProcessNumResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssetsScaProcessNumResponseBody getBody() {
        return this.body;
    }

}
