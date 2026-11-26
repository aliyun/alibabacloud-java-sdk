// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListTodosRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If specified, the operation is performed as the user identified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The collaboration workspace ID. This is an optional filter. If not specified, all workspaces are included.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_123</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>The keyword for fuzzy search in the title or summary.</p>
     * 
     * <strong>example:</strong>
     * <p>Approval</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of entries to return per page. Valid values: 1 to 100. This parameter takes precedence over pageSize if both are specified.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. Use the nextToken value returned in the previous response. This parameter takes precedence over page if both are specified.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

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
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The priority filter. Valid values: HIGH, MEDIUM, LOW.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;HIGH&quot;,&quot;MEDIUM&quot;]</p>
     */
    @NameInMap("priorities")
    public java.util.List<String> priorities;

    /**
     * <p>The read status filter. Valid values: UNREAD, READ. The status is determined by the readAt time of the assignee.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;UNREAD&quot;,&quot;READ&quot;]</p>
     */
    @NameInMap("readStatus")
    public java.util.List<String> readStatus;

    /**
     * <p>The sorting method.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("sortBy")
    public String sortBy;

    /**
     * <p>The to-do type filter. Valid values: WORKFLOW, OPEN_API.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;WORKFLOW&quot;,&quot;OPEN_API&quot;]</p>
     */
    @NameInMap("sourceTypes")
    public java.util.List<String> sourceTypes;

    /**
     * <p>The to-do status filter. Valid values: PENDING, COMPLETED, CANCELLED.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;PENDING&quot;,&quot;COMPLETED&quot;]</p>
     */
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListTodosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTodosRequest self = new ListTodosRequest();
        return TeaModel.build(map, self);
    }

    public ListTodosRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ListTodosRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public ListTodosRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListTodosRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListTodosRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTodosRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ListTodosRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ListTodosRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListTodosRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTodosRequest setPriorities(java.util.List<String> priorities) {
        this.priorities = priorities;
        return this;
    }
    public java.util.List<String> getPriorities() {
        return this.priorities;
    }

    public ListTodosRequest setReadStatus(java.util.List<String> readStatus) {
        this.readStatus = readStatus;
        return this;
    }
    public java.util.List<String> getReadStatus() {
        return this.readStatus;
    }

    public ListTodosRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTodosRequest setSourceTypes(java.util.List<String> sourceTypes) {
        this.sourceTypes = sourceTypes;
        return this;
    }
    public java.util.List<String> getSourceTypes() {
        return this.sourceTypes;
    }

    public ListTodosRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public ListTodosRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
