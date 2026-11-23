// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class CreateEduProblemSolveShrinkRequest extends TeaModel {
    /**
     * <p><strong>The question image container.</strong></p>
     */
    @NameInMap("query")
    public String queryShrink;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019F593F-D6EE-5F44-819A-6CDA127D1637</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateEduProblemSolveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEduProblemSolveShrinkRequest self = new CreateEduProblemSolveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEduProblemSolveShrinkRequest setQueryShrink(String queryShrink) {
        this.queryShrink = queryShrink;
        return this;
    }
    public String getQueryShrink() {
        return this.queryShrink;
    }

    public CreateEduProblemSolveShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
