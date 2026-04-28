// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyConsumerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyConsumerResponseBody body;

    public static ModifyConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumerResponse self = new ModifyConsumerResponse();
        return TeaModel.build(map, self);
    }

    public ModifyConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyConsumerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyConsumerResponse setBody(ModifyConsumerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyConsumerResponseBody getBody() {
        return this.body;
    }

}
