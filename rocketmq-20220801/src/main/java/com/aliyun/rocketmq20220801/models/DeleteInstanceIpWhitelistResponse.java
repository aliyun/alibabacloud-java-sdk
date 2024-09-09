// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteInstanceIpWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInstanceIpWhitelistResponseBody body;

    public static DeleteInstanceIpWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceIpWhitelistResponse self = new DeleteInstanceIpWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceIpWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceIpWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstanceIpWhitelistResponse setBody(DeleteInstanceIpWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceIpWhitelistResponseBody getBody() {
        return this.body;
    }

}
