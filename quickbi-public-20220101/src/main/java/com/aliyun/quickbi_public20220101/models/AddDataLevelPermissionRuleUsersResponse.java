// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddDataLevelPermissionRuleUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDataLevelPermissionRuleUsersResponseBody body;

    public static AddDataLevelPermissionRuleUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDataLevelPermissionRuleUsersResponse self = new AddDataLevelPermissionRuleUsersResponse();
        return TeaModel.build(map, self);
    }

    public AddDataLevelPermissionRuleUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDataLevelPermissionRuleUsersResponse setBody(AddDataLevelPermissionRuleUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDataLevelPermissionRuleUsersResponseBody getBody() {
        return this.body;
    }

}
