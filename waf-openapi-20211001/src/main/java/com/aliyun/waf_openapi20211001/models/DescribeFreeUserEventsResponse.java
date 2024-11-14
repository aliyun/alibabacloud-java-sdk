// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFreeUserEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFreeUserEventsResponseBody body;

    public static DescribeFreeUserEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFreeUserEventsResponse self = new DescribeFreeUserEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFreeUserEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFreeUserEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFreeUserEventsResponse setBody(DescribeFreeUserEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFreeUserEventsResponseBody getBody() {
        return this.body;
    }

}
