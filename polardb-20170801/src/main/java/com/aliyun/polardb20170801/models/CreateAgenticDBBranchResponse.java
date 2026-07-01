// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAgenticDBBranchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAgenticDBBranchResponseBody body;

    public static CreateAgenticDBBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticDBBranchResponse self = new CreateAgenticDBBranchResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgenticDBBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgenticDBBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAgenticDBBranchResponse setBody(CreateAgenticDBBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgenticDBBranchResponseBody getBody() {
        return this.body;
    }

}
