// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyMigrationEndpointAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMigrationEndpointAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMigrationEndpointAttributeResponseBody self = new ModifyMigrationEndpointAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMigrationEndpointAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
