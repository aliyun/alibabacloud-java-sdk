// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressConnectTrafficQosQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyExpressConnectTrafficQosQueueResponseBody body;

    public static ModifyExpressConnectTrafficQosQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressConnectTrafficQosQueueResponse self = new ModifyExpressConnectTrafficQosQueueResponse();
        return TeaModel.build(map, self);
    }

    public ModifyExpressConnectTrafficQosQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyExpressConnectTrafficQosQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyExpressConnectTrafficQosQueueResponse setBody(ModifyExpressConnectTrafficQosQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyExpressConnectTrafficQosQueueResponseBody getBody() {
        return this.body;
    }

}
