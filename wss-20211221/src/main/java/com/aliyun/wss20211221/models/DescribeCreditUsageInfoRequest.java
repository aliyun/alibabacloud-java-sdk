// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeCreditUsageInfoRequest extends TeaModel {
    /**
     * <p>The business type.</p>
     * 
     * <strong>example:</strong>
     * <p>BUSINESS</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The JSON string of the instance ID list. This parameter can be omitted when <code>UsageType</code> is set to <code>User</code>. Set it to the credit package instance ID when <code>UsageType</code> is <code>CreditPackage</code>, and the agent ID when <code>UsageType</code> is <code>Agent</code>.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The operator Scenarios type. Valid values:</p>
     * <ul>
     * <li>Not specified or NaturalMonthlyOwn: Natural monthly exclusive.</li>
     * <li>JzYearlyShare: Jz annual shared.</li>
     * <li>JzYearlyOwn: Jz annual exclusive.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>JzYearlyShare</p>
     */
    @NameInMap("SceneType")
    public String sceneType;

    /**
     * <p>The usage type. Valid values:</p>
     * <ul>
     * <li>User: Returns the used amount, remaining amount, and consumption trend of the currently active credit packages for the user.</li>
     * <li>CreditPackage: Requires a credit package ID. Returns the total amount and remaining amount of the specified credit package.</li>
     * <li>Agent: Requires an agent ID. Returns the cumulative credit usage, cumulative allocated quota, and the percentage between the two.</li>
     * <li>EndUser: Requires a Wuying ID. Returns the shared credit usage, pay-as-you-go credit usage, and total credit usage for the current period of the Wuying user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("UsageType")
    public String usageType;

    public static DescribeCreditUsageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditUsageInfoRequest self = new DescribeCreditUsageInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCreditUsageInfoRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeCreditUsageInfoRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeCreditUsageInfoRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

    public DescribeCreditUsageInfoRequest setUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    public String getUsageType() {
        return this.usageType;
    }

}
