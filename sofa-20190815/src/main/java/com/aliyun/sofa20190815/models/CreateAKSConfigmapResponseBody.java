// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSConfigmapResponseBody extends TeaModel {
    @NameInMap("Annotations")
    public java.util.List<CreateAKSConfigmapResponseBodyAnnotations> annotations;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreationTimeStamp")
    public String creationTimeStamp;

    @NameInMap("Data")
    public java.util.List<CreateAKSConfigmapResponseBodyData> data;

    @NameInMap("Labels")
    public java.util.List<CreateAKSConfigmapResponseBodyLabels> labels;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Name")
    public String name;

    public static CreateAKSConfigmapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSConfigmapResponseBody self = new CreateAKSConfigmapResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAKSConfigmapResponseBody setAnnotations(java.util.List<CreateAKSConfigmapResponseBodyAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<CreateAKSConfigmapResponseBodyAnnotations> getAnnotations() {
        return this.annotations;
    }

    public CreateAKSConfigmapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAKSConfigmapResponseBody setCreationTimeStamp(String creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
        return this;
    }
    public String getCreationTimeStamp() {
        return this.creationTimeStamp;
    }

    public CreateAKSConfigmapResponseBody setData(java.util.List<CreateAKSConfigmapResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateAKSConfigmapResponseBodyData> getData() {
        return this.data;
    }

    public CreateAKSConfigmapResponseBody setLabels(java.util.List<CreateAKSConfigmapResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateAKSConfigmapResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public CreateAKSConfigmapResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateAKSConfigmapResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateAKSConfigmapResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAKSConfigmapResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class CreateAKSConfigmapResponseBodyAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSConfigmapResponseBodyAnnotations build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSConfigmapResponseBodyAnnotations self = new CreateAKSConfigmapResponseBodyAnnotations();
            return TeaModel.build(map, self);
        }

        public CreateAKSConfigmapResponseBodyAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSConfigmapResponseBodyAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAKSConfigmapResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSConfigmapResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSConfigmapResponseBodyData self = new CreateAKSConfigmapResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAKSConfigmapResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSConfigmapResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAKSConfigmapResponseBodyLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateAKSConfigmapResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateAKSConfigmapResponseBodyLabels self = new CreateAKSConfigmapResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public CreateAKSConfigmapResponseBodyLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAKSConfigmapResponseBodyLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
