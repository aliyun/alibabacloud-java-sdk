// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListEcsSpecsV2ResponseBody extends TeaModel {
    // 本分页中请求的实例列表
    @NameInMap("EcsSpecs")
    public java.util.List<ListEcsSpecsV2ResponseBodyEcsSpecs> ecsSpecs;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 实例总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListEcsSpecsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEcsSpecsV2ResponseBody self = new ListEcsSpecsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEcsSpecsV2ResponseBody setEcsSpecs(java.util.List<ListEcsSpecsV2ResponseBodyEcsSpecs> ecsSpecs) {
        this.ecsSpecs = ecsSpecs;
        return this;
    }
    public java.util.List<ListEcsSpecsV2ResponseBodyEcsSpecs> getEcsSpecs() {
        return this.ecsSpecs;
    }

    public ListEcsSpecsV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEcsSpecsV2ResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListEcsSpecsV2ResponseBodyEcsSpecs extends TeaModel {
        // 资源类型
        @NameInMap("AcceleratorType")
        public String acceleratorType;

        // CPU核数
        @NameInMap("CPU")
        public Long CPU;

        // 货币单位
        @NameInMap("Currency")
        public String currency;

        // GPU卡数
        @NameInMap("GPU")
        public Long GPU;

        // 显卡类型
        @NameInMap("GPUType")
        public String GPUType;

        // 实例接收带宽
        @NameInMap("InstanceBandwidthRx")
        public Long instanceBandwidthRx;

        // 实例规格
        @NameInMap("InstanceType")
        public String instanceType;

        // 内存大小(GB)
        @NameInMap("Memory")
        public Float memory;

        // 价格
        @NameInMap("Price")
        public Double price;

        // 系统盘大小(GB)
        @NameInMap("SystemDiskCapacity")
        public Long systemDiskCapacity;

        public static ListEcsSpecsV2ResponseBodyEcsSpecs build(java.util.Map<String, ?> map) throws Exception {
            ListEcsSpecsV2ResponseBodyEcsSpecs self = new ListEcsSpecsV2ResponseBodyEcsSpecs();
            return TeaModel.build(map, self);
        }

        public ListEcsSpecsV2ResponseBodyEcsSpecs setAcceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }
        public String getAcceleratorType() {
            return this.acceleratorType;
        }

        public ListEcsSpecsV2ResponseBodyEcsSpecs setCPU(Long CPU) {
            this.CPU = CPU;
            return this;
        }
        public Long getCPU() {
            return this.CPU;
        }

        public ListEcsSpecsV2ResponseBodyEcsSpecs setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ListEcsSpecsV2ResponseBodyEcsSpecs setGPU(Long GPU) {
            this.GPU = GPU;
            return this;
        }
        public Long getGPU() {
            return this.GPU;
        }

        public ListEcsSpecsV2ResponseBodyEcsSpecs setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public ListEcsSpecsV2ResponseBodyEcsSpecs setInstanceBandwidthRx(Long instanceBandwidthRx) {
            this.instanceBandwidthRx = instanceBandwidthRx;
            return this;
        }
        public Long getInstanceBandwidthRx() {
            return this.instanceBandwidthRx;
        }

        public ListEcsSpecsV2ResponseBodyEcsSpecs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListEcsSpecsV2ResponseBodyEcsSpecs setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public ListEcsSpecsV2ResponseBodyEcsSpecs setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public ListEcsSpecsV2ResponseBodyEcsSpecs setSystemDiskCapacity(Long systemDiskCapacity) {
            this.systemDiskCapacity = systemDiskCapacity;
            return this;
        }
        public Long getSystemDiskCapacity() {
            return this.systemDiskCapacity;
        }

    }

}
