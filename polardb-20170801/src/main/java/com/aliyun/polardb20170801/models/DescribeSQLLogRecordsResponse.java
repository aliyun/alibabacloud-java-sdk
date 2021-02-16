// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSQLLogRecordsResponseBody body;

    public static DescribeSQLLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogRecordsResponse self = new DescribeSQLLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLLogRecordsResponse setBody(DescribeSQLLogRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLLogRecordsResponseBody getBody() {
        return this.body;
    }

}
