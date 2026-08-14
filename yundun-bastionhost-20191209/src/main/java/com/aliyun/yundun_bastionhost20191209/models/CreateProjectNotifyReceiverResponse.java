// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateProjectNotifyReceiverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProjectNotifyReceiverResponseBody body;

    public static CreateProjectNotifyReceiverResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectNotifyReceiverResponse self = new CreateProjectNotifyReceiverResponse();
        return TeaModel.build(map, self);
    }

    public CreateProjectNotifyReceiverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProjectNotifyReceiverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProjectNotifyReceiverResponse setBody(CreateProjectNotifyReceiverResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProjectNotifyReceiverResponseBody getBody() {
        return this.body;
    }

}
