// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeTimeTriggerScalingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTimeTriggerScalingRulesResponseBody body;

    public static DescribeTimeTriggerScalingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTimeTriggerScalingRulesResponse self = new DescribeTimeTriggerScalingRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTimeTriggerScalingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTimeTriggerScalingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTimeTriggerScalingRulesResponse setBody(DescribeTimeTriggerScalingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTimeTriggerScalingRulesResponseBody getBody() {
        return this.body;
    }

}
