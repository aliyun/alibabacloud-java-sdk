// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyTemplateResourcesResponseBody extends TeaModel {
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
