// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListOnlineEvalTaskResultsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidInputParams</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("EvaluationResults")
    public java.util.List<String> evaluationResults;

    /**
     * <strong>example:</strong>
     * <p>must provide trace_id(s) or eval_id</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>22BA9A5A-E3D8-5B4C-90FC-F33F6E5853F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
