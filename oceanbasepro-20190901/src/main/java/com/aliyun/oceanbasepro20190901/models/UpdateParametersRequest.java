// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class UpdateParametersRequest extends TeaModel {
    @NameInMap("Dimension")
    public String dimension;

    @NameInMap("DimensionValue")
    public String dimensionValue;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Parameters")
    public String parameters;

    public static UpdateParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateParametersRequest self = new UpdateParametersRequest();
        return TeaModel.build(map, self);
    }

    public UpdateParametersRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public UpdateParametersRequest setDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
        return this;
    }
    public String getDimensionValue() {
        return this.dimensionValue;
    }

    public UpdateParametersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateParametersRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}
