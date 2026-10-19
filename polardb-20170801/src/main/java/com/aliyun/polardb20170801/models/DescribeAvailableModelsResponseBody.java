// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAvailableModelsResponseBody extends TeaModel {
    /**
     * <p>The database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb_ai</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The DPI engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>3.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The list of models.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAvailableModelsResponseBodyItems> items;

    /**
     * <p>The model type corresponding to the request.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3AA69096-757C-4647-B36C-29EBC2******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The model fine-tuning architecture.</p>
     * 
     * <strong>example:</strong>
     * <p>swift</p>
     */
    @NameInMap("TuneArch")
    public String tuneArch;

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

    public DescribeAvailableModelsResponseBody setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public DescribeAvailableModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableModelsResponseBody setTuneArch(String tuneArch) {
        this.tuneArch = tuneArch;
        return this;
    }
    public String getTuneArch() {
        return this.tuneArch;
    }

    public static class DescribeAvailableModelsResponseBodyItemsGpuRequired extends TeaModel {
        /**
         * <p>The minimum number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("GpuMinCount")
        public String gpuMinCount;

        /**
         * <p>The GPU model.</p>
         * 
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
        /**
         * <p>The container startup environment variables registered for the custom model.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;HF_HOME&quot;:&quot;/cache/hf&quot;}</p>
         */
        @NameInMap("ContainerEnv")
        public java.util.Map<String, String> containerEnv;

        /**
         * <p>The source image address registered by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.example.com/customer/model:v1</p>
         */
        @NameInMap("CustomImageSource")
        public String customImageSource;

        /**
         * <p>The registration key of the custom model.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-32B</p>
         */
        @NameInMap("CustomModelName")
        public String customModelName;

        /**
         * <p>The deployment specifications registered for the custom model.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb.gpu.gn8is.4xlarge</p>
         */
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        /**
         * <p>The direct startup command registered for the custom model.</p>
         * 
         * <strong>example:</strong>
         * <p>python -m vllm.entrypoints.openai.api_server</p>
         */
        @NameInMap("DirectCommand")
        public String directCommand;

        /**
         * <p>The display name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>My Qwen3 32B</p>
         */
        @NameInMap("DisplayModelName")
        public String displayModelName;

        /**
         * <p>The time when the registration was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-07 20:57:20</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The supported GPU models.</p>
         */
        @NameInMap("GpuRequired")
        public java.util.List<DescribeAvailableModelsResponseBodyItemsGpuRequired> gpuRequired;

        /**
         * <p>The image import status. Valid values: Importing, Available, and Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("ImageImportStatus")
        public String imageImportStatus;

        /**
         * <p>The model service image address registered by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.example.com/customer/model:v1</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The inference engine registered for the custom model.</p>
         * 
         * <strong>example:</strong>
         * <p>vllm</p>
         */
        @NameInMap("InferenceEngine")
        public String inferenceEngine;

        /**
         * <p>The minimum CPU requirement.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MinimumCpu")
        public Long minimumCpu;

        /**
         * <p>The minimum memory requirement.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("MinimumMemory")
        public Long minimumMemory;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-32B-GPTQ-Int4</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The startup parameters registered for the custom model.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;--max-model-len&quot;:&quot;32768&quot;}</p>
         */
        @NameInMap("ModelParams")
        public java.util.Map<String, String> modelParams;

        /**
         * <p>The model series.</p>
         * 
         * <strong>example:</strong>
         * <p>BERT</p>
         */
        @NameInMap("ModelSeries")
        public String modelSeries;

        /**
         * <p>The model type.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("ModelType")
        public String modelType;

        /**
         * <p>The OSS path of the custom model.</p>
         * 
         * <strong>example:</strong>
         * <p>/my-model-bucket/models</p>
         */
        @NameInMap("OssPath")
        public String ossPath;

        /**
         * <p>The supported GPU models.</p>
         */
        @NameInMap("SupportedGpuModels")
        public java.util.List<String> supportedGpuModels;

        /**
         * <p>The model fine-tuning architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>swift</p>
         */
        @NameInMap("TuneArch")
        public String tuneArch;

        public static DescribeAvailableModelsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableModelsResponseBodyItems self = new DescribeAvailableModelsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableModelsResponseBodyItems setContainerEnv(java.util.Map<String, String> containerEnv) {
            this.containerEnv = containerEnv;
            return this;
        }
        public java.util.Map<String, String> getContainerEnv() {
            return this.containerEnv;
        }

        public DescribeAvailableModelsResponseBodyItems setCustomImageSource(String customImageSource) {
            this.customImageSource = customImageSource;
            return this;
        }
        public String getCustomImageSource() {
            return this.customImageSource;
        }

        public DescribeAvailableModelsResponseBodyItems setCustomModelName(String customModelName) {
            this.customModelName = customModelName;
            return this;
        }
        public String getCustomModelName() {
            return this.customModelName;
        }

        public DescribeAvailableModelsResponseBodyItems setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeAvailableModelsResponseBodyItems setDirectCommand(String directCommand) {
            this.directCommand = directCommand;
            return this;
        }
        public String getDirectCommand() {
            return this.directCommand;
        }

        public DescribeAvailableModelsResponseBodyItems setDisplayModelName(String displayModelName) {
            this.displayModelName = displayModelName;
            return this;
        }
        public String getDisplayModelName() {
            return this.displayModelName;
        }

        public DescribeAvailableModelsResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAvailableModelsResponseBodyItems setGpuRequired(java.util.List<DescribeAvailableModelsResponseBodyItemsGpuRequired> gpuRequired) {
            this.gpuRequired = gpuRequired;
            return this;
        }
        public java.util.List<DescribeAvailableModelsResponseBodyItemsGpuRequired> getGpuRequired() {
            return this.gpuRequired;
        }

        public DescribeAvailableModelsResponseBodyItems setImageImportStatus(String imageImportStatus) {
            this.imageImportStatus = imageImportStatus;
            return this;
        }
        public String getImageImportStatus() {
            return this.imageImportStatus;
        }

        public DescribeAvailableModelsResponseBodyItems setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeAvailableModelsResponseBodyItems setInferenceEngine(String inferenceEngine) {
            this.inferenceEngine = inferenceEngine;
            return this;
        }
        public String getInferenceEngine() {
            return this.inferenceEngine;
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

        public DescribeAvailableModelsResponseBodyItems setModelParams(java.util.Map<String, String> modelParams) {
            this.modelParams = modelParams;
            return this;
        }
        public java.util.Map<String, String> getModelParams() {
            return this.modelParams;
        }

        public DescribeAvailableModelsResponseBodyItems setModelSeries(String modelSeries) {
            this.modelSeries = modelSeries;
            return this;
        }
        public String getModelSeries() {
            return this.modelSeries;
        }

        public DescribeAvailableModelsResponseBodyItems setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public DescribeAvailableModelsResponseBodyItems setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public DescribeAvailableModelsResponseBodyItems setSupportedGpuModels(java.util.List<String> supportedGpuModels) {
            this.supportedGpuModels = supportedGpuModels;
            return this;
        }
        public java.util.List<String> getSupportedGpuModels() {
            return this.supportedGpuModels;
        }

        public DescribeAvailableModelsResponseBodyItems setTuneArch(String tuneArch) {
            this.tuneArch = tuneArch;
            return this;
        }
        public String getTuneArch() {
            return this.tuneArch;
        }

    }

}
