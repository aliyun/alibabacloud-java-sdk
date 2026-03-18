// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class CheckInventoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;clusterType&quot;: &quot;sr&quot;,
     *   &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
     *   &quot;packageType&quot;: &quot;official&quot;,
     *   &quot;runMode&quot;: &quot;shared_data&quot;,
     *   &quot;beResourceSpec&quot;: {
     *     &quot;cu&quot;: 8,
     *     &quot;storageSize&quot;: 200,
     *     &quot;nodeNumber&quot;: 3,
     *     &quot;diskNumber&quot;: 1,
     *     &quot;storagePerformanceLevel&quot;: &quot;pl1&quot;,
     *     &quot;diskType&quot;: &quot;essd&quot;,
     *     &quot;specType&quot;: &quot;standard&quot;
     *   },
     *   &quot;feResourceSpec&quot;: {
     *     &quot;cu&quot;: 8,
     *     &quot;storageSize&quot;: 100,
     *     &quot;nodeNumber&quot;: 3,
     *     &quot;specType&quot;: &quot;standard&quot;
     *   }
     * }</p>
     */
    @NameInMap("ClusterInfo")
    public String clusterInfo;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CheckInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckInventoryRequest self = new CheckInventoryRequest();
        return TeaModel.build(map, self);
    }

    public CheckInventoryRequest setClusterInfo(String clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }
    public String getClusterInfo() {
        return this.clusterInfo;
    }

    public CheckInventoryRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
