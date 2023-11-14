// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallHybridProxyRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("InstallCode")
    public String installCode;

    @NameInMap("YundunUuids")
    public java.util.List<String> yundunUuids;

    public static InstallHybridProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallHybridProxyRequest self = new InstallHybridProxyRequest();
        return TeaModel.build(map, self);
    }

    public InstallHybridProxyRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public InstallHybridProxyRequest setInstallCode(String installCode) {
        this.installCode = installCode;
        return this;
    }
    public String getInstallCode() {
        return this.installCode;
    }

    public InstallHybridProxyRequest setYundunUuids(java.util.List<String> yundunUuids) {
        this.yundunUuids = yundunUuids;
        return this;
    }
    public java.util.List<String> getYundunUuids() {
        return this.yundunUuids;
    }

}
