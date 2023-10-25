// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyHighDefinationMonitorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("Success")
    public String success;

    public static ModifyHighDefinationMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHighDefinationMonitorResponseBody self = new ModifyHighDefinationMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHighDefinationMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyHighDefinationMonitorResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
