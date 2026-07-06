// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class BindAgentStorage2VpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindAgentStorage2VpcResponseBody body;

    public static BindAgentStorage2VpcResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAgentStorage2VpcResponse self = new BindAgentStorage2VpcResponse();
        return TeaModel.build(map, self);
    }

    public BindAgentStorage2VpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAgentStorage2VpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAgentStorage2VpcResponse setBody(BindAgentStorage2VpcResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAgentStorage2VpcResponseBody getBody() {
        return this.body;
    }

}
