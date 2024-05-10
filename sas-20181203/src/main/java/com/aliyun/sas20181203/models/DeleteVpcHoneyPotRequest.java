// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVpcHoneyPotRequest extends TeaModel {
    /**
     * <p>The ID of the virtual private cloud (VPC) on which the honeypot is deployed.</p>
     * <br>
     * <p>> You can call the [DescribeVpcHoneyPotList](~~DescribeVpcHoneyPotList~~) operation to query the IDs of VPCs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DeleteVpcHoneyPotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcHoneyPotRequest self = new DeleteVpcHoneyPotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpcHoneyPotRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
