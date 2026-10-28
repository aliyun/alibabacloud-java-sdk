// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class StatisticsResources extends TeaModel {
    /**
     * <p>The amount of CPU resources.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("CPU")
    public String CPU;

    /**
     * <p>The amount of GPU resources.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GPU")
    public String GPU;

    /**
     * <p>The number of hypernodes.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HyperNodeNum")
    public Long hyperNodeNum;

    /**
     * <p>The amount of memory resources.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("Memory")
    public String memory;

    /**
     * <p>The number of nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
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
