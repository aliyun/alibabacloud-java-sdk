// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code. If no error occurs, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance.NotExist</p>
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
     * <p>The time consumed for the request, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Latency")
    public Long latency;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>instance not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>68ED4E1B-92B8-5821-A886-9C90686139EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Result")
    public GetFunctionInstanceResponseBodyResult result;

    /**
     * <p>The status of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
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
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The industry.</p>
         * 
         * <strong>example:</strong>
         * <p>ecommerce</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The abbreviation of the language that applies.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
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
         * 
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
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
         * <ul>
         * <li>success: succeeded</li>
         * <li>failed: failed</li>
         * <li>untrained: to be trained</li>
         * <li>pending: being scheduled</li>
         * <li>running: being trained</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("DagStatus")
        public String dagStatus;

        /**
         * <p>The time consumed for the most recent run, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
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
         * 
         * <strong>example:</strong>
         * <p>use_param1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
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
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The cron expression used to schedule training, in the format of (Minutes Hours DayofMonth Month DayofWeek). If the value is empty, it indicates that no periodic training is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>0 3 ? \* 0,1,3,5 (at 3 a.m. on Sunday, Monday, Wednesday, and Friday)</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance descriptions</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The extended information, which is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;dataReport\&quot;:{},\&quot;errors\&quot;:{}}</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>ctr</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The type of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>PAAS</p>
         */
        @NameInMap("FunctionType")
        public String functionType;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ctr_test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The type of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>tf_checkpoint</p>
         */
        @NameInMap("ModelType")
        public String modelType;

        /**
         * <p>How the instance is created. Valid values:</p>
         * <ul>
         * <li>user: The instance is created by user.</li>
         * <li>builtin: The instance is created by the system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ol>
         * <li>unavailable: No model is available. Models must be trained before you can use them.</li>
         * <li>available: Models can be used.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>available</p>
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
         * 
         * <strong>example:</strong>
         * <p>101</p>
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
