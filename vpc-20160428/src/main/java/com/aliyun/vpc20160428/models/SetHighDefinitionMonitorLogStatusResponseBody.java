// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class SetHighDefinitionMonitorLogStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static SetHighDefinitionMonitorLogStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetHighDefinitionMonitorLogStatusResponseBody self = new SetHighDefinitionMonitorLogStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetHighDefinitionMonitorLogStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetHighDefinitionMonitorLogStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
