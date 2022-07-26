// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetQosUsageStatisticRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("CurPageNum")
    public Integer curPageNum;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Month")
    public Long month;

    @NameInMap("NumPerPage")
    public Integer numPerPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static GetQosUsageStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQosUsageStatisticRequest self = new GetQosUsageStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetQosUsageStatisticRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetQosUsageStatisticRequest setCurPageNum(Integer curPageNum) {
        this.curPageNum = curPageNum;
        return this;
    }
    public Integer getCurPageNum() {
        return this.curPageNum;
    }

    public GetQosUsageStatisticRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetQosUsageStatisticRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetQosUsageStatisticRequest setMonth(Long month) {
        this.month = month;
        return this;
    }
    public Long getMonth() {
        return this.month;
    }

    public GetQosUsageStatisticRequest setNumPerPage(Integer numPerPage) {
        this.numPerPage = numPerPage;
        return this;
    }
    public Integer getNumPerPage() {
        return this.numPerPage;
    }

    public GetQosUsageStatisticRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQosUsageStatisticRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
