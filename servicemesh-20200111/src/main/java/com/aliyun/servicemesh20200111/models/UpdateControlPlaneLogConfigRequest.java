// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateControlPlaneLogConfigRequest extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("LogTTLInDay")
    public Integer logTTLInDay;

    @NameInMap("Project")
    public String project;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static UpdateControlPlaneLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPlaneLogConfigRequest self = new UpdateControlPlaneLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateControlPlaneLogConfigRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateControlPlaneLogConfigRequest setLogTTLInDay(Integer logTTLInDay) {
        this.logTTLInDay = logTTLInDay;
        return this;
    }
    public Integer getLogTTLInDay() {
        return this.logTTLInDay;
    }

    public UpdateControlPlaneLogConfigRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public UpdateControlPlaneLogConfigRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
