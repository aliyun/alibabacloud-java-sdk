// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserDescriptionResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTenantUserDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUserDescriptionResponseBody self = new ModifyTenantUserDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTenantUserDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
