// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class GetSDKInstanceDebugInfoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetSDKInstanceDebugInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSDKInstanceDebugInfoRequest self = new GetSDKInstanceDebugInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetSDKInstanceDebugInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
