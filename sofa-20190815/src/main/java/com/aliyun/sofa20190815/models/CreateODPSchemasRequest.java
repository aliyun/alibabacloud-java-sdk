// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateODPSchemasRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SchemaJsonStr")
    public String schemaJsonStr;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateODPSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateODPSchemasRequest self = new CreateODPSchemasRequest();
        return TeaModel.build(map, self);
    }

    public CreateODPSchemasRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateODPSchemasRequest setSchemaJsonStr(String schemaJsonStr) {
        this.schemaJsonStr = schemaJsonStr;
        return this;
    }
    public String getSchemaJsonStr() {
        return this.schemaJsonStr;
    }

    public CreateODPSchemasRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
