// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteDingTalkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDingTalkResponseBody body;

    public static DeleteDingTalkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDingTalkResponse self = new DeleteDingTalkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDingTalkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDingTalkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDingTalkResponse setBody(DeleteDingTalkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDingTalkResponseBody getBody() {
        return this.body;
    }

}
