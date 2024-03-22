// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSoarRecordsResponseBody body;

    public static DescribeSoarRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarRecordsResponse self = new DescribeSoarRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSoarRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSoarRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSoarRecordsResponse setBody(DescribeSoarRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSoarRecordsResponseBody getBody() {
        return this.body;
    }

}
