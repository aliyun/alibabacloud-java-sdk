// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobDataRequest extends TeaModel {
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

    public static QueryOutboundJobDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobDataRequest self = new QueryOutboundJobDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryOutboundJobDataRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public QueryOutboundJobDataRequest setSaasId(String saasId) {
        this.saasId = saasId;
        return this;
    }
    public String getSaasId() {
        return this.saasId;
    }

    public QueryOutboundJobDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
