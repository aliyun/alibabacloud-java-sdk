// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonOverallConfigListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCommonOverallConfigListResponseBody body;

    public static DescribeCommonOverallConfigListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonOverallConfigListResponse self = new DescribeCommonOverallConfigListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommonOverallConfigListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCommonOverallConfigListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCommonOverallConfigListResponse setBody(DescribeCommonOverallConfigListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCommonOverallConfigListResponseBody getBody() {
        return this.body;
    }

}
