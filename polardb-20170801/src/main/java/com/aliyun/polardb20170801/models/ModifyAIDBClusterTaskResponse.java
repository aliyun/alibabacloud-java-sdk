// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAIDBClusterTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAIDBClusterTaskResponseBody body;

    public static ModifyAIDBClusterTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAIDBClusterTaskResponse self = new ModifyAIDBClusterTaskResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAIDBClusterTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAIDBClusterTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAIDBClusterTaskResponse setBody(ModifyAIDBClusterTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAIDBClusterTaskResponseBody getBody() {
        return this.body;
    }

}
