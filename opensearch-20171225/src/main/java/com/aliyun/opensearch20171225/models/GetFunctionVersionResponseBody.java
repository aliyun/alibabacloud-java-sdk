// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionVersionResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpCode")
    public Long httpCode;

    /**
     * <p>The maximum duration for which a task can be executed.</p>
     */
    @NameInMap("Latency")
    public Long latency;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result body.</p>
     */
    @NameInMap("Result")
    public GetFunctionVersionResponseBodyResult result;

    /**
     * <p>The status of the request.</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetFunctionVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionVersionResponseBody self = new GetFunctionVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFunctionVersionResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public GetFunctionVersionResponseBody setLatency(Long latency) {
        this.latency = latency;
        return this;
    }
    public Long getLatency() {
        return this.latency;
    }

    public GetFunctionVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFunctionVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFunctionVersionResponseBody setResult(GetFunctionVersionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetFunctionVersionResponseBodyResult getResult() {
        return this.result;
    }

    public GetFunctionVersionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetFunctionVersionResponseBodyResultVersionConfigCreateParameters extends TeaModel {
        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the parameter is required.</p>
         */
        @NameInMap("Required")
        public String required;

        public static GetFunctionVersionResponseBodyResultVersionConfigCreateParameters build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionVersionResponseBodyResultVersionConfigCreateParameters self = new GetFunctionVersionResponseBodyResultVersionConfigCreateParameters();
            return TeaModel.build(map, self);
        }

        public GetFunctionVersionResponseBodyResultVersionConfigCreateParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFunctionVersionResponseBodyResultVersionConfigCreateParameters setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

    }

    public static class GetFunctionVersionResponseBodyResultVersionConfigDepends extends TeaModel {
        /**
         * <p>The condition.</p>
         */
        @NameInMap("Condition")
        public String condition;

        /**
         * <p>The dependency.</p>
         */
        @NameInMap("Dependency")
        public String dependency;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        public static GetFunctionVersionResponseBodyResultVersionConfigDepends build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionVersionResponseBodyResultVersionConfigDepends self = new GetFunctionVersionResponseBodyResultVersionConfigDepends();
            return TeaModel.build(map, self);
        }

        public GetFunctionVersionResponseBodyResultVersionConfigDepends setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetFunctionVersionResponseBodyResultVersionConfigDepends setDependency(String dependency) {
            this.dependency = dependency;
            return this;
        }
        public String getDependency() {
            return this.dependency;
        }

        public GetFunctionVersionResponseBodyResultVersionConfigDepends setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class GetFunctionVersionResponseBodyResultVersionConfigUsageParameters extends TeaModel {
        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the parameter is required.</p>
         */
        @NameInMap("Required")
        public String required;

        public static GetFunctionVersionResponseBodyResultVersionConfigUsageParameters build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionVersionResponseBodyResultVersionConfigUsageParameters self = new GetFunctionVersionResponseBodyResultVersionConfigUsageParameters();
            return TeaModel.build(map, self);
        }

        public GetFunctionVersionResponseBodyResultVersionConfigUsageParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFunctionVersionResponseBodyResultVersionConfigUsageParameters setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

    }

    public static class GetFunctionVersionResponseBodyResultVersionConfig extends TeaModel {
        /**
         * <p>The parameters that are used to create the instance.</p>
         */
        @NameInMap("CreateParameters")
        public java.util.List<GetFunctionVersionResponseBodyResultVersionConfigCreateParameters> createParameters;

        /**
         * <p>The dependencies of the instance.</p>
         */
        @NameInMap("Depends")
        public java.util.List<GetFunctionVersionResponseBodyResultVersionConfigDepends> depends;

        /**
         * <p>The parameters that are used during online use of the instance.</p>
         */
        @NameInMap("UsageParameters")
        public java.util.List<GetFunctionVersionResponseBodyResultVersionConfigUsageParameters> usageParameters;

        public static GetFunctionVersionResponseBodyResultVersionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionVersionResponseBodyResultVersionConfig self = new GetFunctionVersionResponseBodyResultVersionConfig();
            return TeaModel.build(map, self);
        }

        public GetFunctionVersionResponseBodyResultVersionConfig setCreateParameters(java.util.List<GetFunctionVersionResponseBodyResultVersionConfigCreateParameters> createParameters) {
            this.createParameters = createParameters;
            return this;
        }
        public java.util.List<GetFunctionVersionResponseBodyResultVersionConfigCreateParameters> getCreateParameters() {
            return this.createParameters;
        }

        public GetFunctionVersionResponseBodyResultVersionConfig setDepends(java.util.List<GetFunctionVersionResponseBodyResultVersionConfigDepends> depends) {
            this.depends = depends;
            return this;
        }
        public java.util.List<GetFunctionVersionResponseBodyResultVersionConfigDepends> getDepends() {
            return this.depends;
        }

        public GetFunctionVersionResponseBodyResultVersionConfig setUsageParameters(java.util.List<GetFunctionVersionResponseBodyResultVersionConfigUsageParameters> usageParameters) {
            this.usageParameters = usageParameters;
            return this;
        }
        public java.util.List<GetFunctionVersionResponseBodyResultVersionConfigUsageParameters> getUsageParameters() {
            return this.usageParameters;
        }

    }

    public static class GetFunctionVersionResponseBodyResult extends TeaModel {
        /**
         * <p>The name of the feature.</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The type of the feature. Valid values:</p>
         * <br>
         * <p>*   PAAS</p>
         * <p>*   SAAS</p>
         */
        @NameInMap("FunctionType")
        public String functionType;

        /**
         * <p>The type of the model.</p>
         */
        @NameInMap("ModelType")
        public String modelType;

        /**
         * <p>The configuration information.</p>
         */
        @NameInMap("VersionConfig")
        public GetFunctionVersionResponseBodyResultVersionConfig versionConfig;

        /**
         * <p>The ID of the version.</p>
         */
        @NameInMap("VersionId")
        public Long versionId;

        /**
         * <p>The name of the version.</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        public static GetFunctionVersionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionVersionResponseBodyResult self = new GetFunctionVersionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetFunctionVersionResponseBodyResult setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public GetFunctionVersionResponseBodyResult setFunctionType(String functionType) {
            this.functionType = functionType;
            return this;
        }
        public String getFunctionType() {
            return this.functionType;
        }

        public GetFunctionVersionResponseBodyResult setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public GetFunctionVersionResponseBodyResult setVersionConfig(GetFunctionVersionResponseBodyResultVersionConfig versionConfig) {
            this.versionConfig = versionConfig;
            return this;
        }
        public GetFunctionVersionResponseBodyResultVersionConfig getVersionConfig() {
            return this.versionConfig;
        }

        public GetFunctionVersionResponseBodyResult setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

        public GetFunctionVersionResponseBodyResult setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

}
