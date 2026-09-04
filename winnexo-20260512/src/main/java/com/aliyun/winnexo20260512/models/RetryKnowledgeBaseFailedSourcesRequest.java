// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RetryKnowledgeBaseFailedSourcesRequest extends TeaModel {
    /**
     * <p>The enterprise knowledge base directory ID (recursively includes failed resources in subdirectories).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass this value explicitly with --tenant-id.</p>
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
