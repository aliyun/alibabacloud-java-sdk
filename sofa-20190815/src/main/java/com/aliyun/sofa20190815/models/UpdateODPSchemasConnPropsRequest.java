// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateODPSchemasConnPropsRequest extends TeaModel {
    @NameInMap("ConnectionPropertiesJsonStr")
    public String connectionPropertiesJsonStr;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    public static UpdateODPSchemasConnPropsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateODPSchemasConnPropsRequest self = new UpdateODPSchemasConnPropsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateODPSchemasConnPropsRequest setConnectionPropertiesJsonStr(String connectionPropertiesJsonStr) {
        this.connectionPropertiesJsonStr = connectionPropertiesJsonStr;
        return this;
    }
    public String getConnectionPropertiesJsonStr() {
        return this.connectionPropertiesJsonStr;
    }

    public UpdateODPSchemasConnPropsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateODPSchemasConnPropsRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public UpdateODPSchemasConnPropsRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

}
