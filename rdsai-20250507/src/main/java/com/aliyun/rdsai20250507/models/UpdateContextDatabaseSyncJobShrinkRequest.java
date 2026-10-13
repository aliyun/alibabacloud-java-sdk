// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncJobShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sync-connection-20260923-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <strong>example:</strong>
     * <p>{&quot;include&quot;:[&quot;/研发文档/<strong>&quot;],&quot;exclude&quot;:[&quot;/归档文档/</strong>&quot;],&quot;excludedDocumentIds&quot;:[],&quot;sizeLimit&quot;:2147483648,&quot;typeAllowlist&quot;:[&quot;docx&quot;,&quot;pdf&quot;]}</p>
     */
    @NameInMap("Filters")
    public String filtersShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>研发团队文档导入</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>id-001</p>
     */
    @NameInMap("TargetKnowledgeBaseId")
    public String targetKnowledgeBaseId;

    /**
     * <strong>example:</strong>
     * <p>示例名称</p>
     */
    @NameInMap("TargetKnowledgeBaseName")
    public String targetKnowledgeBaseName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateContextDatabaseSyncJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncJobShrinkRequest self = new UpdateContextDatabaseSyncJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncJobShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateContextDatabaseSyncJobShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateContextDatabaseSyncJobShrinkRequest setFiltersShrink(String filtersShrink) {
        this.filtersShrink = filtersShrink;
        return this;
    }
    public String getFiltersShrink() {
        return this.filtersShrink;
    }

    public UpdateContextDatabaseSyncJobShrinkRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateContextDatabaseSyncJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContextDatabaseSyncJobShrinkRequest setTargetKnowledgeBaseId(String targetKnowledgeBaseId) {
        this.targetKnowledgeBaseId = targetKnowledgeBaseId;
        return this;
    }
    public String getTargetKnowledgeBaseId() {
        return this.targetKnowledgeBaseId;
    }

    public UpdateContextDatabaseSyncJobShrinkRequest setTargetKnowledgeBaseName(String targetKnowledgeBaseName) {
        this.targetKnowledgeBaseName = targetKnowledgeBaseName;
        return this;
    }
    public String getTargetKnowledgeBaseName() {
        return this.targetKnowledgeBaseName;
    }

    public UpdateContextDatabaseSyncJobShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
