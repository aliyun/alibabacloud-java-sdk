// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddDataLevelPermissionRuleUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddDataLevelPermissionRuleUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDataLevelPermissionRuleUsersResponse setBody(AddDataLevelPermissionRuleUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDataLevelPermissionRuleUsersResponseBody getBody() {
        return this.body;
    }

}
