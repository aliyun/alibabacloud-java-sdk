// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateODPSchemasInterceptorsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SqlInterceptJsonStr")
    public String sqlInterceptJsonStr;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    public static CreateODPSchemasInterceptorsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateODPSchemasInterceptorsRequest self = new CreateODPSchemasInterceptorsRequest();
        return TeaModel.build(map, self);
    }

    public CreateODPSchemasInterceptorsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateODPSchemasInterceptorsRequest setSqlInterceptJsonStr(String sqlInterceptJsonStr) {
        this.sqlInterceptJsonStr = sqlInterceptJsonStr;
        return this;
    }
    public String getSqlInterceptJsonStr() {
        return this.sqlInterceptJsonStr;
    }

    public CreateODPSchemasInterceptorsRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

}
