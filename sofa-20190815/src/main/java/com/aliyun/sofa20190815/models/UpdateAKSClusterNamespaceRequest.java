// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSClusterNamespaceRequest extends TeaModel {
    @NameInMap("Labels")
    public java.util.List<UpdateAKSClusterNamespaceRequestLabels> labels;

    @NameInMap("Name")
    public String name;

    @NameInMap("Workspace")
    public String workspace;

    public static UpdateAKSClusterNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSClusterNamespaceRequest self = new UpdateAKSClusterNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAKSClusterNamespaceRequest setLabels(java.util.List<UpdateAKSClusterNamespaceRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateAKSClusterNamespaceRequestLabels> getLabels() {
        return this.labels;
    }

    public UpdateAKSClusterNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAKSClusterNamespaceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class UpdateAKSClusterNamespaceRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSClusterNamespaceRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSClusterNamespaceRequestLabels self = new UpdateAKSClusterNamespaceRequestLabels();
            return TeaModel.build(map, self);
        }

        public UpdateAKSClusterNamespaceRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSClusterNamespaceRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
