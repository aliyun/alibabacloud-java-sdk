// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class StatisticsResources extends TeaModel {
    @NameInMap("CPU")
    public String CPU;

    @NameInMap("GPU")
    public String GPU;

    @NameInMap("HyperNodeNum")
    public Long hyperNodeNum;

    @NameInMap("Memory")
    public String memory;

    @NameInMap("NodeNum")
    public Long nodeNum;

    public static StatisticsResources build(java.util.Map<String, ?> map) throws Exception {
        StatisticsResources self = new StatisticsResources();
        return TeaModel.build(map, self);
    }

    public StatisticsResources setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }
    public String getCPU() {
        return this.CPU;
    }

    public StatisticsResources setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }
    public String getGPU() {
        return this.GPU;
    }

    public StatisticsResources setHyperNodeNum(Long hyperNodeNum) {
        this.hyperNodeNum = hyperNodeNum;
        return this;
    }
    public Long getHyperNodeNum() {
        return this.hyperNodeNum;
    }

    public StatisticsResources setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public StatisticsResources setNodeNum(Long nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }
    public Long getNodeNum() {
        return this.nodeNum;
    }

}
