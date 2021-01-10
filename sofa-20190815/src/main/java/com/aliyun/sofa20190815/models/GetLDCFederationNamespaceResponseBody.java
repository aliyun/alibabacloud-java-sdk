// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCFederationNamespaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetLDCFederationNamespaceResponseBodyData data;

    public static GetLDCFederationNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLDCFederationNamespaceResponseBody self = new GetLDCFederationNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLDCFederationNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLDCFederationNamespaceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLDCFederationNamespaceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLDCFederationNamespaceResponseBody setData(GetLDCFederationNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLDCFederationNamespaceResponseBodyData getData() {
        return this.data;
    }

    public static class GetLDCFederationNamespaceResponseBodyDataAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCFederationNamespaceResponseBodyDataAnnotations build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationNamespaceResponseBodyDataAnnotations self = new GetLDCFederationNamespaceResponseBodyDataAnnotations();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationNamespaceResponseBodyDataAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCFederationNamespaceResponseBodyDataAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCFederationNamespaceResponseBodyDataClusterStateMap extends TeaModel {
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("State")
        public String state;

        public static GetLDCFederationNamespaceResponseBodyDataClusterStateMap build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationNamespaceResponseBodyDataClusterStateMap self = new GetLDCFederationNamespaceResponseBodyDataClusterStateMap();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationNamespaceResponseBodyDataClusterStateMap setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetLDCFederationNamespaceResponseBodyDataClusterStateMap setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class GetLDCFederationNamespaceResponseBodyDataLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCFederationNamespaceResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationNamespaceResponseBodyDataLabels self = new GetLDCFederationNamespaceResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationNamespaceResponseBodyDataLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCFederationNamespaceResponseBodyDataLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCFederationNamespaceResponseBodyData extends TeaModel {
        @NameInMap("CreateTimeStamp")
        public String createTimeStamp;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Clusters")
        public java.util.List<String> clusters;

        @NameInMap("Annotations")
        public java.util.List<GetLDCFederationNamespaceResponseBodyDataAnnotations> annotations;

        @NameInMap("ClusterStateMap")
        public java.util.List<GetLDCFederationNamespaceResponseBodyDataClusterStateMap> clusterStateMap;

        @NameInMap("Labels")
        public java.util.List<GetLDCFederationNamespaceResponseBodyDataLabels> labels;

        public static GetLDCFederationNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationNamespaceResponseBodyData self = new GetLDCFederationNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationNamespaceResponseBodyData setCreateTimeStamp(String createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public GetLDCFederationNamespaceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCFederationNamespaceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetLDCFederationNamespaceResponseBodyData setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public GetLDCFederationNamespaceResponseBodyData setAnnotations(java.util.List<GetLDCFederationNamespaceResponseBodyDataAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<GetLDCFederationNamespaceResponseBodyDataAnnotations> getAnnotations() {
            return this.annotations;
        }

        public GetLDCFederationNamespaceResponseBodyData setClusterStateMap(java.util.List<GetLDCFederationNamespaceResponseBodyDataClusterStateMap> clusterStateMap) {
            this.clusterStateMap = clusterStateMap;
            return this;
        }
        public java.util.List<GetLDCFederationNamespaceResponseBodyDataClusterStateMap> getClusterStateMap() {
            return this.clusterStateMap;
        }

        public GetLDCFederationNamespaceResponseBodyData setLabels(java.util.List<GetLDCFederationNamespaceResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<GetLDCFederationNamespaceResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

    }

}
