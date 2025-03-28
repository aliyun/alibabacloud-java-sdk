// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20191209.models;

import com.aliyun.tea.*;

public class ClearInstanceStorageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dbaudit-cn-78v1gc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>482EF142-BFA5-43FF-B4B0-84A4B0763639</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClearInstanceStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearInstanceStorageResponseBody self = new ClearInstanceStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearInstanceStorageResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ClearInstanceStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
