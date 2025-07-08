// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListEvalResultsResponseBody extends TeaModel {
    /**
     * <p>The internal error code. This parameter is returned only when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>ExecutionFailure</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The evaluation results.</p>
     */
    @NameInMap("EvaluationResults")
    public java.util.List<String> evaluationResults;

    /**
     * <p>The error message. This parameter is returned only when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>cannot get data back.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the POP request.</p>
     * 
     * <strong>example:</strong>
     * <p>6A87228C-969A-1381-98CF-AE07AE630FA5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of results that meet the condition.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEvalResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEvalResultsResponseBody self = new ListEvalResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEvalResultsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEvalResultsResponseBody setEvaluationResults(java.util.List<String> evaluationResults) {
        this.evaluationResults = evaluationResults;
        return this;
    }
    public java.util.List<String> getEvaluationResults() {
        return this.evaluationResults;
    }

    public ListEvalResultsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEvalResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEvalResultsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
