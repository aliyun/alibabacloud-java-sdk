// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class EnableHighDefinationMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static EnableHighDefinationMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableHighDefinationMonitorResponseBody self = new EnableHighDefinationMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableHighDefinationMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableHighDefinationMonitorResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
