// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteUserVpcAuthorizationRequest extends TeaModel {
    @NameInMap("AuthType")
    public String authType;

    @NameInMap("AuthorizedUserId")
    public Long authorizedUserId;

    public static DeleteUserVpcAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserVpcAuthorizationRequest self = new DeleteUserVpcAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserVpcAuthorizationRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public DeleteUserVpcAuthorizationRequest setAuthorizedUserId(Long authorizedUserId) {
        this.authorizedUserId = authorizedUserId;
        return this;
    }
    public Long getAuthorizedUserId() {
        return this.authorizedUserId;
    }

}
