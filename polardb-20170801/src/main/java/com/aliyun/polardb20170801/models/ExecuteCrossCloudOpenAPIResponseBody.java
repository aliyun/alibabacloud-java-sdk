// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ExecuteCrossCloudOpenAPIResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;ProxyData&quot;: &quot;{\&quot;DBCluster\&quot;:[{\&quot;AliyunRegionId\&quot;:\&quot;cn-beijing\&quot;,\&quot;CloudProvider\&quot;:\&quot;huawei\&quot;,\&quot;CreateTime\&quot;:\&quot;2024-11-25T14:49:10Z\&quot;,\&quot;CrossCloudRegionId\&quot;:\&quot;cn-east-3\&quot;,\&quot;DBClusterDescription\&quot;:\&quot;\&quot;,\&quot;DBClusterId\&quot;:\&quot;pc-2zej3qvf5fg******\&quot;,\&quot;DBClusterStatus\&quot;:\&quot;Creating\&quot;,\&quot;DBType\&quot;:\&quot;polardb_mysql\&quot;,\&quot;DBVersion\&quot;:\&quot;8.0\&quot;,\&quot;ProjectId\&quot;:\&quot;pj-bp1m8oh1k68******\&quot;},{\&quot;AliyunRegionId\&quot;:\&quot;cn-beijing\&quot;,\&quot;CloudProvider\&quot;:\&quot;huawei\&quot;,\&quot;CreateTime\&quot;:\&quot;2024-11-25T14:59:10Z\&quot;,\&quot;CrossCloudRegionId\&quot;:\&quot;cn-east-3\&quot;,\&quot;DBClusterDescription\&quot;:\&quot;\&quot;,\&quot;DBClusterId\&quot;:\&quot;pc-2ze29994l17******\&quot;,\&quot;DBClusterStatus\&quot;:\&quot;Running\&quot;,\&quot;DBType\&quot;:\&quot;polardb_mysql\&quot;,\&quot;DBVersion\&quot;:\&quot;8.0\&quot;,\&quot;ProjectId\&quot;:\&quot;pj-bp1m8oh1k68******\&quot;}]}&quot;,&quot;RequestId&quot;: &quot;E56531A4-E552-40BA-9C58-137B80******&quot;}</p>
     */
    @NameInMap("ProxyData")
    public String proxyData;

    /**
     * <strong>example:</strong>
     * <p>E56531A4-E552-40BA-9C58-137B80******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteCrossCloudOpenAPIResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteCrossCloudOpenAPIResponseBody self = new ExecuteCrossCloudOpenAPIResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteCrossCloudOpenAPIResponseBody setProxyData(String proxyData) {
        this.proxyData = proxyData;
        return this;
    }
    public String getProxyData() {
        return this.proxyData;
    }

    public ExecuteCrossCloudOpenAPIResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
