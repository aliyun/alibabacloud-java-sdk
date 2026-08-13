// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAuthorizedUsersRequest extends TeaModel {
    /**
     * <p>筛选类型：USER / USER_GROUP / 不传则返回全部</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("granteeType")
    public String granteeType;

    /**
     * <p>搜索关键词，按用户名或组名模糊匹配</p>
     * 
     * <strong>example:</strong>
     * <p>示例关键词</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>数字员工名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>权限类型过滤：USE=使用权限 / MANAGE=管理权限</p>
     * 
     * <strong>example:</strong>
     * <p>USE</p>
     */
    @NameInMap("permission")
    public String permission;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListAuthorizedUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUsersRequest self = new ListAuthorizedUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUsersRequest setGranteeType(String granteeType) {
        this.granteeType = granteeType;
        return this;
    }
    public String getGranteeType() {
        return this.granteeType;
    }

    public ListAuthorizedUsersRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAuthorizedUsersRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public ListAuthorizedUsersRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public ListAuthorizedUsersRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
