// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetServiceQpsRequest extends TeaModel {
    @NameInMap("CallerParentIdList")
    public java.util.List<String> callerParentIdList;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Id")
    public Long id;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetServiceQpsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceQpsRequest self = new GetServiceQpsRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceQpsRequest setCallerParentIdList(java.util.List<String> callerParentIdList) {
        this.callerParentIdList = callerParentIdList;
        return this;
    }
    public java.util.List<String> getCallerParentIdList() {
        return this.callerParentIdList;
    }

    public GetServiceQpsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetServiceQpsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetServiceQpsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
