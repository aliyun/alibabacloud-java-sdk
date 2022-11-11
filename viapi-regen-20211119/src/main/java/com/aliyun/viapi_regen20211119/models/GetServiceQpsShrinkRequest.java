// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetServiceQpsShrinkRequest extends TeaModel {
    @NameInMap("CallerParentIdList")
    public String callerParentIdListShrink;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Id")
    public Long id;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetServiceQpsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceQpsShrinkRequest self = new GetServiceQpsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceQpsShrinkRequest setCallerParentIdListShrink(String callerParentIdListShrink) {
        this.callerParentIdListShrink = callerParentIdListShrink;
        return this;
    }
    public String getCallerParentIdListShrink() {
        return this.callerParentIdListShrink;
    }

    public GetServiceQpsShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetServiceQpsShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetServiceQpsShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
