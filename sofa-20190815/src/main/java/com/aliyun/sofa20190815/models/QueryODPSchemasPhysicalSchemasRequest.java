// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSchemasPhysicalSchemasRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    public static QueryODPSchemasPhysicalSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSchemasPhysicalSchemasRequest self = new QueryODPSchemasPhysicalSchemasRequest();
        return TeaModel.build(map, self);
    }

    public QueryODPSchemasPhysicalSchemasRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryODPSchemasPhysicalSchemasRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public QueryODPSchemasPhysicalSchemasRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

}
