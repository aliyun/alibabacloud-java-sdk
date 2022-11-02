// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseTemplateStatusResponseBody extends TeaModel {
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
