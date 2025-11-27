// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCElasticScalingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCElasticScalingResponseBody body;

    public static DescribeRCElasticScalingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCElasticScalingResponse self = new DescribeRCElasticScalingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCElasticScalingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCElasticScalingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCElasticScalingResponse setBody(DescribeRCElasticScalingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCElasticScalingResponseBody getBody() {
        return this.body;
    }

}
