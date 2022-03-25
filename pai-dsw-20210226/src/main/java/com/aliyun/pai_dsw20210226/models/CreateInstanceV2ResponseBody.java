// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceV2ResponseBody extends TeaModel {
    // 工作空间Id
    @NameInMap("InstanceId")
    public String instanceId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstanceV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceV2ResponseBody self = new CreateInstanceV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceV2ResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateInstanceV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
