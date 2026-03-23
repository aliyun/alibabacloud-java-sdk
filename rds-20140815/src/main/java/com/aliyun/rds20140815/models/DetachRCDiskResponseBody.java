// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DetachRCDiskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetachRCDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachRCDiskResponseBody self = new DetachRCDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachRCDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
