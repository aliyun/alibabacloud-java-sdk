// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCWorkspacegroupTopologyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Name")
    public String name;

    @NameInMap("CellGroups")
    public java.util.List<GetLDCWorkspacegroupTopologyResponseBodyCellGroups> cellGroups;

    @NameInMap("Zones")
    public java.util.List<GetLDCWorkspacegroupTopologyResponseBodyZones> zones;

    public static GetLDCWorkspacegroupTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLDCWorkspacegroupTopologyResponseBody self = new GetLDCWorkspacegroupTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLDCWorkspacegroupTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLDCWorkspacegroupTopologyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLDCWorkspacegroupTopologyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLDCWorkspacegroupTopologyResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLDCWorkspacegroupTopologyResponseBody setCellGroups(java.util.List<GetLDCWorkspacegroupTopologyResponseBodyCellGroups> cellGroups) {
        this.cellGroups = cellGroups;
        return this;
    }
    public java.util.List<GetLDCWorkspacegroupTopologyResponseBodyCellGroups> getCellGroups() {
        return this.cellGroups;
    }

    public GetLDCWorkspacegroupTopologyResponseBody setZones(java.util.List<GetLDCWorkspacegroupTopologyResponseBodyZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<GetLDCWorkspacegroupTopologyResponseBodyZones> getZones() {
        return this.zones;
    }

    public static class GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells extends TeaModel {
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

        public static GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells build(java.util.Map<String, ?> map) throws Exception {
            GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells self = new GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells();
            return TeaModel.build(map, self);
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells setCellGroup(String cellGroup) {
            this.cellGroup = cellGroup;
            return this;
        }
        public String getCellGroup() {
            return this.cellGroup;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells setIsGray(Boolean isGray) {
            this.isGray = isGray;
            return this;
        }
        public Boolean getIsGray() {
            return this.isGray;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells setPressWeight(Long pressWeight) {
            this.pressWeight = pressWeight;
            return this;
        }
        public Long getPressWeight() {
            return this.pressWeight;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class GetLDCWorkspacegroupTopologyResponseBodyCellGroupsDisasterInfo extends TeaModel {
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

        public static GetLDCWorkspacegroupTopologyResponseBodyCellGroupsDisasterInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLDCWorkspacegroupTopologyResponseBodyCellGroupsDisasterInfo self = new GetLDCWorkspacegroupTopologyResponseBodyCellGroupsDisasterInfo();
            return TeaModel.build(map, self);
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsDisasterInfo setDisasterRecoveryState(String disasterRecoveryState) {
            this.disasterRecoveryState = disasterRecoveryState;
            return this;
        }
        public String getDisasterRecoveryState() {
            return this.disasterRecoveryState;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsDisasterInfo setLocalFailoverTarget(String localFailoverTarget) {
            this.localFailoverTarget = localFailoverTarget;
            return this;
        }
        public String getLocalFailoverTarget() {
            return this.localFailoverTarget;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsDisasterInfo setPressDisasterRecoveryState(String pressDisasterRecoveryState) {
            this.pressDisasterRecoveryState = pressDisasterRecoveryState;
            return this;
        }
        public String getPressDisasterRecoveryState() {
            return this.pressDisasterRecoveryState;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsDisasterInfo setRemoteFailoverTarget(String remoteFailoverTarget) {
            this.remoteFailoverTarget = remoteFailoverTarget;
            return this;
        }
        public String getRemoteFailoverTarget() {
            return this.remoteFailoverTarget;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsDisasterInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroupsDisasterInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetLDCWorkspacegroupTopologyResponseBodyCellGroups extends TeaModel {
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
        public java.util.List<GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells> cells;

        @NameInMap("DisasterInfo")
        public java.util.List<GetLDCWorkspacegroupTopologyResponseBodyCellGroupsDisasterInfo> disasterInfo;

        public static GetLDCWorkspacegroupTopologyResponseBodyCellGroups build(java.util.Map<String, ?> map) throws Exception {
            GetLDCWorkspacegroupTopologyResponseBodyCellGroups self = new GetLDCWorkspacegroupTopologyResponseBodyCellGroups();
            return TeaModel.build(map, self);
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroups setDatacenter(String datacenter) {
            this.datacenter = datacenter;
            return this;
        }
        public String getDatacenter() {
            return this.datacenter;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroups setDefaultGzone(String defaultGzone) {
            this.defaultGzone = defaultGzone;
            return this;
        }
        public String getDefaultGzone() {
            return this.defaultGzone;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroups setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroups setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroups setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroups setCells(java.util.List<GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells> cells) {
            this.cells = cells;
            return this;
        }
        public java.util.List<GetLDCWorkspacegroupTopologyResponseBodyCellGroupsCells> getCells() {
            return this.cells;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyCellGroups setDisasterInfo(java.util.List<GetLDCWorkspacegroupTopologyResponseBodyCellGroupsDisasterInfo> disasterInfo) {
            this.disasterInfo = disasterInfo;
            return this;
        }
        public java.util.List<GetLDCWorkspacegroupTopologyResponseBodyCellGroupsDisasterInfo> getDisasterInfo() {
            return this.disasterInfo;
        }

    }

    public static class GetLDCWorkspacegroupTopologyResponseBodyZones extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Region")
        public String region;

        public static GetLDCWorkspacegroupTopologyResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            GetLDCWorkspacegroupTopologyResponseBodyZones self = new GetLDCWorkspacegroupTopologyResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public GetLDCWorkspacegroupTopologyResponseBodyZones setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyZones setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyZones setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCWorkspacegroupTopologyResponseBodyZones setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
