// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyConsumerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyConsumerGroupResponseBody body;

    public static ModifyConsumerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumerGroupResponse self = new ModifyConsumerGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyConsumerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyConsumerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyConsumerGroupResponse setBody(ModifyConsumerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyConsumerGroupResponseBody getBody() {
        return this.body;
    }

}
