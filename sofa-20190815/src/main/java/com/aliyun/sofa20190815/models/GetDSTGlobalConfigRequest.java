// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDSTGlobalConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDSTGlobalConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDSTGlobalConfigRequest self = new GetDSTGlobalConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetDSTGlobalConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
