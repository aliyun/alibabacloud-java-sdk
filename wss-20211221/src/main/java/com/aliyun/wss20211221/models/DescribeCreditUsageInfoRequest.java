// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeCreditUsageInfoRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
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
