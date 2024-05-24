// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetListenerAccessControlStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetListenerAccessControlStatusResponseBody body;

    public static SetListenerAccessControlStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetListenerAccessControlStatusResponse self = new SetListenerAccessControlStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetListenerAccessControlStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetListenerAccessControlStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetListenerAccessControlStatusResponse setBody(SetListenerAccessControlStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetListenerAccessControlStatusResponseBody getBody() {
        return this.body;
    }

}
