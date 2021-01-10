// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSConfigmapRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("Annotations")
    public java.util.List<CreateAKSConfigmapRequestAnnotations> annotations;

    @NameInMap("Data")
    public java.util.List<CreateAKSConfigmapRequestData> data;

    @NameInMap("Labels")
    public java.util.List<CreateAKSConfigmapRequestLabels> labels;

    public static CreateAKSConfigmapRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSConfigmapRequest self = new CreateAKSConfigmapRequest();
        return TeaModel.build(map, self);
    }

    public CreateAKSConfigmapRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAKSConfigmapRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateAKSConfigmapRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateAKSConfigmapRequest setAnnotations(java.util.List<CreateAKSConfigmapRequestAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<CreateAKSConfigmapRequestAnnotations> getAnnotations() {
        return this.annotations;
    }

    public CreateAKSConfigmapRequest setData(java.util.List<CreateAKSConfigmapRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateAKSConfigmapRequestData> getData() {
        return this.data;
    }

    public CreateAKSConfigmapRequest setLabels(java.util.List<CreateAKSConfigmapRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateAKSConfigmapRequestLabels> getLabels() {
        return this.labels;
    }

    public static class CreateAKSConfigmapRequestAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSConfigmapRequestAnnotations build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSConfigmapRequestAnnotations self = new CreateAKSConfigmapRequestAnnotations();
            return TeaModel.build(map, self);
        }

        public CreateAKSConfigmapRequestAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSConfigmapRequestAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAKSConfigmapRequestData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSConfigmapRequestData build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSConfigmapRequestData self = new CreateAKSConfigmapRequestData();
            return TeaModel.build(map, self);
        }

        public CreateAKSConfigmapRequestData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSConfigmapRequestData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAKSConfigmapRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSConfigmapRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSConfigmapRequestLabels self = new CreateAKSConfigmapRequestLabels();
            return TeaModel.build(map, self);
        }

        public CreateAKSConfigmapRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSConfigmapRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
