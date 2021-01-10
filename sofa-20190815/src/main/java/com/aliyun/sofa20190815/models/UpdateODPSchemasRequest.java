// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateODPSchemasRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SchemaJsonStr")
    public String schemaJsonStr;

    public static UpdateODPSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateODPSchemasRequest self = new UpdateODPSchemasRequest();
        return TeaModel.build(map, self);
    }

    public UpdateODPSchemasRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateODPSchemasRequest setSchemaJsonStr(String schemaJsonStr) {
        this.schemaJsonStr = schemaJsonStr;
        return this;
    }
    public String getSchemaJsonStr() {
        return this.schemaJsonStr;
    }

}
