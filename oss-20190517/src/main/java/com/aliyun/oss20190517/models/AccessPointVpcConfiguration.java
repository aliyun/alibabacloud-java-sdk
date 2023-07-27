// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class AccessPointVpcConfiguration extends TeaModel {
    @NameInMap("VpcId")
    public String vpcId;

    public static AccessPointVpcConfiguration build(java.util.Map<String, ?> map) throws Exception {
        AccessPointVpcConfiguration self = new AccessPointVpcConfiguration();
        return TeaModel.build(map, self);
    }

    public AccessPointVpcConfiguration setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
