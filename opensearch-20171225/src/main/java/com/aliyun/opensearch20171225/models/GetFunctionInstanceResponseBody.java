// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code. If no error occurs, this parameter is left empty.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpCode")
    public Long httpCode;

    /**
     * <p>The time consumed for the request, in milliseconds.</p>
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
     * <p>The details of the instance.</p>
     */
    @NameInMap("Result")
    public GetFunctionInstanceResponseBodyResult result;

    /**
     * <p>The status of the request.</p>
     */
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
        /**
         * <p>The category.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The industry.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The abbreviation of the language that applies.</p>
         */
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
        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the parameter.</p>
         */
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
        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   success: succeeded</p>
         * <p>*   failed: failed</p>
         * <p>*   untrained: to be trained</p>
         * <p>*   pending: being scheduled</p>
         * <p>*   running: being trained</p>
         */
        @NameInMap("DagStatus")
        public String dagStatus;

        /**
         * <p>The time consumed for the most recent run, in milliseconds.</p>
         */
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
        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the parameter.</p>
         */
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
        /**
         * <p>The information about the instance.</p>
         */
        @NameInMap("Belongs")
        public GetFunctionInstanceResponseBodyResultBelongs belongs;

        /**
         * <p>The parameters that are used to create the instance.</p>
         */
        @NameInMap("CreateParameters")
        public java.util.List<GetFunctionInstanceResponseBodyResultCreateParameters> createParameters;

        /**
         * <p>The time when the task was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The cron expression used to schedule training, in the format of (Minutes Hours DayofMonth Month DayofWeek). If the value is empty, it indicates that no periodic training is performed.</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The extended information, which is a JSON string.</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <p>The name of the feature.</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The type of the feature.</p>
         */
        @NameInMap("FunctionType")
        public String functionType;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The type of the model.</p>
         */
        @NameInMap("ModelType")
        public String modelType;

        /**
         * <p>How the instance is created. Valid values:</p>
         * <br>
         * <p>*   user: The instance is created by user.</p>
         * <p>*   builtin: The instance is created by the system.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <br>
         * <p>1.  unavailable: No model is available. Models must be trained before you can use them.</p>
         * <p>2.  available: Models can be used.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The information about the training task. This parameter is not displayed if no task is available.</p>
         */
        @NameInMap("Task")
        public GetFunctionInstanceResponseBodyResultTask task;

        /**
         * <p>The parameters that are used.</p>
         */
        @NameInMap("UsageParameters")
        public java.util.List<GetFunctionInstanceResponseBodyResultUsageParameters> usageParameters;

        /**
         * <p>The ID of the version.</p>
         */
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
