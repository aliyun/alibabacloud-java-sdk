// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVpcHoneyPotRequest extends TeaModel {
    @NameInMap("HoneyPotAction")
    public String honeyPotAction;

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
