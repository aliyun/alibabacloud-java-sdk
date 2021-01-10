// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCCellgroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CellGroupList")
    public java.util.List<ListLDCCellgroupResponseBodyCellGroupList> cellGroupList;

    public static ListLDCCellgroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLDCCellgroupResponseBody self = new ListLDCCellgroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLDCCellgroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLDCCellgroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLDCCellgroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLDCCellgroupResponseBody setCellGroupList(java.util.List<ListLDCCellgroupResponseBodyCellGroupList> cellGroupList) {
        this.cellGroupList = cellGroupList;
        return this;
    }
    public java.util.List<ListLDCCellgroupResponseBodyCellGroupList> getCellGroupList() {
        return this.cellGroupList;
    }

    public static class ListLDCCellgroupResponseBodyCellGroupListCells extends TeaModel {
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

        public static ListLDCCellgroupResponseBodyCellGroupListCells build(java.util.Map<String, ?> map) throws Exception {
            ListLDCCellgroupResponseBodyCellGroupListCells self = new ListLDCCellgroupResponseBodyCellGroupListCells();
            return TeaModel.build(map, self);
        }

        public ListLDCCellgroupResponseBodyCellGroupListCells setCellGroup(String cellGroup) {
            this.cellGroup = cellGroup;
            return this;
        }
        public String getCellGroup() {
            return this.cellGroup;
        }

        public ListLDCCellgroupResponseBodyCellGroupListCells setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListLDCCellgroupResponseBodyCellGroupListCells setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public ListLDCCellgroupResponseBodyCellGroupListCells setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListLDCCellgroupResponseBodyCellGroupListCells setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListLDCCellgroupResponseBodyCellGroupListCells setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public ListLDCCellgroupResponseBodyCellGroupListCells setIsGray(Boolean isGray) {
            this.isGray = isGray;
            return this;
        }
        public Boolean getIsGray() {
            return this.isGray;
        }

        public ListLDCCellgroupResponseBodyCellGroupListCells setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCCellgroupResponseBodyCellGroupListCells setPressWeight(Long pressWeight) {
            this.pressWeight = pressWeight;
            return this;
        }
        public Long getPressWeight() {
            return this.pressWeight;
        }

        public ListLDCCellgroupResponseBodyCellGroupListCells setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLDCCellgroupResponseBodyCellGroupListCells setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public ListLDCCellgroupResponseBodyCellGroupListCells setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public ListLDCCellgroupResponseBodyCellGroupListCells setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

    public static class ListLDCCellgroupResponseBodyCellGroupListDisasterInfo extends TeaModel {
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

        public static ListLDCCellgroupResponseBodyCellGroupListDisasterInfo build(java.util.Map<String, ?> map) throws Exception {
            ListLDCCellgroupResponseBodyCellGroupListDisasterInfo self = new ListLDCCellgroupResponseBodyCellGroupListDisasterInfo();
            return TeaModel.build(map, self);
        }

        public ListLDCCellgroupResponseBodyCellGroupListDisasterInfo setDisasterRecoveryState(String disasterRecoveryState) {
            this.disasterRecoveryState = disasterRecoveryState;
            return this;
        }
        public String getDisasterRecoveryState() {
            return this.disasterRecoveryState;
        }

        public ListLDCCellgroupResponseBodyCellGroupListDisasterInfo setLocalFailoverTarget(String localFailoverTarget) {
            this.localFailoverTarget = localFailoverTarget;
            return this;
        }
        public String getLocalFailoverTarget() {
            return this.localFailoverTarget;
        }

        public ListLDCCellgroupResponseBodyCellGroupListDisasterInfo setPressDisasterRecoveryState(String pressDisasterRecoveryState) {
            this.pressDisasterRecoveryState = pressDisasterRecoveryState;
            return this;
        }
        public String getPressDisasterRecoveryState() {
            return this.pressDisasterRecoveryState;
        }

        public ListLDCCellgroupResponseBodyCellGroupListDisasterInfo setRemoteFailoverTarget(String remoteFailoverTarget) {
            this.remoteFailoverTarget = remoteFailoverTarget;
            return this;
        }
        public String getRemoteFailoverTarget() {
            return this.remoteFailoverTarget;
        }

        public ListLDCCellgroupResponseBodyCellGroupListDisasterInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListLDCCellgroupResponseBodyCellGroupListDisasterInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListLDCCellgroupResponseBodyCellGroupList extends TeaModel {
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
        public java.util.List<ListLDCCellgroupResponseBodyCellGroupListCells> cells;

        @NameInMap("DisasterInfo")
        public java.util.List<ListLDCCellgroupResponseBodyCellGroupListDisasterInfo> disasterInfo;

        public static ListLDCCellgroupResponseBodyCellGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListLDCCellgroupResponseBodyCellGroupList self = new ListLDCCellgroupResponseBodyCellGroupList();
            return TeaModel.build(map, self);
        }

        public ListLDCCellgroupResponseBodyCellGroupList setDatacenter(String datacenter) {
            this.datacenter = datacenter;
            return this;
        }
        public String getDatacenter() {
            return this.datacenter;
        }

        public ListLDCCellgroupResponseBodyCellGroupList setDefaultGzone(String defaultGzone) {
            this.defaultGzone = defaultGzone;
            return this;
        }
        public String getDefaultGzone() {
            return this.defaultGzone;
        }

        public ListLDCCellgroupResponseBodyCellGroupList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListLDCCellgroupResponseBodyCellGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCCellgroupResponseBodyCellGroupList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListLDCCellgroupResponseBodyCellGroupList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListLDCCellgroupResponseBodyCellGroupList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLDCCellgroupResponseBodyCellGroupList setCells(java.util.List<ListLDCCellgroupResponseBodyCellGroupListCells> cells) {
            this.cells = cells;
            return this;
        }
        public java.util.List<ListLDCCellgroupResponseBodyCellGroupListCells> getCells() {
            return this.cells;
        }

        public ListLDCCellgroupResponseBodyCellGroupList setDisasterInfo(java.util.List<ListLDCCellgroupResponseBodyCellGroupListDisasterInfo> disasterInfo) {
            this.disasterInfo = disasterInfo;
            return this;
        }
        public java.util.List<ListLDCCellgroupResponseBodyCellGroupListDisasterInfo> getDisasterInfo() {
            return this.disasterInfo;
        }

    }

}
