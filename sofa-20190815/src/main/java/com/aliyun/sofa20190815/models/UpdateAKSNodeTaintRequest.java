// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSNodeTaintRequest extends TeaModel {
    @NameInMap("Node")
    public String node;

    @NameInMap("Taints")
    public java.util.List<UpdateAKSNodeTaintRequestTaints> taints;

    @NameInMap("Workspace")
    public String workspace;

    public static UpdateAKSNodeTaintRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSNodeTaintRequest self = new UpdateAKSNodeTaintRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAKSNodeTaintRequest setNode(String node) {
        this.node = node;
        return this;
    }
    public String getNode() {
        return this.node;
    }

    public UpdateAKSNodeTaintRequest setTaints(java.util.List<UpdateAKSNodeTaintRequestTaints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<UpdateAKSNodeTaintRequestTaints> getTaints() {
        return this.taints;
    }

    public UpdateAKSNodeTaintRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class UpdateAKSNodeTaintRequestTaints extends TeaModel {
        @NameInMap("Effect")
        public String effect;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSNodeTaintRequestTaints build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSNodeTaintRequestTaints self = new UpdateAKSNodeTaintRequestTaints();
            return TeaModel.build(map, self);
        }

        public UpdateAKSNodeTaintRequestTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public UpdateAKSNodeTaintRequestTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSNodeTaintRequestTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
