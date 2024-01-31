// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAttackAnalysisDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAttackAnalysisDataResponseBody body;

    public static DescribeAttackAnalysisDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackAnalysisDataResponse self = new DescribeAttackAnalysisDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAttackAnalysisDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAttackAnalysisDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAttackAnalysisDataResponse setBody(DescribeAttackAnalysisDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAttackAnalysisDataResponseBody getBody() {
        return this.body;
    }

}
