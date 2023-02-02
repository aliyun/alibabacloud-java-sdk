// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyParametersRequest extends TeaModel {
    /**
     * <p>The type of the parameter.   </p>
     * <p>Valid values: CLUSTER and TENANT.</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <p>The resource ID of the parameter type.    </p>
     * <p>You can leave this parameter unspecified when you call this operation to modify cluster parameters. In the case of tenant parameters, pass the tenant ID.</p>
     */
    @NameInMap("DimensionValue")
    public String dimensionValue;

    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The parameters.   </p>
     * <p>It is a JSON array. Each object in the array has two elements: Name and Value. </p>
     * <br>
     * <p>> <br>The names and values of cluster parameters that can be modified are different from those of tenant parameters. For more information, see DescribeParameters.</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    public static ModifyParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyParametersRequest self = new ModifyParametersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyParametersRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public ModifyParametersRequest setDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
        return this;
    }
    public String getDimensionValue() {
        return this.dimensionValue;
    }

    public ModifyParametersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyParametersRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}
