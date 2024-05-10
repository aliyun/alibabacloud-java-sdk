// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterBasicInfoRequest extends TeaModel {
    /**
     * <p>The ID of the cluster that you want to query.</p>
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The dimension from which you want to configure the feature. Valid values:</p>
     * <br>
     * <p>*   **Cluster**: the ID of the cluster</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The type of the feature. Valid values:</p>
     * <br>
     * <p>*   **containerNetwork**: container network topology</p>
     * <p>*   **interceptionSwitch**: cluster microsegmentation</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeClusterBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterBasicInfoRequest self = new DescribeClusterBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterBasicInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterBasicInfoRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public DescribeClusterBasicInfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
