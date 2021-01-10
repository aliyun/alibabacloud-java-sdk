// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RefreshODPSchemasRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    public static RefreshODPSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshODPSchemasRequest self = new RefreshODPSchemasRequest();
        return TeaModel.build(map, self);
    }

    public RefreshODPSchemasRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RefreshODPSchemasRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public RefreshODPSchemasRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

}
