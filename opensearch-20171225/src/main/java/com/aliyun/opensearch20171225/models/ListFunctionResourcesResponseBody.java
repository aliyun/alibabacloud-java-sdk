// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFunctionResourcesResponseBody extends TeaModel {
    /**
     * <p>The returned error code. This parameter is empty if no error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource.InvalidResourceName</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpCode")
    public Long httpCode;

    /**
     * <p>The request latency. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Latency")
    public Double latency;

    /**
     * <p>The returned error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid resource name.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;3A809095-C554-5CF5-8FCE-BE19D4673790&quot;</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListFunctionResourcesResponseBodyResult> result;

    /**
     * <p>The request status. Valid values: OK and FAIL.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of records that meet the requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListFunctionResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionResourcesResponseBody self = new ListFunctionResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFunctionResourcesResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public ListFunctionResourcesResponseBody setLatency(Double latency) {
        this.latency = latency;
        return this;
    }
    public Double getLatency() {
        return this.latency;
    }

    public ListFunctionResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFunctionResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFunctionResourcesResponseBody setResult(java.util.List<ListFunctionResourcesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListFunctionResourcesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListFunctionResourcesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListFunctionResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListFunctionResourcesResponseBodyResultDataGeneratorsInputFeatures extends TeaModel {
        /**
         * <p>The feature name.</p>
         * 
         * <strong>example:</strong>
         * <p>system_item_id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The feature type.</p>
         * 
         * <strong>example:</strong>
         * <p>item</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListFunctionResourcesResponseBodyResultDataGeneratorsInputFeatures build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionResourcesResponseBodyResultDataGeneratorsInputFeatures self = new ListFunctionResourcesResponseBodyResultDataGeneratorsInputFeatures();
            return TeaModel.build(map, self);
        }

        public ListFunctionResourcesResponseBodyResultDataGeneratorsInputFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFunctionResourcesResponseBodyResultDataGeneratorsInputFeatures setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListFunctionResourcesResponseBodyResultDataGeneratorsInput extends TeaModel {
        /**
         * <p>The list of input features.</p>
         */
        @NameInMap("Features")
        public java.util.List<ListFunctionResourcesResponseBodyResultDataGeneratorsInputFeatures> features;

        public static ListFunctionResourcesResponseBodyResultDataGeneratorsInput build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionResourcesResponseBodyResultDataGeneratorsInput self = new ListFunctionResourcesResponseBodyResultDataGeneratorsInput();
            return TeaModel.build(map, self);
        }

        public ListFunctionResourcesResponseBodyResultDataGeneratorsInput setFeatures(java.util.List<ListFunctionResourcesResponseBodyResultDataGeneratorsInputFeatures> features) {
            this.features = features;
            return this;
        }
        public java.util.List<ListFunctionResourcesResponseBodyResultDataGeneratorsInputFeatures> getFeatures() {
            return this.features;
        }

    }

    public static class ListFunctionResourcesResponseBodyResultDataGenerators extends TeaModel {
        /**
         * <p>The type of the feature generator.</p>
         * 
         * <strong>example:</strong>
         * <p>combo</p>
         */
        @NameInMap("Generator")
        public String generator;

        /**
         * <p>The input.</p>
         */
        @NameInMap("Input")
        public ListFunctionResourcesResponseBodyResultDataGeneratorsInput input;

        /**
         * <p>The name of the output feature.</p>
         * 
         * <strong>example:</strong>
         * <p>feature1</p>
         */
        @NameInMap("Output")
        public String output;

        public static ListFunctionResourcesResponseBodyResultDataGenerators build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionResourcesResponseBodyResultDataGenerators self = new ListFunctionResourcesResponseBodyResultDataGenerators();
            return TeaModel.build(map, self);
        }

        public ListFunctionResourcesResponseBodyResultDataGenerators setGenerator(String generator) {
            this.generator = generator;
            return this;
        }
        public String getGenerator() {
            return this.generator;
        }

        public ListFunctionResourcesResponseBodyResultDataGenerators setInput(ListFunctionResourcesResponseBodyResultDataGeneratorsInput input) {
            this.input = input;
            return this;
        }
        public ListFunctionResourcesResponseBodyResultDataGeneratorsInput getInput() {
            return this.input;
        }

        public ListFunctionResourcesResponseBodyResultDataGenerators setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class ListFunctionResourcesResponseBodyResultData extends TeaModel {
        /**
         * <p>The content of the file that corresponds to the raw_file resource.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;abc&quot;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The list of feature generators that correspond to the feature_generator resource.</p>
         */
        @NameInMap("Generators")
        public java.util.List<ListFunctionResourcesResponseBodyResultDataGenerators> generators;

        public static ListFunctionResourcesResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionResourcesResponseBodyResultData self = new ListFunctionResourcesResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public ListFunctionResourcesResponseBodyResultData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListFunctionResourcesResponseBodyResultData setGenerators(java.util.List<ListFunctionResourcesResponseBodyResultDataGenerators> generators) {
            this.generators = generators;
            return this;
        }
        public java.util.List<ListFunctionResourcesResponseBodyResultDataGenerators> getGenerators() {
            return this.generators;
        }

    }

    public static class ListFunctionResourcesResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the resource was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The resource data. The structure of the data varies based on the resourceType.</p>
         */
        @NameInMap("Data")
        public ListFunctionResourcesResponseBodyResultData data;

        /**
         * <p>The description of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>resource description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The function name.</p>
         * 
         * <strong>example:</strong>
         * <p>rank</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The time when the resource was last modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The names of the referenced algorithm instances.</p>
         */
        @NameInMap("ReferencedInstances")
        public java.util.List<String> referencedInstances;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>fg_json</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>feature_generator</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ListFunctionResourcesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionResourcesResponseBodyResult self = new ListFunctionResourcesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListFunctionResourcesResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListFunctionResourcesResponseBodyResult setData(ListFunctionResourcesResponseBodyResultData data) {
            this.data = data;
            return this;
        }
        public ListFunctionResourcesResponseBodyResultData getData() {
            return this.data;
        }

        public ListFunctionResourcesResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFunctionResourcesResponseBodyResult setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public ListFunctionResourcesResponseBodyResult setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListFunctionResourcesResponseBodyResult setReferencedInstances(java.util.List<String> referencedInstances) {
            this.referencedInstances = referencedInstances;
            return this;
        }
        public java.util.List<String> getReferencedInstances() {
            return this.referencedInstances;
        }

        public ListFunctionResourcesResponseBodyResult setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListFunctionResourcesResponseBodyResult setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
