// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteUserVpcAuthorizationRequest extends TeaModel {
    /**
     * <p>The authorization scope. Valid values:</p>
     * <ul>
     * <li>NORMAL: general authorization</li>
     * <li>NORMAL: cloud service-related authorization</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11111111</p>
     */
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
