// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListOnlineEvalTaskResultsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0bb05ae8888c11ef9757faaa2a1ec0c6</p>
     */
    @NameInMap("EvaluationId")
    public String evaluationId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("MostRecentResultsOnly")
    public Boolean mostRecentResultsOnly;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TraceIds")
    public String traceIdsShrink;

    public static ListOnlineEvalTaskResultsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineEvalTaskResultsShrinkRequest self = new ListOnlineEvalTaskResultsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListOnlineEvalTaskResultsShrinkRequest setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }
    public String getEvaluationId() {
        return this.evaluationId;
    }

    public ListOnlineEvalTaskResultsShrinkRequest setMostRecentResultsOnly(Boolean mostRecentResultsOnly) {
        this.mostRecentResultsOnly = mostRecentResultsOnly;
        return this;
    }
    public Boolean getMostRecentResultsOnly() {
        return this.mostRecentResultsOnly;
    }

    public ListOnlineEvalTaskResultsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOnlineEvalTaskResultsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOnlineEvalTaskResultsShrinkRequest setTraceIdsShrink(String traceIdsShrink) {
        this.traceIdsShrink = traceIdsShrink;
        return this;
    }
    public String getTraceIdsShrink() {
        return this.traceIdsShrink;
    }

}
