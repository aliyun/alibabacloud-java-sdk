// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListOnlineEvalTaskResultsRequest extends TeaModel {
    /**
     * <p>The ID of the evaluation task. At least one of the trace ID or task ID must be set.</p>
     * 
     * <strong>example:</strong>
     * <p>0bb05ae8888c11ef9757faaa2a1ec0c6</p>
     */
    @NameInMap("EvaluationId")
    public String evaluationId;

    /**
     * <p>The same trace data may have been evaluated by different tasks. If no task ID is specified and there are multiple evaluation results for the same trace ID, this parameter specifies whether to return only the most recent evaluation result.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("MostRecentResultsOnly")
    public Boolean mostRecentResultsOnly;

    /**
     * <p>The current page number. Value range: integers greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, default is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specify a set of trace IDs, and only return the evaluation results for these traces. At least one of the trace ID or task ID must be set.</p>
     */
    @NameInMap("TraceIds")
    public java.util.List<String> traceIds;

    public static ListOnlineEvalTaskResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineEvalTaskResultsRequest self = new ListOnlineEvalTaskResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListOnlineEvalTaskResultsRequest setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }
    public String getEvaluationId() {
        return this.evaluationId;
    }

    public ListOnlineEvalTaskResultsRequest setMostRecentResultsOnly(Boolean mostRecentResultsOnly) {
        this.mostRecentResultsOnly = mostRecentResultsOnly;
        return this;
    }
    public Boolean getMostRecentResultsOnly() {
        return this.mostRecentResultsOnly;
    }

    public ListOnlineEvalTaskResultsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOnlineEvalTaskResultsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOnlineEvalTaskResultsRequest setTraceIds(java.util.List<String> traceIds) {
        this.traceIds = traceIds;
        return this;
    }
    public java.util.List<String> getTraceIds() {
        return this.traceIds;
    }

}
