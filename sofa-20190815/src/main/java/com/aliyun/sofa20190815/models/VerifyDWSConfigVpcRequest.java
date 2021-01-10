// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class VerifyDWSConfigVpcRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static VerifyDWSConfigVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDWSConfigVpcRequest self = new VerifyDWSConfigVpcRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDWSConfigVpcRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
