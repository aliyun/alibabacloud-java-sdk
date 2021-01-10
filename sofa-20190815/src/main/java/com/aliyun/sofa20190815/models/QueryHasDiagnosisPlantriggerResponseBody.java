// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisPlantriggerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasDiagnosisPlantriggerResponseBodyResultContent resultContent;

    public static QueryHasDiagnosisPlantriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisPlantriggerResponseBody self = new QueryHasDiagnosisPlantriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisPlantriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasDiagnosisPlantriggerResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasDiagnosisPlantriggerResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasDiagnosisPlantriggerResponseBody setResultContent(QueryHasDiagnosisPlantriggerResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasDiagnosisPlantriggerResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasDiagnosisPlantriggerResponseBodyResultContentDataScopeConfigObj extends TeaModel {
        @NameInMap("BindType")
        public String bindType;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("ProdCodes")
        public java.util.List<String> prodCodes;

        @NameInMap("AppNames")
        public java.util.List<String> appNames;

        public static QueryHasDiagnosisPlantriggerResponseBodyResultContentDataScopeConfigObj build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisPlantriggerResponseBodyResultContentDataScopeConfigObj self = new QueryHasDiagnosisPlantriggerResponseBodyResultContentDataScopeConfigObj();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentDataScopeConfigObj setBindType(String bindType) {
            this.bindType = bindType;
            return this;
        }
        public String getBindType() {
            return this.bindType;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentDataScopeConfigObj setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentDataScopeConfigObj setProdCodes(java.util.List<String> prodCodes) {
            this.prodCodes = prodCodes;
            return this;
        }
        public java.util.List<String> getProdCodes() {
            return this.prodCodes;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentDataScopeConfigObj setAppNames(java.util.List<String> appNames) {
            this.appNames = appNames;
            return this;
        }
        public java.util.List<String> getAppNames() {
            return this.appNames;
        }

    }

    public static class QueryHasDiagnosisPlantriggerResponseBodyResultContentData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("DiagPlanId")
        public String diagPlanId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Code")
        public String code;

        @NameInMap("ScopeConfig")
        public String scopeConfig;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("ScopeConfigObj")
        public QueryHasDiagnosisPlantriggerResponseBodyResultContentDataScopeConfigObj scopeConfigObj;

        public static QueryHasDiagnosisPlantriggerResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisPlantriggerResponseBodyResultContentData self = new QueryHasDiagnosisPlantriggerResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentData setDiagPlanId(String diagPlanId) {
            this.diagPlanId = diagPlanId;
            return this;
        }
        public String getDiagPlanId() {
            return this.diagPlanId;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentData setScopeConfig(String scopeConfig) {
            this.scopeConfig = scopeConfig;
            return this;
        }
        public String getScopeConfig() {
            return this.scopeConfig;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentData setScopeConfigObj(QueryHasDiagnosisPlantriggerResponseBodyResultContentDataScopeConfigObj scopeConfigObj) {
            this.scopeConfigObj = scopeConfigObj;
            return this;
        }
        public QueryHasDiagnosisPlantriggerResponseBodyResultContentDataScopeConfigObj getScopeConfigObj() {
            return this.scopeConfigObj;
        }

    }

    public static class QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Level")
        public String level;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode self = new QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason self = new QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasDiagnosisPlantriggerResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasDiagnosisPlantriggerResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasDiagnosisPlantriggerResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisPlantriggerResponseBodyResultContent self = new QueryHasDiagnosisPlantriggerResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContent setData(java.util.List<QueryHasDiagnosisPlantriggerResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasDiagnosisPlantriggerResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContent setTopErrorCode(QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasDiagnosisPlantriggerResponseBodyResultContent setTopErrorReason(QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasDiagnosisPlantriggerResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
