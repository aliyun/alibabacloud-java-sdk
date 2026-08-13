// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RenameKnowledgeBaseSourceRequest extends TeaModel {
    /**
     * <p>新的数据源名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("newName")
    public String newName;

    /**
     * <p>数据源 ID（租户内唯一）</p>
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

    public static RenameKnowledgeBaseSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameKnowledgeBaseSourceRequest self = new RenameKnowledgeBaseSourceRequest();
        return TeaModel.build(map, self);
    }

    public RenameKnowledgeBaseSourceRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public RenameKnowledgeBaseSourceRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public RenameKnowledgeBaseSourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
