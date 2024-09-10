// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSupervisonInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSupervisonInfoResponseBody body;

    public static DescribeSupervisonInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupervisonInfoResponse self = new DescribeSupervisonInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupervisonInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupervisonInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSupervisonInfoResponse setBody(DescribeSupervisonInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupervisonInfoResponseBody getBody() {
        return this.body;
    }

}
