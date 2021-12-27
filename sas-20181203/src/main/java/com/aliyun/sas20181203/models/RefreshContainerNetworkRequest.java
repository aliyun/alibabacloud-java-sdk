// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshContainerNetworkRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static RefreshContainerNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshContainerNetworkRequest self = new RefreshContainerNetworkRequest();
        return TeaModel.build(map, self);
    }

    public RefreshContainerNetworkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
