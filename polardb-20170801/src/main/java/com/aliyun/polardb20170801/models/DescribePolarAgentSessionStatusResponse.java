// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarAgentSessionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarAgentSessionStatusResponseBody body;

    public static DescribePolarAgentSessionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarAgentSessionStatusResponse self = new DescribePolarAgentSessionStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarAgentSessionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarAgentSessionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarAgentSessionStatusResponse setBody(DescribePolarAgentSessionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarAgentSessionStatusResponseBody getBody() {
        return this.body;
    }

}
