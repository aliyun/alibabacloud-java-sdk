// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSConfigmapResponseBody extends TeaModel {
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

    @NameInMap("Annotations")
    public java.util.List<UpdateAKSConfigmapResponseBodyAnnotations> annotations;

    @NameInMap("Data")
    public java.util.List<UpdateAKSConfigmapResponseBodyData> data;

    @NameInMap("Labels")
    public java.util.List<UpdateAKSConfigmapResponseBodyLabels> labels;

    public static UpdateAKSConfigmapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSConfigmapResponseBody self = new UpdateAKSConfigmapResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAKSConfigmapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAKSConfigmapResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateAKSConfigmapResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateAKSConfigmapResponseBody setCreationTimeStamp(String creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
        return this;
    }
    public String getCreationTimeStamp() {
        return this.creationTimeStamp;
    }

    public UpdateAKSConfigmapResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAKSConfigmapResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateAKSConfigmapResponseBody setAnnotations(java.util.List<UpdateAKSConfigmapResponseBodyAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<UpdateAKSConfigmapResponseBodyAnnotations> getAnnotations() {
        return this.annotations;
    }

    public UpdateAKSConfigmapResponseBody setData(java.util.List<UpdateAKSConfigmapResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UpdateAKSConfigmapResponseBodyData> getData() {
        return this.data;
    }

    public UpdateAKSConfigmapResponseBody setLabels(java.util.List<UpdateAKSConfigmapResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateAKSConfigmapResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public static class UpdateAKSConfigmapResponseBodyAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSConfigmapResponseBodyAnnotations build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSConfigmapResponseBodyAnnotations self = new UpdateAKSConfigmapResponseBodyAnnotations();
            return TeaModel.build(map, self);
        }

        public UpdateAKSConfigmapResponseBodyAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSConfigmapResponseBodyAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateAKSConfigmapResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSConfigmapResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSConfigmapResponseBodyData self = new UpdateAKSConfigmapResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAKSConfigmapResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSConfigmapResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateAKSConfigmapResponseBodyLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAKSConfigmapResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateAKSConfigmapResponseBodyLabels self = new UpdateAKSConfigmapResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public UpdateAKSConfigmapResponseBodyLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAKSConfigmapResponseBodyLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
