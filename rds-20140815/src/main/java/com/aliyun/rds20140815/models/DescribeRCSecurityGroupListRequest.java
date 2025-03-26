// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCSecurityGroupListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeRCSecurityGroupListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCSecurityGroupListRequest self = new DescribeRCSecurityGroupListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCSecurityGroupListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCSecurityGroupListRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeRCSecurityGroupListRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
