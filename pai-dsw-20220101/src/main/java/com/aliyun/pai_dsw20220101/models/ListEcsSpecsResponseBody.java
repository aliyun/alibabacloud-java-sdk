// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListEcsSpecsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("EcsSpecs")
    public java.util.List<ListEcsSpecsResponseBodyEcsSpecs> ecsSpecs;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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

    public static class ListEcsSpecsResponseBodyEcsSpecsLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListEcsSpecsResponseBodyEcsSpecsLabels build(java.util.Map<String, ?> map) throws Exception {
            ListEcsSpecsResponseBodyEcsSpecsLabels self = new ListEcsSpecsResponseBodyEcsSpecsLabels();
            return TeaModel.build(map, self);
        }

        public ListEcsSpecsResponseBodyEcsSpecsLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEcsSpecsResponseBodyEcsSpecsLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEcsSpecsResponseBodyEcsSpecs extends TeaModel {
        @NameInMap("AcceleratorType")
        public String acceleratorType;

        @NameInMap("CPU")
        public Long CPU;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("GPU")
        public Long GPU;

        @NameInMap("GPUType")
        public String GPUType;

        @NameInMap("InstanceBandwidthRx")
        public Long instanceBandwidthRx;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        @NameInMap("Labels")
        public java.util.List<ListEcsSpecsResponseBodyEcsSpecsLabels> labels;

        @NameInMap("Memory")
        public Float memory;

        @NameInMap("Price")
        public Double price;

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

        public ListEcsSpecsResponseBodyEcsSpecs setIsAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        public ListEcsSpecsResponseBodyEcsSpecs setLabels(java.util.List<ListEcsSpecsResponseBodyEcsSpecsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListEcsSpecsResponseBodyEcsSpecsLabels> getLabels() {
            return this.labels;
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
