// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListScheduledTasksRequest extends TeaModel {
    /**
     * <p>The ID of the collaboration group to which the task belongs, such as cg_101. If this parameter is specified, a group space task is created, and the caller must be a valid group member. If this parameter is left empty, a personal task is created.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCollaborationGroupId</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>Specifies whether to view only tasks created by yourself. This parameter takes effect only at the group level (at the personal level, tasks are always your own). If this parameter is not specified, no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("creatorOnly")
    public Boolean creatorOnly;

    /**
     * <p>The keyword in the rule name for fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample keyword</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The maximum number of records to return for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to retrieve the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>eHiB8vca1XDyBT0cNAmThA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number for pagination. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries to return per page.</p>
     * <blockquote>
     * <p>The maximum number of entries per page is 30.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The effective tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>Filters tasks by visibility scope. Multiple values can be selected. Valid values: PRIVATE (visible only to the creator and group owner), COLLABORATIVE (visible to specified collaboration members), and PUBLIC (visible to all group members). If this parameter is not specified or an empty list is passed, no filtering is applied. This parameter takes effect only at the group level (when collaborationGroupId is specified) and is ignored at the personal level.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;PRIVATE&quot;]</p>
     */
    @NameInMap("visibilities")
    public java.util.List<String> visibilities;

    public static ListScheduledTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledTasksRequest self = new ListScheduledTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListScheduledTasksRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public ListScheduledTasksRequest setCreatorOnly(Boolean creatorOnly) {
        this.creatorOnly = creatorOnly;
        return this;
    }
    public Boolean getCreatorOnly() {
        return this.creatorOnly;
    }

    public ListScheduledTasksRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListScheduledTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListScheduledTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListScheduledTasksRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListScheduledTasksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListScheduledTasksRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListScheduledTasksRequest setVisibilities(java.util.List<String> visibilities) {
        this.visibilities = visibilities;
        return this;
    }
    public java.util.List<String> getVisibilities() {
        return this.visibilities;
    }

}
