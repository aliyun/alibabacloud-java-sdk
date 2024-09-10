// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OpenBackupAutoConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ADE57832-9666-511C-9A80-B87DE2E8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenBackupAutoConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenBackupAutoConfigResponseBody self = new OpenBackupAutoConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenBackupAutoConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
