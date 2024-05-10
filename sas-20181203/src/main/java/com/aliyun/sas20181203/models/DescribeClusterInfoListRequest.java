// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterInfoListRequest extends TeaModel {
    /**
     * <p>The operation value. The value specifies the ID of the cluster.</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The dimension based on which you want to configure the feature. Valid values:</p>
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
     * <p>*   **containerNetwork**: container network</p>
     * <p>*   **interceptionSwitch**: cluster microsegmentation</p>
     * <br>
     * <p>This parameter is required.</p>
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
