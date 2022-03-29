// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionInstanceResponseBody extends TeaModel {
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
    public GetFunctionInstanceResponseBodyResult result;

    @NameInMap("Status")
    public String status;

    public static GetFunctionInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionInstanceResponseBody self = new GetFunctionInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFunctionInstanceResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public GetFunctionInstanceResponseBody setLatency(Long latency) {
        this.latency = latency;
        return this;
    }
    public Long getLatency() {
        return this.latency;
    }

    public GetFunctionInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFunctionInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFunctionInstanceResponseBody setResult(GetFunctionInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetFunctionInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public GetFunctionInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetFunctionInstanceResponseBodyResultBelongs extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Language")
        public String language;

        public static GetFunctionInstanceResponseBodyResultBelongs build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionInstanceResponseBodyResultBelongs self = new GetFunctionInstanceResponseBodyResultBelongs();
            return TeaModel.build(map, self);
        }

        public GetFunctionInstanceResponseBodyResultBelongs setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetFunctionInstanceResponseBodyResultBelongs setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetFunctionInstanceResponseBodyResultBelongs setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class GetFunctionInstanceResponseBodyResultCreateParameters extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static GetFunctionInstanceResponseBodyResultCreateParameters build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionInstanceResponseBodyResultCreateParameters self = new GetFunctionInstanceResponseBodyResultCreateParameters();
            return TeaModel.build(map, self);
        }

        public GetFunctionInstanceResponseBodyResultCreateParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFunctionInstanceResponseBodyResultCreateParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetFunctionInstanceResponseBodyResultTask extends TeaModel {
        @NameInMap("DagStatus")
        public String dagStatus;

        @NameInMap("LastRunTime")
        public Long lastRunTime;

        public static GetFunctionInstanceResponseBodyResultTask build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionInstanceResponseBodyResultTask self = new GetFunctionInstanceResponseBodyResultTask();
            return TeaModel.build(map, self);
        }

        public GetFunctionInstanceResponseBodyResultTask setDagStatus(String dagStatus) {
            this.dagStatus = dagStatus;
            return this;
        }
        public String getDagStatus() {
            return this.dagStatus;
        }

        public GetFunctionInstanceResponseBodyResultTask setLastRunTime(Long lastRunTime) {
            this.lastRunTime = lastRunTime;
            return this;
        }
        public Long getLastRunTime() {
            return this.lastRunTime;
        }

    }

    public static class GetFunctionInstanceResponseBodyResultUsageParameters extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static GetFunctionInstanceResponseBodyResultUsageParameters build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionInstanceResponseBodyResultUsageParameters self = new GetFunctionInstanceResponseBodyResultUsageParameters();
            return TeaModel.build(map, self);
        }

        public GetFunctionInstanceResponseBodyResultUsageParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFunctionInstanceResponseBodyResultUsageParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetFunctionInstanceResponseBodyResult extends TeaModel {
        @NameInMap("Belongs")
        public GetFunctionInstanceResponseBodyResultBelongs belongs;

        @NameInMap("CreateParameters")
        public java.util.List<GetFunctionInstanceResponseBodyResultCreateParameters> createParameters;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Cron")
        public String cron;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExtendInfo")
        public String extendInfo;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("FunctionType")
        public String functionType;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("ModelType")
        public String modelType;

        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Task")
        public GetFunctionInstanceResponseBodyResultTask task;

        @NameInMap("UsageParameters")
        public java.util.List<GetFunctionInstanceResponseBodyResultUsageParameters> usageParameters;

        @NameInMap("VersionId")
        public Long versionId;

        public static GetFunctionInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionInstanceResponseBodyResult self = new GetFunctionInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetFunctionInstanceResponseBodyResult setBelongs(GetFunctionInstanceResponseBodyResultBelongs belongs) {
            this.belongs = belongs;
            return this;
        }
        public GetFunctionInstanceResponseBodyResultBelongs getBelongs() {
            return this.belongs;
        }

        public GetFunctionInstanceResponseBodyResult setCreateParameters(java.util.List<GetFunctionInstanceResponseBodyResultCreateParameters> createParameters) {
            this.createParameters = createParameters;
            return this;
        }
        public java.util.List<GetFunctionInstanceResponseBodyResultCreateParameters> getCreateParameters() {
            return this.createParameters;
        }

        public GetFunctionInstanceResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetFunctionInstanceResponseBodyResult setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public GetFunctionInstanceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetFunctionInstanceResponseBodyResult setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public GetFunctionInstanceResponseBodyResult setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public GetFunctionInstanceResponseBodyResult setFunctionType(String functionType) {
            this.functionType = functionType;
            return this;
        }
        public String getFunctionType() {
            return this.functionType;
        }

        public GetFunctionInstanceResponseBodyResult setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetFunctionInstanceResponseBodyResult setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public GetFunctionInstanceResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetFunctionInstanceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetFunctionInstanceResponseBodyResult setTask(GetFunctionInstanceResponseBodyResultTask task) {
            this.task = task;
            return this;
        }
        public GetFunctionInstanceResponseBodyResultTask getTask() {
            return this.task;
        }

        public GetFunctionInstanceResponseBodyResult setUsageParameters(java.util.List<GetFunctionInstanceResponseBodyResultUsageParameters> usageParameters) {
            this.usageParameters = usageParameters;
            return this;
        }
        public java.util.List<GetFunctionInstanceResponseBodyResultUsageParameters> getUsageParameters() {
            return this.usageParameters;
        }

        public GetFunctionInstanceResponseBodyResult setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

    }

}
