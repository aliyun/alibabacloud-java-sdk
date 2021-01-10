// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCContainerserviceRequest extends TeaModel {
    @NameInMap("DraftedRevision")
    public String draftedRevision;

    @NameInMap("DraftedTime")
    public String draftedTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static DeleteLDCContainerserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCContainerserviceRequest self = new DeleteLDCContainerserviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLDCContainerserviceRequest setDraftedRevision(String draftedRevision) {
        this.draftedRevision = draftedRevision;
        return this;
    }
    public String getDraftedRevision() {
        return this.draftedRevision;
    }

    public DeleteLDCContainerserviceRequest setDraftedTime(String draftedTime) {
        this.draftedTime = draftedTime;
        return this;
    }
    public String getDraftedTime() {
        return this.draftedTime;
    }

    public DeleteLDCContainerserviceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteLDCContainerserviceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteLDCContainerserviceRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DeleteLDCContainerserviceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
