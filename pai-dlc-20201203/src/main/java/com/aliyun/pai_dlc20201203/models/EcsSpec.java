// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class EcsSpec extends TeaModel {
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("DefaultGPUDriver")
    public String defaultGPUDriver;

    @NameInMap("Gpu")
    public Integer gpu;

    @NameInMap("GpuType")
    public String gpuType;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("IsAvailable")
    public Boolean isAvailable;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("NonProtectSpotDiscount")
    public Float nonProtectSpotDiscount;

    @NameInMap("PaymentTypes")
    public java.util.List<String> paymentTypes;

    @NameInMap("ResourceType")
    public String resourceType;

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
