// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddDWSVpcRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VpcmodelJsonStr")
    public String vpcmodelJsonStr;

    public static AddDWSVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDWSVpcRequest self = new AddDWSVpcRequest();
        return TeaModel.build(map, self);
    }

    public AddDWSVpcRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDWSVpcRequest setVpcmodelJsonStr(String vpcmodelJsonStr) {
        this.vpcmodelJsonStr = vpcmodelJsonStr;
        return this;
    }
    public String getVpcmodelJsonStr() {
        return this.vpcmodelJsonStr;
    }

}
