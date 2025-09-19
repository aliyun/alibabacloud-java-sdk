// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UnBindHybridProxyRequest extends TeaModel {
    /**
     * <p>The name of the proxy cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy-test</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The UUIDs of the servers that you want to remove from the proxy cluster.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("YundunUuids")
    public java.util.List<String> yundunUuids;

    public static UnBindHybridProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        UnBindHybridProxyRequest self = new UnBindHybridProxyRequest();
        return TeaModel.build(map, self);
    }

    public UnBindHybridProxyRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UnBindHybridProxyRequest setYundunUuids(java.util.List<String> yundunUuids) {
        this.yundunUuids = yundunUuids;
        return this;
    }
    public java.util.List<String> getYundunUuids() {
        return this.yundunUuids;
    }

}
