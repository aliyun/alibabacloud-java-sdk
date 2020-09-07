// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckCloudResourceAuthorizedResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AuthorizationState")
    @Validation(required = true)
    public Integer authorizationState;

    @NameInMap("RoleArn")
    @Validation(required = true)
    public String roleArn;

    public static CheckCloudResourceAuthorizedResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCloudResourceAuthorizedResponse self = new CheckCloudResourceAuthorizedResponse();
        return TeaModel.build(map, self);
    }

    public CheckCloudResourceAuthorizedResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckCloudResourceAuthorizedResponse setAuthorizationState(Integer authorizationState) {
        this.authorizationState = authorizationState;
        return this;
    }
    public Integer getAuthorizationState() {
        return this.authorizationState;
    }

    public CheckCloudResourceAuthorizedResponse setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

}
