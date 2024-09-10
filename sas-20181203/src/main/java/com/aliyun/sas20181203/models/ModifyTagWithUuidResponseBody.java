// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyTagWithUuidResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>70C4B40D-D55E-4B7B-9992-8535E396B2F4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTagWithUuidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagWithUuidResponseBody self = new ModifyTagWithUuidResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTagWithUuidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
