// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationAvailableModelsResponseBody extends TeaModel {
    /**
     * <p>The list of speech recognition models.</p>
     */
    @NameInMap("AsrModels")
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyAsrModels> asrModels;

    /**
     * <p>The default text embedding model.</p>
     */
    @NameInMap("DefaultEmbeddingModel")
    public DescribeApplicationAvailableModelsResponseBodyDefaultEmbeddingModel defaultEmbeddingModel;

    /**
     * <p>The default graph large language model.</p>
     */
    @NameInMap("DefaultGraphLLMModel")
    public DescribeApplicationAvailableModelsResponseBodyDefaultGraphLLMModel defaultGraphLLMModel;

    /**
     * <p>The default large language model.</p>
     */
    @NameInMap("DefaultLLMModel")
    public DescribeApplicationAvailableModelsResponseBodyDefaultLLMModel defaultLLMModel;

    /**
     * <p>The default memory type.</p>
     * 
     * <strong>example:</strong>
     * <p>TEXT</p>
     */
    @NameInMap("DefaultMemoryType")
    public String defaultMemoryType;

    /**
     * <p>The default reranking model.</p>
     */
    @NameInMap("DefaultRerankModel")
    public DescribeApplicationAvailableModelsResponseBodyDefaultRerankModel defaultRerankModel;

    /**
     * <p>The default vision-language model.</p>
     */
    @NameInMap("DefaultVLModel")
    public DescribeApplicationAvailableModelsResponseBodyDefaultVLModel defaultVLModel;

    /**
     * <p>The default VisualEmbedder model.</p>
     */
    @NameInMap("DefaultVisualEmbedderModel")
    public DescribeApplicationAvailableModelsResponseBodyDefaultVisualEmbedderModel defaultVisualEmbedderModel;

    /**
     * <p>The default VisualLLM model.</p>
     */
    @NameInMap("DefaultVisualLlmModel")
    public DescribeApplicationAvailableModelsResponseBodyDefaultVisualLlmModel defaultVisualLlmModel;

    /**
     * <p>The list of available text embedding models.</p>
     */
    @NameInMap("EmbeddingModels")
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyEmbeddingModels> embeddingModels;

    /**
     * <p>The list of available graph large language models.</p>
     */
    @NameInMap("GraphLlmModels")
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyGraphLlmModels> graphLlmModels;

    /**
     * <p>The list of available large language models.</p>
     */
    @NameInMap("LlmModels")
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyLlmModels> llmModels;

    /**
     * <p>The available memory types.</p>
     */
    @NameInMap("MemoryTypes")
    public java.util.List<String> memoryTypes;

    /**
     * <p>Indicates whether the current account supports Mem0 multimodal.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MultimodalSupported")
    public Boolean multimodalSupported;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of available reranking models.</p>
     */
    @NameInMap("RerankModels")
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyRerankModels> rerankModels;

    /**
     * <p>The list of available vision-language models.</p>
     */
    @NameInMap("VLModels")
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyVLModels> VLModels;

    /**
     * <p>The list of available VisualEmbedder models.</p>
     */
    @NameInMap("VisualEmbedderModels")
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyVisualEmbedderModels> visualEmbedderModels;

    /**
     * <p>The list of available VisualLLM models.</p>
     */
    @NameInMap("VisualLlmModels")
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyVisualLlmModels> visualLlmModels;

    public static DescribeApplicationAvailableModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationAvailableModelsResponseBody self = new DescribeApplicationAvailableModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationAvailableModelsResponseBody setAsrModels(java.util.List<DescribeApplicationAvailableModelsResponseBodyAsrModels> asrModels) {
        this.asrModels = asrModels;
        return this;
    }
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyAsrModels> getAsrModels() {
        return this.asrModels;
    }

    public DescribeApplicationAvailableModelsResponseBody setDefaultEmbeddingModel(DescribeApplicationAvailableModelsResponseBodyDefaultEmbeddingModel defaultEmbeddingModel) {
        this.defaultEmbeddingModel = defaultEmbeddingModel;
        return this;
    }
    public DescribeApplicationAvailableModelsResponseBodyDefaultEmbeddingModel getDefaultEmbeddingModel() {
        return this.defaultEmbeddingModel;
    }

    public DescribeApplicationAvailableModelsResponseBody setDefaultGraphLLMModel(DescribeApplicationAvailableModelsResponseBodyDefaultGraphLLMModel defaultGraphLLMModel) {
        this.defaultGraphLLMModel = defaultGraphLLMModel;
        return this;
    }
    public DescribeApplicationAvailableModelsResponseBodyDefaultGraphLLMModel getDefaultGraphLLMModel() {
        return this.defaultGraphLLMModel;
    }

    public DescribeApplicationAvailableModelsResponseBody setDefaultLLMModel(DescribeApplicationAvailableModelsResponseBodyDefaultLLMModel defaultLLMModel) {
        this.defaultLLMModel = defaultLLMModel;
        return this;
    }
    public DescribeApplicationAvailableModelsResponseBodyDefaultLLMModel getDefaultLLMModel() {
        return this.defaultLLMModel;
    }

    public DescribeApplicationAvailableModelsResponseBody setDefaultMemoryType(String defaultMemoryType) {
        this.defaultMemoryType = defaultMemoryType;
        return this;
    }
    public String getDefaultMemoryType() {
        return this.defaultMemoryType;
    }

    public DescribeApplicationAvailableModelsResponseBody setDefaultRerankModel(DescribeApplicationAvailableModelsResponseBodyDefaultRerankModel defaultRerankModel) {
        this.defaultRerankModel = defaultRerankModel;
        return this;
    }
    public DescribeApplicationAvailableModelsResponseBodyDefaultRerankModel getDefaultRerankModel() {
        return this.defaultRerankModel;
    }

    public DescribeApplicationAvailableModelsResponseBody setDefaultVLModel(DescribeApplicationAvailableModelsResponseBodyDefaultVLModel defaultVLModel) {
        this.defaultVLModel = defaultVLModel;
        return this;
    }
    public DescribeApplicationAvailableModelsResponseBodyDefaultVLModel getDefaultVLModel() {
        return this.defaultVLModel;
    }

    public DescribeApplicationAvailableModelsResponseBody setDefaultVisualEmbedderModel(DescribeApplicationAvailableModelsResponseBodyDefaultVisualEmbedderModel defaultVisualEmbedderModel) {
        this.defaultVisualEmbedderModel = defaultVisualEmbedderModel;
        return this;
    }
    public DescribeApplicationAvailableModelsResponseBodyDefaultVisualEmbedderModel getDefaultVisualEmbedderModel() {
        return this.defaultVisualEmbedderModel;
    }

    public DescribeApplicationAvailableModelsResponseBody setDefaultVisualLlmModel(DescribeApplicationAvailableModelsResponseBodyDefaultVisualLlmModel defaultVisualLlmModel) {
        this.defaultVisualLlmModel = defaultVisualLlmModel;
        return this;
    }
    public DescribeApplicationAvailableModelsResponseBodyDefaultVisualLlmModel getDefaultVisualLlmModel() {
        return this.defaultVisualLlmModel;
    }

    public DescribeApplicationAvailableModelsResponseBody setEmbeddingModels(java.util.List<DescribeApplicationAvailableModelsResponseBodyEmbeddingModels> embeddingModels) {
        this.embeddingModels = embeddingModels;
        return this;
    }
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyEmbeddingModels> getEmbeddingModels() {
        return this.embeddingModels;
    }

    public DescribeApplicationAvailableModelsResponseBody setGraphLlmModels(java.util.List<DescribeApplicationAvailableModelsResponseBodyGraphLlmModels> graphLlmModels) {
        this.graphLlmModels = graphLlmModels;
        return this;
    }
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyGraphLlmModels> getGraphLlmModels() {
        return this.graphLlmModels;
    }

    public DescribeApplicationAvailableModelsResponseBody setLlmModels(java.util.List<DescribeApplicationAvailableModelsResponseBodyLlmModels> llmModels) {
        this.llmModels = llmModels;
        return this;
    }
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyLlmModels> getLlmModels() {
        return this.llmModels;
    }

    public DescribeApplicationAvailableModelsResponseBody setMemoryTypes(java.util.List<String> memoryTypes) {
        this.memoryTypes = memoryTypes;
        return this;
    }
    public java.util.List<String> getMemoryTypes() {
        return this.memoryTypes;
    }

    public DescribeApplicationAvailableModelsResponseBody setMultimodalSupported(Boolean multimodalSupported) {
        this.multimodalSupported = multimodalSupported;
        return this;
    }
    public Boolean getMultimodalSupported() {
        return this.multimodalSupported;
    }

    public DescribeApplicationAvailableModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationAvailableModelsResponseBody setRerankModels(java.util.List<DescribeApplicationAvailableModelsResponseBodyRerankModels> rerankModels) {
        this.rerankModels = rerankModels;
        return this;
    }
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyRerankModels> getRerankModels() {
        return this.rerankModels;
    }

    public DescribeApplicationAvailableModelsResponseBody setVLModels(java.util.List<DescribeApplicationAvailableModelsResponseBodyVLModels> VLModels) {
        this.VLModels = VLModels;
        return this;
    }
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyVLModels> getVLModels() {
        return this.VLModels;
    }

    public DescribeApplicationAvailableModelsResponseBody setVisualEmbedderModels(java.util.List<DescribeApplicationAvailableModelsResponseBodyVisualEmbedderModels> visualEmbedderModels) {
        this.visualEmbedderModels = visualEmbedderModels;
        return this;
    }
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyVisualEmbedderModels> getVisualEmbedderModels() {
        return this.visualEmbedderModels;
    }

    public DescribeApplicationAvailableModelsResponseBody setVisualLlmModels(java.util.List<DescribeApplicationAvailableModelsResponseBodyVisualLlmModels> visualLlmModels) {
        this.visualLlmModels = visualLlmModels;
        return this;
    }
    public java.util.List<DescribeApplicationAvailableModelsResponseBodyVisualLlmModels> getVisualLlmModels() {
        return this.visualLlmModels;
    }

    public static class DescribeApplicationAvailableModelsResponseBodyAsrModels extends TeaModel {
        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>paraformer-realtime-v2</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The protocol used by the speech recognition model.</p>
         * 
         * <strong>example:</strong>
         * <p>websocket</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeApplicationAvailableModelsResponseBodyAsrModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyAsrModels self = new DescribeApplicationAvailableModelsResponseBodyAsrModels();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyAsrModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApplicationAvailableModelsResponseBodyAsrModels setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeApplicationAvailableModelsResponseBodyDefaultEmbeddingModel extends TeaModel {
        /**
         * <p>The default vector dimensions of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Dimension")
        public Integer dimension;

        /**
         * <p>The list of vector dimensions supported by the model.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<Integer> dimensions;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v3</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationAvailableModelsResponseBodyDefaultEmbeddingModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyDefaultEmbeddingModel self = new DescribeApplicationAvailableModelsResponseBodyDefaultEmbeddingModel();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyDefaultEmbeddingModel setDimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }
        public Integer getDimension() {
            return this.dimension;
        }

        public DescribeApplicationAvailableModelsResponseBodyDefaultEmbeddingModel setDimensions(java.util.List<Integer> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<Integer> getDimensions() {
            return this.dimensions;
        }

        public DescribeApplicationAvailableModelsResponseBodyDefaultEmbeddingModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationAvailableModelsResponseBodyDefaultGraphLLMModel extends TeaModel {
        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationAvailableModelsResponseBodyDefaultGraphLLMModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyDefaultGraphLLMModel self = new DescribeApplicationAvailableModelsResponseBodyDefaultGraphLLMModel();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyDefaultGraphLLMModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationAvailableModelsResponseBodyDefaultLLMModel extends TeaModel {
        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationAvailableModelsResponseBodyDefaultLLMModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyDefaultLLMModel self = new DescribeApplicationAvailableModelsResponseBodyDefaultLLMModel();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyDefaultLLMModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationAvailableModelsResponseBodyDefaultRerankModel extends TeaModel {
        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>gte-rerank-v2</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationAvailableModelsResponseBodyDefaultRerankModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyDefaultRerankModel self = new DescribeApplicationAvailableModelsResponseBodyDefaultRerankModel();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyDefaultRerankModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationAvailableModelsResponseBodyDefaultVLModel extends TeaModel {
        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-vl-max</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationAvailableModelsResponseBodyDefaultVLModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyDefaultVLModel self = new DescribeApplicationAvailableModelsResponseBodyDefaultVLModel();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyDefaultVLModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationAvailableModelsResponseBodyDefaultVisualEmbedderModel extends TeaModel {
        /**
         * <p>The default dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>2560</p>
         */
        @NameInMap("Dimension")
        public Integer dimension;

        /**
         * <p>The available dimensions.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<Integer> dimensions;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.7-text-embedding</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationAvailableModelsResponseBodyDefaultVisualEmbedderModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyDefaultVisualEmbedderModel self = new DescribeApplicationAvailableModelsResponseBodyDefaultVisualEmbedderModel();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyDefaultVisualEmbedderModel setDimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }
        public Integer getDimension() {
            return this.dimension;
        }

        public DescribeApplicationAvailableModelsResponseBodyDefaultVisualEmbedderModel setDimensions(java.util.List<Integer> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<Integer> getDimensions() {
            return this.dimensions;
        }

        public DescribeApplicationAvailableModelsResponseBodyDefaultVisualEmbedderModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationAvailableModelsResponseBodyDefaultVisualLlmModel extends TeaModel {
        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.6-flash</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The supported modalities.</p>
         */
        @NameInMap("SupportedModalities")
        public java.util.List<String> supportedModalities;

        public static DescribeApplicationAvailableModelsResponseBodyDefaultVisualLlmModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyDefaultVisualLlmModel self = new DescribeApplicationAvailableModelsResponseBodyDefaultVisualLlmModel();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyDefaultVisualLlmModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApplicationAvailableModelsResponseBodyDefaultVisualLlmModel setSupportedModalities(java.util.List<String> supportedModalities) {
            this.supportedModalities = supportedModalities;
            return this;
        }
        public java.util.List<String> getSupportedModalities() {
            return this.supportedModalities;
        }

    }

    public static class DescribeApplicationAvailableModelsResponseBodyEmbeddingModels extends TeaModel {
        /**
         * <p>The default vector dimensions of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Dimension")
        public Integer dimension;

        /**
         * <p>The list of vector dimensions supported by the model.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<Integer> dimensions;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v3</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationAvailableModelsResponseBodyEmbeddingModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyEmbeddingModels self = new DescribeApplicationAvailableModelsResponseBodyEmbeddingModels();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyEmbeddingModels setDimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }
        public Integer getDimension() {
            return this.dimension;
        }

        public DescribeApplicationAvailableModelsResponseBodyEmbeddingModels setDimensions(java.util.List<Integer> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<Integer> getDimensions() {
            return this.dimensions;
        }

        public DescribeApplicationAvailableModelsResponseBodyEmbeddingModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationAvailableModelsResponseBodyGraphLlmModels extends TeaModel {
        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationAvailableModelsResponseBodyGraphLlmModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyGraphLlmModels self = new DescribeApplicationAvailableModelsResponseBodyGraphLlmModels();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyGraphLlmModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationAvailableModelsResponseBodyLlmModels extends TeaModel {
        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationAvailableModelsResponseBodyLlmModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyLlmModels self = new DescribeApplicationAvailableModelsResponseBodyLlmModels();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyLlmModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationAvailableModelsResponseBodyRerankModels extends TeaModel {
        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>gte-rerank-v2</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationAvailableModelsResponseBodyRerankModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyRerankModels self = new DescribeApplicationAvailableModelsResponseBodyRerankModels();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyRerankModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationAvailableModelsResponseBodyVLModels extends TeaModel {
        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-vl-max</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationAvailableModelsResponseBodyVLModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyVLModels self = new DescribeApplicationAvailableModelsResponseBodyVLModels();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyVLModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationAvailableModelsResponseBodyVisualEmbedderModels extends TeaModel {
        /**
         * <p>The default dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>2560</p>
         */
        @NameInMap("Dimension")
        public Integer dimension;

        /**
         * <p>The available dimensions.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<Integer> dimensions;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.7-text-embedding</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationAvailableModelsResponseBodyVisualEmbedderModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyVisualEmbedderModels self = new DescribeApplicationAvailableModelsResponseBodyVisualEmbedderModels();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyVisualEmbedderModels setDimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }
        public Integer getDimension() {
            return this.dimension;
        }

        public DescribeApplicationAvailableModelsResponseBodyVisualEmbedderModels setDimensions(java.util.List<Integer> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<Integer> getDimensions() {
            return this.dimensions;
        }

        public DescribeApplicationAvailableModelsResponseBodyVisualEmbedderModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationAvailableModelsResponseBodyVisualLlmModels extends TeaModel {
        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.6-flash</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The supported modalities.</p>
         */
        @NameInMap("SupportedModalities")
        public java.util.List<String> supportedModalities;

        public static DescribeApplicationAvailableModelsResponseBodyVisualLlmModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAvailableModelsResponseBodyVisualLlmModels self = new DescribeApplicationAvailableModelsResponseBodyVisualLlmModels();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAvailableModelsResponseBodyVisualLlmModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApplicationAvailableModelsResponseBodyVisualLlmModels setSupportedModalities(java.util.List<String> supportedModalities) {
            this.supportedModalities = supportedModalities;
            return this;
        }
        public java.util.List<String> getSupportedModalities() {
            return this.supportedModalities;
        }

    }

}
