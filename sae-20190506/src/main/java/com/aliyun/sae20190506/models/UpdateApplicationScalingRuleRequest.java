// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateApplicationScalingRuleRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Specifies whether to enable or disable the idle mode.</p>
     */
    @NameInMap("EnableIdle")
    public Boolean enableIdle;

    /**
     * <p>The minimum percentage of instances that must remain available during a rolling deployment. Valid values:</p>
     * <ul>
     * <li><p><strong>-1</strong>: An initial value that indicates that a percentage is not used.</p>
     * </li>
     * <li><p><strong>0 to 100</strong>: A percentage that is rounded up. For example, if you have 5 instances and set this parameter to <strong>50</strong>, the minimum number of surviving instances is 3.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you specify both <strong>MinReadyInstances</strong> and <strong>MinReadyInstanceRatio</strong>, and <strong>MinReadyInstanceRatio</strong> is not <strong>-1</strong>, <strong>MinReadyInstanceRatio</strong> takes precedence. For example, if <strong>MinReadyInstances</strong> is set to <strong>5</strong> and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, the system uses <strong>50%</strong> to calculate the minimum number of surviving instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("MinReadyInstanceRatio")
    public Integer minReadyInstanceRatio;

    /**
     * <p>The minimum number of instances that must remain available during a rolling deployment. Valid values:</p>
     * <ul>
     * <li><p>If you set this parameter to <strong>0</strong>, your application experiences service interruptions during a rolling deployment.</p>
     * </li>
     * <li><p>If you set this parameter to <strong>-1</strong>, the system uses a recommended value, which is 25% of the current number of instances. For example, if you have 5 instances, the minimum number of surviving instances is 2 (5 × 25% = 1.25, rounded up).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To ensure business continuity, we recommend that you set the minimum number of surviving instances for each rolling deployment to 1 or higher.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    /**
     * <p>The configuration for the metric-based scaling policy. This parameter is required for metric-based scaling policies.</p>
     * <p>The parameter includes the following fields:</p>
     * <ul>
     * <li><p><strong>maxReplicas</strong>: The maximum number of application instances.</p>
     * </li>
     * <li><p><strong>minReplicas</strong>: The minimum number of application instances.</p>
     * </li>
     * <li><p><strong>metricType</strong>: The metric that triggers the policy. Valid values:</p>
     * <ul>
     * <li><p><strong>CPU</strong>: The CPU usage.</p>
     * </li>
     * <li><p><strong>MEMORY</strong>: The memory usage.</p>
     * </li>
     * <li><p><strong>QPS</strong>: The average QPS of a single instance of a Java application over a 1-minute period.</p>
     * </li>
     * <li><p><strong>RT</strong>: The average RT of all service interfaces of a Java application over a 1-minute period.</p>
     * </li>
     * <li><p><strong>tcpActiveConn</strong>: The average number of active TCP connections per instance over a 30-second period.</p>
     * </li>
     * <li><p><strong>SLB_QPS</strong>: The average QPS of an internet-facing SLB, measured per instance over a 15-second period.</p>
     * </li>
     * <li><p><strong>SLB_RT</strong>: The average RT of an internet-facing SLB over a 15-second period.</p>
     * </li>
     * <li><p><strong>INTRANET_SLB_QPS</strong>: The average QPS of an internal-facing SLB, measured per instance over a 15-second period.</p>
     * </li>
     * <li><p><strong>INTRANET_SLB_RT</strong>: The average RT of an internal-facing SLB over a 15-second period.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>metricTargetAverageUtilization</strong>: The target value for the specified <strong>metricType</strong>.</p>
     * <ul>
     * <li><p>Target CPU usage, in percent.</p>
     * </li>
     * <li><p>Target memory usage, in percent.</p>
     * </li>
     * <li><p>Target QPS.</p>
     * </li>
     * <li><p>Target RT, in milliseconds.</p>
     * </li>
     * <li><p>Average number of active TCP connections, in connections/second.</p>
     * </li>
     * <li><p>Target internet-facing SLB QPS.</p>
     * </li>
     * <li><p>Target internet-facing SLB RT, in milliseconds.</p>
     * </li>
     * <li><p>Target internal-facing SLB QPS.</p>
     * </li>
     * <li><p>Target internal-facing SLB RT, in milliseconds.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>slbId</strong>: The SLB ID.</p>
     * </li>
     * <li><p><strong>slbProject</strong>: The Simple Log Service project.</p>
     * </li>
     * <li><p><strong>slbLogstore</strong>: The Simple Log Service Logstore.</p>
     * </li>
     * <li><p><strong>vport</strong>: The listening port of the SLB. Both HTTP and HTTPS are supported.</p>
     * </li>
     * <li><p><strong>scaleUpRules</strong>: The scale-out rules.</p>
     * </li>
     * <li><p><strong>scaleDownRules</strong>: The scale-in rules.</p>
     * </li>
     * <li><p><strong>step</strong>: The step size for a scale-out or scale-in action. It defines the maximum number of instances that can be added or removed at a time.</p>
     * </li>
     * <li><p><strong>disabled</strong>: Specifies whether to disable scale-in. Disabling scale-in prevents the application from scaling in, which can mitigate risks during peak traffic.</p>
     * <ul>
     * <li><p><strong>true</strong>: Disables scale-in.</p>
     * </li>
     * <li><p><strong>false</strong>: Enables scale-in. This is the default value.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>stabilizationWindowSeconds</strong>: The cooldown time, in seconds, for a scaling action. The value must be an integer from 0 to 3,600. The default is 0.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you specify multiple metrics, a scale-out is triggered when any metric meets its target. The number of instances will not exceed maxReplicas. A scale-in is triggered only when all metrics are below their targets. The number of instances will not drop below minReplicas.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;maxReplicas&quot;:3,&quot;minReplicas&quot;:1,&quot;metrics&quot;:[{&quot;metricType&quot;:&quot;CPU&quot;,&quot;metricTargetAverageUtilization&quot;:20},{&quot;metricType&quot;:&quot;MEMORY&quot;,&quot;metricTargetAverageUtilization&quot;:30},{&quot;metricType&quot;:&quot;tcpActiveConn&quot;,&quot;metricTargetAverageUtilization&quot;:20},{&quot;metricType&quot;:&quot;SLB_QPS&quot;,&quot;MetricTargetAverageUtilization&quot;:25,&quot;slbId&quot;:&quot;lb-xxx&quot;,&quot;slbProject&quot;:&quot;aliyun-fc-cn-hangzhou-d95881d9-5d3c-5f26-a6b8-<strong><strong><strong><strong><strong><strong>&quot;,&quot;slbLogstore&quot;:&quot;function-log&quot;,&quot;vport&quot;:&quot;80&quot;},{&quot;metricType&quot;:&quot;SLB_RT&quot;,&quot;MetricTargetAverageUtilization&quot;:35,&quot;slbId&quot;:&quot;lb-xxx&quot;,&quot;slbProject&quot;:&quot;aliyun-fc-cn-hangzhou-d95881d9-5d3c-5f26-a6b8-</strong></strong></strong></strong></strong></strong>&quot;,&quot;slbLogstore&quot;:&quot;function-log&quot;,&quot;vport&quot;:&quot;80&quot;}],&quot;scaleUpRules&quot;:{&quot;step&quot;:&quot;100&quot;,&quot;disabled&quot;:false,&quot;stabilizationWindowSeconds&quot;:0},&quot;scaleDownRules&quot;:{&quot;step&quot;:&quot;100&quot;,&quot;disabled&quot;:false,&quot;stabilizationWindowSeconds&quot;:300}}</p>
     */
    @NameInMap("ScalingRuleMetric")
    public String scalingRuleMetric;

    /**
     * <p>The name of the auto scaling policy. The name must start with a lowercase letter, contain only lowercase letters, digits, and hyphens (-), and be no more than 32 characters long.</p>
     * <blockquote>
     * <p>You cannot change the name of an auto scaling policy after it is created.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>timer-0800-2100</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    /**
     * <p>The configuration of the scheduled scaling policy. This parameter is required for scheduled scaling policies.</p>
     * <p>The parameter includes the following fields:</p>
     * <ul>
     * <li><p><strong>beginDate</strong> and <strong>endDate</strong>: The start and end dates for the policy\&quot;s effective period.</p>
     * <ul>
     * <li><p>If both parameters are set to <strong>null</strong>, the policy is always active. This is the default.</p>
     * </li>
     * <li><p>If you set <strong>beginDate</strong> to <strong>2021-03-25</strong> and <strong>endDate</strong> to <strong>2021-04-25</strong>, the policy is effective for one month.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>period</strong>: The execution schedule for the policy. Valid values:</p>
     * <ul>
     * <li><p><em><em>\</em> \</em> \***: Executes the policy at a specified time every day.</p>
     * </li>
     * <li><p><em><em>\</em> \</em> Fri,Mon**: Executes the policy at a specified time on specified days of the week. You can select multiple days. The time is in the UTC+8 time zone. Valid values:</p>
     * <ul>
     * <li><p><strong>Sun</strong>: Sunday</p>
     * </li>
     * <li><p><strong>Mon</strong>: Monday</p>
     * </li>
     * <li><p><strong>Tue</strong>: Tuesday</p>
     * </li>
     * <li><p><strong>Wed</strong>: Wednesday</p>
     * </li>
     * <li><p><strong>Thu</strong>: Thursday</p>
     * </li>
     * <li><p><strong>Fri</strong>: Friday</p>
     * </li>
     * <li><p><strong>Sat</strong>: Saturday</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><em><em>1,2,3,28,31 \</em> \</em>**: Executes the policy at a specified time on specified days of a month. The value ranges from 1 to 31. If a specified day does not exist in a given month (for example, the 31st), the policy skips it.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>schedules</strong>: The trigger times and the corresponding target number of instances. You can specify up to 20 time points. This field includes the following parameters:</p>
     * <ul>
     * <li><p><strong>atTime</strong>: The trigger time. The format is <strong>HH:mm</strong>, for example, <strong>08:00</strong>.</p>
     * </li>
     * <li><p><strong>targetReplicas</strong>: The target number of application instances. The value ranges from 1 to 50.</p>
     * <blockquote>
     * <p>To ensure business continuity, we recommend that you set the minimum number of surviving instances for each rolling deployment to <strong>1</strong> or higher. If you set this parameter to <strong>0</strong>, your application is interrupted during an upgrade.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;beginDate&quot;:null,&quot;endDate&quot;:null,&quot;period&quot;:&quot;* * *&quot;,&quot;schedules&quot;:[{&quot;atTime&quot;:&quot;08:00&quot;,&quot;targetReplicas&quot;:10},{&quot;atTime&quot;:&quot;20:00&quot;,&quot;targetReplicas&quot;:3}]}</p>
     */
    @NameInMap("ScalingRuleTimer")
    public String scalingRuleTimer;

    /**
     * <strong>example:</strong>
     * <p>timing</p>
     */
    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    public static UpdateApplicationScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationScalingRuleRequest self = new UpdateApplicationScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationScalingRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateApplicationScalingRuleRequest setEnableIdle(Boolean enableIdle) {
        this.enableIdle = enableIdle;
        return this;
    }
    public Boolean getEnableIdle() {
        return this.enableIdle;
    }

    public UpdateApplicationScalingRuleRequest setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
        this.minReadyInstanceRatio = minReadyInstanceRatio;
        return this;
    }
    public Integer getMinReadyInstanceRatio() {
        return this.minReadyInstanceRatio;
    }

    public UpdateApplicationScalingRuleRequest setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleMetric(String scalingRuleMetric) {
        this.scalingRuleMetric = scalingRuleMetric;
        return this;
    }
    public String getScalingRuleMetric() {
        return this.scalingRuleMetric;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleTimer(String scalingRuleTimer) {
        this.scalingRuleTimer = scalingRuleTimer;
        return this;
    }
    public String getScalingRuleTimer() {
        return this.scalingRuleTimer;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleType(String scalingRuleType) {
        this.scalingRuleType = scalingRuleType;
        return this;
    }
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

}
