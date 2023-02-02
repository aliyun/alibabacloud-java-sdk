// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeParametersRequest extends TeaModel {
    /**
     * <p>The type of the parameter.    </p>
     * <p>Valid values: CLUSTER and TENANT.</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <p>The resource ID of the parameter type.   </p>
     * <p>You can leave this parameter unspecified when you call this operation to query cluster parameters. In the case of tenant parameters, pass the tenant ID.</p>
     */
    @NameInMap("DimensionValue")
    public String dimensionValue;

    /**
     * <p>The ID of the OceanBase cluster.</p>
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
