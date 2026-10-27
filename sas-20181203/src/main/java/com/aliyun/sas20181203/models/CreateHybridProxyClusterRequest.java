// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHybridProxyClusterRequest extends TeaModel {
    /**
     * <p>The name of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Chester-Test</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The endpoint of the cluster.</p>
     * <blockquote>
     * <p> You can specify an IP address or a domain name</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.xx.xx</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The description of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>remark test</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static CreateHybridProxyClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridProxyClusterRequest self = new CreateHybridProxyClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateHybridProxyClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateHybridProxyClusterRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CreateHybridProxyClusterRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
