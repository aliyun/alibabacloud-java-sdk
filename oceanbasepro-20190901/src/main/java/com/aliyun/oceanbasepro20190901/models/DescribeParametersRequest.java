// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeParametersRequest extends TeaModel {
    /**
     * <p>It is an online CLI tool that allows you to quickly retrieve and debug APIs. It can dynamically generate executable SDK code samples.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TENANT</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <p>Alibaba Cloud CLI</p>
     * 
     * <strong>example:</strong>
     * <p>ob2mr3oae0****</p>
     */
    @NameInMap("DimensionValue")
    public String dimensionValue;

    /**
     * <p>498529</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersRequest self = new DescribeParametersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParametersRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public DescribeParametersRequest setDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
        return this;
    }
    public String getDimensionValue() {
        return this.dimensionValue;
    }

    public DescribeParametersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
