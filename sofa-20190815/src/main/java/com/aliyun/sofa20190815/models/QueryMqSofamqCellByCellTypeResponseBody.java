// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqCellByCellTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryMqSofamqCellByCellTypeResponseBodyData> data;

    public static QueryMqSofamqCellByCellTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqCellByCellTypeResponseBody self = new QueryMqSofamqCellByCellTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqCellByCellTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqSofamqCellByCellTypeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMqSofamqCellByCellTypeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMqSofamqCellByCellTypeResponseBody setData(java.util.List<QueryMqSofamqCellByCellTypeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryMqSofamqCellByCellTypeResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryMqSofamqCellByCellTypeResponseBodyData extends TeaModel {
        @NameInMap("CellType")
        public String cellType;

        @NameInMap("Data")
        public java.util.List<String> data;

        public static QueryMqSofamqCellByCellTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqCellByCellTypeResponseBodyData self = new QueryMqSofamqCellByCellTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqCellByCellTypeResponseBodyData setCellType(String cellType) {
            this.cellType = cellType;
            return this;
        }
        public String getCellType() {
            return this.cellType;
        }

        public QueryMqSofamqCellByCellTypeResponseBodyData setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

}
