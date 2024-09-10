// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterCheckItemWarningStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/182997.html">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cd49575861a3044d49c954e4b3911****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The server UUID.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the server UUID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>e4af3620-6895-4e2f-a641-a9d8fb53****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static GetClusterCheckItemWarningStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterCheckItemWarningStatisticsRequest self = new GetClusterCheckItemWarningStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterCheckItemWarningStatisticsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetClusterCheckItemWarningStatisticsRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
