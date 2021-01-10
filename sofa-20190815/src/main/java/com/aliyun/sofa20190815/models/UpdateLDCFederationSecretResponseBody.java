// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCFederationSecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Secret")
    public UpdateLDCFederationSecretResponseBodySecret secret;

    public static UpdateLDCFederationSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCFederationSecretResponseBody self = new UpdateLDCFederationSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLDCFederationSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLDCFederationSecretResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLDCFederationSecretResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLDCFederationSecretResponseBody setSecret(UpdateLDCFederationSecretResponseBodySecret secret) {
        this.secret = secret;
        return this;
    }
    public UpdateLDCFederationSecretResponseBodySecret getSecret() {
        return this.secret;
    }

    public static class UpdateLDCFederationSecretResponseBodySecretAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationSecretResponseBodySecretAnnotations build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationSecretResponseBodySecretAnnotations self = new UpdateLDCFederationSecretResponseBodySecretAnnotations();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationSecretResponseBodySecretAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationSecretResponseBodySecretAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateLDCFederationSecretResponseBodySecretCellStatus extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Status")
        public String status;

        public static UpdateLDCFederationSecretResponseBodySecretCellStatus build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationSecretResponseBodySecretCellStatus self = new UpdateLDCFederationSecretResponseBodySecretCellStatus();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationSecretResponseBodySecretCellStatus setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public UpdateLDCFederationSecretResponseBodySecretCellStatus setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public UpdateLDCFederationSecretResponseBodySecretCellStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class UpdateLDCFederationSecretResponseBodySecretData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationSecretResponseBodySecretData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationSecretResponseBodySecretData self = new UpdateLDCFederationSecretResponseBodySecretData();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationSecretResponseBodySecretData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationSecretResponseBodySecretData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateLDCFederationSecretResponseBodySecretLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationSecretResponseBodySecretLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationSecretResponseBodySecretLabels self = new UpdateLDCFederationSecretResponseBodySecretLabels();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationSecretResponseBodySecretLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationSecretResponseBodySecretLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateLDCFederationSecretResponseBodySecretOverridesData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateLDCFederationSecretResponseBodySecretOverridesData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationSecretResponseBodySecretOverridesData self = new UpdateLDCFederationSecretResponseBodySecretOverridesData();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationSecretResponseBodySecretOverridesData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateLDCFederationSecretResponseBodySecretOverridesData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateLDCFederationSecretResponseBodySecretOverrides extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("NameOverride")
        public String nameOverride;

        @NameInMap("Data")
        public java.util.List<UpdateLDCFederationSecretResponseBodySecretOverridesData> data;

        public static UpdateLDCFederationSecretResponseBodySecretOverrides build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationSecretResponseBodySecretOverrides self = new UpdateLDCFederationSecretResponseBodySecretOverrides();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationSecretResponseBodySecretOverrides setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLDCFederationSecretResponseBodySecretOverrides setNameOverride(String nameOverride) {
            this.nameOverride = nameOverride;
            return this;
        }
        public String getNameOverride() {
            return this.nameOverride;
        }

        public UpdateLDCFederationSecretResponseBodySecretOverrides setData(java.util.List<UpdateLDCFederationSecretResponseBodySecretOverridesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<UpdateLDCFederationSecretResponseBodySecretOverridesData> getData() {
            return this.data;
        }

    }

    public static class UpdateLDCFederationSecretResponseBodySecret extends TeaModel {
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

        @NameInMap("Type")
        public String type;

        @NameInMap("Clusters")
        public java.util.List<String> clusters;

        @NameInMap("Annotations")
        public java.util.List<UpdateLDCFederationSecretResponseBodySecretAnnotations> annotations;

        @NameInMap("CellStatus")
        public java.util.List<UpdateLDCFederationSecretResponseBodySecretCellStatus> cellStatus;

        @NameInMap("Data")
        public java.util.List<UpdateLDCFederationSecretResponseBodySecretData> data;

        @NameInMap("Labels")
        public java.util.List<UpdateLDCFederationSecretResponseBodySecretLabels> labels;

        @NameInMap("Overrides")
        public java.util.List<UpdateLDCFederationSecretResponseBodySecretOverrides> overrides;

        public static UpdateLDCFederationSecretResponseBodySecret build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCFederationSecretResponseBodySecret self = new UpdateLDCFederationSecretResponseBodySecret();
            return TeaModel.build(map, self);
        }

        public UpdateLDCFederationSecretResponseBodySecret setCreateTimeStamp(String createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public UpdateLDCFederationSecretResponseBodySecret setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLDCFederationSecretResponseBodySecret setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateLDCFederationSecretResponseBodySecret setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public UpdateLDCFederationSecretResponseBodySecret setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateLDCFederationSecretResponseBodySecret setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateLDCFederationSecretResponseBodySecret setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public UpdateLDCFederationSecretResponseBodySecret setAnnotations(java.util.List<UpdateLDCFederationSecretResponseBodySecretAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<UpdateLDCFederationSecretResponseBodySecretAnnotations> getAnnotations() {
            return this.annotations;
        }

        public UpdateLDCFederationSecretResponseBodySecret setCellStatus(java.util.List<UpdateLDCFederationSecretResponseBodySecretCellStatus> cellStatus) {
            this.cellStatus = cellStatus;
            return this;
        }
        public java.util.List<UpdateLDCFederationSecretResponseBodySecretCellStatus> getCellStatus() {
            return this.cellStatus;
        }

        public UpdateLDCFederationSecretResponseBodySecret setData(java.util.List<UpdateLDCFederationSecretResponseBodySecretData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<UpdateLDCFederationSecretResponseBodySecretData> getData() {
            return this.data;
        }

        public UpdateLDCFederationSecretResponseBodySecret setLabels(java.util.List<UpdateLDCFederationSecretResponseBodySecretLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<UpdateLDCFederationSecretResponseBodySecretLabels> getLabels() {
            return this.labels;
        }

        public UpdateLDCFederationSecretResponseBodySecret setOverrides(java.util.List<UpdateLDCFederationSecretResponseBodySecretOverrides> overrides) {
            this.overrides = overrides;
            return this;
        }
        public java.util.List<UpdateLDCFederationSecretResponseBodySecretOverrides> getOverrides() {
            return this.overrides;
        }

    }

}
