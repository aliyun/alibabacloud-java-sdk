// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLTuningAdvicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLTuningAdvicesResponseBody body;

    public static DescribeSQLTuningAdvicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLTuningAdvicesResponse self = new DescribeSQLTuningAdvicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLTuningAdvicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLTuningAdvicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLTuningAdvicesResponse setBody(DescribeSQLTuningAdvicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLTuningAdvicesResponseBody getBody() {
        return this.body;
    }

}
