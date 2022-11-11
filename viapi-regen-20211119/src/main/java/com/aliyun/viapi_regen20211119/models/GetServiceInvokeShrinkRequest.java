// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetServiceInvokeShrinkRequest extends TeaModel {
    @NameInMap("CallerParentIdList")
    public String callerParentIdListShrink;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Id")
    public Long id;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetServiceInvokeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInvokeShrinkRequest self = new GetServiceInvokeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceInvokeShrinkRequest setCallerParentIdListShrink(String callerParentIdListShrink) {
        this.callerParentIdListShrink = callerParentIdListShrink;
        return this;
    }
    public String getCallerParentIdListShrink() {
        return this.callerParentIdListShrink;
    }

    public GetServiceInvokeShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetServiceInvokeShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetServiceInvokeShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
