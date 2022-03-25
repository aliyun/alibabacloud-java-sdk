// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class UpdateInstanceV2ResponseBody extends TeaModel {
    // 工作空间Id
    @NameInMap("InstanceId")
    public String instanceId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInstanceV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceV2ResponseBody self = new UpdateInstanceV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceV2ResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
