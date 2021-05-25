// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeAvailableNacosInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeAvailableNacosInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableNacosInstancesRequest self = new DescribeAvailableNacosInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableNacosInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableNacosInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
