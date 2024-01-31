// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLCollectorRetentionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLCollectorRetentionResponseBody body;

    public static DescribeSQLCollectorRetentionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLCollectorRetentionResponse self = new DescribeSQLCollectorRetentionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLCollectorRetentionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLCollectorRetentionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLCollectorRetentionResponse setBody(DescribeSQLCollectorRetentionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLCollectorRetentionResponseBody getBody() {
        return this.body;
    }

}
