// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCClusterConfigResponseBody extends TeaModel {
    /**
     * <p>The kubeconfig file of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: v1****</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The expiration time of the kubeconfig file. Format: the UTC time in the RFC3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-10T09:56:17Z</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E9DD55F4-1A5F-48CA-BA57-DFB3CA8C4C34</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRCClusterConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCClusterConfigResponseBody self = new DescribeRCClusterConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCClusterConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeRCClusterConfigResponseBody setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public DescribeRCClusterConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
