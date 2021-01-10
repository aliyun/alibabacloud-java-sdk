// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeLinktWorkitemreviewRequest extends TeaModel {
    @NameInMap("WorkItemReviewId")
    public String workItemReviewId;

    public static CancelLinkeLinktWorkitemreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeLinktWorkitemreviewRequest self = new CancelLinkeLinktWorkitemreviewRequest();
        return TeaModel.build(map, self);
    }

    public CancelLinkeLinktWorkitemreviewRequest setWorkItemReviewId(String workItemReviewId) {
        this.workItemReviewId = workItemReviewId;
        return this;
    }
    public String getWorkItemReviewId() {
        return this.workItemReviewId;
    }

}
