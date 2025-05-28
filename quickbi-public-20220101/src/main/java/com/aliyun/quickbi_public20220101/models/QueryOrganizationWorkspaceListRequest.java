// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryOrganizationWorkspaceListRequest extends TeaModel {
    /**
     * <p>Keyword for the workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Current page number of the workspace list:</p>
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
     * <p>Number of rows per page in a paginated query:</p>
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
     * <p>User ID in Quick BI.</p>
     * 
     * <strong>example:</strong>
     * <p>fe67f61a35a94b7da1a34ba174a7****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QueryOrganizationWorkspaceListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrganizationWorkspaceListRequest self = new QueryOrganizationWorkspaceListRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrganizationWorkspaceListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryOrganizationWorkspaceListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryOrganizationWorkspaceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOrganizationWorkspaceListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
