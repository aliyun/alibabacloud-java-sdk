// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarClawChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolarClawChannelResponseBody body;

    public static DeletePolarClawChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarClawChannelResponse self = new DeletePolarClawChannelResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolarClawChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolarClawChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolarClawChannelResponse setBody(DeletePolarClawChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolarClawChannelResponseBody getBody() {
        return this.body;
    }

}
