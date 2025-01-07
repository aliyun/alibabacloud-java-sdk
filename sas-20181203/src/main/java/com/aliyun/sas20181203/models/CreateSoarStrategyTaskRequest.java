// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSoarStrategyTaskRequest extends TeaModel {
    /**
     * <p>The ID of the policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeSoarSubscribedStrategy~~">DescribeSoarSubscribedStrategy</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13840</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>The name of the policy. Set the value to Automated Batch Vulnerability Fixing Policy for Multiple Servers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Automated Batch Vulnerability Fixing Policy for Multiple Servers</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    /**
     * <p>The name of.the policy task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task1</p>
     */
    @NameInMap("StrategyTaskName")
    public String strategyTaskName;

    /**
     * <p>The parameters of the policy task. The value is a JSON array.</p>
     * <p>Vulnerability-related parameters:</p>
     * <ul>
     * <li>name: vluList</li>
     * <li>associationProperty: sasAllVul</li>
     * <li>value: basic vulnerability information</li>
     * </ul>
     * <p>Snapshot-related parameters:</p>
     * <ul>
     * <li>name: snapshotConfig</li>
     * <li>associationProperty: snapshotConfig</li>
     * <li>value: retention period</li>
     * </ul>
     * <p>Notification-related parameters:</p>
     * <ul>
     * <li>name: notifyConfig</li>
     * <li>associationProperty: notifyConfig</li>
     * <li>value: email or DingTalk configuration information</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;name&quot;: &quot;vulList&quot;,
     *         &quot;associationProperty&quot;: &quot;sasAllVul&quot;,
     *         &quot;value&quot;: [
     *             {
     *                 &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
     *                 &quot;instanceId&quot;: &quot;i-bp10i<strong><strong><strong>68lo5e&quot;,
     *                 &quot;instanceName&quot;: &quot;instance</strong></strong>&quot;,
     *                 &quot;vulId&quot;: 3974347681,
     *                 &quot;vulName&quot;: &quot;centos:7:cesa-2024:1249&quot;,
     *                 &quot;vulAliasName&quot;: &quot;CESA-2024:1249&quot;,
     *                 &quot;vulTag&quot;: &quot;oval&quot;,
     *                 &quot;vulUuid&quot;: &quot;3c5eb76a-</strong>****-85ef-67562cdc2344&quot;,
     *                 &quot;vulType&quot;: &quot;cve&quot;,
     *                 &quot;vulModifyTs&quot;: 1721324258000
     *             }
     *         ]
     *     },
     *     {
     *         &quot;name&quot;: &quot;snapshotConfig&quot;,
     *         &quot;associationProperty&quot;: &quot;snapshotConfig&quot;,
     *         &quot;value&quot;: {
     *             &quot;ttl&quot;: 1
     *         }
     *     },
     *     {
     *         &quot;name&quot;: &quot;notifyConfig&quot;,
     *         &quot;associationProperty&quot;: &quot;notifyConfig&quot;,
     *         &quot;value&quot;: {
     *             &quot;ding&quot;: [
     *                 {
     *                     &quot;value&quot;: 2195,
     *                     &quot;label&quot;: &quot;test&quot;
     *                 }
     *             ]
     *         }
     *     }
     * ]</p>
     */
    @NameInMap("StrategyTaskParams")
    public String strategyTaskParams;

    /**
     * <p>The timestamp when the task is scheduled to start. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1586739841000</p>
     */
    @NameInMap("StrategyTaskPlanExeTime")
    public Long strategyTaskPlanExeTime;

    public static CreateSoarStrategyTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSoarStrategyTaskRequest self = new CreateSoarStrategyTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSoarStrategyTaskRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

    public CreateSoarStrategyTaskRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public CreateSoarStrategyTaskRequest setStrategyTaskName(String strategyTaskName) {
        this.strategyTaskName = strategyTaskName;
        return this;
    }
    public String getStrategyTaskName() {
        return this.strategyTaskName;
    }

    public CreateSoarStrategyTaskRequest setStrategyTaskParams(String strategyTaskParams) {
        this.strategyTaskParams = strategyTaskParams;
        return this;
    }
    public String getStrategyTaskParams() {
        return this.strategyTaskParams;
    }

    public CreateSoarStrategyTaskRequest setStrategyTaskPlanExeTime(Long strategyTaskPlanExeTime) {
        this.strategyTaskPlanExeTime = strategyTaskPlanExeTime;
        return this;
    }
    public Long getStrategyTaskPlanExeTime() {
        return this.strategyTaskPlanExeTime;
    }

}
