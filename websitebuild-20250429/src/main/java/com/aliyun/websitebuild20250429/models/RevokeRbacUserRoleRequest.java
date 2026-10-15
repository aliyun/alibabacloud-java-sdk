// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RevokeRbacUserRoleRequest extends TeaModel {
    /**
     * <p>The business ID of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250731233102000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The user role information.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;org_id&quot;: &quot;f0534aa7-94ec-4368-a34a-310390f66253&quot;,
     *         &quot;role_id&quot;: &quot;804a6b2a-82ac-49f2-960a-a6c2ed9e73dd&quot;,
     *         &quot;user_id&quot;: &quot;c1721c87-5401-40b3-b836-9b2653507feb&quot;
     *       }</p>
     */
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
