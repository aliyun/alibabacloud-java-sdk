// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCFederationConfigmapResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Configmaps")
    public java.util.List<ListLDCFederationConfigmapResponseBodyConfigmaps> configmaps;

    public static ListLDCFederationConfigmapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLDCFederationConfigmapResponseBody self = new ListLDCFederationConfigmapResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLDCFederationConfigmapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLDCFederationConfigmapResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLDCFederationConfigmapResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLDCFederationConfigmapResponseBody setConfigmaps(java.util.List<ListLDCFederationConfigmapResponseBodyConfigmaps> configmaps) {
        this.configmaps = configmaps;
        return this;
    }
    public java.util.List<ListLDCFederationConfigmapResponseBodyConfigmaps> getConfigmaps() {
        return this.configmaps;
    }

    public static class ListLDCFederationConfigmapResponseBodyConfigmapsAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListLDCFederationConfigmapResponseBodyConfigmapsAnnotations build(java.util.Map<String, ?> map) throws Exception {
            ListLDCFederationConfigmapResponseBodyConfigmapsAnnotations self = new ListLDCFederationConfigmapResponseBodyConfigmapsAnnotations();
            return TeaModel.build(map, self);
        }

        public ListLDCFederationConfigmapResponseBodyConfigmapsAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmapsAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListLDCFederationConfigmapResponseBodyConfigmapsCellStatus extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Status")
        public String status;

        public static ListLDCFederationConfigmapResponseBodyConfigmapsCellStatus build(java.util.Map<String, ?> map) throws Exception {
            ListLDCFederationConfigmapResponseBodyConfigmapsCellStatus self = new ListLDCFederationConfigmapResponseBodyConfigmapsCellStatus();
            return TeaModel.build(map, self);
        }

        public ListLDCFederationConfigmapResponseBodyConfigmapsCellStatus setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmapsCellStatus setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmapsCellStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListLDCFederationConfigmapResponseBodyConfigmapsData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListLDCFederationConfigmapResponseBodyConfigmapsData build(java.util.Map<String, ?> map) throws Exception {
            ListLDCFederationConfigmapResponseBodyConfigmapsData self = new ListLDCFederationConfigmapResponseBodyConfigmapsData();
            return TeaModel.build(map, self);
        }

        public ListLDCFederationConfigmapResponseBodyConfigmapsData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmapsData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListLDCFederationConfigmapResponseBodyConfigmapsLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListLDCFederationConfigmapResponseBodyConfigmapsLabels build(java.util.Map<String, ?> map) throws Exception {
            ListLDCFederationConfigmapResponseBodyConfigmapsLabels self = new ListLDCFederationConfigmapResponseBodyConfigmapsLabels();
            return TeaModel.build(map, self);
        }

        public ListLDCFederationConfigmapResponseBodyConfigmapsLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmapsLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListLDCFederationConfigmapResponseBodyConfigmapsOverridesData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListLDCFederationConfigmapResponseBodyConfigmapsOverridesData build(java.util.Map<String, ?> map) throws Exception {
            ListLDCFederationConfigmapResponseBodyConfigmapsOverridesData self = new ListLDCFederationConfigmapResponseBodyConfigmapsOverridesData();
            return TeaModel.build(map, self);
        }

        public ListLDCFederationConfigmapResponseBodyConfigmapsOverridesData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmapsOverridesData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListLDCFederationConfigmapResponseBodyConfigmapsOverrides extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("NameOverride")
        public String nameOverride;

        @NameInMap("Data")
        public java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsOverridesData> data;

        public static ListLDCFederationConfigmapResponseBodyConfigmapsOverrides build(java.util.Map<String, ?> map) throws Exception {
            ListLDCFederationConfigmapResponseBodyConfigmapsOverrides self = new ListLDCFederationConfigmapResponseBodyConfigmapsOverrides();
            return TeaModel.build(map, self);
        }

        public ListLDCFederationConfigmapResponseBodyConfigmapsOverrides setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmapsOverrides setNameOverride(String nameOverride) {
            this.nameOverride = nameOverride;
            return this;
        }
        public String getNameOverride() {
            return this.nameOverride;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmapsOverrides setData(java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsOverridesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsOverridesData> getData() {
            return this.data;
        }

    }

    public static class ListLDCFederationConfigmapResponseBodyConfigmaps extends TeaModel {
        @NameInMap("CreateTimeStamp")
        public String createTimeStamp;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Status")
        public String status;

        @NameInMap("Clusters")
        public java.util.List<String> clusters;

        @NameInMap("Annotations")
        public java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsAnnotations> annotations;

        @NameInMap("CellStatus")
        public java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsCellStatus> cellStatus;

        @NameInMap("Data")
        public java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsData> data;

        @NameInMap("Labels")
        public java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsLabels> labels;

        @NameInMap("Overrides")
        public java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsOverrides> overrides;

        public static ListLDCFederationConfigmapResponseBodyConfigmaps build(java.util.Map<String, ?> map) throws Exception {
            ListLDCFederationConfigmapResponseBodyConfigmaps self = new ListLDCFederationConfigmapResponseBodyConfigmaps();
            return TeaModel.build(map, self);
        }

        public ListLDCFederationConfigmapResponseBodyConfigmaps setCreateTimeStamp(String createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmaps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmaps setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmaps setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmaps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmaps setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmaps setAnnotations(java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsAnnotations> getAnnotations() {
            return this.annotations;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmaps setCellStatus(java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsCellStatus> cellStatus) {
            this.cellStatus = cellStatus;
            return this;
        }
        public java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsCellStatus> getCellStatus() {
            return this.cellStatus;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmaps setData(java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsData> getData() {
            return this.data;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmaps setLabels(java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsLabels> getLabels() {
            return this.labels;
        }

        public ListLDCFederationConfigmapResponseBodyConfigmaps setOverrides(java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsOverrides> overrides) {
            this.overrides = overrides;
            return this;
        }
        public java.util.List<ListLDCFederationConfigmapResponseBodyConfigmapsOverrides> getOverrides() {
            return this.overrides;
        }

    }

}
