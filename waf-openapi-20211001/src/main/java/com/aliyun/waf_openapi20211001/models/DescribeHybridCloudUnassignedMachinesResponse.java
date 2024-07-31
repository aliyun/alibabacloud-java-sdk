// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudUnassignedMachinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudUnassignedMachinesResponseBody body;

    public static DescribeHybridCloudUnassignedMachinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudUnassignedMachinesResponse self = new DescribeHybridCloudUnassignedMachinesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudUnassignedMachinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudUnassignedMachinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudUnassignedMachinesResponse setBody(DescribeHybridCloudUnassignedMachinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudUnassignedMachinesResponseBody getBody() {
        return this.body;
    }

}
