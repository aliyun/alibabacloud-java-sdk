// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSSecretResponseBody extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Annotations")
    public java.util.List<CreateAKSSecretResponseBodyAnnotations> annotations;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreationTimeStamp")
    public String creationTimeStamp;

    @NameInMap("Data")
    public java.util.List<CreateAKSSecretResponseBodyData> data;

    @NameInMap("Labels")
    public java.util.List<CreateAKSSecretResponseBodyLabels> labels;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Name")
    public String name;

    public static CreateAKSSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSSecretResponseBody self = new CreateAKSSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAKSSecretResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateAKSSecretResponseBody setAnnotations(java.util.List<CreateAKSSecretResponseBodyAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<CreateAKSSecretResponseBodyAnnotations> getAnnotations() {
        return this.annotations;
    }

    public CreateAKSSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAKSSecretResponseBody setCreationTimeStamp(String creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
        return this;
    }
    public String getCreationTimeStamp() {
        return this.creationTimeStamp;
    }

    public CreateAKSSecretResponseBody setData(java.util.List<CreateAKSSecretResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateAKSSecretResponseBodyData> getData() {
        return this.data;
    }

    public CreateAKSSecretResponseBody setLabels(java.util.List<CreateAKSSecretResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateAKSSecretResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public CreateAKSSecretResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateAKSSecretResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateAKSSecretResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAKSSecretResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class CreateAKSSecretResponseBodyAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSSecretResponseBodyAnnotations build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSSecretResponseBodyAnnotations self = new CreateAKSSecretResponseBodyAnnotations();
            return TeaModel.build(map, self);
        }

        public CreateAKSSecretResponseBodyAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSSecretResponseBodyAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAKSSecretResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSSecretResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSSecretResponseBodyData self = new CreateAKSSecretResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAKSSecretResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSSecretResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAKSSecretResponseBodyLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSSecretResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSSecretResponseBodyLabels self = new CreateAKSSecretResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public CreateAKSSecretResponseBodyLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSSecretResponseBodyLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
