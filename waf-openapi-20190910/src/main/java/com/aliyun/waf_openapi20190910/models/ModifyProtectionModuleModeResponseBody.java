// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionModuleModeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyProtectionModuleModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionModuleModeResponseBody self = new ModifyProtectionModuleModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionModuleModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
