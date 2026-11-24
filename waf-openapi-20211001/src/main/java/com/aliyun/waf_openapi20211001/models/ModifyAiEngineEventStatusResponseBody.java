// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyAiEngineEventStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>01A<strong><strong>E2-1219-019A-8B44-2557</strong></strong>*</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAiEngineEventStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAiEngineEventStatusResponseBody self = new ModifyAiEngineEventStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAiEngineEventStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
