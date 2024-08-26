// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionReportCheckItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNisInspectionReportCheckItemsResponseBody body;

    public static DescribeNisInspectionReportCheckItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionReportCheckItemsResponse self = new DescribeNisInspectionReportCheckItemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionReportCheckItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNisInspectionReportCheckItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNisInspectionReportCheckItemsResponse setBody(DescribeNisInspectionReportCheckItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNisInspectionReportCheckItemsResponseBody getBody() {
        return this.body;
    }

}
