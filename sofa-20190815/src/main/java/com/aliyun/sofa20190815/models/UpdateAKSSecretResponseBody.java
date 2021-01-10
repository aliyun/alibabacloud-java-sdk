// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSSecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CreationTimeStamp")
    public String creationTimeStamp;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Type")
    public String type;

    @NameInMap("Annotations")
    public java.util.List<UpdateAKSSecretResponseBodyAnnotations> annotations;

    @NameInMap("Data")
    public java.util.List<UpdateAKSSecretResponseBodyData> data;

    @NameInMap("Labels")
    public java.util.List<UpdateAKSSecretResponseBodyLabels> labels;

    public static UpdateAKSSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSSecretResponseBody self = new UpdateAKSSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAKSSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAKSSecretResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateAKSSecretResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateAKSSecretResponseBody setCreationTimeStamp(String creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
        return this;
    }
    public String getCreationTimeStamp() {
        return this.creationTimeStamp;
    }

    public UpdateAKSSecretResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAKSSecretResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateAKSSecretResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateAKSSecretResponseBody setAnnotations(java.util.List<UpdateAKSSecretResponseBodyAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<UpdateAKSSecretResponseBodyAnnotations> getAnnotations() {
        return this.annotations;
    }

    public UpdateAKSSecretResponseBody setData(java.util.List<UpdateAKSSecretResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UpdateAKSSecretResponseBodyData> getData() {
        return this.data;
    }

    public UpdateAKSSecretResponseBody setLabels(java.util.List<UpdateAKSSecretResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateAKSSecretResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public static class UpdateAKSSecretResponseBodyAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSSecretResponseBodyAnnotations build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSSecretResponseBodyAnnotations self = new UpdateAKSSecretResponseBodyAnnotations();
            return TeaModel.build(map, self);
        }

        public UpdateAKSSecretResponseBodyAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSSecretResponseBodyAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateAKSSecretResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSSecretResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSSecretResponseBodyData self = new UpdateAKSSecretResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAKSSecretResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSSecretResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateAKSSecretResponseBodyLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSSecretResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSSecretResponseBodyLabels self = new UpdateAKSSecretResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public UpdateAKSSecretResponseBodyLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSSecretResponseBodyLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
