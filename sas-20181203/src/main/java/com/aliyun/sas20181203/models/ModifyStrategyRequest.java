// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStrategyRequest extends TeaModel {
    // The type of the baseline check policy. Valid values:
    // 
    // *   **custom**: a custom baseline check policy
    // *   **common**: a standard baseline check policy
    @NameInMap("CustomType")
    public String customType;

    // The new interval of the baseline check. Valid values:
    // 
    // *   **1**: every 2 days
    // *   **3**: every 4 days
    // *   **7**: every 8 days
    // *   **30**: every 31 days
    @NameInMap("CycleDays")
    public String cycleDays;

    // The new time range during which the baseline check starts. Valid values:
    // 
    // *   **0**: The baseline check starts within the time range from 00:00 to 06:00.
    // *   **6**: The baseline check starts within the time range from 06:00 to 12:00.
    // *   **12**: The baseline check starts within the time range from 12:00 to 18:00.
    // *   **18**: The baseline check starts within the time range from 18:00 to 24:00.
    // 
    // >  This parameter is deprecated.
    @NameInMap("CycleStartTime")
    public String cycleStartTime;

    // The time when the baseline check based on the baseline check policy ends.
    @NameInMap("EndTime")
    public String endTime;

    // The ID of the baseline check policy.
    @NameInMap("Id")
    public String id;

    // The new name of the baseline check policy.
    @NameInMap("Name")
    public String name;

    // The custom configurations of the baseline. The value of this parameter is in the JSON format and contains the following fields:
    // 
    // *   **typeName**: the name of the baseline.
    // 
    // *   **checkDetails**: the details of the baseline. The value is in the JSON format.
    // 
    //     *   **checkId**: the ID of the check item.
    // 
    //     *   **rules**: the rule configurations. The value is in the JSON format.
    // 
    //         *   **ruleId**: the ID of the rule.
    // 
    //         *   **paramList**: the list of parameters in the rule. The value is in the JSON format.
    // 
    //             *   **paramName**: the name of the parameter.
    //             *   **value**: the value of the parameter.
    @NameInMap("RiskCustomParams")
    public String riskCustomParams;

    // The subtype of the baselines. You can call the [DescribeRiskType](~~DescribeRiskType~~) operation to query the subtypes of baselines.
    @NameInMap("RiskSubTypeName")
    public String riskSubTypeName;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The time when the baseline check based on the baseline check policy starts.
    @NameInMap("StartTime")
    public String startTime;

    // The method that is used to apply the baseline check policy. Valid values:
    // 
    // *   **groupId**: asset groups
    // *   **uuid**: assets
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
