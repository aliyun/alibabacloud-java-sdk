// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawAgentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarClawAgentsResponseBody body;

    public static DescribePolarClawAgentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawAgentsResponse self = new DescribePolarClawAgentsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawAgentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarClawAgentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarClawAgentsResponse setBody(DescribePolarClawAgentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarClawAgentsResponseBody getBody() {
        return this.body;
    }

}
