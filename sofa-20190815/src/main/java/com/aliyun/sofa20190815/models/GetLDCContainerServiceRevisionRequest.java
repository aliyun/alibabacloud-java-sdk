// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCContainerServiceRevisionRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Revision")
    public String revision;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static GetLDCContainerServiceRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLDCContainerServiceRevisionRequest self = new GetLDCContainerServiceRevisionRequest();
        return TeaModel.build(map, self);
    }

    public GetLDCContainerServiceRevisionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLDCContainerServiceRevisionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetLDCContainerServiceRevisionRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public GetLDCContainerServiceRevisionRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
