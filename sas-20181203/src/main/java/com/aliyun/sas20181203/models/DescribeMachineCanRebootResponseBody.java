// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeMachineCanRebootResponseBody extends TeaModel {
    @NameInMap("CanReboot")
    public Boolean canReboot;

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
