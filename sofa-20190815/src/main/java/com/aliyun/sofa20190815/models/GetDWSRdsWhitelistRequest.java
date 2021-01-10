// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSRdsWhitelistRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDWSRdsWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSRdsWhitelistRequest self = new GetDWSRdsWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSRdsWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
