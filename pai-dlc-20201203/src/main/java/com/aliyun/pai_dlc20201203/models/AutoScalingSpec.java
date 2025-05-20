// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class AutoScalingSpec extends TeaModel {
    @NameInMap("ScalingStrategy")
    public String scalingStrategy;

    public static AutoScalingSpec build(java.util.Map<String, ?> map) throws Exception {
        AutoScalingSpec self = new AutoScalingSpec();
        return TeaModel.build(map, self);
    }

    public AutoScalingSpec setScalingStrategy(String scalingStrategy) {
        this.scalingStrategy = scalingStrategy;
        return this;
    }
    public String getScalingStrategy() {
        return this.scalingStrategy;
    }

}
