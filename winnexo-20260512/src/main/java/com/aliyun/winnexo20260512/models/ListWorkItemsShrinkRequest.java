// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListWorkItemsShrinkRequest extends TeaModel {
    /**
     * <p>The business statuses used for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("businessStatuses")
    public String businessStatusesShrink;

    /**
     * <p>The ID of the collaboration workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The work item types used for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("itemTypes")
    public String itemTypesShrink;

    /**
     * <p>The keyword for fuzzy search in the title or description.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of entries to return per page. Valid values: 1 to 100. This parameter takes precedence over pageSize if both are specified.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. Obtain the token from the nextToken parameter in the previous response. This parameter takes precedence over page if both are specified.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number. This parameter is ignored if nextToken is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The priorities used for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("priorities")
    public String prioritiesShrink;

    /**
     * <p>The personal scope used for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>ASSIGNED_TO_ME</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListWorkItemsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkItemsShrinkRequest self = new ListWorkItemsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkItemsShrinkRequest setBusinessStatusesShrink(String businessStatusesShrink) {
        this.businessStatusesShrink = businessStatusesShrink;
        return this;
    }
    public String getBusinessStatusesShrink() {
        return this.businessStatusesShrink;
    }

    public ListWorkItemsShrinkRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public ListWorkItemsShrinkRequest setItemTypesShrink(String itemTypesShrink) {
        this.itemTypesShrink = itemTypesShrink;
        return this;
    }
    public String getItemTypesShrink() {
        return this.itemTypesShrink;
    }

    public ListWorkItemsShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListWorkItemsShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListWorkItemsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkItemsShrinkRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListWorkItemsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWorkItemsShrinkRequest setPrioritiesShrink(String prioritiesShrink) {
        this.prioritiesShrink = prioritiesShrink;
        return this;
    }
    public String getPrioritiesShrink() {
        return this.prioritiesShrink;
    }

    public ListWorkItemsShrinkRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListWorkItemsShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
