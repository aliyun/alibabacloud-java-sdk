// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFederationConfigmapResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Configmap")
    public UpdateLDCFederationConfigmapResponseBodyConfigmap configmap;

    public static UpdateLDCFederationConfigmapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFederationConfigmapResponseBody self = new UpdateLDCFederationConfigmapResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFederationConfigmapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLDCFederationConfigmapResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLDCFederationConfigmapResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLDCFederationConfigmapResponseBody setConfigmap(UpdateLDCFederationConfigmapResponseBodyConfigmap configmap) {
        this.configmap = configmap;
        return this;
    }
    public UpdateLDCFederationConfigmapResponseBodyConfigmap getConfigmap() {
        return this.configmap;
    }

    public static class UpdateLDCFederationConfigmapResponseBodyConfigmapAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationConfigmapResponseBodyConfigmapAnnotations build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationConfigmapResponseBodyConfigmapAnnotations self = new UpdateLDCFederationConfigmapResponseBodyConfigmapAnnotations();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmapAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmapAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateLDCFederationConfigmapResponseBodyConfigmapCellStatus extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Status")
        public String status;

        public static UpdateLDCFederationConfigmapResponseBodyConfigmapCellStatus build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationConfigmapResponseBodyConfigmapCellStatus self = new UpdateLDCFederationConfigmapResponseBodyConfigmapCellStatus();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmapCellStatus setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmapCellStatus setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmapCellStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class UpdateLDCFederationConfigmapResponseBodyConfigmapData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationConfigmapResponseBodyConfigmapData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationConfigmapResponseBodyConfigmapData self = new UpdateLDCFederationConfigmapResponseBodyConfigmapData();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmapData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmapData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateLDCFederationConfigmapResponseBodyConfigmapLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationConfigmapResponseBodyConfigmapLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationConfigmapResponseBodyConfigmapLabels self = new UpdateLDCFederationConfigmapResponseBodyConfigmapLabels();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmapLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmapLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateLDCFederationConfigmapResponseBodyConfigmapOverridesData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationConfigmapResponseBodyConfigmapOverridesData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationConfigmapResponseBodyConfigmapOverridesData self = new UpdateLDCFederationConfigmapResponseBodyConfigmapOverridesData();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmapOverridesData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmapOverridesData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateLDCFederationConfigmapResponseBodyConfigmapOverrides extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("NameOverride")
        public String nameOverride;

        @NameInMap("Data")
        public java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapOverridesData> data;

        public static UpdateLDCFederationConfigmapResponseBodyConfigmapOverrides build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationConfigmapResponseBodyConfigmapOverrides self = new UpdateLDCFederationConfigmapResponseBodyConfigmapOverrides();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmapOverrides setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmapOverrides setNameOverride(String nameOverride) {
            this.nameOverride = nameOverride;
            return this;
        }
        public String getNameOverride() {
            return this.nameOverride;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmapOverrides setData(java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapOverridesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapOverridesData> getData() {
            return this.data;
        }

    }

    public static class UpdateLDCFederationConfigmapResponseBodyConfigmap extends TeaModel {
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
        public java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapAnnotations> annotations;

        @NameInMap("CellStatus")
        public java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapCellStatus> cellStatus;

        @NameInMap("Data")
        public java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapData> data;

        @NameInMap("Labels")
        public java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapLabels> labels;

        @NameInMap("Overrides")
        public java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapOverrides> overrides;

        public static UpdateLDCFederationConfigmapResponseBodyConfigmap build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationConfigmapResponseBodyConfigmap self = new UpdateLDCFederationConfigmapResponseBodyConfigmap();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmap setCreateTimeStamp(String createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmap setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmap setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmap setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmap setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmap setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmap setAnnotations(java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapAnnotations> getAnnotations() {
            return this.annotations;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmap setCellStatus(java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapCellStatus> cellStatus) {
            this.cellStatus = cellStatus;
            return this;
        }
        public java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapCellStatus> getCellStatus() {
            return this.cellStatus;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmap setData(java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapData> getData() {
            return this.data;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmap setLabels(java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapLabels> getLabels() {
            return this.labels;
        }

        public UpdateLDCFederationConfigmapResponseBodyConfigmap setOverrides(java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapOverrides> overrides) {
            this.overrides = overrides;
            return this;
        }
        public java.util.List<UpdateLDCFederationConfigmapResponseBodyConfigmapOverrides> getOverrides() {
            return this.overrides;
        }

    }

}
