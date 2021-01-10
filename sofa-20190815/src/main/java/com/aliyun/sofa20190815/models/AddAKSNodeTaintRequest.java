// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddAKSNodeTaintRequest extends TeaModel {
    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("Nodes")
    public java.util.List<AddAKSNodeTaintRequestNodes> nodes;

    @NameInMap("Taints")
    public java.util.List<AddAKSNodeTaintRequestTaints> taints;

    public static AddAKSNodeTaintRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAKSNodeTaintRequest self = new AddAKSNodeTaintRequest();
        return TeaModel.build(map, self);
    }

    public AddAKSNodeTaintRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public AddAKSNodeTaintRequest setNodes(java.util.List<AddAKSNodeTaintRequestNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<AddAKSNodeTaintRequestNodes> getNodes() {
        return this.nodes;
    }

    public AddAKSNodeTaintRequest setTaints(java.util.List<AddAKSNodeTaintRequestTaints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<AddAKSNodeTaintRequestTaints> getTaints() {
        return this.taints;
    }

    public static class AddAKSNodeTaintRequestNodes extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static AddAKSNodeTaintRequestNodes build(java.util.Map<String, ?> map) throws Exception {
            AddAKSNodeTaintRequestNodes self = new AddAKSNodeTaintRequestNodes();
            return TeaModel.build(map, self);
        }

        public AddAKSNodeTaintRequestNodes setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

    public static class AddAKSNodeTaintRequestTaints extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Effect")
        public String effect;

        public static AddAKSNodeTaintRequestTaints build(java.util.Map<String, ?> map) throws Exception {
            AddAKSNodeTaintRequestTaints self = new AddAKSNodeTaintRequestTaints();
            return TeaModel.build(map, self);
        }

        public AddAKSNodeTaintRequestTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddAKSNodeTaintRequestTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public AddAKSNodeTaintRequestTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

    }

}
