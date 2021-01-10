// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCFederationSecretResponseBody extends TeaModel {
    @NameInMap("Secret")
    public CreateLDCFederationSecretResponseBodySecret secret;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLDCFederationSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCFederationSecretResponseBody self = new CreateLDCFederationSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLDCFederationSecretResponseBody setSecret(CreateLDCFederationSecretResponseBodySecret secret) {
        this.secret = secret;
        return this;
    }
    public CreateLDCFederationSecretResponseBodySecret getSecret() {
        return this.secret;
    }

    public CreateLDCFederationSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLDCFederationSecretResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLDCFederationSecretResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLDCFederationSecretResponseBodySecretData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationSecretResponseBodySecretData build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationSecretResponseBodySecretData self = new CreateLDCFederationSecretResponseBodySecretData();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationSecretResponseBodySecretData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationSecretResponseBodySecretData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationSecretResponseBodySecretLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationSecretResponseBodySecretLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationSecretResponseBodySecretLabels self = new CreateLDCFederationSecretResponseBodySecretLabels();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationSecretResponseBodySecretLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationSecretResponseBodySecretLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationSecretResponseBodySecretAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationSecretResponseBodySecretAnnotations build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationSecretResponseBodySecretAnnotations self = new CreateLDCFederationSecretResponseBodySecretAnnotations();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationSecretResponseBodySecretAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationSecretResponseBodySecretAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationSecretResponseBodySecretOverridesData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationSecretResponseBodySecretOverridesData build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationSecretResponseBodySecretOverridesData self = new CreateLDCFederationSecretResponseBodySecretOverridesData();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationSecretResponseBodySecretOverridesData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationSecretResponseBodySecretOverridesData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationSecretResponseBodySecretOverrides extends TeaModel {
        @NameInMap("NameOverride")
        public String nameOverride;

        @NameInMap("Data")
        public java.util.List<CreateLDCFederationSecretResponseBodySecretOverridesData> data;

        @NameInMap("Name")
        public String name;

        public static CreateLDCFederationSecretResponseBodySecretOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationSecretResponseBodySecretOverrides self = new CreateLDCFederationSecretResponseBodySecretOverrides();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationSecretResponseBodySecretOverrides setNameOverride(String nameOverride) {
            this.nameOverride = nameOverride;
            return this;
        }
        public String getNameOverride() {
            return this.nameOverride;
        }

        public CreateLDCFederationSecretResponseBodySecretOverrides setData(java.util.List<CreateLDCFederationSecretResponseBodySecretOverridesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<CreateLDCFederationSecretResponseBodySecretOverridesData> getData() {
            return this.data;
        }

        public CreateLDCFederationSecretResponseBodySecretOverrides setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateLDCFederationSecretResponseBodySecretCellStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Cell")
        public String cell;

        public static CreateLDCFederationSecretResponseBodySecretCellStatus build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationSecretResponseBodySecretCellStatus self = new CreateLDCFederationSecretResponseBodySecretCellStatus();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationSecretResponseBodySecretCellStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateLDCFederationSecretResponseBodySecretCellStatus setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public CreateLDCFederationSecretResponseBodySecretCellStatus setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

    }

    public static class CreateLDCFederationSecretResponseBodySecret extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("CreateTimeStamp")
        public String createTimeStamp;

        @NameInMap("Data")
        public java.util.List<CreateLDCFederationSecretResponseBodySecretData> data;

        @NameInMap("Labels")
        public java.util.List<CreateLDCFederationSecretResponseBodySecretLabels> labels;

        @NameInMap("Annotations")
        public java.util.List<CreateLDCFederationSecretResponseBodySecretAnnotations> annotations;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Overrides")
        public java.util.List<CreateLDCFederationSecretResponseBodySecretOverrides> overrides;

        @NameInMap("CellStatus")
        public java.util.List<CreateLDCFederationSecretResponseBodySecretCellStatus> cellStatus;

        @NameInMap("Clusters")
        public java.util.List<String> clusters;

        @NameInMap("Name")
        public String name;

        @NameInMap("Reason")
        public String reason;

        public static CreateLDCFederationSecretResponseBodySecret build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationSecretResponseBodySecret self = new CreateLDCFederationSecretResponseBodySecret();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationSecretResponseBodySecret setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateLDCFederationSecretResponseBodySecret setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateLDCFederationSecretResponseBodySecret setCreateTimeStamp(String createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public CreateLDCFederationSecretResponseBodySecret setData(java.util.List<CreateLDCFederationSecretResponseBodySecretData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<CreateLDCFederationSecretResponseBodySecretData> getData() {
            return this.data;
        }

        public CreateLDCFederationSecretResponseBodySecret setLabels(java.util.List<CreateLDCFederationSecretResponseBodySecretLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<CreateLDCFederationSecretResponseBodySecretLabels> getLabels() {
            return this.labels;
        }

        public CreateLDCFederationSecretResponseBodySecret setAnnotations(java.util.List<CreateLDCFederationSecretResponseBodySecretAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<CreateLDCFederationSecretResponseBodySecretAnnotations> getAnnotations() {
            return this.annotations;
        }

        public CreateLDCFederationSecretResponseBodySecret setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateLDCFederationSecretResponseBodySecret setOverrides(java.util.List<CreateLDCFederationSecretResponseBodySecretOverrides> overrides) {
            this.overrides = overrides;
            return this;
        }
        public java.util.List<CreateLDCFederationSecretResponseBodySecretOverrides> getOverrides() {
            return this.overrides;
        }

        public CreateLDCFederationSecretResponseBodySecret setCellStatus(java.util.List<CreateLDCFederationSecretResponseBodySecretCellStatus> cellStatus) {
            this.cellStatus = cellStatus;
            return this;
        }
        public java.util.List<CreateLDCFederationSecretResponseBodySecretCellStatus> getCellStatus() {
            return this.cellStatus;
        }

        public CreateLDCFederationSecretResponseBodySecret setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public CreateLDCFederationSecretResponseBodySecret setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLDCFederationSecretResponseBodySecret setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
