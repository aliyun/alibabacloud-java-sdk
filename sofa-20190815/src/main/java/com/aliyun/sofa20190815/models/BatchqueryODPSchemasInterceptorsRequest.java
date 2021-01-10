// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPSchemasInterceptorsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    public static BatchqueryODPSchemasInterceptorsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPSchemasInterceptorsRequest self = new BatchqueryODPSchemasInterceptorsRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPSchemasInterceptorsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchqueryODPSchemasInterceptorsRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

}
