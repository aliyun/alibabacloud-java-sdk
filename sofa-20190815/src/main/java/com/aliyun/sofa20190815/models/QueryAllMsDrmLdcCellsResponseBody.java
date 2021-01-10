// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAllMsDrmLdcCellsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("IsLdc")
    public Boolean isLdc;

    @NameInMap("OldCells")
    public java.util.List<String> oldCells;

    @NameInMap("NewCells")
    public java.util.List<QueryAllMsDrmLdcCellsResponseBodyNewCells> newCells;

    public static QueryAllMsDrmLdcCellsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAllMsDrmLdcCellsResponseBody self = new QueryAllMsDrmLdcCellsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAllMsDrmLdcCellsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAllMsDrmLdcCellsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAllMsDrmLdcCellsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryAllMsDrmLdcCellsResponseBody setIsLdc(Boolean isLdc) {
        this.isLdc = isLdc;
        return this;
    }
    public Boolean getIsLdc() {
        return this.isLdc;
    }

    public QueryAllMsDrmLdcCellsResponseBody setOldCells(java.util.List<String> oldCells) {
        this.oldCells = oldCells;
        return this;
    }
    public java.util.List<String> getOldCells() {
        return this.oldCells;
    }

    public QueryAllMsDrmLdcCellsResponseBody setNewCells(java.util.List<QueryAllMsDrmLdcCellsResponseBodyNewCells> newCells) {
        this.newCells = newCells;
        return this;
    }
    public java.util.List<QueryAllMsDrmLdcCellsResponseBodyNewCells> getNewCells() {
        return this.newCells;
    }

    public static class QueryAllMsDrmLdcCellsResponseBodyNewCells extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static QueryAllMsDrmLdcCellsResponseBodyNewCells build(java.util.Map<String, ?> map) throws Exception {
            QueryAllMsDrmLdcCellsResponseBodyNewCells self = new QueryAllMsDrmLdcCellsResponseBodyNewCells();
            return TeaModel.build(map, self);
        }

        public QueryAllMsDrmLdcCellsResponseBodyNewCells setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAllMsDrmLdcCellsResponseBodyNewCells setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
