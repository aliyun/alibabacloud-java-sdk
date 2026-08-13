// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RetryKnowledgeBaseFailedSourcesRequest extends TeaModel {
    /**
     * <p>企业知识库目录 ID（递归包含子目录下的失败资源）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static RetryKnowledgeBaseFailedSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryKnowledgeBaseFailedSourcesRequest self = new RetryKnowledgeBaseFailedSourcesRequest();
        return TeaModel.build(map, self);
    }

    public RetryKnowledgeBaseFailedSourcesRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public RetryKnowledgeBaseFailedSourcesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
