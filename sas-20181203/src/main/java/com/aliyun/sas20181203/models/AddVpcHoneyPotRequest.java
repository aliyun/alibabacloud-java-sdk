// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddVpcHoneyPotRequest extends TeaModel {
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpcSwitchId")
    public String vpcSwitchId;

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

    public AddVpcHoneyPotRequest setVpcSwitchId(String vpcSwitchId) {
        this.vpcSwitchId = vpcSwitchId;
        return this;
    }
    public String getVpcSwitchId() {
        return this.vpcSwitchId;
    }

}
