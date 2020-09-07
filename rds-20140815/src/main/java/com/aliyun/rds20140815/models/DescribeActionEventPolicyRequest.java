// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeActionEventPolicyRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeActionEventPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActionEventPolicyRequest self = new DescribeActionEventPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActionEventPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
