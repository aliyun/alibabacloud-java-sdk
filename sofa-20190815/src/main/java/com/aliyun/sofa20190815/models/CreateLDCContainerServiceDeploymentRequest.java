// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCContainerServiceDeploymentRequest extends TeaModel {
    @NameInMap("ContainerServicesJsonStr")
    public String containerServicesJsonStr;

    @NameInMap("IsAutoExecute")
    public Boolean isAutoExecute;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OpsType")
    public String opsType;

    @NameInMap("ReleasePlanUniqueId")
    public String releasePlanUniqueId;

    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("Title")
    public String title;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static CreateLDCContainerServiceDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCContainerServiceDeploymentRequest self = new CreateLDCContainerServiceDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public CreateLDCContainerServiceDeploymentRequest setContainerServicesJsonStr(String containerServicesJsonStr) {
        this.containerServicesJsonStr = containerServicesJsonStr;
        return this;
    }
    public String getContainerServicesJsonStr() {
        return this.containerServicesJsonStr;
    }

    public CreateLDCContainerServiceDeploymentRequest setIsAutoExecute(Boolean isAutoExecute) {
        this.isAutoExecute = isAutoExecute;
        return this;
    }
    public Boolean getIsAutoExecute() {
        return this.isAutoExecute;
    }

    public CreateLDCContainerServiceDeploymentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateLDCContainerServiceDeploymentRequest setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

    public CreateLDCContainerServiceDeploymentRequest setReleasePlanUniqueId(String releasePlanUniqueId) {
        this.releasePlanUniqueId = releasePlanUniqueId;
        return this;
    }
    public String getReleasePlanUniqueId() {
        return this.releasePlanUniqueId;
    }

    public CreateLDCContainerServiceDeploymentRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public CreateLDCContainerServiceDeploymentRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateLDCContainerServiceDeploymentRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
