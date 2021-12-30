// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class SendXspaceStationMsgToServicerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendXspaceStationMsgToServicerResponseBody body;

    public static SendXspaceStationMsgToServicerResponse build(java.util.Map<String, ?> map) throws Exception {
        SendXspaceStationMsgToServicerResponse self = new SendXspaceStationMsgToServicerResponse();
        return TeaModel.build(map, self);
    }

    public SendXspaceStationMsgToServicerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendXspaceStationMsgToServicerResponse setBody(SendXspaceStationMsgToServicerResponseBody body) {
        this.body = body;
        return this;
    }
    public SendXspaceStationMsgToServicerResponseBody getBody() {
        return this.body;
    }

}
