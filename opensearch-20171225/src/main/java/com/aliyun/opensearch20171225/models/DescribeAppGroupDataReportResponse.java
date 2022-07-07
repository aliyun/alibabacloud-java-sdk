// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppGroupDataReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppGroupDataReportResponseBody body;

    public static DescribeAppGroupDataReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppGroupDataReportResponse self = new DescribeAppGroupDataReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppGroupDataReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppGroupDataReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppGroupDataReportResponse setBody(DescribeAppGroupDataReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppGroupDataReportResponseBody getBody() {
        return this.body;
    }

}
