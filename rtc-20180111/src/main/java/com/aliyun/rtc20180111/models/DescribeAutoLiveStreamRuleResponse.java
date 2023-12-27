// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAutoLiveStreamRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAutoLiveStreamRuleResponseBody body;

    public static DescribeAutoLiveStreamRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoLiveStreamRuleResponse self = new DescribeAutoLiveStreamRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoLiveStreamRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAutoLiveStreamRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAutoLiveStreamRuleResponse setBody(DescribeAutoLiveStreamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAutoLiveStreamRuleResponseBody getBody() {
        return this.body;
    }

}
