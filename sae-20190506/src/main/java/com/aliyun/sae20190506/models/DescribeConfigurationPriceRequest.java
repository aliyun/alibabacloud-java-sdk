// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeConfigurationPriceRequest extends TeaModel {
    /**
     * <p>The BestEffort policy. Valid values:</p>
     * <ul>
     * <li><p>besteffort: BestEffort</p>
     * </li>
     * <li><p>try-besteffort: BestEffort preferred</p>
     * </li>
     * <li><p>default: default</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("BestEffortType")
    public String bestEffortType;

    /**
     * <p>The number of CPU cores required for each instance. Unit: millicores. This value cannot be 0. Only the following defined specifications are supported:</p>
     * <ul>
     * <li><p><strong>500</strong></p>
     * </li>
     * <li><p><strong>1000</strong></p>
     * </li>
     * <li><p><strong>2000</strong></p>
     * </li>
     * <li><p><strong>4000</strong></p>
     * </li>
     * <li><p><strong>8000</strong></p>
     * </li>
     * <li><p><strong>12000</strong></p>
     * </li>
     * <li><p><strong>16000</strong></p>
     * </li>
     * <li><p><strong>32000</strong></p>
     * </li>
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
     * <p>The amount of memory required for each instance. Unit: MB. This value cannot be 0. The memory size must correspond to the CPU specification. Only the following defined specifications are supported:</p>
     * <ul>
     * <li><p><strong>1024</strong>: Corresponds to 500 millicores and 1,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>2048</strong>: Corresponds to 500, 1,000, and 2,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>4096</strong>: Corresponds to 1,000, 2,000, and 4,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>8192</strong>: Corresponds to 2,000, 4,000, and 8,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>12288</strong>: Corresponds to 12,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>16384</strong>: Corresponds to 4,000, 8,000, and 16,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>24576</strong>: Corresponds to 12,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>32768</strong>: Corresponds to 16,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>65536</strong>: Corresponds to 8,000, 16,000, and 32,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>131072</strong>: Corresponds to 32,000 millicores of CPU.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The application version. Valid values:</p>
     * <ul>
     * <li><p>lite: Lightweight Edition</p>
     * </li>
     * <li><p>std: Standard Edition</p>
     * </li>
     * <li><p>pro: Professional Edition</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>std</p>
     */
    @NameInMap("NewSaeVersion")
    public String newSaeVersion;

    /**
     * <p>The resource type. Valid values: NULL (default), default, and haiguang (Haiguang server).</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The application scenario. Valid values:</p>
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
