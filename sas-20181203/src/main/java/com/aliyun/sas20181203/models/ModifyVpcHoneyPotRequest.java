// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVpcHoneyPotRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable or disable the honeypot. Valid values:</p>
     * <ul>
     * <li><strong>disable</strong></li>
     * <li><strong>enable</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disable</p>
     */
    @NameInMap("HoneyPotAction")
    public String honeyPotAction;

    /**
     * <p>The ID of the virtual private cloud (VPC) on which the honeypot is deployed.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeVpcHoneyPotList~~">DescribeVpcHoneyPotList</a> operation to query the IDs of VPCs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-d7o009q63fqy21r8u****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ModifyVpcHoneyPotRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcHoneyPotRequest self = new ModifyVpcHoneyPotRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcHoneyPotRequest setHoneyPotAction(String honeyPotAction) {
        this.honeyPotAction = honeyPotAction;
        return this;
    }
    public String getHoneyPotAction() {
        return this.honeyPotAction;
    }

    public ModifyVpcHoneyPotRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
