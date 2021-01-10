// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCCellgroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CellGroup")
    public GetLDCCellgroupResponseBodyCellGroup cellGroup;

    public static GetLDCCellgroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLDCCellgroupResponseBody self = new GetLDCCellgroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLDCCellgroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLDCCellgroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLDCCellgroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLDCCellgroupResponseBody setCellGroup(GetLDCCellgroupResponseBodyCellGroup cellGroup) {
        this.cellGroup = cellGroup;
        return this;
    }
    public GetLDCCellgroupResponseBodyCellGroup getCellGroup() {
        return this.cellGroup;
    }

    public static class GetLDCCellgroupResponseBodyCellGroupCells extends TeaModel {
        @NameInMap("CellGroup")
        public String cellGroup;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Color")
        public String color;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("IsGray")
        public Boolean isGray;

        @NameInMap("Name")
        public String name;

        @NameInMap("PressWeight")
        public Long pressWeight;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Long weight;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("Zone")
        public String zone;

        public static GetLDCCellgroupResponseBodyCellGroupCells build(java.util.Map<String, ?> map) throws Exception {
            GetLDCCellgroupResponseBodyCellGroupCells self = new GetLDCCellgroupResponseBodyCellGroupCells();
            return TeaModel.build(map, self);
        }

        public GetLDCCellgroupResponseBodyCellGroupCells setCellGroup(String cellGroup) {
            this.cellGroup = cellGroup;
            return this;
        }
        public String getCellGroup() {
            return this.cellGroup;
        }

        public GetLDCCellgroupResponseBodyCellGroupCells setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetLDCCellgroupResponseBodyCellGroupCells setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public GetLDCCellgroupResponseBodyCellGroupCells setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetLDCCellgroupResponseBodyCellGroupCells setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetLDCCellgroupResponseBodyCellGroupCells setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public GetLDCCellgroupResponseBodyCellGroupCells setIsGray(Boolean isGray) {
            this.isGray = isGray;
            return this;
        }
        public Boolean getIsGray() {
            return this.isGray;
        }

        public GetLDCCellgroupResponseBodyCellGroupCells setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCCellgroupResponseBodyCellGroupCells setPressWeight(Long pressWeight) {
            this.pressWeight = pressWeight;
            return this;
        }
        public Long getPressWeight() {
            return this.pressWeight;
        }

        public GetLDCCellgroupResponseBodyCellGroupCells setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLDCCellgroupResponseBodyCellGroupCells setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public GetLDCCellgroupResponseBodyCellGroupCells setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public GetLDCCellgroupResponseBodyCellGroupCells setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class GetLDCCellgroupResponseBodyCellGroupDisasterInfo extends TeaModel {
        @NameInMap("DisasterRecoveryState")
        public String disasterRecoveryState;

        @NameInMap("LocalFailoverTarget")
        public String localFailoverTarget;

        @NameInMap("PressDisasterRecoveryState")
        public String pressDisasterRecoveryState;

        @NameInMap("RemoteFailoverTarget")
        public String remoteFailoverTarget;

        @NameInMap("Source")
        public String source;

        @NameInMap("Type")
        public String type;

        public static GetLDCCellgroupResponseBodyCellGroupDisasterInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLDCCellgroupResponseBodyCellGroupDisasterInfo self = new GetLDCCellgroupResponseBodyCellGroupDisasterInfo();
            return TeaModel.build(map, self);
        }

        public GetLDCCellgroupResponseBodyCellGroupDisasterInfo setDisasterRecoveryState(String disasterRecoveryState) {
            this.disasterRecoveryState = disasterRecoveryState;
            return this;
        }
        public String getDisasterRecoveryState() {
            return this.disasterRecoveryState;
        }

        public GetLDCCellgroupResponseBodyCellGroupDisasterInfo setLocalFailoverTarget(String localFailoverTarget) {
            this.localFailoverTarget = localFailoverTarget;
            return this;
        }
        public String getLocalFailoverTarget() {
            return this.localFailoverTarget;
        }

        public GetLDCCellgroupResponseBodyCellGroupDisasterInfo setPressDisasterRecoveryState(String pressDisasterRecoveryState) {
            this.pressDisasterRecoveryState = pressDisasterRecoveryState;
            return this;
        }
        public String getPressDisasterRecoveryState() {
            return this.pressDisasterRecoveryState;
        }

        public GetLDCCellgroupResponseBodyCellGroupDisasterInfo setRemoteFailoverTarget(String remoteFailoverTarget) {
            this.remoteFailoverTarget = remoteFailoverTarget;
            return this;
        }
        public String getRemoteFailoverTarget() {
            return this.remoteFailoverTarget;
        }

        public GetLDCCellgroupResponseBodyCellGroupDisasterInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetLDCCellgroupResponseBodyCellGroupDisasterInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetLDCCellgroupResponseBodyCellGroup extends TeaModel {
        @NameInMap("Datacenter")
        public String datacenter;

        @NameInMap("DefaultGzone")
        public String defaultGzone;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Region")
        public String region;

        @NameInMap("Type")
        public String type;

        @NameInMap("Cells")
        public java.util.List<GetLDCCellgroupResponseBodyCellGroupCells> cells;

        @NameInMap("DisasterInfo")
        public java.util.List<GetLDCCellgroupResponseBodyCellGroupDisasterInfo> disasterInfo;

        public static GetLDCCellgroupResponseBodyCellGroup build(java.util.Map<String, ?> map) throws Exception {
            GetLDCCellgroupResponseBodyCellGroup self = new GetLDCCellgroupResponseBodyCellGroup();
            return TeaModel.build(map, self);
        }

        public GetLDCCellgroupResponseBodyCellGroup setDatacenter(String datacenter) {
            this.datacenter = datacenter;
            return this;
        }
        public String getDatacenter() {
            return this.datacenter;
        }

        public GetLDCCellgroupResponseBodyCellGroup setDefaultGzone(String defaultGzone) {
            this.defaultGzone = defaultGzone;
            return this;
        }
        public String getDefaultGzone() {
            return this.defaultGzone;
        }

        public GetLDCCellgroupResponseBodyCellGroup setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetLDCCellgroupResponseBodyCellGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCCellgroupResponseBodyCellGroup setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetLDCCellgroupResponseBodyCellGroup setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetLDCCellgroupResponseBodyCellGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLDCCellgroupResponseBodyCellGroup setCells(java.util.List<GetLDCCellgroupResponseBodyCellGroupCells> cells) {
            this.cells = cells;
            return this;
        }
        public java.util.List<GetLDCCellgroupResponseBodyCellGroupCells> getCells() {
            return this.cells;
        }

        public GetLDCCellgroupResponseBodyCellGroup setDisasterInfo(java.util.List<GetLDCCellgroupResponseBodyCellGroupDisasterInfo> disasterInfo) {
            this.disasterInfo = disasterInfo;
            return this;
        }
        public java.util.List<GetLDCCellgroupResponseBodyCellGroupDisasterInfo> getDisasterInfo() {
            return this.disasterInfo;
        }

    }

}
