// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeChargeModuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChargeModuleResponseBody body;

    public static DescribeChargeModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChargeModuleResponse self = new DescribeChargeModuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChargeModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChargeModuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChargeModuleResponse setBody(DescribeChargeModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChargeModuleResponseBody getBody() {
        return this.body;
    }

}
