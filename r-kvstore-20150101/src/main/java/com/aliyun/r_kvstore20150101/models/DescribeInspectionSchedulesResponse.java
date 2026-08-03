// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInspectionSchedulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInspectionSchedulesResponseBody body;

    public static DescribeInspectionSchedulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionSchedulesResponse self = new DescribeInspectionSchedulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionSchedulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInspectionSchedulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInspectionSchedulesResponse setBody(DescribeInspectionSchedulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInspectionSchedulesResponseBody getBody() {
        return this.body;
    }

}
