// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStrategyRequest extends TeaModel {
    @NameInMap("CustomType")
    public String customType;

    @NameInMap("CycleDays")
    public String cycleDays;

    @NameInMap("CycleStartTime")
    public String cycleStartTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("RiskCustomParams")
    public String riskCustomParams;

    @NameInMap("RiskSubTypeName")
    public String riskSubTypeName;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TargetType")
    public String targetType;

    public static ModifyStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStrategyRequest self = new ModifyStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStrategyRequest setCustomType(String customType) {
        this.customType = customType;
        return this;
    }
    public String getCustomType() {
        return this.customType;
    }

    public ModifyStrategyRequest setCycleDays(String cycleDays) {
        this.cycleDays = cycleDays;
        return this;
    }
    public String getCycleDays() {
        return this.cycleDays;
    }

    public ModifyStrategyRequest setCycleStartTime(String cycleStartTime) {
        this.cycleStartTime = cycleStartTime;
        return this;
    }
    public String getCycleStartTime() {
        return this.cycleStartTime;
    }

    public ModifyStrategyRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModifyStrategyRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyStrategyRequest setRiskCustomParams(String riskCustomParams) {
        this.riskCustomParams = riskCustomParams;
        return this;
    }
    public String getRiskCustomParams() {
        return this.riskCustomParams;
    }

    public ModifyStrategyRequest setRiskSubTypeName(String riskSubTypeName) {
        this.riskSubTypeName = riskSubTypeName;
        return this;
    }
    public String getRiskSubTypeName() {
        return this.riskSubTypeName;
    }

    public ModifyStrategyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyStrategyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ModifyStrategyRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
