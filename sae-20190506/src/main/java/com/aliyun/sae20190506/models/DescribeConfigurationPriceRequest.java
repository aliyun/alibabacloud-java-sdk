// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeConfigurationPriceRequest extends TeaModel {
    @NameInMap("BestEffortType")
    public String bestEffortType;

    /**
     * <p>The CPU specifications that are required for each instance. Unit: millicores. This parameter cannot be set to 0. Valid values:</p>
     * <ul>
     * <li><strong>500</strong></li>
     * <li><strong>1000</strong></li>
     * <li><strong>2000</strong></li>
     * <li><strong>4000</strong></li>
     * <li><strong>8000</strong></li>
     * <li><strong>12000</strong></li>
     * <li><strong>16000</strong></li>
     * <li><strong>32000</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("GpuA10")
    public String gpuA10;

    @NameInMap("GpuPpu810e")
    public String gpuPpu810e;

    /**
     * <p>The memory size that is required by each instance. Unit: MB. This parameter cannot be set to 0. The values of this parameter correspond to the values of the Cpu parameter:</p>
     * <ul>
     * <li>This parameter is set to <strong>1024</strong> if the Cpu parameter is set to 500 or 1000.</li>
     * <li>This parameter is set to <strong>2048</strong> if the Cpu parameter is set to 500, 1000, or 2000.</li>
     * <li>This parameter is set to <strong>4096</strong> if the Cpu parameter is set to 1000, 2000, or 4000.</li>
     * <li>This parameter is set to <strong>8192</strong> if the Cpu parameter is set to 2000, 4000, or 8,000.</li>
     * <li>This parameter is set to <strong>12288</strong> if the Cpu parameter is set to 12000.</li>
     * <li>This parameter is set to <strong>16384</strong> if the Cpu parameter is set to 4000, 8000, or 16000.</li>
     * <li>This parameter is set to <strong>24576</strong> if the Cpu parameter is set to 12000.</li>
     * <li>This parameter is set to <strong>32768</strong> if the Cpu parameter is set to 16000.</li>
     * <li>This parameter is set to <strong>65536</strong> if the Cpu parameter is set to 8000, 16000, or 32000.</li>
     * <li>This parameter is set to <strong>131072</strong> if the Cpu parameter is set to 32000.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("NewSaeVersion")
    public String newSaeVersion;

    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Scenarios:</p>
     * <ul>
     * <li>Web</li>
     * <li>micro_service</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Web</p>
     */
    @NameInMap("Workload")
    public String workload;

    public static DescribeConfigurationPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigurationPriceRequest self = new DescribeConfigurationPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigurationPriceRequest setBestEffortType(String bestEffortType) {
        this.bestEffortType = bestEffortType;
        return this;
    }
    public String getBestEffortType() {
        return this.bestEffortType;
    }

    public DescribeConfigurationPriceRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DescribeConfigurationPriceRequest setGpuA10(String gpuA10) {
        this.gpuA10 = gpuA10;
        return this;
    }
    public String getGpuA10() {
        return this.gpuA10;
    }

    public DescribeConfigurationPriceRequest setGpuPpu810e(String gpuPpu810e) {
        this.gpuPpu810e = gpuPpu810e;
        return this;
    }
    public String getGpuPpu810e() {
        return this.gpuPpu810e;
    }

    public DescribeConfigurationPriceRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DescribeConfigurationPriceRequest setNewSaeVersion(String newSaeVersion) {
        this.newSaeVersion = newSaeVersion;
        return this;
    }
    public String getNewSaeVersion() {
        return this.newSaeVersion;
    }

    public DescribeConfigurationPriceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeConfigurationPriceRequest setWorkload(String workload) {
        this.workload = workload;
        return this;
    }
    public String getWorkload() {
        return this.workload;
    }

}
