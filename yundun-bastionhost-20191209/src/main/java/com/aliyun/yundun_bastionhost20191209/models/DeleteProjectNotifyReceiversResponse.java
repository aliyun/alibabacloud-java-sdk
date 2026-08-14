// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteProjectNotifyReceiversResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProjectNotifyReceiversResponseBody body;

    public static DeleteProjectNotifyReceiversResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectNotifyReceiversResponse self = new DeleteProjectNotifyReceiversResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProjectNotifyReceiversResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProjectNotifyReceiversResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProjectNotifyReceiversResponse setBody(DeleteProjectNotifyReceiversResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProjectNotifyReceiversResponseBody getBody() {
        return this.body;
    }

}
