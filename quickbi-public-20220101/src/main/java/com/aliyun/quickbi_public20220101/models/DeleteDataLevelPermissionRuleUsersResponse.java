// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteDataLevelPermissionRuleUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteDataLevelPermissionRuleUsersResponse setBody(DeleteDataLevelPermissionRuleUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataLevelPermissionRuleUsersResponseBody getBody() {
        return this.body;
    }

}
