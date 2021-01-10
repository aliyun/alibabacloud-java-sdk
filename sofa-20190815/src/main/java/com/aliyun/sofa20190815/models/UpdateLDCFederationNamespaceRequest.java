// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFederationNamespaceRequest extends TeaModel {
    @NameInMap("Labels")
    public java.util.List<UpdateLDCFederationNamespaceRequestLabels> labels;

    @NameInMap("Name")
    public String name;

    @NameInMap("WorkspaceGroupName")
    public String workspaceGroupName;

    public static UpdateLDCFederationNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFederationNamespaceRequest self = new UpdateLDCFederationNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFederationNamespaceRequest setLabels(java.util.List<UpdateLDCFederationNamespaceRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateLDCFederationNamespaceRequestLabels> getLabels() {
        return this.labels;
    }

    public UpdateLDCFederationNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLDCFederationNamespaceRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public static class UpdateLDCFederationNamespaceRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationNamespaceRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationNamespaceRequestLabels self = new UpdateLDCFederationNamespaceRequestLabels();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationNamespaceRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationNamespaceRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
