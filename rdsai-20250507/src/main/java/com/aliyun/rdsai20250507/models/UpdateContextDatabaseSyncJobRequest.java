// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateContextDatabaseSyncJobRequest extends TeaModel {
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
    public java.util.Map<String, ?> filters;

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

    public static UpdateContextDatabaseSyncJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContextDatabaseSyncJobRequest self = new UpdateContextDatabaseSyncJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContextDatabaseSyncJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateContextDatabaseSyncJobRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateContextDatabaseSyncJobRequest setFilters(java.util.Map<String, ?> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.Map<String, ?> getFilters() {
        return this.filters;
    }

    public UpdateContextDatabaseSyncJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateContextDatabaseSyncJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContextDatabaseSyncJobRequest setTargetKnowledgeBaseId(String targetKnowledgeBaseId) {
        this.targetKnowledgeBaseId = targetKnowledgeBaseId;
        return this;
    }
    public String getTargetKnowledgeBaseId() {
        return this.targetKnowledgeBaseId;
    }

    public UpdateContextDatabaseSyncJobRequest setTargetKnowledgeBaseName(String targetKnowledgeBaseName) {
        this.targetKnowledgeBaseName = targetKnowledgeBaseName;
        return this;
    }
    public String getTargetKnowledgeBaseName() {
        return this.targetKnowledgeBaseName;
    }

    public UpdateContextDatabaseSyncJobRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
