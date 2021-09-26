// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DescribeRenewStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    public static DescribeRenewStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenewStatusRequest self = new DescribeRenewStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRenewStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRenewStatusRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

}
