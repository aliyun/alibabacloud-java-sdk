// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddVpcHoneyPotRequest extends TeaModel {
    /**
     * <p>The ID of the virtual private cloud (VPC) in which you want to create a honeypot.</p>
     * <br>
     * <p>> You can call the [DescribeVpcList](~~DescribeVpcList~~) operation to obtain the VPC ID. The VPC ID is the value of the InstanceId parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static AddVpcHoneyPotRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVpcHoneyPotRequest self = new AddVpcHoneyPotRequest();
        return TeaModel.build(map, self);
    }

    public AddVpcHoneyPotRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
