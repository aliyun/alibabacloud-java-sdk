// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the specified container cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain the cluster ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cccfd68c474454665ace07efce924****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeContainerStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerStatisticsRequest self = new DescribeContainerStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerStatisticsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
