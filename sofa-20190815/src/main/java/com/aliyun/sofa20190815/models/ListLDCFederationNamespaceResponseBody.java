// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCFederationNamespaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<ListLDCFederationNamespaceResponseBodyData> data;

    public static ListLDCFederationNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLDCFederationNamespaceResponseBody self = new ListLDCFederationNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLDCFederationNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLDCFederationNamespaceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLDCFederationNamespaceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLDCFederationNamespaceResponseBody setData(java.util.List<ListLDCFederationNamespaceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLDCFederationNamespaceResponseBodyData> getData() {
        return this.data;
    }

    public static class ListLDCFederationNamespaceResponseBodyDataAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListLDCFederationNamespaceResponseBodyDataAnnotations build(java.util.Map<String, ?> map) throws Exception {
            ListLDCFederationNamespaceResponseBodyDataAnnotations self = new ListLDCFederationNamespaceResponseBodyDataAnnotations();
            return TeaModel.build(map, self);
        }

        public ListLDCFederationNamespaceResponseBodyDataAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLDCFederationNamespaceResponseBodyDataAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListLDCFederationNamespaceResponseBodyDataClusterStateMap extends TeaModel {
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("State")
        public String state;

        public static ListLDCFederationNamespaceResponseBodyDataClusterStateMap build(java.util.Map<String, ?> map) throws Exception {
            ListLDCFederationNamespaceResponseBodyDataClusterStateMap self = new ListLDCFederationNamespaceResponseBodyDataClusterStateMap();
            return TeaModel.build(map, self);
        }

        public ListLDCFederationNamespaceResponseBodyDataClusterStateMap setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListLDCFederationNamespaceResponseBodyDataClusterStateMap setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListLDCFederationNamespaceResponseBodyDataLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListLDCFederationNamespaceResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            ListLDCFederationNamespaceResponseBodyDataLabels self = new ListLDCFederationNamespaceResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public ListLDCFederationNamespaceResponseBodyDataLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLDCFederationNamespaceResponseBodyDataLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListLDCFederationNamespaceResponseBodyData extends TeaModel {
        @NameInMap("CreateTimeStamp")
        public String createTimeStamp;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Clusters")
        public java.util.List<String> clusters;

        @NameInMap("Annotations")
        public java.util.List<ListLDCFederationNamespaceResponseBodyDataAnnotations> annotations;

        @NameInMap("ClusterStateMap")
        public java.util.List<ListLDCFederationNamespaceResponseBodyDataClusterStateMap> clusterStateMap;

        @NameInMap("Labels")
        public java.util.List<ListLDCFederationNamespaceResponseBodyDataLabels> labels;

        public static ListLDCFederationNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLDCFederationNamespaceResponseBodyData self = new ListLDCFederationNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLDCFederationNamespaceResponseBodyData setCreateTimeStamp(String createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public ListLDCFederationNamespaceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCFederationNamespaceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListLDCFederationNamespaceResponseBodyData setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public ListLDCFederationNamespaceResponseBodyData setAnnotations(java.util.List<ListLDCFederationNamespaceResponseBodyDataAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<ListLDCFederationNamespaceResponseBodyDataAnnotations> getAnnotations() {
            return this.annotations;
        }

        public ListLDCFederationNamespaceResponseBodyData setClusterStateMap(java.util.List<ListLDCFederationNamespaceResponseBodyDataClusterStateMap> clusterStateMap) {
            this.clusterStateMap = clusterStateMap;
            return this;
        }
        public java.util.List<ListLDCFederationNamespaceResponseBodyDataClusterStateMap> getClusterStateMap() {
            return this.clusterStateMap;
        }

        public ListLDCFederationNamespaceResponseBodyData setLabels(java.util.List<ListLDCFederationNamespaceResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListLDCFederationNamespaceResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

    }

}
