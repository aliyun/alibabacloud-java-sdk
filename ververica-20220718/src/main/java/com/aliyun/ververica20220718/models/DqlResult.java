// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DqlResult extends TeaModel {
    @NameInMap("statementIndex")
    public Integer statementIndex;

    @NameInMap("submitPreviewResult")
    public SubmitPreviewResult submitPreviewResult;

    @NameInMap("tableResults")
    public java.util.List<TableResult> tableResults;

    public static DqlResult build(java.util.Map<String, ?> map) throws Exception {
        DqlResult self = new DqlResult();
        return TeaModel.build(map, self);
    }

    public DqlResult setStatementIndex(Integer statementIndex) {
        this.statementIndex = statementIndex;
        return this;
    }
    public Integer getStatementIndex() {
        return this.statementIndex;
    }

    public DqlResult setSubmitPreviewResult(SubmitPreviewResult submitPreviewResult) {
        this.submitPreviewResult = submitPreviewResult;
        return this;
    }
    public SubmitPreviewResult getSubmitPreviewResult() {
        return this.submitPreviewResult;
    }

    public DqlResult setTableResults(java.util.List<TableResult> tableResults) {
        this.tableResults = tableResults;
        return this;
    }
    public java.util.List<TableResult> getTableResults() {
        return this.tableResults;
    }

}
