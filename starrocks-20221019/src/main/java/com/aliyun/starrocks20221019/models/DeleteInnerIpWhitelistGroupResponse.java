// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DeleteInnerIpWhitelistGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInnerIpWhitelistGroupResponseBody body;

    public static DeleteInnerIpWhitelistGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInnerIpWhitelistGroupResponse self = new DeleteInnerIpWhitelistGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInnerIpWhitelistGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInnerIpWhitelistGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInnerIpWhitelistGroupResponse setBody(DeleteInnerIpWhitelistGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInnerIpWhitelistGroupResponseBody getBody() {
        return this.body;
    }

}
