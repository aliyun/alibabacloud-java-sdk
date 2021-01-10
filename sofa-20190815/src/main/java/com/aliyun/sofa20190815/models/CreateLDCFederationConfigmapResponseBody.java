// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCFederationConfigmapResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Configmap")
    public CreateLDCFederationConfigmapResponseBodyConfigmap configmap;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLDCFederationConfigmapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCFederationConfigmapResponseBody self = new CreateLDCFederationConfigmapResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLDCFederationConfigmapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLDCFederationConfigmapResponseBody setConfigmap(CreateLDCFederationConfigmapResponseBodyConfigmap configmap) {
        this.configmap = configmap;
        return this;
    }
    public CreateLDCFederationConfigmapResponseBodyConfigmap getConfigmap() {
        return this.configmap;
    }

    public CreateLDCFederationConfigmapResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLDCFederationConfigmapResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLDCFederationConfigmapResponseBodyConfigmapData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationConfigmapResponseBodyConfigmapData build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationConfigmapResponseBodyConfigmapData self = new CreateLDCFederationConfigmapResponseBodyConfigmapData();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmapData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmapData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationConfigmapResponseBodyConfigmapLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationConfigmapResponseBodyConfigmapLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationConfigmapResponseBodyConfigmapLabels self = new CreateLDCFederationConfigmapResponseBodyConfigmapLabels();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmapLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmapLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationConfigmapResponseBodyConfigmapCellStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Cell")
        public String cell;

        public static CreateLDCFederationConfigmapResponseBodyConfigmapCellStatus build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationConfigmapResponseBodyConfigmapCellStatus self = new CreateLDCFederationConfigmapResponseBodyConfigmapCellStatus();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmapCellStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmapCellStatus setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmapCellStatus setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

    }

    public static class CreateLDCFederationConfigmapResponseBodyConfigmapAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationConfigmapResponseBodyConfigmapAnnotations build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationConfigmapResponseBodyConfigmapAnnotations self = new CreateLDCFederationConfigmapResponseBodyConfigmapAnnotations();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmapAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmapAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationConfigmapResponseBodyConfigmapOverridesData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationConfigmapResponseBodyConfigmapOverridesData build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationConfigmapResponseBodyConfigmapOverridesData self = new CreateLDCFederationConfigmapResponseBodyConfigmapOverridesData();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmapOverridesData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmapOverridesData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationConfigmapResponseBodyConfigmapOverrides extends TeaModel {
        @NameInMap("NameOverride")
        public String nameOverride;

        @NameInMap("Data")
        public java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapOverridesData> data;

        @NameInMap("Name")
        public String name;

        public static CreateLDCFederationConfigmapResponseBodyConfigmapOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationConfigmapResponseBodyConfigmapOverrides self = new CreateLDCFederationConfigmapResponseBodyConfigmapOverrides();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmapOverrides setNameOverride(String nameOverride) {
            this.nameOverride = nameOverride;
            return this;
        }
        public String getNameOverride() {
            return this.nameOverride;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmapOverrides setData(java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapOverridesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapOverridesData> getData() {
            return this.data;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmapOverrides setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateLDCFederationConfigmapResponseBodyConfigmap extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreateTimeStamp")
        public String createTimeStamp;

        @NameInMap("Data")
        public java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapData> data;

        @NameInMap("Labels")
        public java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapLabels> labels;

        @NameInMap("CellStatus")
        public java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapCellStatus> cellStatus;

        @NameInMap("Annotations")
        public java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapAnnotations> annotations;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Clusters")
        public java.util.List<String> clusters;

        @NameInMap("Name")
        public String name;

        @NameInMap("Overrides")
        public java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapOverrides> overrides;

        @NameInMap("Reason")
        public String reason;

        public static CreateLDCFederationConfigmapResponseBodyConfigmap build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationConfigmapResponseBodyConfigmap self = new CreateLDCFederationConfigmapResponseBodyConfigmap();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmap setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmap setCreateTimeStamp(String createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmap setData(java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapData> getData() {
            return this.data;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmap setLabels(java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapLabels> getLabels() {
            return this.labels;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmap setCellStatus(java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapCellStatus> cellStatus) {
            this.cellStatus = cellStatus;
            return this;
        }
        public java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapCellStatus> getCellStatus() {
            return this.cellStatus;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmap setAnnotations(java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapAnnotations> getAnnotations() {
            return this.annotations;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmap setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmap setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmap setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmap setOverrides(java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapOverrides> overrides) {
            this.overrides = overrides;
            return this;
        }
        public java.util.List<CreateLDCFederationConfigmapResponseBodyConfigmapOverrides> getOverrides() {
            return this.overrides;
        }

        public CreateLDCFederationConfigmapResponseBodyConfigmap setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
