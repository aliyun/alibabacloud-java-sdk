// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenAttackAnalysisDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScreenAttackAnalysisDataResponseBody body;

    public static DescribeScreenAttackAnalysisDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenAttackAnalysisDataResponse self = new DescribeScreenAttackAnalysisDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScreenAttackAnalysisDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScreenAttackAnalysisDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScreenAttackAnalysisDataResponse setBody(DescribeScreenAttackAnalysisDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScreenAttackAnalysisDataResponseBody getBody() {
        return this.body;
    }

}
