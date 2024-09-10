// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyEmgVulSubmitResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>52A3AEE6-114A-499D-8990-4BA9B27FE0AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyEmgVulSubmitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyEmgVulSubmitResponseBody self = new ModifyEmgVulSubmitResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyEmgVulSubmitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
