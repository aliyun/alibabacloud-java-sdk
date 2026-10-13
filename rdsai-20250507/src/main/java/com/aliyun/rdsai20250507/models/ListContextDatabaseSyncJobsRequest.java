// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncJobsRequest extends TeaModel {
    /**
     * <p>The ID of the target knowledge base.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-as1llqmkol****</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The page number. The value starts from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListContextDatabaseSyncJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncJobsRequest self = new ListContextDatabaseSyncJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncJobsRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public ListContextDatabaseSyncJobsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListContextDatabaseSyncJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListContextDatabaseSyncJobsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
