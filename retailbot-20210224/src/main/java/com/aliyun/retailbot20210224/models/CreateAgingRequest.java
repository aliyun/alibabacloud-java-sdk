// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateAgingRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

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

    public static CreateAgingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgingRequest self = new CreateAgingRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgingRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateAgingRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateAgingRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAgingRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public CreateAgingRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateAgingRequest setTimeDay(String timeDay) {
        this.timeDay = timeDay;
        return this;
    }
    public String getTimeDay() {
        return this.timeDay;
    }

    public CreateAgingRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
