// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionCurrentVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpCode")
    public Long httpCode;

    @NameInMap("Latency")
    public Long latency;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetFunctionCurrentVersionResponseBodyResult result;

    @NameInMap("Status")
    public String status;

    public static GetFunctionCurrentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionCurrentVersionResponseBody self = new GetFunctionCurrentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionCurrentVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFunctionCurrentVersionResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public GetFunctionCurrentVersionResponseBody setLatency(Long latency) {
        this.latency = latency;
        return this;
    }
    public Long getLatency() {
        return this.latency;
    }

    public GetFunctionCurrentVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFunctionCurrentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFunctionCurrentVersionResponseBody setResult(GetFunctionCurrentVersionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetFunctionCurrentVersionResponseBodyResult getResult() {
        return this.result;
    }

    public GetFunctionCurrentVersionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetFunctionCurrentVersionResponseBodyResultVersionConfigCreateParameters extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Required")
        public String required;

        public static GetFunctionCurrentVersionResponseBodyResultVersionConfigCreateParameters build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionCurrentVersionResponseBodyResultVersionConfigCreateParameters self = new GetFunctionCurrentVersionResponseBodyResultVersionConfigCreateParameters();
            return TeaModel.build(map, self);
        }

        public GetFunctionCurrentVersionResponseBodyResultVersionConfigCreateParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFunctionCurrentVersionResponseBodyResultVersionConfigCreateParameters setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

    }

    public static class GetFunctionCurrentVersionResponseBodyResultVersionConfigDepends extends TeaModel {
        @NameInMap("Condition")
        public String condition;

        @NameInMap("Dependency")
        public String dependency;

        @NameInMap("Description")
        public String description;

        public static GetFunctionCurrentVersionResponseBodyResultVersionConfigDepends build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionCurrentVersionResponseBodyResultVersionConfigDepends self = new GetFunctionCurrentVersionResponseBodyResultVersionConfigDepends();
            return TeaModel.build(map, self);
        }

        public GetFunctionCurrentVersionResponseBodyResultVersionConfigDepends setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetFunctionCurrentVersionResponseBodyResultVersionConfigDepends setDependency(String dependency) {
            this.dependency = dependency;
            return this;
        }
        public String getDependency() {
            return this.dependency;
        }

        public GetFunctionCurrentVersionResponseBodyResultVersionConfigDepends setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class GetFunctionCurrentVersionResponseBodyResultVersionConfigUsageParameters extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Required")
        public String required;

        public static GetFunctionCurrentVersionResponseBodyResultVersionConfigUsageParameters build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionCurrentVersionResponseBodyResultVersionConfigUsageParameters self = new GetFunctionCurrentVersionResponseBodyResultVersionConfigUsageParameters();
            return TeaModel.build(map, self);
        }

        public GetFunctionCurrentVersionResponseBodyResultVersionConfigUsageParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFunctionCurrentVersionResponseBodyResultVersionConfigUsageParameters setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

    }

    public static class GetFunctionCurrentVersionResponseBodyResultVersionConfig extends TeaModel {
        @NameInMap("CreateParameters")
        public java.util.List<GetFunctionCurrentVersionResponseBodyResultVersionConfigCreateParameters> createParameters;

        @NameInMap("Depends")
        public java.util.List<GetFunctionCurrentVersionResponseBodyResultVersionConfigDepends> depends;

        @NameInMap("UsageParameters")
        public java.util.List<GetFunctionCurrentVersionResponseBodyResultVersionConfigUsageParameters> usageParameters;

        public static GetFunctionCurrentVersionResponseBodyResultVersionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionCurrentVersionResponseBodyResultVersionConfig self = new GetFunctionCurrentVersionResponseBodyResultVersionConfig();
            return TeaModel.build(map, self);
        }

        public GetFunctionCurrentVersionResponseBodyResultVersionConfig setCreateParameters(java.util.List<GetFunctionCurrentVersionResponseBodyResultVersionConfigCreateParameters> createParameters) {
            this.createParameters = createParameters;
            return this;
        }
        public java.util.List<GetFunctionCurrentVersionResponseBodyResultVersionConfigCreateParameters> getCreateParameters() {
            return this.createParameters;
        }

        public GetFunctionCurrentVersionResponseBodyResultVersionConfig setDepends(java.util.List<GetFunctionCurrentVersionResponseBodyResultVersionConfigDepends> depends) {
            this.depends = depends;
            return this;
        }
        public java.util.List<GetFunctionCurrentVersionResponseBodyResultVersionConfigDepends> getDepends() {
            return this.depends;
        }

        public GetFunctionCurrentVersionResponseBodyResultVersionConfig setUsageParameters(java.util.List<GetFunctionCurrentVersionResponseBodyResultVersionConfigUsageParameters> usageParameters) {
            this.usageParameters = usageParameters;
            return this;
        }
        public java.util.List<GetFunctionCurrentVersionResponseBodyResultVersionConfigUsageParameters> getUsageParameters() {
            return this.usageParameters;
        }

    }

    public static class GetFunctionCurrentVersionResponseBodyResult extends TeaModel {
        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("FunctionType")
        public String functionType;

        @NameInMap("ModelType")
        public String modelType;

        @NameInMap("VersionConfig")
        public GetFunctionCurrentVersionResponseBodyResultVersionConfig versionConfig;

        @NameInMap("VersionId")
        public Long versionId;

        @NameInMap("VersionName")
        public String versionName;

        public static GetFunctionCurrentVersionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionCurrentVersionResponseBodyResult self = new GetFunctionCurrentVersionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetFunctionCurrentVersionResponseBodyResult setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public GetFunctionCurrentVersionResponseBodyResult setFunctionType(String functionType) {
            this.functionType = functionType;
            return this;
        }
        public String getFunctionType() {
            return this.functionType;
        }

        public GetFunctionCurrentVersionResponseBodyResult setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public GetFunctionCurrentVersionResponseBodyResult setVersionConfig(GetFunctionCurrentVersionResponseBodyResultVersionConfig versionConfig) {
            this.versionConfig = versionConfig;
            return this;
        }
        public GetFunctionCurrentVersionResponseBodyResultVersionConfig getVersionConfig() {
            return this.versionConfig;
        }

        public GetFunctionCurrentVersionResponseBodyResult setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

        public GetFunctionCurrentVersionResponseBodyResult setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

}
