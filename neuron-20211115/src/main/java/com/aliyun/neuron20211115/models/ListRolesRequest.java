// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListRolesRequest extends TeaModel {
    @NameInMap("authorizer_id")
    public String authorizerId;

    @NameInMap("authorizer_type")
    public String authorizerType;

    @NameInMap("enterprise_id")
    public Long enterpriseId;

    @NameInMap("name")
    public String name;

    @NameInMap("order_by")
    public String orderBy;

    @NameInMap("order_direction")
    public String orderDirection;

    @NameInMap("page_number")
    public Integer pageNumber;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("platform")
    public String platform;

    @NameInMap("role_ids")
    public java.util.List<Long> roleIds;

    @NameInMap("role_type")
    public String roleType;

    public static ListRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRolesRequest self = new ListRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListRolesRequest setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    public ListRolesRequest setAuthorizerType(String authorizerType) {
        this.authorizerType = authorizerType;
        return this;
    }
    public String getAuthorizerType() {
        return this.authorizerType;
    }

    public ListRolesRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ListRolesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListRolesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListRolesRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListRolesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRolesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRolesRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ListRolesRequest setRoleIds(java.util.List<Long> roleIds) {
        this.roleIds = roleIds;
        return this;
    }
    public java.util.List<Long> getRoleIds() {
        return this.roleIds;
    }

    public ListRolesRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
