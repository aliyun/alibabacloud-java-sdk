// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogReportListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLLogReportListResponseBody body;

    public static DescribeSQLLogReportListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogReportListResponse self = new DescribeSQLLogReportListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogReportListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLLogReportListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLLogReportListResponse setBody(DescribeSQLLogReportListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLLogReportListResponseBody getBody() {
        return this.body;
    }

}
