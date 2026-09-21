// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStrategyRequest extends TeaModel {
    /**
     * <p>The policy type. Valid values:</p>
     * <ul>
     * <li><strong>custom</strong>: custom policy.</li>
     * <li><strong>common</strong>: standard policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("CustomType")
    public String customType;

    /**
     * <p>The cycle of the baseline check. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Every 1 day.</li>
     * <li><strong>3</strong>: Every 3 days.</li>
     * <li><strong>7</strong>: Every 7 days.</li>
     * <li><strong>30</strong>: Every 30 days.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CycleDays")
    public String cycleDays;

    /**
     * <p>The start time of the baseline check. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The baseline check starts between 00:00 and 06:00.</li>
     * <li><strong>6</strong>: The baseline check starts between 06:00 and 12:00.</li>
     * <li><strong>12</strong>: The baseline check starts between 12:00 and 18:00.</li>
     * <li><strong>18</strong>: The baseline check starts between 18:00 and 24:00.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     * <p>The value indicates the start hour of the daily check period, in hours.</p>
     * 
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("CycleStartTime")
    public String cycleStartTime;

    /**
     * <p>The end time of the policy execution. Format: hh:mm:ss.</p>
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
     * <p>The name of the baseline check policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testStrategy</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The custom configuration of baseline check items. The value is in JSON format and contains the following parameters:</p>
     * <ul>
     * <li><p><strong>typeName</strong>: The baseline name.</p>
     * </li>
     * <li><p><strong>checkDetails</strong>: The check details. The value is in JSON format.</p>
     * <ul>
     * <li><p><strong>checkId</strong>: The ID of the check item.</p>
     * </li>
     * <li><p><strong>rules</strong>: The policy configuration. The value is in JSON format.</p>
     * <ul>
     * <li><p><strong>ruleId</strong>: The ID of the policy configuration.</p>
     * </li>
     * <li><p><strong>paramList</strong>: The collection of policy parameter settings. The value is in JSON format.</p>
     * <ul>
     * <li><strong>paramName</strong>: The parameter name.</li>
     * <li><strong>value</strong>: The parameter settings value.</li>
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
     * <p>The subtype of the check item. You can call the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation to obtain the subtype.</p>
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
     * <p>The start time of the policy execution. Format: hh:mm:ss.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00:01:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The scan method of the policy. Valid values:</p>
     * <ul>
     * <li><strong>groupId</strong>: group-based scan.</li>
     * <li><strong>uuid</strong>: asset-based scan.</li>
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
