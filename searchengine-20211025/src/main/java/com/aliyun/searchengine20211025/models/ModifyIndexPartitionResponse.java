// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyIndexPartitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIndexPartitionResponseBody body;

    public static ModifyIndexPartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIndexPartitionResponse self = new ModifyIndexPartitionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIndexPartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIndexPartitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIndexPartitionResponse setBody(ModifyIndexPartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIndexPartitionResponseBody getBody() {
        return this.body;
    }

}
