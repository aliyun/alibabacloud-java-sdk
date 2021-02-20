// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class EnableMPURuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableMPURuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableMPURuleResponseBody self = new EnableMPURuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableMPURuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
