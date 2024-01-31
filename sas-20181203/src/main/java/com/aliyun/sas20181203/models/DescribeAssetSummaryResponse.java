// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAssetSummaryResponseBody body;

    public static DescribeAssetSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetSummaryResponse self = new DescribeAssetSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAssetSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAssetSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAssetSummaryResponse setBody(DescribeAssetSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAssetSummaryResponseBody getBody() {
        return this.body;
    }

}
