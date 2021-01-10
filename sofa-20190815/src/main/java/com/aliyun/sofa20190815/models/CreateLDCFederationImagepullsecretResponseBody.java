// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCFederationImagepullsecretResponseBody extends TeaModel {
    @NameInMap("Secret")
    public CreateLDCFederationImagepullsecretResponseBodySecret secret;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLDCFederationImagepullsecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCFederationImagepullsecretResponseBody self = new CreateLDCFederationImagepullsecretResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLDCFederationImagepullsecretResponseBody setSecret(CreateLDCFederationImagepullsecretResponseBodySecret secret) {
        this.secret = secret;
        return this;
    }
    public CreateLDCFederationImagepullsecretResponseBodySecret getSecret() {
        return this.secret;
    }

    public CreateLDCFederationImagepullsecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLDCFederationImagepullsecretResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLDCFederationImagepullsecretResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLDCFederationImagepullsecretResponseBodySecretData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationImagepullsecretResponseBodySecretData build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationImagepullsecretResponseBodySecretData self = new CreateLDCFederationImagepullsecretResponseBodySecretData();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationImagepullsecretResponseBodySecretData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecretData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationImagepullsecretResponseBodySecretLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationImagepullsecretResponseBodySecretLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationImagepullsecretResponseBodySecretLabels self = new CreateLDCFederationImagepullsecretResponseBodySecretLabels();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationImagepullsecretResponseBodySecretLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecretLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationImagepullsecretResponseBodySecretAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationImagepullsecretResponseBodySecretAnnotations build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationImagepullsecretResponseBodySecretAnnotations self = new CreateLDCFederationImagepullsecretResponseBodySecretAnnotations();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationImagepullsecretResponseBodySecretAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecretAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationImagepullsecretResponseBodySecretOverridesData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateLDCFederationImagepullsecretResponseBodySecretOverridesData build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationImagepullsecretResponseBodySecretOverridesData self = new CreateLDCFederationImagepullsecretResponseBodySecretOverridesData();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationImagepullsecretResponseBodySecretOverridesData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecretOverridesData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLDCFederationImagepullsecretResponseBodySecretOverrides extends TeaModel {
        @NameInMap("NameOverride")
        public String nameOverride;

        @NameInMap("Data")
        public java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretOverridesData> data;

        @NameInMap("Name")
        public String name;

        public static CreateLDCFederationImagepullsecretResponseBodySecretOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationImagepullsecretResponseBodySecretOverrides self = new CreateLDCFederationImagepullsecretResponseBodySecretOverrides();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationImagepullsecretResponseBodySecretOverrides setNameOverride(String nameOverride) {
            this.nameOverride = nameOverride;
            return this;
        }
        public String getNameOverride() {
            return this.nameOverride;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecretOverrides setData(java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretOverridesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretOverridesData> getData() {
            return this.data;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecretOverrides setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateLDCFederationImagepullsecretResponseBodySecretCellStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Cell")
        public String cell;

        public static CreateLDCFederationImagepullsecretResponseBodySecretCellStatus build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationImagepullsecretResponseBodySecretCellStatus self = new CreateLDCFederationImagepullsecretResponseBodySecretCellStatus();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationImagepullsecretResponseBodySecretCellStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecretCellStatus setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecretCellStatus setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

    }

    public static class CreateLDCFederationImagepullsecretResponseBodySecret extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("CreateTimeStamp")
        public String createTimeStamp;

        @NameInMap("Data")
        public java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretData> data;

        @NameInMap("Labels")
        public java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretLabels> labels;

        @NameInMap("Annotations")
        public java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretAnnotations> annotations;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Overrides")
        public java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretOverrides> overrides;

        @NameInMap("CellStatus")
        public java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretCellStatus> cellStatus;

        @NameInMap("Clusters")
        public java.util.List<String> clusters;

        @NameInMap("Name")
        public String name;

        @NameInMap("Reason")
        public String reason;

        public static CreateLDCFederationImagepullsecretResponseBodySecret build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCFederationImagepullsecretResponseBodySecret self = new CreateLDCFederationImagepullsecretResponseBodySecret();
            return TeaModel.build(map, self);
        }

        public CreateLDCFederationImagepullsecretResponseBodySecret setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecret setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecret setCreateTimeStamp(String createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecret setData(java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretData> getData() {
            return this.data;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecret setLabels(java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretLabels> getLabels() {
            return this.labels;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecret setAnnotations(java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretAnnotations> getAnnotations() {
            return this.annotations;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecret setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecret setOverrides(java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretOverrides> overrides) {
            this.overrides = overrides;
            return this;
        }
        public java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretOverrides> getOverrides() {
            return this.overrides;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecret setCellStatus(java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretCellStatus> cellStatus) {
            this.cellStatus = cellStatus;
            return this;
        }
        public java.util.List<CreateLDCFederationImagepullsecretResponseBodySecretCellStatus> getCellStatus() {
            return this.cellStatus;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecret setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecret setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLDCFederationImagepullsecretResponseBodySecret setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
