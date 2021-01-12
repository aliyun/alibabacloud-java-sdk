// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogReportListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSQLLogReportListResponse setBody(DescribeSQLLogReportListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLLogReportListResponseBody getBody() {
        return this.body;
    }

}
