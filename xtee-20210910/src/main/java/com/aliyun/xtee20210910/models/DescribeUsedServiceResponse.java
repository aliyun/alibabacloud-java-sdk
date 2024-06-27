// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeUsedServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUsedServiceResponseBody body;

    public static DescribeUsedServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsedServiceResponse self = new DescribeUsedServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUsedServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUsedServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUsedServiceResponse setBody(DescribeUsedServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUsedServiceResponseBody getBody() {
        return this.body;
    }

}
