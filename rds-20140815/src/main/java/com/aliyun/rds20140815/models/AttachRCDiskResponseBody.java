// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AttachRCDiskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C19D1668-70CB-5421-AA91-D6D8EE3AB664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachRCDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachRCDiskResponseBody self = new AttachRCDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachRCDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
