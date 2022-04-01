// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class NodeSelector extends TeaModel {
    // labels
    @NameInMap("labels")
    public java.util.List<Labels> labels;

    // taints
    @NameInMap("taints")
    public java.util.List<Taints> taints;

    public static NodeSelector build(java.util.Map<String, ?> map) throws Exception {
        NodeSelector self = new NodeSelector();
        return TeaModel.build(map, self);
    }

    public NodeSelector setLabels(java.util.List<Labels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    public NodeSelector setTaints(java.util.List<Taints> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<Taints> getTaints() {
        return this.taints;
    }

    public static class Labels extends TeaModel {
        // key
        @NameInMap("key")
        public String key;

        // value
        @NameInMap("value")
        public String value;

        public static Labels build(java.util.Map<String, ?> map) throws Exception {
            Labels self = new Labels();
            return TeaModel.build(map, self);
        }

        public Labels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Labels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class Taints extends TeaModel {
        // effect
        @NameInMap("effect")
        public String effect;

        // key
        @NameInMap("key")
        public String key;

        // value
        @NameInMap("value")
        public String value;

        public static Taints build(java.util.Map<String, ?> map) throws Exception {
            Taints self = new Taints();
            return TeaModel.build(map, self);
        }

        public Taints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public Taints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Taints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
