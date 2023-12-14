// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class TriggerGatewayRemoteSyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TriggerGatewayRemoteSyncResponseBody body;

    public static TriggerGatewayRemoteSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerGatewayRemoteSyncResponse self = new TriggerGatewayRemoteSyncResponse();
        return TeaModel.build(map, self);
    }

    public TriggerGatewayRemoteSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerGatewayRemoteSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerGatewayRemoteSyncResponse setBody(TriggerGatewayRemoteSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerGatewayRemoteSyncResponseBody getBody() {
        return this.body;
    }

}
