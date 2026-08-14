// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyProjectNotifyReceiverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyProjectNotifyReceiverResponseBody body;

    public static ModifyProjectNotifyReceiverResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectNotifyReceiverResponse self = new ModifyProjectNotifyReceiverResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProjectNotifyReceiverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProjectNotifyReceiverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyProjectNotifyReceiverResponse setBody(ModifyProjectNotifyReceiverResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProjectNotifyReceiverResponseBody getBody() {
        return this.body;
    }

}
