// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QuerySofamqCellByCellTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QuerySofamqCellByCellTypeResponseBodyData> data;

    public static QuerySofamqCellByCellTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqCellByCellTypeResponseBody self = new QuerySofamqCellByCellTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySofamqCellByCellTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySofamqCellByCellTypeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqCellByCellTypeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QuerySofamqCellByCellTypeResponseBody setData(java.util.List<QuerySofamqCellByCellTypeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySofamqCellByCellTypeResponseBodyData> getData() {
        return this.data;
    }

    public static class QuerySofamqCellByCellTypeResponseBodyData extends TeaModel {
        @NameInMap("CellType")
        public String cellType;

        @NameInMap("Data")
        public java.util.List<String> data;

        public static QuerySofamqCellByCellTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySofamqCellByCellTypeResponseBodyData self = new QuerySofamqCellByCellTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySofamqCellByCellTypeResponseBodyData setCellType(String cellType) {
            this.cellType = cellType;
            return this;
        }
        public String getCellType() {
            return this.cellType;
        }

        public QuerySofamqCellByCellTypeResponseBodyData setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

}
