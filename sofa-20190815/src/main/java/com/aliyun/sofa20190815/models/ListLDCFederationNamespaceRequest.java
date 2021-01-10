// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCFederationNamespaceRequest extends TeaModel {
    @NameInMap("LabelSelector")
    public String labelSelector;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    public static ListLDCFederationNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLDCFederationNamespaceRequest self = new ListLDCFederationNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public ListLDCFederationNamespaceRequest setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public String getLabelSelector() {
        return this.labelSelector;
    }

    public ListLDCFederationNamespaceRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
