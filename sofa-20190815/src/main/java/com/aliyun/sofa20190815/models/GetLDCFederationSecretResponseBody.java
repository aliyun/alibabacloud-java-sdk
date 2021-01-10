// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCFederationSecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Secret")
    public GetLDCFederationSecretResponseBodySecret secret;

    public static GetLDCFederationSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLDCFederationSecretResponseBody self = new GetLDCFederationSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLDCFederationSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLDCFederationSecretResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLDCFederationSecretResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLDCFederationSecretResponseBody setSecret(GetLDCFederationSecretResponseBodySecret secret) {
        this.secret = secret;
        return this;
    }
    public GetLDCFederationSecretResponseBodySecret getSecret() {
        return this.secret;
    }

    public static class GetLDCFederationSecretResponseBodySecretAnnotations extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCFederationSecretResponseBodySecretAnnotations build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationSecretResponseBodySecretAnnotations self = new GetLDCFederationSecretResponseBodySecretAnnotations();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationSecretResponseBodySecretAnnotations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCFederationSecretResponseBodySecretAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCFederationSecretResponseBodySecretCellStatus extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Status")
        public String status;

        public static GetLDCFederationSecretResponseBodySecretCellStatus build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationSecretResponseBodySecretCellStatus self = new GetLDCFederationSecretResponseBodySecretCellStatus();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationSecretResponseBodySecretCellStatus setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public GetLDCFederationSecretResponseBodySecretCellStatus setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetLDCFederationSecretResponseBodySecretCellStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetLDCFederationSecretResponseBodySecretData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCFederationSecretResponseBodySecretData build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationSecretResponseBodySecretData self = new GetLDCFederationSecretResponseBodySecretData();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationSecretResponseBodySecretData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCFederationSecretResponseBodySecretData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCFederationSecretResponseBodySecretLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCFederationSecretResponseBodySecretLabels build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationSecretResponseBodySecretLabels self = new GetLDCFederationSecretResponseBodySecretLabels();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationSecretResponseBodySecretLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCFederationSecretResponseBodySecretLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCFederationSecretResponseBodySecretOverridesData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCFederationSecretResponseBodySecretOverridesData build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationSecretResponseBodySecretOverridesData self = new GetLDCFederationSecretResponseBodySecretOverridesData();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationSecretResponseBodySecretOverridesData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCFederationSecretResponseBodySecretOverridesData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCFederationSecretResponseBodySecretOverrides extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("NameOverride")
        public String nameOverride;

        @NameInMap("Data")
        public java.util.List<GetLDCFederationSecretResponseBodySecretOverridesData> data;

        public static GetLDCFederationSecretResponseBodySecretOverrides build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationSecretResponseBodySecretOverrides self = new GetLDCFederationSecretResponseBodySecretOverrides();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationSecretResponseBodySecretOverrides setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCFederationSecretResponseBodySecretOverrides setNameOverride(String nameOverride) {
            this.nameOverride = nameOverride;
            return this;
        }
        public String getNameOverride() {
            return this.nameOverride;
        }

        public GetLDCFederationSecretResponseBodySecretOverrides setData(java.util.List<GetLDCFederationSecretResponseBodySecretOverridesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetLDCFederationSecretResponseBodySecretOverridesData> getData() {
            return this.data;
        }

    }

    public static class GetLDCFederationSecretResponseBodySecret extends TeaModel {
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
        public java.util.List<GetLDCFederationSecretResponseBodySecretAnnotations> annotations;

        @NameInMap("CellStatus")
        public java.util.List<GetLDCFederationSecretResponseBodySecretCellStatus> cellStatus;

        @NameInMap("Data")
        public java.util.List<GetLDCFederationSecretResponseBodySecretData> data;

        @NameInMap("Labels")
        public java.util.List<GetLDCFederationSecretResponseBodySecretLabels> labels;

        @NameInMap("Overrides")
        public java.util.List<GetLDCFederationSecretResponseBodySecretOverrides> overrides;

        public static GetLDCFederationSecretResponseBodySecret build(java.util.Map<String, ?> map) throws Exception {
            GetLDCFederationSecretResponseBodySecret self = new GetLDCFederationSecretResponseBodySecret();
            return TeaModel.build(map, self);
        }

        public GetLDCFederationSecretResponseBodySecret setCreateTimeStamp(String createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public GetLDCFederationSecretResponseBodySecret setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCFederationSecretResponseBodySecret setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetLDCFederationSecretResponseBodySecret setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetLDCFederationSecretResponseBodySecret setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLDCFederationSecretResponseBodySecret setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLDCFederationSecretResponseBodySecret setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public GetLDCFederationSecretResponseBodySecret setAnnotations(java.util.List<GetLDCFederationSecretResponseBodySecretAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<GetLDCFederationSecretResponseBodySecretAnnotations> getAnnotations() {
            return this.annotations;
        }

        public GetLDCFederationSecretResponseBodySecret setCellStatus(java.util.List<GetLDCFederationSecretResponseBodySecretCellStatus> cellStatus) {
            this.cellStatus = cellStatus;
            return this;
        }
        public java.util.List<GetLDCFederationSecretResponseBodySecretCellStatus> getCellStatus() {
            return this.cellStatus;
        }

        public GetLDCFederationSecretResponseBodySecret setData(java.util.List<GetLDCFederationSecretResponseBodySecretData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetLDCFederationSecretResponseBodySecretData> getData() {
            return this.data;
        }

        public GetLDCFederationSecretResponseBodySecret setLabels(java.util.List<GetLDCFederationSecretResponseBodySecretLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<GetLDCFederationSecretResponseBodySecretLabels> getLabels() {
            return this.labels;
        }

        public GetLDCFederationSecretResponseBodySecret setOverrides(java.util.List<GetLDCFederationSecretResponseBodySecretOverrides> overrides) {
            this.overrides = overrides;
            return this;
        }
        public java.util.List<GetLDCFederationSecretResponseBodySecretOverrides> getOverrides() {
            return this.overrides;
        }

    }

}
