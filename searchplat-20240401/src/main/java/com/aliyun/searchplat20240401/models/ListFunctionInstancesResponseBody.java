// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListFunctionInstancesResponseBody extends TeaModel {
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
     * <p>The elapsed time.</p>
     * 
     * <strong>example:</strong>
     * <p>39.108</p>
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
     * <p>33E4F0CA-F766-5803-B11C-70DC57A5A6E4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("result")
    public java.util.List<ListFunctionInstancesResponseBodyResult> result;

    /**
     * <p>The request status.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
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
         * <p>The language. Valid values:</p>
         * <ul>
         * <li>zh_CN: Chinese (default)</li>
         * <li>en_US: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_CN</p>
         */
        @NameInMap("language")
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

    public static class ListFunctionInstancesResponseBodyResult extends TeaModel {
        /**
         * <p>The ownership information.</p>
         */
        @NameInMap("belongs")
        public ListFunctionInstancesResponseBodyResultBelongs belongs;

        /**
         * <p>The creation parameter body.</p>
         */
        @NameInMap("createParameters")
        public java.util.List<ListFunctionInstancesResponseBodyResultCreateParameters> createParameters;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1713352442039</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The cron expression for the timed scheduling node.</p>
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
         * <p>The configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>nl2sql</p>
         */
        @NameInMap("functionName")
        public String functionName;

        /**
         * <p>The configuration type.</p>
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
         * <p>a_test</p>
         */
        @NameInMap("instanceName")
        public String instanceName;

        /**
         * <p>The model type.</p>
         * 
         * <strong>example:</strong>
         * <p>ops-query-analyze-001</p>
         */
        @NameInMap("modelType")
        public String modelType;

        /**
         * <p>The instance source. Valid values:</p>
         * <ul>
         * <li>builtin: system instance</li>
         * <li>user: user instance (default)</li>
         * <li>all: all instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
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
         * <p>usageParameters</p>
         */
        @NameInMap("usageParameters")
        public java.util.List<java.util.Map<String, ?>> usageParameters;

        /**
         * <p>The version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("versionId")
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

        public ListFunctionInstancesResponseBodyResult setUsageParameters(java.util.List<java.util.Map<String, ?>> usageParameters) {
            this.usageParameters = usageParameters;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getUsageParameters() {
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
