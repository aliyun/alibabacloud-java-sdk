// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFederationNamespaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public UpdateLDCFederationNamespaceResponseBodyData data;

    public static UpdateLDCFederationNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFederationNamespaceResponseBody self = new UpdateLDCFederationNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFederationNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLDCFederationNamespaceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLDCFederationNamespaceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLDCFederationNamespaceResponseBody setData(UpdateLDCFederationNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLDCFederationNamespaceResponseBodyData getData() {
        return this.data;
    }

    public static class UpdateLDCFederationNamespaceResponseBodyDataAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationNamespaceResponseBodyDataAnnotations build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationNamespaceResponseBodyDataAnnotations self = new UpdateLDCFederationNamespaceResponseBodyDataAnnotations();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationNamespaceResponseBodyDataAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationNamespaceResponseBodyDataAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateLDCFederationNamespaceResponseBodyDataClusterStateMap extends TeaModel {
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("State")
        public String state;

        public static UpdateLDCFederationNamespaceResponseBodyDataClusterStateMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationNamespaceResponseBodyDataClusterStateMap self = new UpdateLDCFederationNamespaceResponseBodyDataClusterStateMap();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationNamespaceResponseBodyDataClusterStateMap setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public UpdateLDCFederationNamespaceResponseBodyDataClusterStateMap setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class UpdateLDCFederationNamespaceResponseBodyDataLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationNamespaceResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationNamespaceResponseBodyDataLabels self = new UpdateLDCFederationNamespaceResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationNamespaceResponseBodyDataLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationNamespaceResponseBodyDataLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateLDCFederationNamespaceResponseBodyData extends TeaModel {
        @NameInMap("CreateTimeStamp")
        public String createTimeStamp;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Clusters")
        public java.util.List<String> clusters;

        @NameInMap("Annotations")
        public java.util.List<UpdateLDCFederationNamespaceResponseBodyDataAnnotations> annotations;

        @NameInMap("ClusterStateMap")
        public java.util.List<UpdateLDCFederationNamespaceResponseBodyDataClusterStateMap> clusterStateMap;

        @NameInMap("Labels")
        public java.util.List<UpdateLDCFederationNamespaceResponseBodyDataLabels> labels;

        public static UpdateLDCFederationNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationNamespaceResponseBodyData self = new UpdateLDCFederationNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationNamespaceResponseBodyData setCreateTimeStamp(String createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public UpdateLDCFederationNamespaceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLDCFederationNamespaceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateLDCFederationNamespaceResponseBodyData setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public UpdateLDCFederationNamespaceResponseBodyData setAnnotations(java.util.List<UpdateLDCFederationNamespaceResponseBodyDataAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<UpdateLDCFederationNamespaceResponseBodyDataAnnotations> getAnnotations() {
            return this.annotations;
        }

        public UpdateLDCFederationNamespaceResponseBodyData setClusterStateMap(java.util.List<UpdateLDCFederationNamespaceResponseBodyDataClusterStateMap> clusterStateMap) {
            this.clusterStateMap = clusterStateMap;
            return this;
        }
        public java.util.List<UpdateLDCFederationNamespaceResponseBodyDataClusterStateMap> getClusterStateMap() {
            return this.clusterStateMap;
        }

        public UpdateLDCFederationNamespaceResponseBodyData setLabels(java.util.List<UpdateLDCFederationNamespaceResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<UpdateLDCFederationNamespaceResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

    }

}
