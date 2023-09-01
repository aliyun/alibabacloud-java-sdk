// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallRaspAttachResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UninstallRaspAttachResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallRaspAttachResponseBody self = new UninstallRaspAttachResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallRaspAttachResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
