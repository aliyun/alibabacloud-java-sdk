// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVpcHoneyPotRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable or disable the honeypot. Valid values:</p>
     * <br>
     * <p>*   **disable**</p>
     * <p>*   **enable**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("HoneyPotAction")
    public String honeyPotAction;

    /**
     * <p>The ID of the virtual private cloud (VPC) on which the honeypot is deployed.</p>
     * <br>
     * <p>>  You can call the [DescribeVpcHoneyPotList](~~DescribeVpcHoneyPotList~~) operation to query the IDs of VPCs.</p>
     * <br>
     * <p>This parameter is required.</p>
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
