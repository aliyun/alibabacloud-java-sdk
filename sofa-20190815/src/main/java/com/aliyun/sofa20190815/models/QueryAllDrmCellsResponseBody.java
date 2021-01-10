// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAllDrmCellsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Cells")
    public java.util.List<String> cells;

    public static QueryAllDrmCellsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAllDrmCellsResponseBody self = new QueryAllDrmCellsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAllDrmCellsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAllDrmCellsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAllDrmCellsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryAllDrmCellsResponseBody setCells(java.util.List<String> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<String> getCells() {
        return this.cells;
    }

}
