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
     * <p>The JSON string of instance IDs. This parameter can be omitted when <code>UsageType=User</code>. Set this parameter to the credit package instance ID when <code>UsageType=CreditPackage</code>, or to the <code>AgentId</code> when <code>UsageType=Agent</code>.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The usage type. Valid values:</p>
     * <ul>
     * <li>User: Returns the usage, remaining credits, and consumption trends of the active credit packages for the current user.</li>
     * <li>CreditPackage: Requires a CreditPackageId. Returns the total and remaining credits of the specified credit package.</li>
     * <li>Agent: Requires an AgentId. Returns the cumulative credit usage, cumulative allocated quota, and the percentages of both.</li>
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

    public DescribeCreditUsageInfoRequest setUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    public String getUsageType() {
        return this.usageType;
    }

}
