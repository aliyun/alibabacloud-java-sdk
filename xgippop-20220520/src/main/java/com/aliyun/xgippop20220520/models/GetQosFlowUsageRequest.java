// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetQosFlowUsageRequest extends TeaModel {
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

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Type")
    public Boolean type;

    public static GetQosFlowUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQosFlowUsageRequest self = new GetQosFlowUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetQosFlowUsageRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetQosFlowUsageRequest setCurPageNum(Integer curPageNum) {
        this.curPageNum = curPageNum;
        return this;
    }
    public Integer getCurPageNum() {
        return this.curPageNum;
    }

    public GetQosFlowUsageRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetQosFlowUsageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetQosFlowUsageRequest setMonth(Long month) {
        this.month = month;
        return this;
    }
    public Long getMonth() {
        return this.month;
    }

    public GetQosFlowUsageRequest setNumPerPage(Integer numPerPage) {
        this.numPerPage = numPerPage;
        return this;
    }
    public Integer getNumPerPage() {
        return this.numPerPage;
    }

    public GetQosFlowUsageRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetQosFlowUsageRequest setType(Boolean type) {
        this.type = type;
        return this;
    }
    public Boolean getType() {
        return this.type;
    }

}
