// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateApplicationScalingRuleRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The percentage of the minimum number of available instances. Take note of the following rules:</p>
     * <br>
     * <p>*   If you set the value to **-1**, the minimum number of available instances is not determined based on this parameter. This is the default value.</p>
     * <p>*   If you set the value to a number **from 0 to 100**, the minimum number of available instances is calculated by using the following formula: Current number of instances × (Value of MinReadyInstanceRatio × 100%). The value is the nearest integer rounded up from the calculated result. For example, if you set this parameter to **50**, and five instances are available, the minimum number of available instances is 3.</p>
     * <br>
     * <p>> When **MinReadyInstance** and **MinReadyInstanceRatio** are specified and **MinReadyInstanceRatio** is set to a number from 0 to 100, the value of \*\*MinReadyInstanceRatio** takes precedence.**** For example, if **MinReadyInstances** is set to **5\*\*, and **MinReadyInstanceRatio** is set to **50**, the minimum number of available instances is set to the nearest integer rounded up from the calculated result of the following formula: Current number of instances × **50%**.</p>
     */
    @NameInMap("MinReadyInstanceRatio")
    public Integer minReadyInstanceRatio;

    /**
     * <p>The minimum number of available instances. Take note of the following rules:</p>
     * <br>
     * <p>*   If you set the value to **0**, business interruptions occur when the auto-scaling policy is updated.</p>
     * <p>*   If you set the value to \*\*-1\*\*, the minimum number of available instances is automatically set to a system-recommended value. The value is the nearest integer to which the calculated result of the following formula is rounded up: Current number of instances × 25%. For example, if five instances are available, the minimum number of available instances is calculated by using the following formula: 5 × 25% = 1.25. In this case, the minimum number of available instances is 2.</p>
     * <br>
     * <p>> Make sure that at least one instance is available during application deployment and rollback to prevent business interruptions.</p>
     */
    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    /**
     * <p>The configurations of the metric-based auto scaling policy. This parameter is required if you set the ScalingRuleType parameter to metric.</p>
     * <br>
     * <p>Parameter description:</p>
     * <br>
     * <p>*   **maxReplicas**: the maximum number of instances in the application.</p>
     * <br>
     * <p>*   **minReplicas**: the minimum number of instances in the application.</p>
     * <br>
     * <p>*   **metricType**: the metric that is used to trigger the auto scaling policy.</p>
     * <br>
     * <p>    *   **CPU**: the CPU utilization.</p>
     * <p>    *   **MEMORY**: the memory usage.</p>
     * <p>    *   **tcpActiveConn**: the average number of active TCP connections in an application instance within 30 seconds.</p>
     * <p>    *   **SLB_QPS**: the average queries per second (QPS) of the Internet-facing Server Load Balancer (SLB) instance associated with an application instance within 15 seconds.</p>
     * <p>    *   **SLB_RT**: the average response time of the Internet-facing SLB instance within 15 seconds.</p>
     * <br>
     * <p>*   **metricTargetAverageUtilization**: the limit on the metric specified by the **metricType** parameter.</p>
     * <br>
     * <p>    *   The limit on the CPU utilization. Unit: percentage.</p>
     * <p>    *   The limit on the memory usage. Unit: percentage.</p>
     * <p>    *   The limit on the average number of active TCP connections per second.</p>
     * <p>    *   The limit on the QPS of the Internet-facing SLB instance.</p>
     * <p>    *   The limit on the response time of the Internet-facing SLB instance. Unit: milliseconds.</p>
     * <br>
     * <p>*   **SlbProject**: the Log Service project.</p>
     * <br>
     * <p>*   **SlbLogstore**: the Log Service Logstore.</p>
     * <br>
     * <p>*   **Vport**: the listener port for the SLB instance. HTTP and HTTPS are supported.</p>
     * <br>
     * <p>*   **scaleUpRules**: the scale-out rule.</p>
     * <br>
     * <p>*   **scaleDownRules**: the scale-in rule.</p>
     * <br>
     * <p>*   **step**: the scale-out or scale-in step size. The maximum number of instances that can be added or removed per unit time.</p>
     * <br>
     * <p>*   **disabled**: specifies whether to disable the application scale-in. If you set this parameter to true, the application instances are never scaled in. This prevents business risks during peak hours.</p>
     * <br>
     * <p>    *   **true**: disables the application scale-in.</p>
     * <p>    *   **false**: enables the application scale-in. Default value: false.</p>
     * <br>
     * <p>*   **stabilizationWindowSeconds**: the cooldown period during which the system is stable and does not perform scale-out or scale-in operations. Valid values: 0 to 3600. Unit: seconds. Default value: 0.</p>
     * <br>
     * <p>> You can specify one or more metrics as the trigger conditions of the auto scaling policy. If you specify multiple metrics, the application is scaled out when the value of a metric is greater than or equal to the limit. The number of application instances after the scale-out cannot exceed the configured maximum number of application instances. If the values of all the metrics are less than the limits, the application is scaled in. The number of instances after the scale-in cannot be less than the configured minimum number of application instances.</p>
     */
    @NameInMap("ScalingRuleMetric")
    public String scalingRuleMetric;

    /**
     * <p>The name of the auto scaling policy. The name must start with a lowercase letter and can contain only lowercase letters, digits, and hyphens (-). The name cannot exceed 32 characters in length.</p>
     * <br>
     * <p>> You cannot change the names of created policies.</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    /**
     * <p>The configurations of the scheduled auto scaling policy. This parameter is required when you set the ScalingRuleType parameter to timing or when you want to create a scheduled auto scaling policy by using an SDK.</p>
     * <br>
     * <p>Parameter description:</p>
     * <br>
     * <p>*   **beginDate** and **endDate**: specify the validity period of the scheduled auto scaling policy. **beginDate** specifies the start date and **endDate** specifies the end date. Take note of the following rules:</p>
     * <br>
     * <p>    *   If you set the two parameters to **null**, the scheduled auto scaling policy is a long-term policy. Default values of the beginDate and endDate parameters: null.</p>
     * <p>    *   If you set the two parameters to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if you set **beginDate** to **2021-03-25** and **endDate** to **2021-04-25**, the auto scaling policy is valid for one month.</p>
     * <br>
     * <p>*   **period**: specifies the frequency at which the scheduled auto scaling policy is executed. Valid values:</p>
     * <br>
     * <p>    *   **\* \* \***: The scheduled auto scaling policy is executed at a specified point in time every day.</p>
     * <br>
     * <p>    *   **\* \* Fri,Mon**: The scheduled auto scaling policy is executed at a specified point in time on one or more specified days of each week. GMT+8 is used. Valid values:</p>
     * <br>
     * <p>        *   **Sun**</p>
     * <p>        *   **Mon**</p>
     * <p>        *   **Tue**</p>
     * <p>        *   **Wed**</p>
     * <p>        *   **Thu**</p>
     * <p>        *   **Fri**</p>
     * <p>        *   **Sat**</p>
     * <br>
     * <p>    *   **1,2,3,28,31 \* \***: The scheduled auto scaling policy is executed at a specified point in time on one or more days of each month. Valid values: 1 to 31. If the month does not have a 31st day, the auto scaling policy is executed on the specified days other than the 31st day.</p>
     * <br>
     * <p>*   **schedules**: specifies the points in time at which the auto scaling policy is triggered and the number of application instances that are retained during the corresponding period of time. You can specify up to 20 points in time. Parameter description:</p>
     * <br>
     * <p>    *   **atTime**: the point in time at which the policy is triggered. Format: **Hour:Minute**. Example: **08:00**.</p>
     * <br>
     * <p>    *   **targetReplicas**: specifies the number of application instances that you want to maintain by using this policy. You can also set the value to the minimum number of available instances required for each application release. Valid values: 1 to 50.</p>
     * <br>
     * <p>        **</p>
     * <br>
     * <p>        **Note**Make sure that at least **one** instance is available during the application deployment and rollback to prevent your business from being interrupted. If you set the value to **0**, business interruptions occur when the application is updated.</p>
     */
    @NameInMap("ScalingRuleTimer")
    public String scalingRuleTimer;

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

}
