// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class PreviewOutputFileRequest extends TeaModel {
    /**
     * <p>The output item ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleOutputItemId</p>
     */
    @NameInMap("outputItemId")
    public String outputItemId;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The version referenced by the alias.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleVersionId</p>
     */
    @NameInMap("versionId")
    public String versionId;

    public static PreviewOutputFileRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewOutputFileRequest self = new PreviewOutputFileRequest();
        return TeaModel.build(map, self);
    }

    public PreviewOutputFileRequest setOutputItemId(String outputItemId) {
        this.outputItemId = outputItemId;
        return this;
    }
    public String getOutputItemId() {
        return this.outputItemId;
    }

    public PreviewOutputFileRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PreviewOutputFileRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
