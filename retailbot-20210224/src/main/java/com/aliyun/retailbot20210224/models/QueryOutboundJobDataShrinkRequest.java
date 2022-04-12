// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobDataShrinkRequest extends TeaModel {
    // 结束时间 yyyyMMddHHmmss
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("SaasId")
    public String saasId;

    // 开始时间 yyyyMMddHHmmss
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("UserProfile")
    public String userProfileShrink;

    public static QueryOutboundJobDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobDataShrinkRequest self = new QueryOutboundJobDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobDataShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryOutboundJobDataShrinkRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public QueryOutboundJobDataShrinkRequest setSaasId(String saasId) {
        this.saasId = saasId;
        return this;
    }
    public String getSaasId() {
        return this.saasId;
    }

    public QueryOutboundJobDataShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryOutboundJobDataShrinkRequest setUserProfileShrink(String userProfileShrink) {
        this.userProfileShrink = userProfileShrink;
        return this;
    }
    public String getUserProfileShrink() {
        return this.userProfileShrink;
    }

}
