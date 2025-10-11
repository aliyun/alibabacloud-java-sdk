// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateNetworkChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNetworkChannelResponseBody body;

    public static CreateNetworkChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkChannelResponse self = new CreateNetworkChannelResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkChannelResponse setBody(CreateNetworkChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkChannelResponseBody getBody() {
        return this.body;
    }

}
