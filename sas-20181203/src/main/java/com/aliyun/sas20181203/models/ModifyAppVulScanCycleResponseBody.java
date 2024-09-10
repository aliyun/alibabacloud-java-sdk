// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAppVulScanCycleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AFEDC54D-70A2-5E56-A69B-E3D8AA8A5197</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppVulScanCycleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppVulScanCycleResponseBody self = new ModifyAppVulScanCycleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppVulScanCycleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
