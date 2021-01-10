// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCCellResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Cells")
    public java.util.List<ListLDCCellResponseBodyCells> cells;

    public static ListLDCCellResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLDCCellResponseBody self = new ListLDCCellResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLDCCellResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLDCCellResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLDCCellResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLDCCellResponseBody setCells(java.util.List<ListLDCCellResponseBodyCells> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<ListLDCCellResponseBodyCells> getCells() {
        return this.cells;
    }

    public static class ListLDCCellResponseBodyCells extends TeaModel {
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

        public static ListLDCCellResponseBodyCells build(java.util.Map<String, ?> map) throws Exception {
            ListLDCCellResponseBodyCells self = new ListLDCCellResponseBodyCells();
            return TeaModel.build(map, self);
        }

        public ListLDCCellResponseBodyCells setCellGroup(String cellGroup) {
            this.cellGroup = cellGroup;
            return this;
        }
        public String getCellGroup() {
            return this.cellGroup;
        }

        public ListLDCCellResponseBodyCells setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListLDCCellResponseBodyCells setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public ListLDCCellResponseBodyCells setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListLDCCellResponseBodyCells setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListLDCCellResponseBodyCells setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public ListLDCCellResponseBodyCells setIsGray(Boolean isGray) {
            this.isGray = isGray;
            return this;
        }
        public Boolean getIsGray() {
            return this.isGray;
        }

        public ListLDCCellResponseBodyCells setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCCellResponseBodyCells setPressWeight(Long pressWeight) {
            this.pressWeight = pressWeight;
            return this;
        }
        public Long getPressWeight() {
            return this.pressWeight;
        }

        public ListLDCCellResponseBodyCells setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLDCCellResponseBodyCells setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public ListLDCCellResponseBodyCells setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public ListLDCCellResponseBodyCells setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
