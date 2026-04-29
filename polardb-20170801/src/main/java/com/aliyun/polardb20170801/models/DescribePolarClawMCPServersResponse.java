// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawMCPServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarClawMCPServersResponseBody body;

    public static DescribePolarClawMCPServersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawMCPServersResponse self = new DescribePolarClawMCPServersResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawMCPServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarClawMCPServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarClawMCPServersResponse setBody(DescribePolarClawMCPServersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarClawMCPServersResponseBody getBody() {
        return this.body;
    }

}
