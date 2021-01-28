// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyActiveOperationTaskResponse setBody(ModifyActiveOperationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyActiveOperationTaskResponseBody getBody() {
        return this.body;
    }

}
