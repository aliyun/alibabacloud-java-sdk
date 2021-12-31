// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFunctionInstancesResponseBody extends TeaModel {
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
    public java.util.List<ListFunctionInstancesResponseBodyResult> result;

    @NameInMap("Status")
    public String status;

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
        @NameInMap("Category")
        public String category;

        @NameInMap("Domain")
        public String domain;

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
        @NameInMap("Name")
        public String name;

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

    public static class ListFunctionInstancesResponseBodyResult extends TeaModel {
        @NameInMap("Belongs")
        public ListFunctionInstancesResponseBodyResultBelongs belongs;

        @NameInMap("CreateParameters")
        public java.util.List<ListFunctionInstancesResponseBodyResultCreateParameters> createParameters;

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

        public ListFunctionInstancesResponseBodyResult setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

    }

}
