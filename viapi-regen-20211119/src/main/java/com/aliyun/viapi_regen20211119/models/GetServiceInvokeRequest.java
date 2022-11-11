// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetServiceInvokeRequest extends TeaModel {
    @NameInMap("CallerParentIdList")
    public java.util.List<String> callerParentIdList;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Id")
    public Long id;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetServiceInvokeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInvokeRequest self = new GetServiceInvokeRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceInvokeRequest setCallerParentIdList(java.util.List<String> callerParentIdList) {
        this.callerParentIdList = callerParentIdList;
        return this;
    }
    public java.util.List<String> getCallerParentIdList() {
        return this.callerParentIdList;
    }

    public GetServiceInvokeRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetServiceInvokeRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetServiceInvokeRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
