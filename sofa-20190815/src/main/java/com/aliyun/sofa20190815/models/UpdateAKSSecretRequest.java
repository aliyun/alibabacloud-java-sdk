// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSSecretRequest extends TeaModel {
    @NameInMap("Annotations")
    public java.util.List<UpdateAKSSecretRequestAnnotations> annotations;

    @NameInMap("Data")
    public java.util.List<UpdateAKSSecretRequestData> data;

    @NameInMap("Labels")
    public java.util.List<UpdateAKSSecretRequestLabels> labels;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Workspace")
    public String workspace;

    public static UpdateAKSSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSSecretRequest self = new UpdateAKSSecretRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAKSSecretRequest setAnnotations(java.util.List<UpdateAKSSecretRequestAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<UpdateAKSSecretRequestAnnotations> getAnnotations() {
        return this.annotations;
    }

    public UpdateAKSSecretRequest setData(java.util.List<UpdateAKSSecretRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UpdateAKSSecretRequestData> getData() {
        return this.data;
    }

    public UpdateAKSSecretRequest setLabels(java.util.List<UpdateAKSSecretRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateAKSSecretRequestLabels> getLabels() {
        return this.labels;
    }

    public UpdateAKSSecretRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAKSSecretRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateAKSSecretRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class UpdateAKSSecretRequestAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSSecretRequestAnnotations build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSSecretRequestAnnotations self = new UpdateAKSSecretRequestAnnotations();
            return TeaModel.build(map, self);
        }

        public UpdateAKSSecretRequestAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSSecretRequestAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateAKSSecretRequestData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSSecretRequestData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSSecretRequestData self = new UpdateAKSSecretRequestData();
            return TeaModel.build(map, self);
        }

        public UpdateAKSSecretRequestData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSSecretRequestData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateAKSSecretRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSSecretRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSSecretRequestLabels self = new UpdateAKSSecretRequestLabels();
            return TeaModel.build(map, self);
        }

        public UpdateAKSSecretRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSSecretRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
