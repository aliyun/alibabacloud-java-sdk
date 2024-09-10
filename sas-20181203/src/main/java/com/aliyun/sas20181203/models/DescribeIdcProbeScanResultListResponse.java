// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIdcProbeScanResultListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIdcProbeScanResultListResponseBody body;

    public static DescribeIdcProbeScanResultListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdcProbeScanResultListResponse self = new DescribeIdcProbeScanResultListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIdcProbeScanResultListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIdcProbeScanResultListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIdcProbeScanResultListResponse setBody(DescribeIdcProbeScanResultListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIdcProbeScanResultListResponseBody getBody() {
        return this.body;
    }

}
