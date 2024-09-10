// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteMonitorAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMonitorAccountResponseBody body;

    public static DeleteMonitorAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorAccountResponse self = new DeleteMonitorAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMonitorAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMonitorAccountResponse setBody(DeleteMonitorAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMonitorAccountResponseBody getBody() {
        return this.body;
    }

}
