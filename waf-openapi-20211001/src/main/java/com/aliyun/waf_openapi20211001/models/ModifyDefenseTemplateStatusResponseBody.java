// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseTemplateStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>58007AE3-65D9-57BA-ABB4-1A544015FB50</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDefenseTemplateStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseTemplateStatusResponseBody self = new ModifyDefenseTemplateStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseTemplateStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
