// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteChannelResponseBody body;

    public static DeleteChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChannelResponse self = new DeleteChannelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteChannelResponse setBody(DeleteChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChannelResponseBody getBody() {
        return this.body;
    }

}
