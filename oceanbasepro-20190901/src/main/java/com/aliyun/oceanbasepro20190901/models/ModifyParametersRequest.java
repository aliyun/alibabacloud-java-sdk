// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyParametersRequest extends TeaModel {
    // 参数类型。 当前支持集群（CLUSTER)和租户（TENANT）
    @NameInMap("Dimension")
    public String dimension;

    // 参数类型的资源标识。 如果为集群参数可以不填，若为租户的参数，则传入租户的TenantId。
    @NameInMap("DimensionValue")
    public String dimensionValue;

    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 参数信息。 其为一个Json格式的数组，数组中每个对象包括两个元素：参数名称（Name）和参数值（Value）。 注意：集群和租户可修改的参数名称和参数值的范围不同，详见DescribeParameters。
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
