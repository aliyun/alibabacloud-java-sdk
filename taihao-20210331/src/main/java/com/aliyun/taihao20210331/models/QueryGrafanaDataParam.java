// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class QueryGrafanaDataParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // data
    @NameInMap("data")
    public String data;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static QueryGrafanaDataParam build(java.util.Map<String, ?> map) throws Exception {
        QueryGrafanaDataParam self = new QueryGrafanaDataParam();
        return TeaModel.build(map, self);
    }

    public QueryGrafanaDataParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryGrafanaDataParam setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryGrafanaDataParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
