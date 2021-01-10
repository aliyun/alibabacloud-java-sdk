// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportODPSchemasRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    public static ExportODPSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportODPSchemasRequest self = new ExportODPSchemasRequest();
        return TeaModel.build(map, self);
    }

    public ExportODPSchemasRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportODPSchemasRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public ExportODPSchemasRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

}
