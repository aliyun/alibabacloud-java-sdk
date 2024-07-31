// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudGroupExpansionServerResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BD7F9A1-0E72-5BC1-8248-C629B4***B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHybridCloudGroupExpansionServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudGroupExpansionServerResponseBody self = new ModifyHybridCloudGroupExpansionServerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudGroupExpansionServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
