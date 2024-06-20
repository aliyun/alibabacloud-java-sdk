// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyTemplateResourcesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CF708F2F-FFB0-54D4-B1E0-B84A7CEBFB60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTemplateResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateResourcesResponseBody self = new ModifyTemplateResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
