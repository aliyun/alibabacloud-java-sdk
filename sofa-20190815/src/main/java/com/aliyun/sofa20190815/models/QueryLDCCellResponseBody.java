// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCCellResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CellList")
    public java.util.List<QueryLDCCellResponseBodyCellList> cellList;

    public static QueryLDCCellResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCCellResponseBody self = new QueryLDCCellResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLDCCellResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLDCCellResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLDCCellResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLDCCellResponseBody setCellList(java.util.List<QueryLDCCellResponseBodyCellList> cellList) {
        this.cellList = cellList;
        return this;
    }
    public java.util.List<QueryLDCCellResponseBodyCellList> getCellList() {
        return this.cellList;
    }

    public static class QueryLDCCellResponseBodyCellList extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        public static QueryLDCCellResponseBodyCellList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCCellResponseBodyCellList self = new QueryLDCCellResponseBodyCellList();
            return TeaModel.build(map, self);
        }

        public QueryLDCCellResponseBodyCellList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

}
