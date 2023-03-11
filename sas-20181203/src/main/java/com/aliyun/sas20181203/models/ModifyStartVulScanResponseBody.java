// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStartVulScanResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyStartVulScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyStartVulScanResponseBody self = new ModifyStartVulScanResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyStartVulScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
