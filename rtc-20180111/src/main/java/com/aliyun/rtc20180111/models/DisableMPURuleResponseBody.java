// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DisableMPURuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableMPURuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableMPURuleResponseBody self = new DisableMPURuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableMPURuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
