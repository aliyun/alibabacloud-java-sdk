// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmAKSOpsContainerServiceRequest extends TeaModel {
    @NameInMap("ContainerServiceName")
    public String containerServiceName;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("OpsContainerServiceId")
    public String opsContainerServiceId;

    @NameInMap("Revision")
    public String revision;

    @NameInMap("Token")
    public String token;

    @NameInMap("Workspace")
    public String workspace;

    public static ConfirmAKSOpsContainerServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAKSOpsContainerServiceRequest self = new ConfirmAKSOpsContainerServiceRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmAKSOpsContainerServiceRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public ConfirmAKSOpsContainerServiceRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public ConfirmAKSOpsContainerServiceRequest setOpsContainerServiceId(String opsContainerServiceId) {
        this.opsContainerServiceId = opsContainerServiceId;
        return this;
    }
    public String getOpsContainerServiceId() {
        return this.opsContainerServiceId;
    }

    public ConfirmAKSOpsContainerServiceRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public ConfirmAKSOpsContainerServiceRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ConfirmAKSOpsContainerServiceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
