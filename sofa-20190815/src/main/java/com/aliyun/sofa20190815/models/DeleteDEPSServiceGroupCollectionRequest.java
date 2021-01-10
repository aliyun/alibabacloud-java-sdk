// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDEPSServiceGroupCollectionRequest extends TeaModel {
    @NameInMap("ArrangementId")
    public String arrangementId;

    @NameInMap("ProcessDefinitionId")
    public String processDefinitionId;

    @NameInMap("Workspace")
    public String workspace;

    public static DeleteDEPSServiceGroupCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDEPSServiceGroupCollectionRequest self = new DeleteDEPSServiceGroupCollectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDEPSServiceGroupCollectionRequest setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public DeleteDEPSServiceGroupCollectionRequest setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    public DeleteDEPSServiceGroupCollectionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
