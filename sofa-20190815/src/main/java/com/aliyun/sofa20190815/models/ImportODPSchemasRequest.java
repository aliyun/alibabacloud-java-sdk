// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportODPSchemasRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SchemaAndTableJsonStr")
    public String schemaAndTableJsonStr;

    public static ImportODPSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportODPSchemasRequest self = new ImportODPSchemasRequest();
        return TeaModel.build(map, self);
    }

    public ImportODPSchemasRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportODPSchemasRequest setSchemaAndTableJsonStr(String schemaAndTableJsonStr) {
        this.schemaAndTableJsonStr = schemaAndTableJsonStr;
        return this;
    }
    public String getSchemaAndTableJsonStr() {
        return this.schemaAndTableJsonStr;
    }

}
