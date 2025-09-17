// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHybridCloudClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudClusterResponseBody self = new ModifyHybridCloudClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
