// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAIDBClusterDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAIDBClusterDescriptionResponseBody body;

    public static ModifyAIDBClusterDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAIDBClusterDescriptionResponse self = new ModifyAIDBClusterDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAIDBClusterDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAIDBClusterDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAIDBClusterDescriptionResponse setBody(ModifyAIDBClusterDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAIDBClusterDescriptionResponseBody getBody() {
        return this.body;
    }

}
