// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteMigrationEndpointRequest extends TeaModel {
    @NameInMap("EndpointId")
    public String endpointId;

    public static DeleteMigrationEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMigrationEndpointRequest self = new DeleteMigrationEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMigrationEndpointRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

}
