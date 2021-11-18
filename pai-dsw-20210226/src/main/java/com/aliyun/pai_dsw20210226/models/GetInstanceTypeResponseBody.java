// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstanceTypeResponseBody extends TeaModel {
    // cpu核数
    @NameInMap("CpuCoreCount")
    public Long cpuCoreCount;

    // 折扣
    @NameInMap("Discount")
    public Float discount;

    // 国内价格
    @NameInMap("DomesticPrice")
    public Float domesticPrice;

    // GPU卡数
    @NameInMap("GPUAmount")
    public Long GPUAmount;

    // GPU卡型
    @NameInMap("GPUSpec")
    public String GPUSpec;

    // 实例接收带宽
    @NameInMap("InstanceBandwidthRx")
    public Long instanceBandwidthRx;

    // 实例发送带宽
    @NameInMap("InstanceBandwidthTx")
    public Long instanceBandwidthTx;

    // 实例每秒发包数
    @NameInMap("InstancePpsRx")
    public Long instancePpsRx;

    // 实例每秒收包数
    @NameInMap("InstancePpsTx")
    public Long instancePpsTx;

    // 规格族
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    // 实例类型id
    @NameInMap("InstanceTypeId")
    public String instanceTypeId;

    // 是否国际站用户
    @NameInMap("International")
    public Boolean international;

    // 存储盘容量
    @NameInMap("LocalStorageCapacity")
    public Long localStorageCapacity;

    // 内存容量
    @NameInMap("MemorySize")
    public Float memorySize;

    // 价格
    @NameInMap("Price")
    public Float price;

    // 价格（人民币）
    @NameInMap("PriceCNY")
    public Float priceCNY;

    // 价格（美元）
    @NameInMap("PriceUSD")
    public Float priceUSD;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 资源类型
    @NameInMap("ResourceType")
    public String resourceType;

    // 系统盘存储类型
    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    // 系统盘容量
    @NameInMap("SystemDiskSize")
    public Long systemDiskSize;

    public static GetInstanceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTypeResponseBody self = new GetInstanceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceTypeResponseBody setCpuCoreCount(Long cpuCoreCount) {
        this.cpuCoreCount = cpuCoreCount;
        return this;
    }
    public Long getCpuCoreCount() {
        return this.cpuCoreCount;
    }

    public GetInstanceTypeResponseBody setDiscount(Float discount) {
        this.discount = discount;
        return this;
    }
    public Float getDiscount() {
        return this.discount;
    }

    public GetInstanceTypeResponseBody setDomesticPrice(Float domesticPrice) {
        this.domesticPrice = domesticPrice;
        return this;
    }
    public Float getDomesticPrice() {
        return this.domesticPrice;
    }

    public GetInstanceTypeResponseBody setGPUAmount(Long GPUAmount) {
        this.GPUAmount = GPUAmount;
        return this;
    }
    public Long getGPUAmount() {
        return this.GPUAmount;
    }

    public GetInstanceTypeResponseBody setGPUSpec(String GPUSpec) {
        this.GPUSpec = GPUSpec;
        return this;
    }
    public String getGPUSpec() {
        return this.GPUSpec;
    }

    public GetInstanceTypeResponseBody setInstanceBandwidthRx(Long instanceBandwidthRx) {
        this.instanceBandwidthRx = instanceBandwidthRx;
        return this;
    }
    public Long getInstanceBandwidthRx() {
        return this.instanceBandwidthRx;
    }

    public GetInstanceTypeResponseBody setInstanceBandwidthTx(Long instanceBandwidthTx) {
        this.instanceBandwidthTx = instanceBandwidthTx;
        return this;
    }
    public Long getInstanceBandwidthTx() {
        return this.instanceBandwidthTx;
    }

    public GetInstanceTypeResponseBody setInstancePpsRx(Long instancePpsRx) {
        this.instancePpsRx = instancePpsRx;
        return this;
    }
    public Long getInstancePpsRx() {
        return this.instancePpsRx;
    }

    public GetInstanceTypeResponseBody setInstancePpsTx(Long instancePpsTx) {
        this.instancePpsTx = instancePpsTx;
        return this;
    }
    public Long getInstancePpsTx() {
        return this.instancePpsTx;
    }

    public GetInstanceTypeResponseBody setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public GetInstanceTypeResponseBody setInstanceTypeId(String instanceTypeId) {
        this.instanceTypeId = instanceTypeId;
        return this;
    }
    public String getInstanceTypeId() {
        return this.instanceTypeId;
    }

    public GetInstanceTypeResponseBody setInternational(Boolean international) {
        this.international = international;
        return this;
    }
    public Boolean getInternational() {
        return this.international;
    }

    public GetInstanceTypeResponseBody setLocalStorageCapacity(Long localStorageCapacity) {
        this.localStorageCapacity = localStorageCapacity;
        return this;
    }
    public Long getLocalStorageCapacity() {
        return this.localStorageCapacity;
    }

    public GetInstanceTypeResponseBody setMemorySize(Float memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Float getMemorySize() {
        return this.memorySize;
    }

    public GetInstanceTypeResponseBody setPrice(Float price) {
        this.price = price;
        return this;
    }
    public Float getPrice() {
        return this.price;
    }

    public GetInstanceTypeResponseBody setPriceCNY(Float priceCNY) {
        this.priceCNY = priceCNY;
        return this;
    }
    public Float getPriceCNY() {
        return this.priceCNY;
    }

    public GetInstanceTypeResponseBody setPriceUSD(Float priceUSD) {
        this.priceUSD = priceUSD;
        return this;
    }
    public Float getPriceUSD() {
        return this.priceUSD;
    }

    public GetInstanceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceTypeResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetInstanceTypeResponseBody setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public GetInstanceTypeResponseBody setSystemDiskSize(Long systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Long getSystemDiskSize() {
        return this.systemDiskSize;
    }

}
