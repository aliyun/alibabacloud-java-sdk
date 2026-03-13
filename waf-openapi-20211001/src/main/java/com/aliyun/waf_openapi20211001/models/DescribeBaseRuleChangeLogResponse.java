// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeBaseRuleChangeLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBaseRuleChangeLogResponseBody body;

    public static DescribeBaseRuleChangeLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBaseRuleChangeLogResponse self = new DescribeBaseRuleChangeLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBaseRuleChangeLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBaseRuleChangeLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBaseRuleChangeLogResponse setBody(DescribeBaseRuleChangeLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBaseRuleChangeLogResponseBody getBody() {
        return this.body;
    }

}
