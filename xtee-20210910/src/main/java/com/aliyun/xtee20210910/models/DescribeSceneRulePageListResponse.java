// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSceneRulePageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSceneRulePageListResponseBody body;

    public static DescribeSceneRulePageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneRulePageListResponse self = new DescribeSceneRulePageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneRulePageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneRulePageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneRulePageListResponse setBody(DescribeSceneRulePageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneRulePageListResponseBody getBody() {
        return this.body;
    }

}
