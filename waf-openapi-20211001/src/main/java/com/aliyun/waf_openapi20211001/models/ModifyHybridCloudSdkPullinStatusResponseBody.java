// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudSdkPullinStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B191**EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHybridCloudSdkPullinStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudSdkPullinStatusResponseBody self = new ModifyHybridCloudSdkPullinStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudSdkPullinStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
