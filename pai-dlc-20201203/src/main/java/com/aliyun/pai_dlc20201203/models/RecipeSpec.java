// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RecipeSpec extends TeaModel {
    /**
     * <p>The CPU specification of a single pod, represented as a Kubernetes quantity string such as &quot;4&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CPU")
    public String CPU;

    /**
     * <p>The name of the ECS instance specification. This field is not supported when starting an RLJob. Omit this field. A non-empty value returns Recipe.InvalidParameter. The example only illustrates the name format.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.gn7i-c8g1.2xlarge</p>
     */
    @NameInMap("EcsSpec")
    public String ecsSpec;

    /**
     * <p>The number of GPUs for a single pod, such as &quot;1&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GPU")
    public String GPU;

    /**
     * <p>The GPU type, such as &quot;A100&quot;. You can obtain the supported values from the existing quota or specification API.</p>
     * 
     * <strong>example:</strong>
     * <p>A100</p>
     */
    @NameInMap("GPUType")
    public String GPUType;

    /**
     * <p>The memory specification of a single pod, represented as a Kubernetes quantity string such as &quot;8Gi&quot;. This refers to the host memory rather than the GPU memory.</p>
     * 
     * <strong>example:</strong>
     * <p>8Gi</p>
     */
    @NameInMap("Memory")
    public String memory;

    /**
     * <p>The number of pods for the entry. The default value is 1. This parameter takes effect only when the value is greater than 0. Otherwise, the downstream RLJob uses the default value of 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PodCount")
    public Integer podCount;

    /**
     * <p>The quota ID. The current RLJob startup path requires a single quota. Multiple quotas are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>quotag2uo09dyp40</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The shared memory specification of a single pod, represented as a Kubernetes quantity string such as &quot;4Gi&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>4Gi</p>
     */
    @NameInMap("SharedMemory")
    public String sharedMemory;

    public static RecipeSpec build(java.util.Map<String, ?> map) throws Exception {
        RecipeSpec self = new RecipeSpec();
        return TeaModel.build(map, self);
    }

    public RecipeSpec setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }
    public String getCPU() {
        return this.CPU;
    }

    public RecipeSpec setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public RecipeSpec setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }
    public String getGPU() {
        return this.GPU;
    }

    public RecipeSpec setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public RecipeSpec setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public RecipeSpec setPodCount(Integer podCount) {
        this.podCount = podCount;
        return this;
    }
    public Integer getPodCount() {
        return this.podCount;
    }

    public RecipeSpec setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public RecipeSpec setSharedMemory(String sharedMemory) {
        this.sharedMemory = sharedMemory;
        return this;
    }
    public String getSharedMemory() {
        return this.sharedMemory;
    }

}
