// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeBotRuleLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBotRuleLabelsResponseBody body;

    public static DescribeBotRuleLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBotRuleLabelsResponse self = new DescribeBotRuleLabelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBotRuleLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBotRuleLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBotRuleLabelsResponse setBody(DescribeBotRuleLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBotRuleLabelsResponseBody getBody() {
        return this.body;
    }

}
