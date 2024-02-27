// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class WithdrawAllUserGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WithdrawAllUserGroupsResponseBody body;

    public static WithdrawAllUserGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        WithdrawAllUserGroupsResponse self = new WithdrawAllUserGroupsResponse();
        return TeaModel.build(map, self);
    }

    public WithdrawAllUserGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WithdrawAllUserGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WithdrawAllUserGroupsResponse setBody(WithdrawAllUserGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public WithdrawAllUserGroupsResponseBody getBody() {
        return this.body;
    }

}
