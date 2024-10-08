// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockStartResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D9354C1A-D709-4873-9AAE-41513327B247</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebLockStartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockStartResponseBody self = new ModifyWebLockStartResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockStartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
