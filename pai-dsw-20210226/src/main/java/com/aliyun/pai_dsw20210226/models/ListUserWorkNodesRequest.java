// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListUserWorkNodesRequest extends TeaModel {
    // 集群id
    @NameInMap("ClusterId")
    public String clusterId;

    public static ListUserWorkNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserWorkNodesRequest self = new ListUserWorkNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserWorkNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
