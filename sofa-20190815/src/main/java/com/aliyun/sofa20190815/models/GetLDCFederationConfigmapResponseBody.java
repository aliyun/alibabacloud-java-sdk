// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCFederationConfigmapResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Configmap")
    public GetLDCFederationConfigmapResponseBodyConfigmap configmap;

    public static GetLDCFederationConfigmapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLDCFederationConfigmapResponseBody self = new GetLDCFederationConfigmapResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLDCFederationConfigmapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLDCFederationConfigmapResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLDCFederationConfigmapResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLDCFederationConfigmapResponseBody setConfigmap(GetLDCFederationConfigmapResponseBodyConfigmap configmap) {
        this.configmap = configmap;
        return this;
    }
    public GetLDCFederationConfigmapResponseBodyConfigmap getConfigmap() {
        return this.configmap;
    }

    public static class GetLDCFederationConfigmapResponseBodyConfigmapAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCFederationConfigmapResponseBodyConfigmapAnnotations build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationConfigmapResponseBodyConfigmapAnnotations self = new GetLDCFederationConfigmapResponseBodyConfigmapAnnotations();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationConfigmapResponseBodyConfigmapAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmapAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCFederationConfigmapResponseBodyConfigmapCellStatus extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Status")
        public String status;

        public static GetLDCFederationConfigmapResponseBodyConfigmapCellStatus build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationConfigmapResponseBodyConfigmapCellStatus self = new GetLDCFederationConfigmapResponseBodyConfigmapCellStatus();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationConfigmapResponseBodyConfigmapCellStatus setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmapCellStatus setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmapCellStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetLDCFederationConfigmapResponseBodyConfigmapData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCFederationConfigmapResponseBodyConfigmapData build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationConfigmapResponseBodyConfigmapData self = new GetLDCFederationConfigmapResponseBodyConfigmapData();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationConfigmapResponseBodyConfigmapData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmapData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCFederationConfigmapResponseBodyConfigmapLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCFederationConfigmapResponseBodyConfigmapLabels build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationConfigmapResponseBodyConfigmapLabels self = new GetLDCFederationConfigmapResponseBodyConfigmapLabels();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationConfigmapResponseBodyConfigmapLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmapLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCFederationConfigmapResponseBodyConfigmapOverridesData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCFederationConfigmapResponseBodyConfigmapOverridesData build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationConfigmapResponseBodyConfigmapOverridesData self = new GetLDCFederationConfigmapResponseBodyConfigmapOverridesData();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationConfigmapResponseBodyConfigmapOverridesData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmapOverridesData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCFederationConfigmapResponseBodyConfigmapOverrides extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("NameOverride")
        public String nameOverride;

        @NameInMap("Data")
        public java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapOverridesData> data;

        public static GetLDCFederationConfigmapResponseBodyConfigmapOverrides build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationConfigmapResponseBodyConfigmapOverrides self = new GetLDCFederationConfigmapResponseBodyConfigmapOverrides();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationConfigmapResponseBodyConfigmapOverrides setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmapOverrides setNameOverride(String nameOverride) {
            this.nameOverride = nameOverride;
            return this;
        }
        public String getNameOverride() {
            return this.nameOverride;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmapOverrides setData(java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapOverridesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapOverridesData> getData() {
            return this.data;
        }

    }

    public static class GetLDCFederationConfigmapResponseBodyConfigmap extends TeaModel {
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
        public java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapAnnotations> annotations;

        @NameInMap("CellStatus")
        public java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapCellStatus> cellStatus;

        @NameInMap("Data")
        public java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapData> data;

        @NameInMap("Labels")
        public java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapLabels> labels;

        @NameInMap("Overrides")
        public java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapOverrides> overrides;

        public static GetLDCFederationConfigmapResponseBodyConfigmap build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationConfigmapResponseBodyConfigmap self = new GetLDCFederationConfigmapResponseBodyConfigmap();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationConfigmapResponseBodyConfigmap setCreateTimeStamp(String createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmap setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmap setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmap setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmap setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmap setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmap setAnnotations(java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapAnnotations> getAnnotations() {
            return this.annotations;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmap setCellStatus(java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapCellStatus> cellStatus) {
            this.cellStatus = cellStatus;
            return this;
        }
        public java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapCellStatus> getCellStatus() {
            return this.cellStatus;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmap setData(java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapData> getData() {
            return this.data;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmap setLabels(java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapLabels> getLabels() {
            return this.labels;
        }

        public GetLDCFederationConfigmapResponseBodyConfigmap setOverrides(java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapOverrides> overrides) {
            this.overrides = overrides;
            return this;
        }
        public java.util.List<GetLDCFederationConfigmapResponseBodyConfigmapOverrides> getOverrides() {
            return this.overrides;
        }

    }

}
