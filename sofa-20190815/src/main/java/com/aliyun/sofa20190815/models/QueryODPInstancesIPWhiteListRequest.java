// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPInstancesIPWhiteListRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    public static QueryODPInstancesIPWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryODPInstancesIPWhiteListRequest self = new QueryODPInstancesIPWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public QueryODPInstancesIPWhiteListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryODPInstancesIPWhiteListRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

}
