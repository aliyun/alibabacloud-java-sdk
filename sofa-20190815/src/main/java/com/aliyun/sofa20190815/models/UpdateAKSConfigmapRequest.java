// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSConfigmapRequest extends TeaModel {
    @NameInMap("Annotations")
    public java.util.List<UpdateAKSConfigmapRequestAnnotations> annotations;

    @NameInMap("Data")
    public java.util.List<UpdateAKSConfigmapRequestData> data;

    @NameInMap("Labels")
    public java.util.List<UpdateAKSConfigmapRequestLabels> labels;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Workspace")
    public String workspace;

    public static UpdateAKSConfigmapRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSConfigmapRequest self = new UpdateAKSConfigmapRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAKSConfigmapRequest setAnnotations(java.util.List<UpdateAKSConfigmapRequestAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<UpdateAKSConfigmapRequestAnnotations> getAnnotations() {
        return this.annotations;
    }

    public UpdateAKSConfigmapRequest setData(java.util.List<UpdateAKSConfigmapRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UpdateAKSConfigmapRequestData> getData() {
        return this.data;
    }

    public UpdateAKSConfigmapRequest setLabels(java.util.List<UpdateAKSConfigmapRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateAKSConfigmapRequestLabels> getLabels() {
        return this.labels;
    }

    public UpdateAKSConfigmapRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAKSConfigmapRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateAKSConfigmapRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class UpdateAKSConfigmapRequestAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSConfigmapRequestAnnotations build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSConfigmapRequestAnnotations self = new UpdateAKSConfigmapRequestAnnotations();
            return TeaModel.build(map, self);
        }

        public UpdateAKSConfigmapRequestAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSConfigmapRequestAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateAKSConfigmapRequestData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSConfigmapRequestData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSConfigmapRequestData self = new UpdateAKSConfigmapRequestData();
            return TeaModel.build(map, self);
        }

        public UpdateAKSConfigmapRequestData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSConfigmapRequestData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateAKSConfigmapRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSConfigmapRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSConfigmapRequestLabels self = new UpdateAKSConfigmapRequestLabels();
            return TeaModel.build(map, self);
        }

        public UpdateAKSConfigmapRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSConfigmapRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
