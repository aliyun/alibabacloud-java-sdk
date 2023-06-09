// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFunctionInstancesResponseBody extends TeaModel {
    /**
     * <p>The error code. If no error occurs, the parameter is left empty.</p>
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
     * <p>The error message. If no error occurs, the parameter is left empty.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the instances.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListFunctionInstancesResponseBodyResult> result;

    /**
     * <p>The status of the request.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListFunctionInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionInstancesResponseBody self = new ListFunctionInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFunctionInstancesResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public ListFunctionInstancesResponseBody setLatency(Long latency) {
        this.latency = latency;
        return this;
    }
    public Long getLatency() {
        return this.latency;
    }

    public ListFunctionInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFunctionInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFunctionInstancesResponseBody setResult(java.util.List<ListFunctionInstancesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListFunctionInstancesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListFunctionInstancesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListFunctionInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListFunctionInstancesResponseBodyResultBelongs extends TeaModel {
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

        public static ListFunctionInstancesResponseBodyResultBelongs build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionInstancesResponseBodyResultBelongs self = new ListFunctionInstancesResponseBodyResultBelongs();
            return TeaModel.build(map, self);
        }

        public ListFunctionInstancesResponseBodyResultBelongs setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListFunctionInstancesResponseBodyResultBelongs setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListFunctionInstancesResponseBodyResultBelongs setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class ListFunctionInstancesResponseBodyResultCreateParameters extends TeaModel {
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

        public static ListFunctionInstancesResponseBodyResultCreateParameters build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionInstancesResponseBodyResultCreateParameters self = new ListFunctionInstancesResponseBodyResultCreateParameters();
            return TeaModel.build(map, self);
        }

        public ListFunctionInstancesResponseBodyResultCreateParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFunctionInstancesResponseBodyResultCreateParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListFunctionInstancesResponseBodyResultUsageParameters extends TeaModel {
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

        public static ListFunctionInstancesResponseBodyResultUsageParameters build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionInstancesResponseBodyResultUsageParameters self = new ListFunctionInstancesResponseBodyResultUsageParameters();
            return TeaModel.build(map, self);
        }

        public ListFunctionInstancesResponseBodyResultUsageParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFunctionInstancesResponseBodyResultUsageParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListFunctionInstancesResponseBodyResult extends TeaModel {
        /**
         * <p>The information about the instance.</p>
         */
        @NameInMap("Belongs")
        public ListFunctionInstancesResponseBodyResultBelongs belongs;

        /**
         * <p>The parameters of the instance.</p>
         */
        @NameInMap("CreateParameters")
        public java.util.List<ListFunctionInstancesResponseBodyResultCreateParameters> createParameters;

        /**
         * <p>The time when the instance was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The cron expression used to schedule training, in the format of (Minutes Hours DayofMonth Month DayofWeek). If the value is empty, it indicates that no periodic training is performed.</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The extended information, which is a JSON string. It includes model evaluation information and error information.</p>
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
         * <p>*   builtin: The instance is created by system.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The state of the instance. Valid values:</p>
         * <br>
         * <p>1.  unavailable: No model is available. Models must be trained before you can use them.</p>
         * <p>2.  available: Models can be used.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The parameters that are used.</p>
         */
        @NameInMap("UsageParameters")
        public java.util.List<ListFunctionInstancesResponseBodyResultUsageParameters> usageParameters;

        /**
         * <p>The ID of the version.</p>
         */
        @NameInMap("VersionId")
        public Long versionId;

        public static ListFunctionInstancesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionInstancesResponseBodyResult self = new ListFunctionInstancesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListFunctionInstancesResponseBodyResult setBelongs(ListFunctionInstancesResponseBodyResultBelongs belongs) {
            this.belongs = belongs;
            return this;
        }
        public ListFunctionInstancesResponseBodyResultBelongs getBelongs() {
            return this.belongs;
        }

        public ListFunctionInstancesResponseBodyResult setCreateParameters(java.util.List<ListFunctionInstancesResponseBodyResultCreateParameters> createParameters) {
            this.createParameters = createParameters;
            return this;
        }
        public java.util.List<ListFunctionInstancesResponseBodyResultCreateParameters> getCreateParameters() {
            return this.createParameters;
        }

        public ListFunctionInstancesResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListFunctionInstancesResponseBodyResult setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public ListFunctionInstancesResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFunctionInstancesResponseBodyResult setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public ListFunctionInstancesResponseBodyResult setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public ListFunctionInstancesResponseBodyResult setFunctionType(String functionType) {
            this.functionType = functionType;
            return this;
        }
        public String getFunctionType() {
            return this.functionType;
        }

        public ListFunctionInstancesResponseBodyResult setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListFunctionInstancesResponseBodyResult setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ListFunctionInstancesResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListFunctionInstancesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFunctionInstancesResponseBodyResult setUsageParameters(java.util.List<ListFunctionInstancesResponseBodyResultUsageParameters> usageParameters) {
            this.usageParameters = usageParameters;
            return this;
        }
        public java.util.List<ListFunctionInstancesResponseBodyResultUsageParameters> getUsageParameters() {
            return this.usageParameters;
        }

        public ListFunctionInstancesResponseBodyResult setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

    }

}
