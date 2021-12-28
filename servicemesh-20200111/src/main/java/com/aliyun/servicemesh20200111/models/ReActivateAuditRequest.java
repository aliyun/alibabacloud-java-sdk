// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ReActivateAuditRequest extends TeaModel {
    @NameInMap("EnableAudit")
    public Boolean enableAudit;

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
