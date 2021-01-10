// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisRuleofnodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasDiagnosisRuleofnodeResponseBodyResultContent resultContent;

    public static QueryHasDiagnosisRuleofnodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisRuleofnodeResponseBody self = new QueryHasDiagnosisRuleofnodeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisRuleofnodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasDiagnosisRuleofnodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasDiagnosisRuleofnodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasDiagnosisRuleofnodeResponseBody setResultContent(QueryHasDiagnosisRuleofnodeResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasDiagnosisRuleofnodeResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg extends TeaModel {
        @NameInMap("InspectRuleId")
        public String inspectRuleId;

        @NameInMap("AllApp")
        public Boolean allApp;

        @NameInMap("AllProd")
        public Boolean allProd;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceUid")
        public String workspaceUid;

        @NameInMap("RmsTenantId")
        public String rmsTenantId;

        @NameInMap("RmsWorkspaceId")
        public String rmsWorkspaceId;

        @NameInMap("QueryTime")
        public Long queryTime;

        @NameInMap("SpaceTypeCode")
        public String spaceTypeCode;

        @NameInMap("ProdCode")
        public String prodCode;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        @NameInMap("ProdCodes")
        public java.util.List<String> prodCodes;

        @NameInMap("AppNames")
        public java.util.List<String> appNames;

        public static QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg self = new QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setInspectRuleId(String inspectRuleId) {
            this.inspectRuleId = inspectRuleId;
            return this;
        }
        public String getInspectRuleId() {
            return this.inspectRuleId;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setAllApp(Boolean allApp) {
            this.allApp = allApp;
            return this;
        }
        public Boolean getAllApp() {
            return this.allApp;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setAllProd(Boolean allProd) {
            this.allProd = allProd;
            return this;
        }
        public Boolean getAllProd() {
            return this.allProd;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setWorkspaceUid(String workspaceUid) {
            this.workspaceUid = workspaceUid;
            return this;
        }
        public String getWorkspaceUid() {
            return this.workspaceUid;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setRmsTenantId(String rmsTenantId) {
            this.rmsTenantId = rmsTenantId;
            return this;
        }
        public String getRmsTenantId() {
            return this.rmsTenantId;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setRmsWorkspaceId(String rmsWorkspaceId) {
            this.rmsWorkspaceId = rmsWorkspaceId;
            return this;
        }
        public String getRmsWorkspaceId() {
            return this.rmsWorkspaceId;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setQueryTime(Long queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public Long getQueryTime() {
            return this.queryTime;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setSpaceTypeCode(String spaceTypeCode) {
            this.spaceTypeCode = spaceTypeCode;
            return this;
        }
        public String getSpaceTypeCode() {
            return this.spaceTypeCode;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setProdCodes(java.util.List<String> prodCodes) {
            this.prodCodes = prodCodes;
            return this;
        }
        public java.util.List<String> getProdCodes() {
            return this.prodCodes;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg setAppNames(java.util.List<String> appNames) {
            this.appNames = appNames;
            return this;
        }
        public java.util.List<String> getAppNames() {
            return this.appNames;
        }

    }

    public static class QueryHasDiagnosisRuleofnodeResponseBodyResultContentData extends TeaModel {
        @NameInMap("DiagPlanNodeId")
        public String diagPlanNodeId;

        @NameInMap("DiagAtomicId")
        public String diagAtomicId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("IsReferenced")
        public Boolean isReferenced;

        @NameInMap("ReferenceCount")
        public Long referenceCount;

        @NameInMap("RuleArg")
        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg ruleArg;

        public static QueryHasDiagnosisRuleofnodeResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisRuleofnodeResponseBodyResultContentData self = new QueryHasDiagnosisRuleofnodeResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentData setDiagPlanNodeId(String diagPlanNodeId) {
            this.diagPlanNodeId = diagPlanNodeId;
            return this;
        }
        public String getDiagPlanNodeId() {
            return this.diagPlanNodeId;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentData setDiagAtomicId(String diagAtomicId) {
            this.diagAtomicId = diagAtomicId;
            return this;
        }
        public String getDiagAtomicId() {
            return this.diagAtomicId;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentData setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentData setIsReferenced(Boolean isReferenced) {
            this.isReferenced = isReferenced;
            return this;
        }
        public Boolean getIsReferenced() {
            return this.isReferenced;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentData setReferenceCount(Long referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Long getReferenceCount() {
            return this.referenceCount;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentData setRuleArg(QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg ruleArg) {
            this.ruleArg = ruleArg;
            return this;
        }
        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentDataRuleArg getRuleArg() {
            return this.ruleArg;
        }

    }

    public static class QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode self = new QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorReason self = new QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasDiagnosisRuleofnodeResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasDiagnosisRuleofnodeResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasDiagnosisRuleofnodeResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisRuleofnodeResponseBodyResultContent self = new QueryHasDiagnosisRuleofnodeResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContent setData(java.util.List<QueryHasDiagnosisRuleofnodeResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasDiagnosisRuleofnodeResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContent setTopErrorCode(QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasDiagnosisRuleofnodeResponseBodyResultContent setTopErrorReason(QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasDiagnosisRuleofnodeResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
