// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RevokeRbacUserRoleRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("UserRoleData")
    public String userRoleData;

    public static RevokeRbacUserRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeRbacUserRoleRequest self = new RevokeRbacUserRoleRequest();
        return TeaModel.build(map, self);
    }

    public RevokeRbacUserRoleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RevokeRbacUserRoleRequest setUserRoleData(String userRoleData) {
        this.userRoleData = userRoleData;
        return this;
    }
    public String getUserRoleData() {
        return this.userRoleData;
    }

}
