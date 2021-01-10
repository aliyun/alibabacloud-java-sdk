// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCFederationNamespaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateLDCFederationNamespaceResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLDCFederationNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCFederationNamespaceResponseBody self = new CreateLDCFederationNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLDCFederationNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLDCFederationNamespaceResponseBody setData(CreateLDCFederationNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLDCFederationNamespaceResponseBodyData getData() {
        return this.data;
    }

    public CreateLDCFederationNamespaceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLDCFederationNamespaceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLDCFederationNamespaceResponseBodyDataLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationNamespaceResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationNamespaceResponseBodyDataLabels self = new CreateLDCFederationNamespaceResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationNamespaceResponseBodyDataLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationNamespaceResponseBodyDataLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationNamespaceResponseBodyDataAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationNamespaceResponseBodyDataAnnotations build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationNamespaceResponseBodyDataAnnotations self = new CreateLDCFederationNamespaceResponseBodyDataAnnotations();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationNamespaceResponseBodyDataAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationNamespaceResponseBodyDataAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationNamespaceResponseBodyDataClusterStateMap extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("ClusterName")
        public String clusterName;

        public static CreateLDCFederationNamespaceResponseBodyDataClusterStateMap build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationNamespaceResponseBodyDataClusterStateMap self = new CreateLDCFederationNamespaceResponseBodyDataClusterStateMap();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationNamespaceResponseBodyDataClusterStateMap setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLDCFederationNamespaceResponseBodyDataClusterStateMap setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

    }

    public static class CreateLDCFederationNamespaceResponseBodyData extends TeaModel {
        @NameInMap("CreateTimeStamp")
        public String createTimeStamp;

        @NameInMap("Labels")
        public java.util.List<CreateLDCFederationNamespaceResponseBodyDataLabels> labels;

        @NameInMap("Annotations")
        public java.util.List<CreateLDCFederationNamespaceResponseBodyDataAnnotations> annotations;

        @NameInMap("ClusterStateMap")
        public java.util.List<CreateLDCFederationNamespaceResponseBodyDataClusterStateMap> clusterStateMap;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Clusters")
        public java.util.List<String> clusters;

        @NameInMap("Name")
        public String name;

        public static CreateLDCFederationNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationNamespaceResponseBodyData self = new CreateLDCFederationNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationNamespaceResponseBodyData setCreateTimeStamp(String createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public CreateLDCFederationNamespaceResponseBodyData setLabels(java.util.List<CreateLDCFederationNamespaceResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<CreateLDCFederationNamespaceResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

        public CreateLDCFederationNamespaceResponseBodyData setAnnotations(java.util.List<CreateLDCFederationNamespaceResponseBodyDataAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<CreateLDCFederationNamespaceResponseBodyDataAnnotations> getAnnotations() {
            return this.annotations;
        }

        public CreateLDCFederationNamespaceResponseBodyData setClusterStateMap(java.util.List<CreateLDCFederationNamespaceResponseBodyDataClusterStateMap> clusterStateMap) {
            this.clusterStateMap = clusterStateMap;
            return this;
        }
        public java.util.List<CreateLDCFederationNamespaceResponseBodyDataClusterStateMap> getClusterStateMap() {
            return this.clusterStateMap;
        }

        public CreateLDCFederationNamespaceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateLDCFederationNamespaceResponseBodyData setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public CreateLDCFederationNamespaceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
