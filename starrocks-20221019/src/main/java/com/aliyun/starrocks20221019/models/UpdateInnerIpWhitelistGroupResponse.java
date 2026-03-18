// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class UpdateInnerIpWhitelistGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInnerIpWhitelistGroupResponseBody body;

    public static UpdateInnerIpWhitelistGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInnerIpWhitelistGroupResponse self = new UpdateInnerIpWhitelistGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInnerIpWhitelistGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInnerIpWhitelistGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInnerIpWhitelistGroupResponse setBody(UpdateInnerIpWhitelistGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInnerIpWhitelistGroupResponseBody getBody() {
        return this.body;
    }

}
