// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteUserVpcAuthorizationRequest extends TeaModel {
    /**
     * <p>The authorization type. Valid values:</p>
     * <ul>
     * <li><p>NORMAL: Standard authorization.</p>
     * </li>
     * <li><p>CLOUD_PRODUCT: Cloud product authorization.</p>
     * </li>
     * </ul>
     * <p>Default value: NORMAL</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>The ID of the Alibaba Cloud account that owns the authorized resources.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>141339776561****</p>
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
