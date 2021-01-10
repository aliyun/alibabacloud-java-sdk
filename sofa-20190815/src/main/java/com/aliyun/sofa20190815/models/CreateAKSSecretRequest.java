// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSSecretRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("Annotations")
    public java.util.List<CreateAKSSecretRequestAnnotations> annotations;

    @NameInMap("Data")
    public java.util.List<CreateAKSSecretRequestData> data;

    @NameInMap("Labels")
    public java.util.List<CreateAKSSecretRequestLabels> labels;

    public static CreateAKSSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSSecretRequest self = new CreateAKSSecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateAKSSecretRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAKSSecretRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateAKSSecretRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateAKSSecretRequest setAnnotations(java.util.List<CreateAKSSecretRequestAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<CreateAKSSecretRequestAnnotations> getAnnotations() {
        return this.annotations;
    }

    public CreateAKSSecretRequest setData(java.util.List<CreateAKSSecretRequestData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateAKSSecretRequestData> getData() {
        return this.data;
    }

    public CreateAKSSecretRequest setLabels(java.util.List<CreateAKSSecretRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateAKSSecretRequestLabels> getLabels() {
        return this.labels;
    }

    public static class CreateAKSSecretRequestAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSSecretRequestAnnotations build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSSecretRequestAnnotations self = new CreateAKSSecretRequestAnnotations();
            return TeaModel.build(map, self);
        }

        public CreateAKSSecretRequestAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSSecretRequestAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAKSSecretRequestData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSSecretRequestData build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSSecretRequestData self = new CreateAKSSecretRequestData();
            return TeaModel.build(map, self);
        }

        public CreateAKSSecretRequestData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSSecretRequestData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAKSSecretRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSSecretRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSSecretRequestLabels self = new CreateAKSSecretRequestLabels();
            return TeaModel.build(map, self);
        }

        public CreateAKSSecretRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSSecretRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
