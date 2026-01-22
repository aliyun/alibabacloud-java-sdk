// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarAgentUserSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarAgentUserSessionsResponseBody body;

    public static DescribePolarAgentUserSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarAgentUserSessionsResponse self = new DescribePolarAgentUserSessionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarAgentUserSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarAgentUserSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarAgentUserSessionsResponse setBody(DescribePolarAgentUserSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarAgentUserSessionsResponseBody getBody() {
        return this.body;
    }

}
