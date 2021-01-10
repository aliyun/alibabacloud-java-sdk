// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateODPSchemasPhysicalSchemaAuthInfosRequest extends TeaModel {
    @NameInMap("AuthInfoJsonStr")
    public String authInfoJsonStr;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateODPSchemasPhysicalSchemaAuthInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateODPSchemasPhysicalSchemaAuthInfosRequest self = new UpdateODPSchemasPhysicalSchemaAuthInfosRequest();
        return TeaModel.build(map, self);
    }

    public UpdateODPSchemasPhysicalSchemaAuthInfosRequest setAuthInfoJsonStr(String authInfoJsonStr) {
        this.authInfoJsonStr = authInfoJsonStr;
        return this;
    }
    public String getAuthInfoJsonStr() {
        return this.authInfoJsonStr;
    }

    public UpdateODPSchemasPhysicalSchemaAuthInfosRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
