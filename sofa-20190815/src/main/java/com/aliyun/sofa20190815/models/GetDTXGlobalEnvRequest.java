// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXGlobalEnvRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDTXGlobalEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDTXGlobalEnvRequest self = new GetDTXGlobalEnvRequest();
        return TeaModel.build(map, self);
    }

    public GetDTXGlobalEnvRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
