// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStrategyTargetResponseBody body;

    public static DescribeStrategyTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyTargetResponse self = new DescribeStrategyTargetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStrategyTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStrategyTargetResponse setBody(DescribeStrategyTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStrategyTargetResponseBody getBody() {
        return this.body;
    }

}
