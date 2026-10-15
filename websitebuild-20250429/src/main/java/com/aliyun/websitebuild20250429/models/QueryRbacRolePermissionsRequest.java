// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryRbacRolePermissionsRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250731233102000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The field by which to sort the results.</p>
     * 
     * <strong>example:</strong>
     * <p>gmtCreated</p>
     */
    @NameInMap("OrderColumn")
    public String orderColumn;

    /**
     * <p>The sort order. Valid values: ASC and DESC.</p>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The organization role ID, including predefined roles and custom roles:</p>
     * <ul>
     * <li>Organization administrator (predefined role): 111111111</li>
     * <li>Permission management administrator (predefined role): 111111112</li>
     * <li>Regular user (predefined role): 111111113</li>
     * <li>Custom role: the role ID of the custom role</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>75b2f16f-35a5-4e90-949f-295ea14a4dc8</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    public static QueryRbacRolePermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRbacRolePermissionsRequest self = new QueryRbacRolePermissionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryRbacRolePermissionsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryRbacRolePermissionsRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public QueryRbacRolePermissionsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryRbacRolePermissionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryRbacRolePermissionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRbacRolePermissionsRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

}
