// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLPlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLPlansResponseBody body;

    public static DescribeSQLPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPlansResponse self = new DescribeSQLPlansResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLPlansResponse setBody(DescribeSQLPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLPlansResponseBody getBody() {
        return this.body;
    }

}
