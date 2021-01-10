// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDWSVpcAppRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VpcAppJsonStr")
    public String vpcAppJsonStr;

    public static CreateDWSVpcAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDWSVpcAppRequest self = new CreateDWSVpcAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateDWSVpcAppRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDWSVpcAppRequest setVpcAppJsonStr(String vpcAppJsonStr) {
        this.vpcAppJsonStr = vpcAppJsonStr;
        return this;
    }
    public String getVpcAppJsonStr() {
        return this.vpcAppJsonStr;
    }

}
