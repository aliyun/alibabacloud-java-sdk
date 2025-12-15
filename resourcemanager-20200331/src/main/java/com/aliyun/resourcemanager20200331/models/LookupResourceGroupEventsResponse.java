// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class LookupResourceGroupEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LookupResourceGroupEventsResponseBody body;

    public static LookupResourceGroupEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        LookupResourceGroupEventsResponse self = new LookupResourceGroupEventsResponse();
        return TeaModel.build(map, self);
    }

    public LookupResourceGroupEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LookupResourceGroupEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LookupResourceGroupEventsResponse setBody(LookupResourceGroupEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public LookupResourceGroupEventsResponseBody getBody() {
        return this.body;
    }

}
