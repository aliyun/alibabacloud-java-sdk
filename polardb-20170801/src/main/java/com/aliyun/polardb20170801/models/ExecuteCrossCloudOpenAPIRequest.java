// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ExecuteCrossCloudOpenAPIRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;Action&quot;:&quot;DescribeDBClusters&quot;}</p>
     */
    @NameInMap("ProxyInfo")
    public String proxyInfo;

    public static ExecuteCrossCloudOpenAPIRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteCrossCloudOpenAPIRequest self = new ExecuteCrossCloudOpenAPIRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteCrossCloudOpenAPIRequest setProxyInfo(String proxyInfo) {
        this.proxyInfo = proxyInfo;
        return this;
    }
    public String getProxyInfo() {
        return this.proxyInfo;
    }

}
