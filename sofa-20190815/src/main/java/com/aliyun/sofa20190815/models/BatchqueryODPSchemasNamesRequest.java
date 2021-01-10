// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPSchemasNamesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ZdalproxyInstaneId")
    public String zdalproxyInstaneId;

    public static BatchqueryODPSchemasNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPSchemasNamesRequest self = new BatchqueryODPSchemasNamesRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPSchemasNamesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchqueryODPSchemasNamesRequest setZdalproxyInstaneId(String zdalproxyInstaneId) {
        this.zdalproxyInstaneId = zdalproxyInstaneId;
        return this;
    }
    public String getZdalproxyInstaneId() {
        return this.zdalproxyInstaneId;
    }

}
