// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockDeleteConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>299D0992-271A-5750-ACEB-46D322862BFF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebLockDeleteConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockDeleteConfigResponseBody self = new ModifyWebLockDeleteConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockDeleteConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
