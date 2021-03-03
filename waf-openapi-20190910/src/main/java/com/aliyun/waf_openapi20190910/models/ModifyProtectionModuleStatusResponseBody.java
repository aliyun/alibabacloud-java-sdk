// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class ModifyProtectionModuleStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyProtectionModuleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtectionModuleStatusResponseBody self = new ModifyProtectionModuleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyProtectionModuleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
