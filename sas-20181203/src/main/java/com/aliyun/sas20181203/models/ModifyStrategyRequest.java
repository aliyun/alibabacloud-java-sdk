// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStrategyRequest extends TeaModel {
    /**
     * <p>The type of the baseline check policy. Valid values:</p>
     * <ul>
     * <li><strong>custom</strong>: a custom baseline check policy</li>
     * <li><strong>common</strong>: a standard baseline check policy</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("CustomType")
    public String customType;

    /**
     * <p>The new interval of the baseline check. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: every 2 days</li>
     * <li><strong>3</strong>: every 4 days</li>
     * <li><strong>7</strong>: every 8 days</li>
     * <li><strong>30</strong>: every 31 days</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CycleDays")
    public String cycleDays;

    /**
     * <p>The new time range during which the baseline check starts. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The baseline check starts within the time range from 00:00 to 06:00.</li>
     * <li><strong>6</strong>: The baseline check starts within the time range from 06:00 to 12:00.</li>
     * <li><strong>12</strong>: The baseline check starts within the time range from 12:00 to 18:00.</li>
     * <li><strong>18</strong>: The baseline check starts within the time range from 18:00 to 24:00.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("CycleStartTime")
    public String cycleStartTime;

    /**
     * <p>The time when the baseline check based on the baseline check policy ends. Specify the time in the hh:mm:ss format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the baseline check policy.</p>
     * 
     * <strong>example:</strong>
     * <p>245</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The new name of the baseline check policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testStrategy</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The custom configurations of the baseline. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>typeName</strong>: the name of the baseline.</p>
     * </li>
     * <li><p><strong>checkDetails</strong>: the details of the baseline. The value is in the JSON format.</p>
     * <ul>
     * <li><p><strong>checkId</strong>: the ID of the check item.</p>
     * </li>
     * <li><p><strong>rules</strong>: the rule configurations. The value is in the JSON format.</p>
     * <ul>
     * <li><p><strong>ruleId</strong>: the ID of the rule.</p>
     * </li>
     * <li><p><strong>paramList</strong>: the list of parameters in the rule. The value is in the JSON format.</p>
     * <ul>
     * <li><strong>paramName</strong>: the name of the parameter.</li>
     * <li><strong>value</strong>: the value of the parameter.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;typeName&quot;:&quot;hc_centos_6_custom&quot;,&quot;checkDetails&quot;:[{&quot;checkId&quot;:4,&quot;rules&quot;:[{&quot;ruleId&quot;:&quot;pass_min_days_login_defs.must.cus&quot;,&quot;paramList&quot;:[{&quot;paramName&quot;:&quot;range_val&quot;,&quot;value&quot;:&quot;7&quot;}]}]}]}]</p>
     */
    @NameInMap("RiskCustomParams")
    public String riskCustomParams;

    /**
     * <p>The subtype of the baselines. You can call the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation to query the subtypes of baselines.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hc_exploit_redis</p>
     */
    @NameInMap("RiskSubTypeName")
    public String riskSubTypeName;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.X.X</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The time when the baseline check based on the baseline check policy starts. Specify the time in the hh:mm:ss format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00:01:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The method that is used to apply the baseline check policy. Valid values:</p>
     * <ul>
     * <li><strong>groupId</strong>: asset groups</li>
     * <li><strong>uuid</strong>: assets</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>groupId</p>
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
