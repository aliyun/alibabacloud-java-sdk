// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateMigrationEndpointResponseBody extends TeaModel {
    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateMigrationEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationEndpointResponseBody self = new CreateMigrationEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMigrationEndpointResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public CreateMigrationEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
