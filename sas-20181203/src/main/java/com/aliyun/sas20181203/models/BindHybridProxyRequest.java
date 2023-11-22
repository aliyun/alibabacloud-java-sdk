// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindHybridProxyRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("YundunUuids")
    public java.util.List<String> yundunUuids;

    public static BindHybridProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        BindHybridProxyRequest self = new BindHybridProxyRequest();
        return TeaModel.build(map, self);
    }

    public BindHybridProxyRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public BindHybridProxyRequest setYundunUuids(java.util.List<String> yundunUuids) {
        this.yundunUuids = yundunUuids;
        return this;
    }
    public java.util.List<String> getYundunUuids() {
        return this.yundunUuids;
    }

}
