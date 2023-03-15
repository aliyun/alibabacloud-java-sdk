// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListRolesShrinkRequest extends TeaModel {
    @NameInMap("authorizerId")
    public String authorizerId;

    @NameInMap("authorizerType")
    public String authorizerType;

    @NameInMap("enterpriseId")
    public Long enterpriseId;

    @NameInMap("name")
    public String name;

    @NameInMap("orderBy")
    public String orderBy;

    @NameInMap("orderDirection")
    public String orderDirection;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("platform")
    public String platform;

    @NameInMap("roleIds")
    public String roleIdsShrink;

    @NameInMap("roleType")
    public String roleType;

    public static ListRolesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRolesShrinkRequest self = new ListRolesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListRolesShrinkRequest setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    public ListRolesShrinkRequest setAuthorizerType(String authorizerType) {
        this.authorizerType = authorizerType;
        return this;
    }
    public String getAuthorizerType() {
        return this.authorizerType;
    }

    public ListRolesShrinkRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ListRolesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListRolesShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListRolesShrinkRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListRolesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRolesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRolesShrinkRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ListRolesShrinkRequest setRoleIdsShrink(String roleIdsShrink) {
        this.roleIdsShrink = roleIdsShrink;
        return this;
    }
    public String getRoleIdsShrink() {
        return this.roleIdsShrink;
    }

    public ListRolesShrinkRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
