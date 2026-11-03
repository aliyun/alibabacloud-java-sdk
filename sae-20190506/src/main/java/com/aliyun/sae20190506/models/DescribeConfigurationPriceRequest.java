// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeConfigurationPriceRequest extends TeaModel {
    /**
     * <p>The BestEffort policy. Valid values:</p>
     * <ul>
     * <li>besteffort: BestEffort.</li>
     * <li>try-besteffort: BestEffort preferred.</li>
     * <li>default: Default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("BestEffortType")
    public String bestEffortType;

    /**
     * <p>The required CPU for each instance, in millicores. The value cannot be 0. Only the following defined specifications are supported:</p>
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

    /**
     * <p>The number of A10 GPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GpuA10")
    public String gpuA10;

    /**
     * <p>The number of PPU 810E units.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GpuPpu810e")
    public String gpuPpu810e;

    /**
     * <p>The required memory for each instance, in MB. The value cannot be 0. Memory has a one-to-one mapping with CPU. Only the following defined specifications are supported:</p>
     * <ul>
     * <li><strong>1024</strong>: Corresponds to 500 and 1000 millicores.</li>
     * <li><strong>2048</strong>: Corresponds to 500, 1000, and 2000 millicores.</li>
     * <li><strong>4096</strong>: Corresponds to 1000, 2000, and 4000 millicores.</li>
     * <li><strong>8192</strong>: Corresponds to 2000, 4000, and 8000 millicores.</li>
     * <li><strong>12288</strong>: Corresponds to 12000 millicores.</li>
     * <li><strong>16384</strong>: Corresponds to 4000, 8000, and 16000 millicores.</li>
     * <li><strong>24576</strong>: Corresponds to 12000 millicores.</li>
     * <li><strong>32768</strong>: Corresponds to 16000 millicores.</li>
     * <li><strong>65536</strong>: Corresponds to 8000, 16000, and 32000 millicores.</li>
     * <li><strong>131072</strong>: Corresponds to 32000 millicores.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The application edition. Valid values:</p>
     * <ul>
     * <li>lite: Lite Edition.</li>
     * <li>std: Standard Edition.</li>
     * <li>pro: Professional Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>std</p>
     */
    @NameInMap("NewSaeVersion")
    public String newSaeVersion;

    /**
     * <p>The resource type. Valid values: NULL (default), default (default), and haiguang (Hygon server).</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Common scenarios. Valid values:</p>
     * <ul>
     * <li><p>web</p>
     * </li>
     * <li><p>micro_service</p>
     * </li>
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
