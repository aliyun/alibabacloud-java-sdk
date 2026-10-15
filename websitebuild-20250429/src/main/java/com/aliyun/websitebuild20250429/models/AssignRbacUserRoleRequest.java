// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AssignRbacUserRoleRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The role parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;user_id&quot;: &quot;c1721c87-5401-40b3-b836-9b2653507feb&quot;,
     *     &quot;role_id&quot;: &quot;804a6b2a-82ac-49f2-960a-a6c2ed9e73dd&quot;,
     *     &quot;org_id&quot;: &quot;f0534aa7-94ec-4368-a34a-310390f66253&quot;}</p>
     */
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
