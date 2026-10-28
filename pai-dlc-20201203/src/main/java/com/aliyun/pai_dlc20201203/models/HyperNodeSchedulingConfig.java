// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class HyperNodeSchedulingConfig extends TeaModel {
    /**
     * <p>The minimum number of available instances required when the role participates in HyperNode scheduling. The value must be greater than 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinAvailable")
    public Integer minAvailable;

    /**
     * <p>The quality policy. Currently, only AlwaysRequire is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>AlwaysRequire</p>
     */
    @NameInMap("QualityPolicy")
    public String qualityPolicy;

    public static HyperNodeSchedulingConfig build(java.util.Map<String, ?> map) throws Exception {
        HyperNodeSchedulingConfig self = new HyperNodeSchedulingConfig();
        return TeaModel.build(map, self);
    }

    public HyperNodeSchedulingConfig setMinAvailable(Integer minAvailable) {
        this.minAvailable = minAvailable;
        return this;
    }
    public Integer getMinAvailable() {
        return this.minAvailable;
    }

    public HyperNodeSchedulingConfig setQualityPolicy(String qualityPolicy) {
        this.qualityPolicy = qualityPolicy;
        return this;
    }
    public String getQualityPolicy() {
        return this.qualityPolicy;
    }

}
