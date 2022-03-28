// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListEcsSpecsResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // 本分页中请求的实例列表
    @NameInMap("EcsSpecs")
    public java.util.List<ListEcsSpecsResponseBodyEcsSpecs> ecsSpecs;

    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 说明
    @NameInMap("Message")
    public String message;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 成功标志
    @NameInMap("Success")
    public Boolean success;

    // 实例总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListEcsSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEcsSpecsResponseBody self = new ListEcsSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEcsSpecsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEcsSpecsResponseBody setEcsSpecs(java.util.List<ListEcsSpecsResponseBodyEcsSpecs> ecsSpecs) {
        this.ecsSpecs = ecsSpecs;
        return this;
    }
    public java.util.List<ListEcsSpecsResponseBodyEcsSpecs> getEcsSpecs() {
        return this.ecsSpecs;
    }

    public ListEcsSpecsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListEcsSpecsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEcsSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEcsSpecsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListEcsSpecsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListEcsSpecsResponseBodyEcsSpecs extends TeaModel {
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

        public static ListEcsSpecsResponseBodyEcsSpecs build(java.util.Map<String, ?> map) throws Exception {
            ListEcsSpecsResponseBodyEcsSpecs self = new ListEcsSpecsResponseBodyEcsSpecs();
            return TeaModel.build(map, self);
        }

        public ListEcsSpecsResponseBodyEcsSpecs setAcceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }
        public String getAcceleratorType() {
            return this.acceleratorType;
        }

        public ListEcsSpecsResponseBodyEcsSpecs setCPU(Long CPU) {
            this.CPU = CPU;
            return this;
        }
        public Long getCPU() {
            return this.CPU;
        }

        public ListEcsSpecsResponseBodyEcsSpecs setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ListEcsSpecsResponseBodyEcsSpecs setGPU(Long GPU) {
            this.GPU = GPU;
            return this;
        }
        public Long getGPU() {
            return this.GPU;
        }

        public ListEcsSpecsResponseBodyEcsSpecs setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public ListEcsSpecsResponseBodyEcsSpecs setInstanceBandwidthRx(Long instanceBandwidthRx) {
            this.instanceBandwidthRx = instanceBandwidthRx;
            return this;
        }
        public Long getInstanceBandwidthRx() {
            return this.instanceBandwidthRx;
        }

        public ListEcsSpecsResponseBodyEcsSpecs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListEcsSpecsResponseBodyEcsSpecs setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public ListEcsSpecsResponseBodyEcsSpecs setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public ListEcsSpecsResponseBodyEcsSpecs setSystemDiskCapacity(Long systemDiskCapacity) {
            this.systemDiskCapacity = systemDiskCapacity;
            return this;
        }
        public Long getSystemDiskCapacity() {
            return this.systemDiskCapacity;
        }

    }

}
