// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteMPURuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMPURuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMPURuleResponseBody self = new DeleteMPURuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMPURuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
