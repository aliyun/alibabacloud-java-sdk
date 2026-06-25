// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateApplicationScalingRuleRequest extends TeaModel {
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
     * <p>Specifies whether to enable idle mode for the application.</p>
     */
    @NameInMap("EnableIdle")
    public Boolean enableIdle;

    /**
     * <p>The minimum number of ready instances, specified as a percentage of the total number of instances. Valid values:</p>
     * <ul>
     * <li><p><strong>-1</strong>: Indicates that a percentage is not used. In this case, the value of <code>MinReadyInstances</code> is used.</p>
     * </li>
     * <li><p><strong>0\~100</strong>: A percentage. The result is rounded up. For example, if you set this parameter to 50 (%) and the application has 5 instances, the minimum number of ready instances is 3.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you specify both <code>MinReadyInstances</code> and a <code>MinReadyInstanceRatio</code> other than <code>-1</code>, <code>MinReadyInstanceRatio</code> takes precedence. For example, if <code>MinReadyInstances</code> is set to <code>5</code> and <code>MinReadyInstanceRatio</code> is set to <code>50</code>, the system uses <code>50</code> (%) to calculate the minimum number of ready instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("MinReadyInstanceRatio")
    public Integer minReadyInstanceRatio;

    /**
     * <p>The minimum number of ready instances. Valid values:</p>
     * <ul>
     * <li><p>If you set this parameter to <code>0</code>, the application is interrupted during an update.</p>
     * </li>
     * <li><p>If you set this parameter to <code>-1</code>, the system sets the value to 25% of the current number of instances, rounded up. For example, if the application has 5 instances, the minimum number of ready instances is 2 (5 × 25% = 1.25, rounded up to 2).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To ensure service continuity during a rolling deployment, we recommend setting the minimum number of ready instances to 1 or more.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    /**
     * <p>Specifies whether to enable the auto scaling policy. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ScalingRuleEnable")
    public Boolean scalingRuleEnable;

    /**
     * <p>Configurations for the metric-based auto scaling policy. This parameter is required if <code>ScalingRuleType</code> is set to <code>metric</code> or <code>mix</code>.</p>
     * <p>The parameter is a JSON string that contains the following fields:</p>
     * <ul>
     * <li><p><strong>maxReplicas</strong>: The maximum number of application instances.</p>
     * </li>
     * <li><p><strong>minReplicas</strong>: The minimum number of application instances.</p>
     * </li>
     * <li><p><strong>metricType</strong>: The metric that triggers the auto scaling policy. Valid values:</p>
     * <ul>
     * <li><p><strong>CPU</strong>: CPU utilization.</p>
     * </li>
     * <li><p><strong>MEMORY</strong>: Memory utilization.</p>
     * </li>
     * <li><p><strong>QPS</strong>: The average queries per second (QPS) per instance for a Java application over a 1-minute period.</p>
     * </li>
     * <li><p><strong>RT</strong>: The average response time (RT) of all service interfaces for a Java application over a 1-minute period.</p>
     * </li>
     * <li><p><strong>tcpActiveConn</strong>: The average number of active TCP connections per instance over a 30-second period.</p>
     * </li>
     * <li><p><strong>SLB_QPS</strong>: The average QPS per instance for a public-facing SLB instance over a 15-second period.</p>
     * </li>
     * <li><p><strong>SLB_RT</strong>: The average RT of a public-facing SLB instance over a 15-second period.</p>
     * </li>
     * <li><p><strong>INTRANET_SLB_QPS</strong>: The average QPS per instance for an internal-facing SLB instance over a 15-second period.</p>
     * </li>
     * <li><p><strong>INTRANET_SLB_RT</strong>: The average RT of an internal-facing SLB instance over a 15-second period.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>metricTargetAverageUtilization</strong>: The target value for the metric specified by <code>metricType</code>. The unit of this value depends on <code>metricType</code>.</p>
     * <ul>
     * <li><p>Target CPU utilization, in percentage.</p>
     * </li>
     * <li><p>Target memory utilization, in percentage.</p>
     * </li>
     * <li><p>Target QPS, in requests per second.</p>
     * </li>
     * <li><p>Target response time, in milliseconds.</p>
     * </li>
     * <li><p>Average number of active TCP connections.</p>
     * </li>
     * <li><p>Target public-facing SLB QPS, in requests per second.</p>
     * </li>
     * <li><p>Target public-facing SLB response time, in milliseconds.</p>
     * </li>
     * <li><p>Target internal-facing SLB QPS, in requests per second.</p>
     * </li>
     * <li><p>Target internal-facing SLB response time, in milliseconds.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>slbId</strong>: The SLB instance ID.</p>
     * </li>
     * <li><p><strong>slbProject</strong>: The Log Service project.</p>
     * </li>
     * <li><p><strong>slbLogstore</strong>: The Log Service Logstore.</p>
     * </li>
     * <li><p><strong>vport</strong>: The SLB listener port. The HTTP and HTTPS protocols are supported.</p>
     * </li>
     * <li><p><strong>scaleUpRules</strong>: The rules to scale out the application.</p>
     * </li>
     * <li><p><strong>scaleDownRules</strong>: The rules to scale in the application.</p>
     * </li>
     * <li><p><strong>step</strong>: The step size for scaling out or scaling in. This is the maximum number of instances that can be added or removed in a single scaling activity.</p>
     * </li>
     * <li><p><strong>disabled</strong>: Specifies whether to prevent the application from scaling in. If set to <code>true</code>, the number of application instances is never reduced. This can prevent business risks caused by scaling in during peak hours.</p>
     * <ul>
     * <li><p><strong>true</strong>: Scale-in is disabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Scale-in is enabled. This is the default value.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>stabilizationWindowSeconds</strong>: The cooldown period for scaling out or scaling in, in seconds. Valid values: 0 to 3600. The default value is 0.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can configure one or more metrics. If you configure multiple metrics, the application scales out when any of the metrics meets or exceeds its target value, up to the specified maximum number of instances. The application scales in only when all metrics are below their target values, down to the specified minimum number of instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;maxReplicas&quot;:3,&quot;minReplicas&quot;:1,&quot;metrics&quot;:[{&quot;metricType&quot;:&quot;CPU&quot;,&quot;metricTargetAverageUtilization&quot;:20},{&quot;metricType&quot;:&quot;MEMORY&quot;,&quot;metricTargetAverageUtilization&quot;:30},{&quot;metricType&quot;:&quot;tcpActiveConn&quot;,&quot;metricTargetAverageUtilization&quot;:20},{&quot;metricType&quot;:&quot;SLB_QPS&quot;,&quot;MetricTargetAverageUtilization&quot;:25,&quot;slbId&quot;:&quot;lb-xxx&quot;,&quot;slbProject&quot;:&quot;aliyun-fc-cn-hangzhou-d95881d9-5d3c-5f26-a6b8-<strong><strong><strong><strong><strong><strong>&quot;,&quot;slbLogstore&quot;:&quot;function-log&quot;,&quot;vport&quot;:&quot;80&quot;},{&quot;metricType&quot;:&quot;SLB_RT&quot;,&quot;MetricTargetAverageUtilization&quot;:35,&quot;slbId&quot;:&quot;lb-xxx&quot;,&quot;slbProject&quot;:&quot;aliyun-fc-cn-hangzhou-d95881d9-5d3c-5f26-a6b8-</strong></strong></strong></strong></strong></strong>&quot;,&quot;slbLogstore&quot;:&quot;function-log&quot;,&quot;vport&quot;:&quot;80&quot;}],&quot;scaleUpRules&quot;:{&quot;step&quot;:&quot;100&quot;,&quot;disabled&quot;:false,&quot;stabilizationWindowSeconds&quot;:0},&quot;scaleDownRules&quot;:{&quot;step&quot;:&quot;100&quot;,&quot;disabled&quot;:false,&quot;stabilizationWindowSeconds&quot;:300}}</p>
     */
    @NameInMap("ScalingRuleMetric")
    public String scalingRuleMetric;

    /**
     * <p>The name of the auto scaling policy. The name must be unique within an application, start with a lowercase letter, and contain only lowercase letters, digits, and hyphens (-). The name can be up to 32 characters long.</p>
     * <blockquote>
     * <p>The policy name cannot be changed after creation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>timer-0800-2100</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    /**
     * <p>Configurations for the scheduled auto scaling policy. This parameter is required if <code>ScalingRuleType</code> is set to <code>timing</code> or if you use an SDK.</p>
     * <p>The parameter is a JSON string that contains the following fields:</p>
     * <ul>
     * <li><p><strong>beginDate</strong> and <strong>endDate</strong>: The start and end dates of the policy\&quot;s effective period.</p>
     * <ul>
     * <li><p>If both fields are set to <code>null</code> (default), the policy is effective indefinitely.</p>
     * </li>
     * <li><p>If you specify a date range, for example, <code>beginDate</code> is <code>2021-03-25</code> and <code>endDate</code> is <code>2021-04-25</code>, the policy is effective for one month.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>period</strong>: The recurrence rule for the scheduled auto scaling policy.</p>
     * <ul>
     * <li><p><em><em>\</em> \</em> \***: The policy is executed at a specified time every day.</p>
     * </li>
     * <li><p><em><em>\</em> \</em> Fri,Mon**: The policy is executed at a specified time on specific days of the week. You can select multiple days. The time is in the GMT+8 time zone. Valid values:</p>
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
     * <li><p><em><em>1,2,3,28,31 \</em> \</em>**: The policy is executed at a specified time on specific days of a month. You can select multiple days. The value can be from 1 to 31. If a month does not have the specified day, for example, the 31st, the policy is not executed on that day for that month.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>schedules</strong>: The trigger times and the corresponding target number of instances. You can specify a maximum of 20 schedules. The parameter includes the following fields:</p>
     * <ul>
     * <li><p><strong>atTime</strong>: The trigger time in <code>HH:mm</code> format. For example, <code>08:00</code>.</p>
     * </li>
     * <li><p><strong>targetReplicas</strong>: The target number of application instances. Valid values: 1 to 50.</p>
     * <blockquote>
     * <p>During a rolling deployment, we recommend that you set the minimum number of ready instances to 1 or more to prevent service interruptions. If you set the minimum number of ready instances to <code>0</code>, your application will be interrupted during an update.</p>
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
     * <p>The type of the auto scaling policy. Valid values:</p>
     * <ul>
     * <li><p><strong>timing</strong>: scheduled auto scaling.</p>
     * </li>
     * <li><p><strong>metric</strong>: metric-based auto scaling.</p>
     * </li>
     * <li><p><strong>mix</strong>: mixed auto scaling.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>If you set this parameter to <code>timing</code>, the <code>ScalingRuleTimer</code> parameter is required.</p>
     * </li>
     * <li><p>If you set this parameter to <code>metric</code>, the <code>ScalingRuleMetric</code> parameter is required.</p>
     * </li>
     * <li><p>If you set this parameter to <code>mix</code>, the <code>ScalingRuleMetric</code> parameter is required. You can also configure the <code>ScalingRuleTimer</code> parameter as needed.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>timing</p>
     */
    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    public static CreateApplicationScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationScalingRuleRequest self = new CreateApplicationScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationScalingRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateApplicationScalingRuleRequest setEnableIdle(Boolean enableIdle) {
        this.enableIdle = enableIdle;
        return this;
    }
    public Boolean getEnableIdle() {
        return this.enableIdle;
    }

    public CreateApplicationScalingRuleRequest setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
        this.minReadyInstanceRatio = minReadyInstanceRatio;
        return this;
    }
    public Integer getMinReadyInstanceRatio() {
        return this.minReadyInstanceRatio;
    }

    public CreateApplicationScalingRuleRequest setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

    public CreateApplicationScalingRuleRequest setScalingRuleEnable(Boolean scalingRuleEnable) {
        this.scalingRuleEnable = scalingRuleEnable;
        return this;
    }
    public Boolean getScalingRuleEnable() {
        return this.scalingRuleEnable;
    }

    public CreateApplicationScalingRuleRequest setScalingRuleMetric(String scalingRuleMetric) {
        this.scalingRuleMetric = scalingRuleMetric;
        return this;
    }
    public String getScalingRuleMetric() {
        return this.scalingRuleMetric;
    }

    public CreateApplicationScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public CreateApplicationScalingRuleRequest setScalingRuleTimer(String scalingRuleTimer) {
        this.scalingRuleTimer = scalingRuleTimer;
        return this;
    }
    public String getScalingRuleTimer() {
        return this.scalingRuleTimer;
    }

    public CreateApplicationScalingRuleRequest setScalingRuleType(String scalingRuleType) {
        this.scalingRuleType = scalingRuleType;
        return this;
    }
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

}
