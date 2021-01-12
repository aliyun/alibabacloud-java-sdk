// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSQLLogReportsResponseBody body;

    public static DescribeSQLLogReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogReportsResponse self = new DescribeSQLLogReportsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLLogReportsResponse setBody(DescribeSQLLogReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLLogReportsResponseBody getBody() {
        return this.body;
    }

}
