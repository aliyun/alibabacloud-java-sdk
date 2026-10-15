// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryRbacRoleRequest extends TeaModel {
    /**
     * <p>The business ID of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250821161210000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The storage management role ID, including preset roles and custom roles.</p>
     * <ul>
     * <li>25: storage management administrator (preset role)</li>
     * <li>26: developer (preset role)</li>
     * <li>27: analyst (preset role)</li>
     * <li>30: viewer (preset role)</li>
     * <li>Custom role: the role ID of the custom role</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>75b2f16f-35a5-4e90-949f-295ea14a4dc8</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    public static QueryRbacRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRbacRoleRequest self = new QueryRbacRoleRequest();
        return TeaModel.build(map, self);
    }

    public QueryRbacRoleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryRbacRoleRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

}
