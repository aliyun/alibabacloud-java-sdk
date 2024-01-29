// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyActiveOperationTaskResponseBody body;

    public static ModifyActiveOperationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationTaskResponse self = new ModifyActiveOperationTaskResponse();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyActiveOperationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyActiveOperationTaskResponse setBody(ModifyActiveOperationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyActiveOperationTaskResponseBody getBody() {
        return this.body;
    }

}
