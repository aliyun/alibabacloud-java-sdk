// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20191209.models;

import com.aliyun.tea.*;

public class ModifyInstanceStorageResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceStorageResponseBody self = new ModifyInstanceStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceStorageResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
