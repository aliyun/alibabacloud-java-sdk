// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseSourceContentRequest extends TeaModel {
    /**
     * <p>更新后的完整正文；允许空字符串</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例内容</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>是否同步等待重新解析完成；默认 false，异步入队</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("forceSync")
    public Boolean forceSync;

    /**
     * <p>待编辑的企业知识库数据源 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UpdateKnowledgeBaseSourceContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseSourceContentRequest self = new UpdateKnowledgeBaseSourceContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseSourceContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateKnowledgeBaseSourceContentRequest setForceSync(Boolean forceSync) {
        this.forceSync = forceSync;
        return this;
    }
    public Boolean getForceSync() {
        return this.forceSync;
    }

    public UpdateKnowledgeBaseSourceContentRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public UpdateKnowledgeBaseSourceContentRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
