// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListEvalResultsRequest extends TeaModel {
    /**
     * <p>The task ID of the evaluation task to which the trace belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>0bb05ae2a2dc11ef9757faaa2a1ec0c6</p>
     */
    @NameInMap("EvaluationId")
    public String evaluationId;

    /**
     * <p>The keyword to query from the evaluation inputs.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number. Page starts from page 1. Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The trace data IDs.</p>
     */
    @NameInMap("RecordIds")
    public java.util.List<String> recordIds;

    public static ListEvalResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEvalResultsRequest self = new ListEvalResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListEvalResultsRequest setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }
    public String getEvaluationId() {
        return this.evaluationId;
    }

    public ListEvalResultsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListEvalResultsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEvalResultsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEvalResultsRequest setRecordIds(java.util.List<String> recordIds) {
        this.recordIds = recordIds;
        return this;
    }
    public java.util.List<String> getRecordIds() {
        return this.recordIds;
    }

}
