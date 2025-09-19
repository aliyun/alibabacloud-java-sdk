// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAIAssetSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAIAssetSummaryResponseBody body;

    public static DescribeAIAssetSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIAssetSummaryResponse self = new DescribeAIAssetSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIAssetSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIAssetSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAIAssetSummaryResponse setBody(DescribeAIAssetSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIAssetSummaryResponseBody getBody() {
        return this.body;
    }

}
