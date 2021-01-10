// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSConfigVpcwhitelistRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDWSConfigVpcwhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSConfigVpcwhitelistRequest self = new GetDWSConfigVpcwhitelistRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSConfigVpcwhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
