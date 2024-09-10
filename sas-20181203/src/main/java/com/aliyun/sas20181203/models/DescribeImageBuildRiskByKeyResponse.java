// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBuildRiskByKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageBuildRiskByKeyResponseBody body;

    public static DescribeImageBuildRiskByKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBuildRiskByKeyResponse self = new DescribeImageBuildRiskByKeyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageBuildRiskByKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageBuildRiskByKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageBuildRiskByKeyResponse setBody(DescribeImageBuildRiskByKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageBuildRiskByKeyResponseBody getBody() {
        return this.body;
    }

}
