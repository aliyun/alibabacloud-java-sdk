// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class EcsSpec extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>GPU</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <strong>example:</strong>
     * <p>470.199.02</p>
     */
    @NameInMap("DefaultGPUDriver")
    public String defaultGPUDriver;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Gpu")
    public Integer gpu;

    /**
     * <strong>example:</strong>
     * <p>NVIDIA v100</p>
     */
    @NameInMap("GpuType")
    public String gpuType;

    /**
     * <strong>example:</strong>
     * <p>ecs.gn6e-c12g1.3xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAvailable")
    public Boolean isAvailable;

    /**
     * <strong>example:</strong>
     * <p>92</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("NonProtectSpotDiscount")
    public Float nonProtectSpotDiscount;

    @NameInMap("PaymentTypes")
    public java.util.List<String> paymentTypes;

    /**
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>WithStock</p>
     */
    @NameInMap("SpotStockStatus")
    public String spotStockStatus;

    @NameInMap("SupportedGPUDrivers")
    public java.util.List<String> supportedGPUDrivers;

    public static EcsSpec build(java.util.Map<String, ?> map) throws Exception {
        EcsSpec self = new EcsSpec();
        return TeaModel.build(map, self);
    }

    public EcsSpec setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public EcsSpec setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public EcsSpec setDefaultGPUDriver(String defaultGPUDriver) {
        this.defaultGPUDriver = defaultGPUDriver;
        return this;
    }
    public String getDefaultGPUDriver() {
        return this.defaultGPUDriver;
    }

    public EcsSpec setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

    public EcsSpec setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }
    public String getGpuType() {
        return this.gpuType;
    }

    public EcsSpec setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public EcsSpec setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }
    public Boolean getIsAvailable() {
        return this.isAvailable;
    }

    public EcsSpec setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public EcsSpec setNonProtectSpotDiscount(Float nonProtectSpotDiscount) {
        this.nonProtectSpotDiscount = nonProtectSpotDiscount;
        return this;
    }
    public Float getNonProtectSpotDiscount() {
        return this.nonProtectSpotDiscount;
    }

    public EcsSpec setPaymentTypes(java.util.List<String> paymentTypes) {
        this.paymentTypes = paymentTypes;
        return this;
    }
    public java.util.List<String> getPaymentTypes() {
        return this.paymentTypes;
    }

    public EcsSpec setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public EcsSpec setSpotStockStatus(String spotStockStatus) {
        this.spotStockStatus = spotStockStatus;
        return this;
    }
    public String getSpotStockStatus() {
        return this.spotStockStatus;
    }

    public EcsSpec setSupportedGPUDrivers(java.util.List<String> supportedGPUDrivers) {
        this.supportedGPUDrivers = supportedGPUDrivers;
        return this;
    }
    public java.util.List<String> getSupportedGPUDrivers() {
        return this.supportedGPUDrivers;
    }

}
