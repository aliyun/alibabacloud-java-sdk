// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLLogFilesResponseBody body;

    public static DescribeSQLLogFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogFilesResponse self = new DescribeSQLLogFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLLogFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLLogFilesResponse setBody(DescribeSQLLogFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLLogFilesResponseBody getBody() {
        return this.body;
    }

}
