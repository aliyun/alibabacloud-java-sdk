// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyExecDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStrategyExecDetailResponseBody body;

    public static DescribeStrategyExecDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyExecDetailResponse self = new DescribeStrategyExecDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyExecDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStrategyExecDetailResponse setBody(DescribeStrategyExecDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStrategyExecDetailResponseBody getBody() {
        return this.body;
    }

}
