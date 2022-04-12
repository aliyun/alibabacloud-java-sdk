// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobDetailRecordShrinkRequest extends TeaModel {
    @NameInMap("JobTaskDetailPaginatedQuery")
    public String jobTaskDetailPaginatedQueryShrink;

    @NameInMap("SaasId")
    public String saasId;

    @NameInMap("UserProfile")
    public String userProfileShrink;

    public static QueryOutboundJobDetailRecordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobDetailRecordShrinkRequest self = new QueryOutboundJobDetailRecordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobDetailRecordShrinkRequest setJobTaskDetailPaginatedQueryShrink(String jobTaskDetailPaginatedQueryShrink) {
        this.jobTaskDetailPaginatedQueryShrink = jobTaskDetailPaginatedQueryShrink;
        return this;
    }
    public String getJobTaskDetailPaginatedQueryShrink() {
        return this.jobTaskDetailPaginatedQueryShrink;
    }

    public QueryOutboundJobDetailRecordShrinkRequest setSaasId(String saasId) {
        this.saasId = saasId;
        return this;
    }
    public String getSaasId() {
        return this.saasId;
    }

    public QueryOutboundJobDetailRecordShrinkRequest setUserProfileShrink(String userProfileShrink) {
        this.userProfileShrink = userProfileShrink;
        return this;
    }
    public String getUserProfileShrink() {
        return this.userProfileShrink;
    }

}
