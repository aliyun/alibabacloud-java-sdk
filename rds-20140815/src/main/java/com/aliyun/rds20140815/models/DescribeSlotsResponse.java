// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSlotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlotsResponseBody body;

    public static DescribeSlotsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlotsResponse self = new DescribeSlotsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlotsResponse setBody(DescribeSlotsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlotsResponseBody getBody() {
        return this.body;
    }

}
