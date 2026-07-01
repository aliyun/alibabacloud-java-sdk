// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAgenticDBBranchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgenticDBBranchResponseBody body;

    public static DeleteAgenticDBBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDBBranchResponse self = new DeleteAgenticDBBranchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDBBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgenticDBBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgenticDBBranchResponse setBody(DeleteAgenticDBBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgenticDBBranchResponseBody getBody() {
        return this.body;
    }

}
