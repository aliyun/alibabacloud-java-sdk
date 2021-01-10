// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCFederationConfigmapRequest extends TeaModel {
    @NameInMap("LabelSelector")
    public String labelSelector;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    public static ListLDCFederationConfigmapRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLDCFederationConfigmapRequest self = new ListLDCFederationConfigmapRequest();
        return TeaModel.build(map, self);
    }

    public ListLDCFederationConfigmapRequest setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public String getLabelSelector() {
        return this.labelSelector;
    }

    public ListLDCFederationConfigmapRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListLDCFederationConfigmapRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
