// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVpcHoneyPotRequest extends TeaModel {
    /**
     * <p>The VPC ID of the honeypot instance that you want to delete.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeVpcHoneyPotList~~">DescribeVpcHoneyPotList</a> operation to obtain the VPC ID of the honeypot instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-d7o009q63fqy21r8u****</p>
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
