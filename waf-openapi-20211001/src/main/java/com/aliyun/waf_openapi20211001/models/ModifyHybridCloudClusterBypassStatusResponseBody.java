// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudClusterBypassStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHybridCloudClusterBypassStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudClusterBypassStatusResponseBody self = new ModifyHybridCloudClusterBypassStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudClusterBypassStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
