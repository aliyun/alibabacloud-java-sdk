// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AuthDWSVpcAccessRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VpcGrantInstanceJsonStr")
    public String vpcGrantInstanceJsonStr;

    public static AuthDWSVpcAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthDWSVpcAccessRequest self = new AuthDWSVpcAccessRequest();
        return TeaModel.build(map, self);
    }

    public AuthDWSVpcAccessRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AuthDWSVpcAccessRequest setVpcGrantInstanceJsonStr(String vpcGrantInstanceJsonStr) {
        this.vpcGrantInstanceJsonStr = vpcGrantInstanceJsonStr;
        return this;
    }
    public String getVpcGrantInstanceJsonStr() {
        return this.vpcGrantInstanceJsonStr;
    }

}
