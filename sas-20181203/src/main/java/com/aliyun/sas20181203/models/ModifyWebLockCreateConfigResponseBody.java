// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockCreateConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebLockCreateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockCreateConfigResponseBody self = new ModifyWebLockCreateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockCreateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
