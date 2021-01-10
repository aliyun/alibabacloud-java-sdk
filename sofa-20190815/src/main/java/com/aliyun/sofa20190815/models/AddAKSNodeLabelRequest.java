// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddAKSNodeLabelRequest extends TeaModel {
    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("Labels")
    public java.util.List<AddAKSNodeLabelRequestLabels> labels;

    @NameInMap("Nodes")
    public java.util.List<AddAKSNodeLabelRequestNodes> nodes;

    public static AddAKSNodeLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAKSNodeLabelRequest self = new AddAKSNodeLabelRequest();
        return TeaModel.build(map, self);
    }

    public AddAKSNodeLabelRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public AddAKSNodeLabelRequest setLabels(java.util.List<AddAKSNodeLabelRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<AddAKSNodeLabelRequestLabels> getLabels() {
        return this.labels;
    }

    public AddAKSNodeLabelRequest setNodes(java.util.List<AddAKSNodeLabelRequestNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<AddAKSNodeLabelRequestNodes> getNodes() {
        return this.nodes;
    }

    public static class AddAKSNodeLabelRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static AddAKSNodeLabelRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            AddAKSNodeLabelRequestLabels self = new AddAKSNodeLabelRequestLabels();
            return TeaModel.build(map, self);
        }

        public AddAKSNodeLabelRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddAKSNodeLabelRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AddAKSNodeLabelRequestNodes extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static AddAKSNodeLabelRequestNodes build(java.util.Map<String, ?> map) throws Exception {
            AddAKSNodeLabelRequestNodes self = new AddAKSNodeLabelRequestNodes();
            return TeaModel.build(map, self);
        }

        public AddAKSNodeLabelRequestNodes setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

}
