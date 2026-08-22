// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteOpenSearchWhitelistGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOpenSearchWhitelistGroupResponseBody body;

    public static DeleteOpenSearchWhitelistGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpenSearchWhitelistGroupResponse self = new DeleteOpenSearchWhitelistGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOpenSearchWhitelistGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOpenSearchWhitelistGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOpenSearchWhitelistGroupResponse setBody(DeleteOpenSearchWhitelistGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOpenSearchWhitelistGroupResponseBody getBody() {
        return this.body;
    }

}
