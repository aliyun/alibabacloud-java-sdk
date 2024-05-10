// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindHybridProxyRequest extends TeaModel {
    /**
     * <p>The name of the proxy cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The UUIDs of servers that you want to add to Security Center over the proxy server.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
