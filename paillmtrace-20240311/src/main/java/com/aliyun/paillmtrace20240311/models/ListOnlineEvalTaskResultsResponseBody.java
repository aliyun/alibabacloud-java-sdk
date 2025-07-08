// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListOnlineEvalTaskResultsResponseBody extends TeaModel {
    /**
     * <p>Internal error code. Set only when the response has an error.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidInputParams</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>List of evaluation results.</p>
     */
    @NameInMap("EvaluationResults")
    public java.util.List<String> evaluationResults;

    /**
     * <p>Response error message. Set only when the response has an error.</p>
     * 
     * <strong>example:</strong>
     * <p>must provide trace_id(s) or eval_id</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>22BA9A5A-E3D8-5B4C-90FC-F33F6E5853F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of evaluation results that meet the criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOnlineEvalTaskResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineEvalTaskResultsResponseBody self = new ListOnlineEvalTaskResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOnlineEvalTaskResultsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOnlineEvalTaskResultsResponseBody setEvaluationResults(java.util.List<String> evaluationResults) {
        this.evaluationResults = evaluationResults;
        return this;
    }
    public java.util.List<String> getEvaluationResults() {
        return this.evaluationResults;
    }

    public ListOnlineEvalTaskResultsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOnlineEvalTaskResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOnlineEvalTaskResultsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
