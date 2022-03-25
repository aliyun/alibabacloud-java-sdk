// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class DeleteInstanceV2ResponseBody extends TeaModel {
    // 工作空间Id
    @NameInMap("InstanceId")
    public String instanceId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstanceV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceV2ResponseBody self = new DeleteInstanceV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceV2ResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteInstanceV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
