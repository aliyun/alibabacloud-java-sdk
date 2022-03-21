// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceNameResponseBody extends TeaModel {
    // Oceanbase集群名称。
    @NameInMap("InstanceName")
    public String instanceName;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNameResponseBody self = new ModifyInstanceNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNameResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
