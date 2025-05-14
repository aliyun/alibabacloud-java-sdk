// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListEcsSpecsResponseBody extends TeaModel {
    /**
     * <p>The status code. Valid values:</p>
     * <ul>
     * <li>InternalError: an internal error. All errors, except for parameter validation errors, are classified as internal errors.</li>
     * <li>ValidationError: a parameter validation error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The specifications of the ECS instances returned on this page.</p>
     */
    @NameInMap("EcsSpecs")
    public java.util.List<ListEcsSpecsResponseBodyEcsSpecs> ecsSpecs;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li>400</li>
     * <li>404</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;XXX&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of ECS instances.</p>
     * 
     * <strong>example:</strong>
     * <p>35</p>
     */
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
        /**
         * <p>The label key added to the ECS specification.</p>
         * 
         * <strong>example:</strong>
         * <p>SupportResourcePackDeduction</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The label value added to the ECS specification.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The accelerator type.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("AcceleratorType")
        public String acceleratorType;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("CPU")
        public Long CPU;

        /**
         * <p>The currency unit.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("GPU")
        public Long GPU;

        @NameInMap("GPUMemorySize")
        public Float GPUMemorySize;

        /**
         * <p>The GPU type. Valid values:</p>
         * <ul>
         * <li>V100</li>
         * <li>A100</li>
         * <li>A10</li>
         * <li>T4</li>
         * <li>P100</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>v100</p>
         */
        @NameInMap("GPUType")
        public String GPUType;

        /**
         * <p>The inbound bandwidth of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5120000</p>
         */
        @NameInMap("InstanceBandwidthRx")
        public Long instanceBandwidthRx;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.gn5-c28g1.7xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Indicates whether the resource was available.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        /**
         * <p>The labels of the ECS specification.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;foo\&quot;: \&quot;bar\&quot;}</p>
         */
        @NameInMap("Labels")
        public java.util.List<ListEcsSpecsResponseBodyEcsSpecsLabels> labels;

        /**
         * <p>The memory size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The price.</p>
         * 
         * <strong>example:</strong>
         * <p>22.8</p>
         */
        @NameInMap("Price")
        public Double price;

        @NameInMap("SpotStockStatus")
        public String spotStockStatus;

        /**
         * <p>The size of the system disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
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

        public ListEcsSpecsResponseBodyEcsSpecs setGPUMemorySize(Float GPUMemorySize) {
            this.GPUMemorySize = GPUMemorySize;
            return this;
        }
        public Float getGPUMemorySize() {
            return this.GPUMemorySize;
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

        public ListEcsSpecsResponseBodyEcsSpecs setSpotStockStatus(String spotStockStatus) {
            this.spotStockStatus = spotStockStatus;
            return this;
        }
        public String getSpotStockStatus() {
            return this.spotStockStatus;
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
