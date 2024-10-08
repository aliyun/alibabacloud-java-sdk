// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHybridProxyPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-idc</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    public static DescribeHybridProxyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridProxyPolicyRequest self = new DescribeHybridProxyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHybridProxyPolicyRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

}
