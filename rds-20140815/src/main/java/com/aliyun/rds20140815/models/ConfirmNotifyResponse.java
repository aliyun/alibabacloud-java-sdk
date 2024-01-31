// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ConfirmNotifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmNotifyResponseBody body;

    public static ConfirmNotifyResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmNotifyResponse self = new ConfirmNotifyResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmNotifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmNotifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmNotifyResponse setBody(ConfirmNotifyResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmNotifyResponseBody getBody() {
        return this.body;
    }

}
