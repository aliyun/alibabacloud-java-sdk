// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCCellResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Cell")
    public GetLDCCellResponseBodyCell cell;

    public static GetLDCCellResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLDCCellResponseBody self = new GetLDCCellResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLDCCellResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLDCCellResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLDCCellResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLDCCellResponseBody setCell(GetLDCCellResponseBodyCell cell) {
        this.cell = cell;
        return this;
    }
    public GetLDCCellResponseBodyCell getCell() {
        return this.cell;
    }

    public static class GetLDCCellResponseBodyCell extends TeaModel {
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

        public static GetLDCCellResponseBodyCell build(java.util.Map<String, ?> map) throws Exception {
            GetLDCCellResponseBodyCell self = new GetLDCCellResponseBodyCell();
            return TeaModel.build(map, self);
        }

        public GetLDCCellResponseBodyCell setCellGroup(String cellGroup) {
            this.cellGroup = cellGroup;
            return this;
        }
        public String getCellGroup() {
            return this.cellGroup;
        }

        public GetLDCCellResponseBodyCell setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetLDCCellResponseBodyCell setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public GetLDCCellResponseBodyCell setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetLDCCellResponseBodyCell setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetLDCCellResponseBodyCell setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public GetLDCCellResponseBodyCell setIsGray(Boolean isGray) {
            this.isGray = isGray;
            return this;
        }
        public Boolean getIsGray() {
            return this.isGray;
        }

        public GetLDCCellResponseBodyCell setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCCellResponseBodyCell setPressWeight(Long pressWeight) {
            this.pressWeight = pressWeight;
            return this;
        }
        public Long getPressWeight() {
            return this.pressWeight;
        }

        public GetLDCCellResponseBodyCell setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLDCCellResponseBodyCell setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public GetLDCCellResponseBodyCell setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public GetLDCCellResponseBodyCell setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
