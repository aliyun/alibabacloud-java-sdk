// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the specified container cluster.</p>
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to obtain the cluster ID.</p>
     * <br>
     * <p>This parameter is required.</p>
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
