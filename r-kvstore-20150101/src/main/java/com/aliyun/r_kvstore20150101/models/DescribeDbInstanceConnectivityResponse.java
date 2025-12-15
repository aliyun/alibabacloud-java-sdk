// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDbInstanceConnectivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDbInstanceConnectivityResponseBody body;

    public static DescribeDbInstanceConnectivityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbInstanceConnectivityResponse self = new DescribeDbInstanceConnectivityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDbInstanceConnectivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDbInstanceConnectivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDbInstanceConnectivityResponse setBody(DescribeDbInstanceConnectivityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDbInstanceConnectivityResponseBody getBody() {
        return this.body;
    }

}
