// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteDataLevelPermissionRuleUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataLevelPermissionRuleUsersResponseBody body;

    public static DeleteDataLevelPermissionRuleUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataLevelPermissionRuleUsersResponse self = new DeleteDataLevelPermissionRuleUsersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataLevelPermissionRuleUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataLevelPermissionRuleUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataLevelPermissionRuleUsersResponse setBody(DeleteDataLevelPermissionRuleUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataLevelPermissionRuleUsersResponseBody getBody() {
        return this.body;
    }

}
