// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ReActivateAuditRequest extends TeaModel {
    /**
     * <p>Specifies whether to recreate a project that is used to store audit logs. Valid values:</p>
     * <ul>
     * <li>true: recreates a project.</li>
     * <li>false: does not recreate a project.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAudit")
    public Boolean enableAudit;

    /**
     * <p>The ID of the Service Mesh (ASM) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5bf9eb05c4424b89985d6536a809****</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static ReActivateAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        ReActivateAuditRequest self = new ReActivateAuditRequest();
        return TeaModel.build(map, self);
    }

    public ReActivateAuditRequest setEnableAudit(Boolean enableAudit) {
        this.enableAudit = enableAudit;
        return this;
    }
    public Boolean getEnableAudit() {
        return this.enableAudit;
    }

    public ReActivateAuditRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
