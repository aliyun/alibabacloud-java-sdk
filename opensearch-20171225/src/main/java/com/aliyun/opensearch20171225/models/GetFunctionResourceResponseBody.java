// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionResourceResponseBody extends TeaModel {
    /**
     * <p>The error code returned. If no error occurs, this value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource.NotExist</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpCode")
    public Long httpCode;

    /**
     * <p>The time consumed for the API request. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Latency")
    public Double latency;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E215C843-0795-5293-AC9A-14FE0723E890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Result")
    public GetFunctionResourceResponseBodyResult result;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li>OK</li>
     * <li>FAIL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetFunctionResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionResourceResponseBody self = new GetFunctionResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFunctionResourceResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public GetFunctionResourceResponseBody setLatency(Double latency) {
        this.latency = latency;
        return this;
    }
    public Double getLatency() {
        return this.latency;
    }

    public GetFunctionResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFunctionResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFunctionResourceResponseBody setResult(GetFunctionResourceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetFunctionResourceResponseBodyResult getResult() {
        return this.result;
    }

    public GetFunctionResourceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetFunctionResourceResponseBodyResultDataGeneratorsInputFeatures extends TeaModel {
        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>system_item_id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>item</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetFunctionResourceResponseBodyResultDataGeneratorsInputFeatures build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionResourceResponseBodyResultDataGeneratorsInputFeatures self = new GetFunctionResourceResponseBodyResultDataGeneratorsInputFeatures();
            return TeaModel.build(map, self);
        }

        public GetFunctionResourceResponseBodyResultDataGeneratorsInputFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFunctionResourceResponseBodyResultDataGeneratorsInputFeatures setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetFunctionResourceResponseBodyResultDataGeneratorsInput extends TeaModel {
        /**
         * <p>The input features.</p>
         */
        @NameInMap("Features")
        public java.util.List<GetFunctionResourceResponseBodyResultDataGeneratorsInputFeatures> features;

        public static GetFunctionResourceResponseBodyResultDataGeneratorsInput build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionResourceResponseBodyResultDataGeneratorsInput self = new GetFunctionResourceResponseBodyResultDataGeneratorsInput();
            return TeaModel.build(map, self);
        }

        public GetFunctionResourceResponseBodyResultDataGeneratorsInput setFeatures(java.util.List<GetFunctionResourceResponseBodyResultDataGeneratorsInputFeatures> features) {
            this.features = features;
            return this;
        }
        public java.util.List<GetFunctionResourceResponseBodyResultDataGeneratorsInputFeatures> getFeatures() {
            return this.features;
        }

    }

    public static class GetFunctionResourceResponseBodyResultDataGenerators extends TeaModel {
        /**
         * <p>The type of the feature generator.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Generator")
        public String generator;

        /**
         * <p>The input.</p>
         */
        @NameInMap("Input")
        public GetFunctionResourceResponseBodyResultDataGeneratorsInput input;

        /**
         * <p>The name of the output feature.</p>
         * 
         * <strong>example:</strong>
         * <p>output_feature_name</p>
         */
        @NameInMap("Output")
        public String output;

        public static GetFunctionResourceResponseBodyResultDataGenerators build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionResourceResponseBodyResultDataGenerators self = new GetFunctionResourceResponseBodyResultDataGenerators();
            return TeaModel.build(map, self);
        }

        public GetFunctionResourceResponseBodyResultDataGenerators setGenerator(String generator) {
            this.generator = generator;
            return this;
        }
        public String getGenerator() {
            return this.generator;
        }

        public GetFunctionResourceResponseBodyResultDataGenerators setInput(GetFunctionResourceResponseBodyResultDataGeneratorsInput input) {
            this.input = input;
            return this;
        }
        public GetFunctionResourceResponseBodyResultDataGeneratorsInput getInput() {
            return this.input;
        }

        public GetFunctionResourceResponseBodyResultDataGenerators setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

    }

    public static class GetFunctionResourceResponseBodyResultData extends TeaModel {
        /**
         * <p>The content of the file that corresponds to a resource of the raw_file type.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The feature generators that correspond to resources of the feature_generator type.</p>
         */
        @NameInMap("Generators")
        public java.util.List<GetFunctionResourceResponseBodyResultDataGenerators> generators;

        public static GetFunctionResourceResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionResourceResponseBodyResultData self = new GetFunctionResourceResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public GetFunctionResourceResponseBodyResultData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetFunctionResourceResponseBodyResultData setGenerators(java.util.List<GetFunctionResourceResponseBodyResultDataGenerators> generators) {
            this.generators = generators;
            return this;
        }
        public java.util.List<GetFunctionResourceResponseBodyResultDataGenerators> getGenerators() {
            return this.generators;
        }

    }

    public static class GetFunctionResourceResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the resource was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The resource data. The data structure varies with the resource type.</p>
         */
        @NameInMap("Data")
        public GetFunctionResourceResponseBodyResultData data;

        /**
         * <p>The description of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>rank</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The time when the resource was modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The algorithm instances that are referenced.</p>
         */
        @NameInMap("ReferencedInstances")
        public java.util.List<String> referencedInstances;

        /**
         * <p>The name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>fg_json</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>raw_file</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GetFunctionResourceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionResourceResponseBodyResult self = new GetFunctionResourceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetFunctionResourceResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetFunctionResourceResponseBodyResult setData(GetFunctionResourceResponseBodyResultData data) {
            this.data = data;
            return this;
        }
        public GetFunctionResourceResponseBodyResultData getData() {
            return this.data;
        }

        public GetFunctionResourceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetFunctionResourceResponseBodyResult setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public GetFunctionResourceResponseBodyResult setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetFunctionResourceResponseBodyResult setReferencedInstances(java.util.List<String> referencedInstances) {
            this.referencedInstances = referencedInstances;
            return this;
        }
        public java.util.List<String> getReferencedInstances() {
            return this.referencedInstances;
        }

        public GetFunctionResourceResponseBodyResult setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetFunctionResourceResponseBodyResult setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
