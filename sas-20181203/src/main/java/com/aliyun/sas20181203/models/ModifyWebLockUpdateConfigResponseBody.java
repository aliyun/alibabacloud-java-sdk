// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockUpdateConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebLockUpdateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockUpdateConfigResponseBody self = new ModifyWebLockUpdateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockUpdateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
