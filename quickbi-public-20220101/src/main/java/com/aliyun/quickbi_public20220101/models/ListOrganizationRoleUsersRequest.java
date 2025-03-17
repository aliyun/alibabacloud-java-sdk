// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListOrganizationRoleUsersRequest extends TeaModel {
    /**
     * <p>Keyword for the nickname of the organization member.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Page number.</p>
     * <ul>
     * <li>Default value is 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Number of items per page.</p>
     * <ul>
     * <li>Default value is 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Organization role ID, including predefined roles and custom roles:</p>
     * <ul>
     * <li>Organization Administrator (predefined role): 111111111</li>
     * <li>Permission Administrator (predefined role): 111111112</li>
     * <li>Regular User (predefined role): 111111113</li>
     * <li>Custom Role: The corresponding role ID for a custom role</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111111111</p>
     */
    @NameInMap("RoleId")
    public Long roleId;

    public static ListOrganizationRoleUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationRoleUsersRequest self = new ListOrganizationRoleUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListOrganizationRoleUsersRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListOrganizationRoleUsersRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListOrganizationRoleUsersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrganizationRoleUsersRequest setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

}
