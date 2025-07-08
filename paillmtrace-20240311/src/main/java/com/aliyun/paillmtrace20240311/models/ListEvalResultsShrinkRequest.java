// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListEvalResultsShrinkRequest extends TeaModel {
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
    public String recordIdsShrink;

    public static ListEvalResultsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEvalResultsShrinkRequest self = new ListEvalResultsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListEvalResultsShrinkRequest setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }
    public String getEvaluationId() {
        return this.evaluationId;
    }

    public ListEvalResultsShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListEvalResultsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEvalResultsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEvalResultsShrinkRequest setRecordIdsShrink(String recordIdsShrink) {
        this.recordIdsShrink = recordIdsShrink;
        return this;
    }
    public String getRecordIdsShrink() {
        return this.recordIdsShrink;
    }

}
