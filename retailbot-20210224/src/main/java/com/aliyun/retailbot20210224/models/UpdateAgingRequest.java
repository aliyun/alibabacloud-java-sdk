// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateAgingRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Name")
    public String name;

    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TimeDay")
    public String timeDay;

    @NameInMap("Type")
    public String type;

    public static UpdateAgingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgingRequest self = new UpdateAgingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgingRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public UpdateAgingRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateAgingRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UpdateAgingRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAgingRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public UpdateAgingRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public UpdateAgingRequest setTimeDay(String timeDay) {
        this.timeDay = timeDay;
        return this;
    }
    public String getTimeDay() {
        return this.timeDay;
    }

    public UpdateAgingRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
