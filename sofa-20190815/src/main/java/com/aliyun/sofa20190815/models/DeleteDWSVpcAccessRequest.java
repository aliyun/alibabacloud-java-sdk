// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDWSVpcAccessRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VpcGrantInstanceJsonStr")
    public String vpcGrantInstanceJsonStr;

    public static DeleteDWSVpcAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDWSVpcAccessRequest self = new DeleteDWSVpcAccessRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDWSVpcAccessRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDWSVpcAccessRequest setVpcGrantInstanceJsonStr(String vpcGrantInstanceJsonStr) {
        this.vpcGrantInstanceJsonStr = vpcGrantInstanceJsonStr;
        return this;
    }
    public String getVpcGrantInstanceJsonStr() {
        return this.vpcGrantInstanceJsonStr;
    }

}
