// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSSecretImagepullResponseBody extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Annotations")
    public java.util.List<CreateAKSSecretImagepullResponseBodyAnnotations> annotations;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreationTimeStamp")
    public String creationTimeStamp;

    @NameInMap("Data")
    public java.util.List<CreateAKSSecretImagepullResponseBodyData> data;

    @NameInMap("Labels")
    public java.util.List<CreateAKSSecretImagepullResponseBodyLabels> labels;

    @NameInMap("Id")
    public String id;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Name")
    public String name;

    public static CreateAKSSecretImagepullResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSSecretImagepullResponseBody self = new CreateAKSSecretImagepullResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAKSSecretImagepullResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateAKSSecretImagepullResponseBody setAnnotations(java.util.List<CreateAKSSecretImagepullResponseBodyAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<CreateAKSSecretImagepullResponseBodyAnnotations> getAnnotations() {
        return this.annotations;
    }

    public CreateAKSSecretImagepullResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAKSSecretImagepullResponseBody setCreationTimeStamp(String creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
        return this;
    }
    public String getCreationTimeStamp() {
        return this.creationTimeStamp;
    }

    public CreateAKSSecretImagepullResponseBody setData(java.util.List<CreateAKSSecretImagepullResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateAKSSecretImagepullResponseBodyData> getData() {
        return this.data;
    }

    public CreateAKSSecretImagepullResponseBody setLabels(java.util.List<CreateAKSSecretImagepullResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateAKSSecretImagepullResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public CreateAKSSecretImagepullResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateAKSSecretImagepullResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateAKSSecretImagepullResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateAKSSecretImagepullResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAKSSecretImagepullResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class CreateAKSSecretImagepullResponseBodyAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSSecretImagepullResponseBodyAnnotations build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSSecretImagepullResponseBodyAnnotations self = new CreateAKSSecretImagepullResponseBodyAnnotations();
            return TeaModel.build(map, self);
        }

        public CreateAKSSecretImagepullResponseBodyAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSSecretImagepullResponseBodyAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAKSSecretImagepullResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSSecretImagepullResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSSecretImagepullResponseBodyData self = new CreateAKSSecretImagepullResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAKSSecretImagepullResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSSecretImagepullResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAKSSecretImagepullResponseBodyLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSSecretImagepullResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSSecretImagepullResponseBodyLabels self = new CreateAKSSecretImagepullResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public CreateAKSSecretImagepullResponseBodyLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSSecretImagepullResponseBodyLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
