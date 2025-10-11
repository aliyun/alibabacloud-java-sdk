// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteNetworkChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNetworkChannelResponseBody body;

    public static DeleteNetworkChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkChannelResponse self = new DeleteNetworkChannelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkChannelResponse setBody(DeleteNetworkChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkChannelResponseBody getBody() {
        return this.body;
    }

}
