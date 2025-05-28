// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListWorkspaceRoleUsersRequest extends TeaModel {
    /**
     * <p>Keyword for the user\&quot;s nickname.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Current page number for pagination:</p>
     * <ul>
     * <li>Starting value: 1</li>
     * <li>Default value: 1</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Number of items per page for pagination:</p>
     * <ul>
     * <li>Default value: 10</li>
     * <li>Maximum value: 1000</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Workspace role ID, including predefined roles and custom roles:</p>
     * <ul>
     * <li>25: Workspace Administrator (predefined role)</li>
     * <li>26: Developer (predefined role)</li>
     * <li>27: Analyst (predefined role)</li>
     * <li>30: Viewer (predefined role)</li>
     * <li>Custom roles: The corresponding role ID for custom roles</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("RoleId")
    public Long roleId;

    /**
     * <p>The ID of the workspace. This parameter is optional. If you do not set this parameter, the roles of all workspaces are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>726bee5a-****-43e1-9a8e-b550f0120f35</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListWorkspaceRoleUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceRoleUsersRequest self = new ListWorkspaceRoleUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceRoleUsersRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListWorkspaceRoleUsersRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListWorkspaceRoleUsersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWorkspaceRoleUsersRequest setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

    public ListWorkspaceRoleUsersRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
