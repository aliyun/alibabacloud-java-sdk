// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseResourceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDefenseResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseResourceGroupResponseBody self = new ModifyDefenseResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
