// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateListenerAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateListenerAttributeResponseBody body;

    public static UpdateListenerAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerAttributeResponse self = new UpdateListenerAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateListenerAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateListenerAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateListenerAttributeResponse setBody(UpdateListenerAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateListenerAttributeResponseBody getBody() {
        return this.body;
    }

}
