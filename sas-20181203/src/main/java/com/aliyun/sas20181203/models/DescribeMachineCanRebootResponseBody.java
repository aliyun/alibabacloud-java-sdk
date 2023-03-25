// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeMachineCanRebootResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the server can be restarted. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("CanReboot")
    public Boolean canReboot;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMachineCanRebootResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineCanRebootResponseBody self = new DescribeMachineCanRebootResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMachineCanRebootResponseBody setCanReboot(Boolean canReboot) {
        this.canReboot = canReboot;
        return this;
    }
    public Boolean getCanReboot() {
        return this.canReboot;
    }

    public DescribeMachineCanRebootResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
