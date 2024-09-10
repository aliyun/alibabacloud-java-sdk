// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterSuspEventStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c6094b964bfc145fe9e418c869e7e****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the request source. Set the value to sas.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    public static GetClusterSuspEventStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterSuspEventStatisticsRequest self = new GetClusterSuspEventStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterSuspEventStatisticsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetClusterSuspEventStatisticsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

}
