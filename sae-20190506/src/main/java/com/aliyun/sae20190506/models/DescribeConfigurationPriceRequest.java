// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeConfigurationPriceRequest extends TeaModel {
    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("Memory")
    public Integer memory;

    public static DescribeConfigurationPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigurationPriceRequest self = new DescribeConfigurationPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigurationPriceRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DescribeConfigurationPriceRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

}
