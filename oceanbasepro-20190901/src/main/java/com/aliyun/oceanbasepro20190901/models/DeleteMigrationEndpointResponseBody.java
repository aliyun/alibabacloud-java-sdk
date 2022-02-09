// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteMigrationEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMigrationEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMigrationEndpointResponseBody self = new DeleteMigrationEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMigrationEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
