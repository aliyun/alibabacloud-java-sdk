// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UnbindAgentStorage2VpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindAgentStorage2VpcResponseBody body;

    public static UnbindAgentStorage2VpcResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindAgentStorage2VpcResponse self = new UnbindAgentStorage2VpcResponse();
        return TeaModel.build(map, self);
    }

    public UnbindAgentStorage2VpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindAgentStorage2VpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindAgentStorage2VpcResponse setBody(UnbindAgentStorage2VpcResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindAgentStorage2VpcResponseBody getBody() {
        return this.body;
    }

}
