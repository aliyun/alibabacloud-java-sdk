// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagPortRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagPortRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagPortRoleResponseBody self = new ModifySagPortRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagPortRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
