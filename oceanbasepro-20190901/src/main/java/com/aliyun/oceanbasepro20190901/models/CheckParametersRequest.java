// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CheckParametersRequest extends TeaModel {
    @NameInMap("Dimension")
    public String dimension;

    @NameInMap("DimensionValue")
    public String dimensionValue;

    @NameInMap("Parameters")
    public String parameters;

    public static CheckParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckParametersRequest self = new CheckParametersRequest();
        return TeaModel.build(map, self);
    }

    public CheckParametersRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public CheckParametersRequest setDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
        return this;
    }
    public String getDimensionValue() {
        return this.dimensionValue;
    }

    public CheckParametersRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}
