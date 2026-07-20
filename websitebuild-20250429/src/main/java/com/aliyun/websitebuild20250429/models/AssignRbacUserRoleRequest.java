// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AssignRbacUserRoleRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("UserRoleData")
    public String userRoleData;

    public static AssignRbacUserRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignRbacUserRoleRequest self = new AssignRbacUserRoleRequest();
        return TeaModel.build(map, self);
    }

    public AssignRbacUserRoleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AssignRbacUserRoleRequest setUserRoleData(String userRoleData) {
        this.userRoleData = userRoleData;
        return this;
    }
    public String getUserRoleData() {
        return this.userRoleData;
    }

}
