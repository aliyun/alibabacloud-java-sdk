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
     * <p>Specifies whether to enable the idle mode.</p>
     */
    @NameInMap("EnableIdle")
    public Boolean enableIdle;

    /**
     * <p>The percentage of the minimum number of surviving instances. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: the initial value, which indicates that the percentage is not used.</li>
     * <li><strong>0~100</strong>: the percentage, rounded up. For example, if you set this parameter to 50 and the current number of instances is 5, the minimum number of surviving instances is 3.</li>
     * </ul>
     * <blockquote>
     * <p>When both <strong>MinReadyInstances</strong> and <strong>MinReadyInstanceRatio</strong> are specified and the value of <strong>MinReadyInstanceRatio</strong> is not <strong>-1</strong>, the <strong>MinReadyInstanceRatio</strong> parameter prevails. For example, if <strong>MinReadyInstances</strong> is set to <strong>5</strong> and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, the value <strong>50</strong> is used to calculate the minimum number of surviving instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("MinReadyInstanceRatio")
    public Integer minReadyInstanceRatio;

    /**
     * <p>The minimum number of surviving instances. Valid values:</p>
     * <ul>
     * <li>If you set this parameter to <strong>0</strong>, services are interrupted during the application upgrade.</li>
     * <li>If you set this parameter to <strong>-1</strong>, the system recommended value is used, which is 25% of the current number of instances. For example, if the current number of instances is 5, 5 × 25% = 1.25. After rounding up, the minimum number of surviving instances is 2.</li>
     * </ul>
     * <blockquote>
     * <p>We recommend that you set the minimum number of surviving instances for each rolling deployment to a value greater than or equal to 1 to ensure service continuity.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    /**
     * <p>Specifies whether to enable the elastic scaling policy. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ScalingRuleEnable")
    public Boolean scalingRuleEnable;

    /**
     * <p>The configuration of the monitoring metric-based elastic policy. This parameter is required when you select the monitoring metric-based elastic policy settings.</p>
     * <p>Metric description:</p>
     * <ul>
     * <li><strong>maxReplicas</strong>: the maximum number of instances for the application.</li>
     * <li><strong>minReplicas</strong>: the minimum number of instances for the application.</li>
     * <li><strong>metricType</strong>: the trigger condition for the monitoring metric. Valid values:<ul>
     * <li><strong>CPU</strong>: CPU utilization.</li>
     * <li><strong>MEMORY</strong>: memory utilization.</li>
     * <li><strong>QPS</strong>: the average queries per second (QPS) of a single instance of a Java application within 1 minute.</li>
     * <li><strong>RT</strong>: the average response time (RT) of all service interfaces of a Java application within 1 minute.</li>
     * <li><strong>tcpActiveConn</strong>: the average number of active TCP connections of a single instance within 30 seconds.</li>
     * <li><strong>SLB_QPS</strong>: the average public-facing Server Load Balancer (SLB) QPS of a single instance within 15 seconds.</li>
     * <li><strong>SLB_RT</strong>: the average public-Internet-facing SLB response time within 15 seconds.</li>
     * <li><strong>INTRANET_SLB_QPS</strong>: the average private network SLB QPS of a single instance within 15 seconds.</li>
     * <li><strong>INTRANET_SLB_RT</strong>: the average private network SLB response time within 15 seconds.</li>
     * </ul>
     * </li>
     * <li><strong>metricTargetAverageUtilization</strong>: the target value of the monitoring metric based on the <strong>metricType</strong>.<ul>
     * <li>Target CPU utilization, in percentage.</li>
     * <li>Target memory utilization, in percentage.</li>
     * <li>QPS.</li>
     * <li>Response time, in milliseconds.</li>
     * <li>Average number of active TCP connections, in connections per second.</li>
     * <li>Public-Internet-facing SLB QPS.</li>
     * <li>Public-Internet-facing SLB response time, in milliseconds.</li>
     * <li>Private network SLB QPS.</li>
     * <li>Private network SLB response time, in milliseconds.</li>
     * </ul>
     * </li>
     * <li><strong>slbId</strong>: the SLB instance ID.</li>
     * <li><strong>slbProject</strong>: the Simple Log Service project.</li>
     * <li><strong>slbLogstore</strong>: the Simple Log Service Logstore.</li>
     * <li><strong>vport</strong>: the SLB listener port. HTTP and HTTPS protocols are supported.</li>
     * <li><strong>scaleUpRules</strong>: the scale-out rules for the application.</li>
     * <li><strong>scaleDownRules</strong>: the scale-in rules for the application.</li>
     * <li><strong>step</strong>: the step size for scaling out or scaling in. The maximum number of instances that can be scaled out or in per unit of time.</li>
     * <li><strong>disabled</strong>: specifies whether to disable scale-in. If enabled, the application instances are never scaled in, which effectively prevents service risks caused by scale-in during traffic peaks. Valid values:<ul>
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled. This is the default value.</li>
     * </ul>
     * </li>
     * <li><strong>stabilizationWindowSeconds</strong>: the cooldown period for scaling out or scaling in. Valid values: [0, 3600\]. Unit: seconds. Default value: 0.</li>
     * </ul>
     * <blockquote>
     * <p>You can configure one or more monitoring metrics. If multiple monitoring metrics are configured, the application scales out as long as any metric is greater than or equal to the target value. The number of instances after scale-out does not exceed the maximum number of instances for the application. If all metrics are less than the target value, the application scales in. The number of instances after scale-in is not less than the minimum number of instances for the application.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;maxReplicas&quot;:3,&quot;minReplicas&quot;:1,&quot;metrics&quot;:[{&quot;metricType&quot;:&quot;CPU&quot;,&quot;metricTargetAverageUtilization&quot;:20},{&quot;metricType&quot;:&quot;MEMORY&quot;,&quot;metricTargetAverageUtilization&quot;:30},{&quot;metricType&quot;:&quot;tcpActiveConn&quot;,&quot;metricTargetAverageUtilization&quot;:20},{&quot;metricType&quot;:&quot;SLB_QPS&quot;,&quot;MetricTargetAverageUtilization&quot;:25,&quot;slbId&quot;:&quot;lb-xxx&quot;,&quot;slbProject&quot;:&quot;aliyun-fc-cn-hangzhou-d95881d9-5d3c-5f26-a6b8-<strong><strong><strong><strong><strong><strong>&quot;,&quot;slbLogstore&quot;:&quot;function-log&quot;,&quot;vport&quot;:&quot;80&quot;},{&quot;metricType&quot;:&quot;SLB_RT&quot;,&quot;MetricTargetAverageUtilization&quot;:35,&quot;slbId&quot;:&quot;lb-xxx&quot;,&quot;slbProject&quot;:&quot;aliyun-fc-cn-hangzhou-d95881d9-5d3c-5f26-a6b8-</strong></strong></strong></strong></strong></strong>&quot;,&quot;slbLogstore&quot;:&quot;function-log&quot;,&quot;vport&quot;:&quot;80&quot;}],&quot;scaleUpRules&quot;:{&quot;step&quot;:&quot;100&quot;,&quot;disabled&quot;:false,&quot;stabilizationWindowSeconds&quot;:0},&quot;scaleDownRules&quot;:{&quot;step&quot;:&quot;100&quot;,&quot;disabled&quot;:false,&quot;stabilizationWindowSeconds&quot;:300}}</p>
     */
    @NameInMap("ScalingRuleMetric")
    public String scalingRuleMetric;

    /**
     * <p>The custom name of the elastic scaling policy. The policy name must be unique within the application, start with a lowercase letter, and contain only lowercase letters, digits, and hyphens (-). It can be up to 32 characters in length.</p>
     * <blockquote>
     * <p>After the elastic scaling policy is created, the policy name cannot be modified.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>timer-0800-2100</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    /**
     * <p>The configuration of the scheduled elastic policy. This parameter is required when you select a scheduled elastic policy or use an SDK for configuration.</p>
     * <p>Metric description:</p>
     * <ul>
     * <li><p><strong>beginDate</strong> and <strong>endDate</strong>: <strong>beginDate</strong> specifies the start date, and <strong>endDate</strong> specifies the end date. These parameters are used to configure the validity period of the scheduled elastic scaling policy. Valid values:</p>
     * <ul>
     * <li>If both values are <strong>null</strong>, the policy is executed on a long-term basis. This is the default value.</li>
     * <li>If specific dates are specified, for example, <strong>beginDate</strong> is <strong>2021-03-25</strong> and <strong>endDate</strong> is <strong>2021-04-25</strong>, the validity period is one month.</li>
     * </ul>
     * </li>
     * <li><p><strong>period</strong>: the epoch for executing the scheduled elastic scaling policy. Valid values:</p>
     * <ul>
     * <li><em><em>\</em> \</em> \***: executes the scheduled policy at the specified time every day.</li>
     * <li><em><em>\</em> \</em> Fri,Mon**: executes the scheduled policy at the specified time on the specified days of every week. Multiple days are supported. The time zone is GMT+8. Valid values: <ul>
     * <li><strong>Sun</strong>: Sunday</li>
     * <li><strong>Mon</strong>: Monday</li>
     * <li><strong>Tue</strong>: Tuesday</li>
     * <li><strong>Wed</strong>: Wednesday</li>
     * <li><strong>Thu</strong>: Thursday</li>
     * <li><strong>Fri</strong>: Friday</li>
     * <li><strong>Sat</strong>: Saturday</li>
     * </ul>
     * </li>
     * <li><em><em>1,2,3,28,31 \</em> \</em>**: executes the scheduled policy at the specified time on the specified days of every month. Multiple days are supported. Valid values: [1,31\]. If the current month does not have the 31st day, the scheduled policy is skipped on that day.</li>
     * </ul>
     * </li>
     * <li><p><strong>schedules</strong>: the trigger time of the elastic scaling policy and the number of application instances to maintain during the time period. Up to 20 time points are supported. Metric description:</p>
     * <ul>
     * <li><strong>atTime</strong>: the trigger time point. The format is <strong>HH:mm</strong>, for example, <strong>08:00</strong>.</li>
     * <li><strong>targetReplicas</strong>: the number of instances for the application, or the minimum number of surviving instances for each deployment. Valid values: [1,50\].<blockquote>
     * <p>We recommend that you set the minimum number of surviving instances for each rolling deployment to a value greater than or equal to <strong>1</strong> to ensure that business is not interrupted. If you set this parameter to <strong>0</strong>, business will be interrupted during the application upgrade procedure.</p>
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
     * <p>The type of the elastic scaling policy. Valid values:</p>
     * <ul>
     * <li><p><strong>timing</strong>: scheduled elastic scaling.</p>
     * </li>
     * <li><p><strong>metric</strong>: monitoring metric-based elastic scaling.</p>
     * </li>
     * <li><p><strong>mix</strong>: hybrid elastic scaling.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you select scheduled elastic scaling, the ScalingRuleTimer parameter is required.</li>
     * <li>If you select monitoring metric-based elastic scaling, the ScalingRuleMetric parameter is required.</li>
     * <li>If you select hybrid elastic scaling, the ScalingRuleMetric parameter is required. You can also specify the ScalingRuleTimer and ScalingRuleMetric parameters as needed.</li>
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
