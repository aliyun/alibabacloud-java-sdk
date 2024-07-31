// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudServerResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>26DCD663-5EB8-5103-B270-E24A32***5F0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHybridCloudServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudServerResponseBody self = new ModifyHybridCloudServerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
