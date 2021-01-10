// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSNodeLabelRequest extends TeaModel {
    @NameInMap("Labels")
    public java.util.List<UpdateAKSNodeLabelRequestLabels> labels;

    @NameInMap("Node")
    public String node;

    @NameInMap("Workspace")
    public String workspace;

    public static UpdateAKSNodeLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSNodeLabelRequest self = new UpdateAKSNodeLabelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAKSNodeLabelRequest setLabels(java.util.List<UpdateAKSNodeLabelRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateAKSNodeLabelRequestLabels> getLabels() {
        return this.labels;
    }

    public UpdateAKSNodeLabelRequest setNode(String node) {
        this.node = node;
        return this;
    }
    public String getNode() {
        return this.node;
    }

    public UpdateAKSNodeLabelRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class UpdateAKSNodeLabelRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSNodeLabelRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSNodeLabelRequestLabels self = new UpdateAKSNodeLabelRequestLabels();
            return TeaModel.build(map, self);
        }

        public UpdateAKSNodeLabelRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSNodeLabelRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
