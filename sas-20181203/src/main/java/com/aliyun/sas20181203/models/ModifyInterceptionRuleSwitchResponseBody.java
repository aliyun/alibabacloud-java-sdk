// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionRuleSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInterceptionRuleSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInterceptionRuleSwitchResponseBody self = new ModifyInterceptionRuleSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInterceptionRuleSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
