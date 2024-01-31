// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSimilarSecurityEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSimilarSecurityEventsResponseBody body;

    public static DescribeSimilarSecurityEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimilarSecurityEventsResponse self = new DescribeSimilarSecurityEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSimilarSecurityEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSimilarSecurityEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSimilarSecurityEventsResponse setBody(DescribeSimilarSecurityEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSimilarSecurityEventsResponseBody getBody() {
        return this.body;
    }

}
