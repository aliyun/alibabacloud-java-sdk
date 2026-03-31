// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1A68C85D-7467-5BB1-9A7E-2E8A5D96D88A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDefenseTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseTemplateResponseBody self = new ModifyDefenseTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
