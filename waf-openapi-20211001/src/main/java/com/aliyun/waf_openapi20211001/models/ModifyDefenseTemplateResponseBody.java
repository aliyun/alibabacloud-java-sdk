// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseTemplateResponseBody extends TeaModel {
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
