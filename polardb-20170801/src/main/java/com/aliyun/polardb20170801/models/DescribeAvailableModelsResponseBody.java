// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAvailableModelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>polardb_ai</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <strong>example:</strong>
     * <p>3.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("Items")
    public java.util.List<DescribeAvailableModelsResponseBodyItems> items;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3AA69096-757C-4647-B36C-29EBC2******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableModelsResponseBody self = new DescribeAvailableModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableModelsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeAvailableModelsResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeAvailableModelsResponseBody setItems(java.util.List<DescribeAvailableModelsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAvailableModelsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAvailableModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableModelsResponseBodyItemsGpuRequired extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("GpuMinCount")
        public String gpuMinCount;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("GpuModel")
        public String gpuModel;

        public static DescribeAvailableModelsResponseBodyItemsGpuRequired build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableModelsResponseBodyItemsGpuRequired self = new DescribeAvailableModelsResponseBodyItemsGpuRequired();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableModelsResponseBodyItemsGpuRequired setGpuMinCount(String gpuMinCount) {
            this.gpuMinCount = gpuMinCount;
            return this;
        }
        public String getGpuMinCount() {
            return this.gpuMinCount;
        }

        public DescribeAvailableModelsResponseBodyItemsGpuRequired setGpuModel(String gpuModel) {
            this.gpuModel = gpuModel;
            return this;
        }
        public String getGpuModel() {
            return this.gpuModel;
        }

    }

    public static class DescribeAvailableModelsResponseBodyItems extends TeaModel {
        @NameInMap("GpuRequired")
        public java.util.List<DescribeAvailableModelsResponseBodyItemsGpuRequired> gpuRequired;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MinimumCpu")
        public Long minimumCpu;

        /**
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("MinimumMemory")
        public Long minimumMemory;

        /**
         * <strong>example:</strong>
         * <p>Qwen3-32B-GPTQ-Int4</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>BERT</p>
         */
        @NameInMap("ModelSeries")
        public String modelSeries;

        @NameInMap("SupportedGpuModels")
        public java.util.List<String> supportedGpuModels;

        public static DescribeAvailableModelsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableModelsResponseBodyItems self = new DescribeAvailableModelsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableModelsResponseBodyItems setGpuRequired(java.util.List<DescribeAvailableModelsResponseBodyItemsGpuRequired> gpuRequired) {
            this.gpuRequired = gpuRequired;
            return this;
        }
        public java.util.List<DescribeAvailableModelsResponseBodyItemsGpuRequired> getGpuRequired() {
            return this.gpuRequired;
        }

        public DescribeAvailableModelsResponseBodyItems setMinimumCpu(Long minimumCpu) {
            this.minimumCpu = minimumCpu;
            return this;
        }
        public Long getMinimumCpu() {
            return this.minimumCpu;
        }

        public DescribeAvailableModelsResponseBodyItems setMinimumMemory(Long minimumMemory) {
            this.minimumMemory = minimumMemory;
            return this;
        }
        public Long getMinimumMemory() {
            return this.minimumMemory;
        }

        public DescribeAvailableModelsResponseBodyItems setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DescribeAvailableModelsResponseBodyItems setModelSeries(String modelSeries) {
            this.modelSeries = modelSeries;
            return this;
        }
        public String getModelSeries() {
            return this.modelSeries;
        }

        public DescribeAvailableModelsResponseBodyItems setSupportedGpuModels(java.util.List<String> supportedGpuModels) {
            this.supportedGpuModels = supportedGpuModels;
            return this;
        }
        public java.util.List<String> getSupportedGpuModels() {
            return this.supportedGpuModels;
        }

    }

}
