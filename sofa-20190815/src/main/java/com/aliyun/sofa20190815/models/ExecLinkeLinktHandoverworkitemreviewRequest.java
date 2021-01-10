// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktHandoverworkitemreviewRequest extends TeaModel {
    @NameInMap("Reviewer")
    public String reviewer;

    @NameInMap("WorkItemReviewId")
    public String workItemReviewId;

    public static ExecLinkeLinktHandoverworkitemreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktHandoverworkitemreviewRequest self = new ExecLinkeLinktHandoverworkitemreviewRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktHandoverworkitemreviewRequest setReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }
    public String getReviewer() {
        return this.reviewer;
    }

    public ExecLinkeLinktHandoverworkitemreviewRequest setWorkItemReviewId(String workItemReviewId) {
        this.workItemReviewId = workItemReviewId;
        return this;
    }
    public String getWorkItemReviewId() {
        return this.workItemReviewId;
    }

}
