// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSContainerservicesRequest extends TeaModel {
    @NameInMap("ContainerServiceName")
    public String containerServiceName;

    @NameInMap("DraftedTime")
    public String draftedTime;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("Workspace")
    public String workspace;

    public static DeleteAKSContainerservicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSContainerservicesRequest self = new DeleteAKSContainerservicesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAKSContainerservicesRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public DeleteAKSContainerservicesRequest setDraftedTime(String draftedTime) {
        this.draftedTime = draftedTime;
        return this;
    }
    public String getDraftedTime() {
        return this.draftedTime;
    }

    public DeleteAKSContainerservicesRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public DeleteAKSContainerservicesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
