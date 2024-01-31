// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHostGroupElasticStrategyParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHostGroupElasticStrategyParametersResponseBody body;

    public static DescribeHostGroupElasticStrategyParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostGroupElasticStrategyParametersResponse self = new DescribeHostGroupElasticStrategyParametersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHostGroupElasticStrategyParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHostGroupElasticStrategyParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHostGroupElasticStrategyParametersResponse setBody(DescribeHostGroupElasticStrategyParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHostGroupElasticStrategyParametersResponseBody getBody() {
        return this.body;
    }

}
