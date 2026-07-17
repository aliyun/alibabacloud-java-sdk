// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFunctionInstancesResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is empty if the request is successful.</p>
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
     * <p>The request latency, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Latency")
    public Long latency;

    /**
     * <p>The error message. This parameter is empty if the request is successful.</p>
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
     * <p>A4D487A9-A456-5AA5-A9C6-B7BF2889CF74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Result")
    public java.util.List<ListFunctionInstancesResponseBodyResult> result;

    /**
     * <p>The status of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;OK&quot;</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * 
         * <strong>example:</strong>
         * <p>&quot;general&quot;</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The industry.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ecommerce&quot;</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The language code.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;zh&quot;</p>
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
         * 
         * <strong>example:</strong>
         * <p>&quot;param1&quot;</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;value1&quot;</p>
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
         * <p>The ownership information of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Belongs")
        public ListFunctionInstancesResponseBodyResultBelongs belongs;

        /**
         * <p>The list of parameters for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("CreateParameters")
        public java.util.List<ListFunctionInstancesResponseBodyResultCreateParameters> createParameters;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The training schedule. This is a cron expression in the format of Minutes Hours DayofMonth Month DayofWeek. If this parameter is empty, periodic training is not performed.</p>
         * 
         * <strong>example:</strong>
         * <p>0 3 ? * 0,1,3,5 (周日，周一，周三，周五凌晨3点)</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The extended information. This is a JSON string that contains information such as model evaluation results and error messages.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;dataReport\&quot;:{},\&quot;errors\&quot;:{}}&quot;</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ctr&quot;</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The type of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;PAAS&quot;</p>
         */
        @NameInMap("FunctionType")
        public String functionType;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;ctr_test&quot;</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The type of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;tf_checkpoint&quot;</p>
         */
        @NameInMap("ModelType")
        public String modelType;

        /**
         * <p>The source of the instance. Valid values:</p>
         * <ul>
         * <li><p>user: The instance is created by the user.</p>
         * </li>
         * <li><p>builtin: The instance is created by the system.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;user&quot;</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ol>
         * <li><p>unavailable: No model is available. You must train a model before you can use the instance.</p>
         * </li>
         * <li><p>available: The instance is available.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of parameters in use.</p>
         */
        @NameInMap("UsageParameters")
        public java.util.List<ListFunctionInstancesResponseBodyResultUsageParameters> usageParameters;

        /**
         * <p>The version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
