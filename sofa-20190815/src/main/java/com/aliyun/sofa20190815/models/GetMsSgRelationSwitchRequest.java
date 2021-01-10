// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsSgRelationSwitchRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetMsSgRelationSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMsSgRelationSwitchRequest self = new GetMsSgRelationSwitchRequest();
        return TeaModel.build(map, self);
    }

    public GetMsSgRelationSwitchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
