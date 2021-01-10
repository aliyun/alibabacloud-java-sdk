// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSClusterNamespaceRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("Labels")
    public java.util.List<CreateAKSClusterNamespaceRequestLabels> labels;

    public static CreateAKSClusterNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSClusterNamespaceRequest self = new CreateAKSClusterNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAKSClusterNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAKSClusterNamespaceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateAKSClusterNamespaceRequest setLabels(java.util.List<CreateAKSClusterNamespaceRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateAKSClusterNamespaceRequestLabels> getLabels() {
        return this.labels;
    }

    public static class CreateAKSClusterNamespaceRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSClusterNamespaceRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSClusterNamespaceRequestLabels self = new CreateAKSClusterNamespaceRequestLabels();
            return TeaModel.build(map, self);
        }

        public CreateAKSClusterNamespaceRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSClusterNamespaceRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
