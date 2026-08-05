// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetFunctionInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>not found</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Long httpCode;

    /**
     * <p>The time consumed.</p>
     * 
     * <strong>example:</strong>
     * <p>11.627</p>
     */
    @NameInMap("latency")
    public Long latency;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;xx not found&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C56462F4-CCB3-10BF-A3D8-FEE53C72B65C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public GetFunctionInstanceResponseBodyResult result;

    /**
     * <p>The request status.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("status")
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
         * <p>&quot;&quot;</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The industry type.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("language")
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
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("value")
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
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>success: Succeeded.</li>
         * <li>failed: Failed.</li>
         * <li>untrained: Pending training.</li>
         * <li>pending: Scheduling.</li>
         * <li>running: Training in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("dagStatus")
        public String dagStatus;

        /**
         * <p>The last training time.</p>
         * 
         * <strong>example:</strong>
         * <p>1724998630466</p>
         */
        @NameInMap("lastRunTime")
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

    public static class GetFunctionInstanceResponseBodyResult extends TeaModel {
        /**
         * <p>The ownership information.</p>
         */
        @NameInMap("belongs")
        public GetFunctionInstanceResponseBodyResultBelongs belongs;

        /**
         * <p>The specific configuration items.</p>
         */
        @NameInMap("createParameters")
        public java.util.List<GetFunctionInstanceResponseBodyResultCreateParameters> createParameters;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1724998630466</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The cron expression for the timed scheduling task.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("extendInfo")
        public String extendInfo;

        /**
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li>nl2sql</li>
         * <li>embedding-tuning</li>
         * <li>deployment</li>
         * <li>notebook.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nl2sql</p>
         */
        @NameInMap("functionName")
        public String functionName;

        /**
         * <p>The configuration type. PAAS (default): requires training before use.</p>
         * 
         * <strong>example:</strong>
         * <p>PAAS</p>
         */
        @NameInMap("functionType")
        public String functionType;

        /**
         * <p>The configuration name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("instanceName")
        public String instanceName;

        /**
         * <p>The model type. The valid values vary based on the configuration type (functionName):</p>
         * <ul>
         * <li>ops-query-analyze-nl2sql-001 (nl2sql)</li>
         * <li>ops-embedding-dim-reduction-001 (embedding-tuning)</li>
         * <li>native (deployment)</li>
         * <li>dsw (notebook).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dsw</p>
         */
        @NameInMap("modelType")
        public String modelType;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>available</li>
         * <li>unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The task information.</p>
         */
        @NameInMap("task")
        public GetFunctionInstanceResponseBodyResultTask task;

        /**
         * <p>The training version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("versionId")
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

        public GetFunctionInstanceResponseBodyResult setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

    }

}
