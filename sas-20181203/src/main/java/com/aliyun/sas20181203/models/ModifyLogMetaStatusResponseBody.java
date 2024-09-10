// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLogMetaStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>861445A7-B6D6-5825-B015-CD46ED90613A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLogMetaStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogMetaStatusResponseBody self = new ModifyLogMetaStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLogMetaStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
