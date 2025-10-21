// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class FetchResult extends TeaModel {
    @NameInMap("resultMessage")
    public String resultMessage;

    @NameInMap("resultType")
    public String resultType;

    @NameInMap("tableResults")
    public java.util.List<TableResult> tableResults;

    public static FetchResult build(java.util.Map<String, ?> map) throws Exception {
        FetchResult self = new FetchResult();
        return TeaModel.build(map, self);
    }

    public FetchResult setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public FetchResult setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public FetchResult setTableResults(java.util.List<TableResult> tableResults) {
        this.tableResults = tableResults;
        return this;
    }
    public java.util.List<TableResult> getTableResults() {
        return this.tableResults;
    }

}
