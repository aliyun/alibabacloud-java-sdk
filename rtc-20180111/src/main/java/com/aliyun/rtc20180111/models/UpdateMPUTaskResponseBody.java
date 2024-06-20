// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateMPUTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>760bad53276431c499e30dc36f6b26be</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMPUTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMPUTaskResponseBody self = new UpdateMPUTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMPUTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
