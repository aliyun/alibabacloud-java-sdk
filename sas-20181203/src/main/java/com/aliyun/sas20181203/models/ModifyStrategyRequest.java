// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStrategyRequest extends TeaModel {
    /**
     * <p>The type of the baseline check policy. Valid values:</p>
     * <br>
     * <p>*   **custom**: a custom baseline check policy</p>
     * <p>*   **common**: a standard baseline check policy</p>
     */
    @NameInMap("CustomType")
    public String customType;

    /**
     * <p>The new interval of the baseline check. Valid values:</p>
     * <br>
     * <p>*   **1**: every 2 days</p>
     * <p>*   **3**: every 4 days</p>
     * <p>*   **7**: every 8 days</p>
     * <p>*   **30**: every 31 days</p>
     */
    @NameInMap("CycleDays")
    public String cycleDays;

    /**
     * <p>The new time range during which the baseline check starts. Valid values:</p>
     * <br>
     * <p>*   **0**: The baseline check starts within the time range from 00:00 to 06:00.</p>
     * <p>*   **6**: The baseline check starts within the time range from 06:00 to 12:00.</p>
     * <p>*   **12**: The baseline check starts within the time range from 12:00 to 18:00.</p>
     * <p>*   **18**: The baseline check starts within the time range from 18:00 to 24:00.</p>
     * <br>
     * <p>>  This parameter is deprecated.</p>
     */
    @NameInMap("CycleStartTime")
    public String cycleStartTime;

    /**
     * <p>The time when the baseline check based on the baseline check policy ends. Specify the time in the hh:mm:ss format.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the baseline check policy.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The new name of the baseline check policy.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The custom configurations of the baseline. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **typeName**: the name of the baseline.</p>
     * <br>
     * <p>*   **checkDetails**: the details of the baseline. The value is in the JSON format.</p>
     * <br>
     * <p>    *   **checkId**: the ID of the check item.</p>
     * <br>
     * <p>    *   **rules**: the rule configurations. The value is in the JSON format.</p>
     * <br>
     * <p>        *   **ruleId**: the ID of the rule.</p>
     * <br>
     * <p>        *   **paramList**: the list of parameters in the rule. The value is in the JSON format.</p>
     * <br>
     * <p>            *   **paramName**: the name of the parameter.</p>
     * <p>            *   **value**: the value of the parameter.</p>
     */
    @NameInMap("RiskCustomParams")
    public String riskCustomParams;

    /**
     * <p>The subtype of the baselines. You can call the [DescribeRiskType](~~DescribeRiskType~~) operation to query the subtypes of baselines.</p>
     */
    @NameInMap("RiskSubTypeName")
    public String riskSubTypeName;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The time when the baseline check based on the baseline check policy starts. Specify the time in the hh:mm:ss format.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The method that is used to apply the baseline check policy. Valid values:</p>
     * <br>
     * <p>*   **groupId**: asset groups</p>
     * <p>*   **uuid**: assets</p>
     */
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
