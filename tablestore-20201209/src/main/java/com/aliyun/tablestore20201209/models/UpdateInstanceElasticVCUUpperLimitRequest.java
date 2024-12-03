// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UpdateInstanceElasticVCUUpperLimitRequest extends TeaModel {
    /**
     * <p>The upper limit for the VCUs of the instance.</p>
     * <blockquote>
     * <p> Valid values of the upper limit for the VCUs of an instance: <strong>Number of reserved VCUs+0.1 to 2000</strong>. You can upgrade or downgrade configurations to modify the number of reserved VCUs by increments or decrements of 1. You can dynamically modify the upper limit for the VCUs of an instance by increments or decrements of 0.1</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("ElasticVCUUpperLimit")
    public Float elasticVCUUpperLimit;

    /**
     * <p>The name of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>workshop-bj-ots1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    public static UpdateInstanceElasticVCUUpperLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceElasticVCUUpperLimitRequest self = new UpdateInstanceElasticVCUUpperLimitRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceElasticVCUUpperLimitRequest setElasticVCUUpperLimit(Float elasticVCUUpperLimit) {
        this.elasticVCUUpperLimit = elasticVCUUpperLimit;
        return this;
    }
    public Float getElasticVCUUpperLimit() {
        return this.elasticVCUUpperLimit;
    }

    public UpdateInstanceElasticVCUUpperLimitRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
