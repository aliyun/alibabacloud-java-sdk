// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RetryDirectoryFailedSourcesRequest extends TeaModel {
    /**
     * <p>The ID of the enterprise knowledge base folder. Failed resources in the folder and its subfolders are included recursively.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass this value explicitly by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static RetryDirectoryFailedSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryDirectoryFailedSourcesRequest self = new RetryDirectoryFailedSourcesRequest();
        return TeaModel.build(map, self);
    }

    public RetryDirectoryFailedSourcesRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public RetryDirectoryFailedSourcesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
