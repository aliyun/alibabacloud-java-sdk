// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterBasicInfoRequest extends TeaModel {
    /**
     * <p>The ID of the cluster that you want to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c870ec78ecbcb41d2a35c679823ef****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The dimension from which you want to configure the feature. Valid values:</p>
     * <ul>
     * <li><strong>Cluster</strong>: the ID of the cluster</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cluster</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The type of the feature. Valid values:</p>
     * <ul>
     * <li><strong>containerNetwork</strong>: container network topology</li>
     * <li><strong>interceptionSwitch</strong>: cluster microsegmentation</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>containerNetwork</p>
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
