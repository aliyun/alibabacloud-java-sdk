// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterInfoListRequest extends TeaModel {
    /**
     * <p>The operation value. The value specifies the ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>c23551de6149343e8a54e69fbefe6****</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The dimension based on which you want to configure the feature. Valid values:</p>
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
     * <li><strong>containerNetwork</strong>: container network</li>
     * <li><strong>interceptionSwitch</strong>: cluster microsegmentation</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>containerNetwork</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeClusterInfoListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterInfoListRequest self = new DescribeClusterInfoListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterInfoListRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public DescribeClusterInfoListRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public DescribeClusterInfoListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
