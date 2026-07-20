// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryRbacRolePermissionsRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("OrderColumn")
    public String orderColumn;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

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
