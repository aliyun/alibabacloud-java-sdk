// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockUnbindResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F0A8A039-930D-5EC1-97C8-43F05776188A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebLockUnbindResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockUnbindResponseBody self = new ModifyWebLockUnbindResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockUnbindResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
