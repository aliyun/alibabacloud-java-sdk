// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSuspEventsResponseBody body;

    public static DescribeSuspEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventsResponse self = new DescribeSuspEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSuspEventsResponse setBody(DescribeSuspEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspEventsResponseBody getBody() {
        return this.body;
    }

}
