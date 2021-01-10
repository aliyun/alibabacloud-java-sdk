// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasDiagnosisRuleResponseBodyResultContent resultContent;

    public static QueryHasDiagnosisRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisRuleResponseBody self = new QueryHasDiagnosisRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasDiagnosisRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasDiagnosisRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasDiagnosisRuleResponseBody setResultContent(QueryHasDiagnosisRuleResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasDiagnosisRuleResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg extends TeaModel {
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

        public static QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg self = new QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setInspectRuleId(String inspectRuleId) {
            this.inspectRuleId = inspectRuleId;
            return this;
        }
        public String getInspectRuleId() {
            return this.inspectRuleId;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setAllApp(Boolean allApp) {
            this.allApp = allApp;
            return this;
        }
        public Boolean getAllApp() {
            return this.allApp;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setAllProd(Boolean allProd) {
            this.allProd = allProd;
            return this;
        }
        public Boolean getAllProd() {
            return this.allProd;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setWorkspaceUid(String workspaceUid) {
            this.workspaceUid = workspaceUid;
            return this;
        }
        public String getWorkspaceUid() {
            return this.workspaceUid;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setRmsTenantId(String rmsTenantId) {
            this.rmsTenantId = rmsTenantId;
            return this;
        }
        public String getRmsTenantId() {
            return this.rmsTenantId;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setRmsWorkspaceId(String rmsWorkspaceId) {
            this.rmsWorkspaceId = rmsWorkspaceId;
            return this;
        }
        public String getRmsWorkspaceId() {
            return this.rmsWorkspaceId;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setQueryTime(Long queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public Long getQueryTime() {
            return this.queryTime;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setSpaceTypeCode(String spaceTypeCode) {
            this.spaceTypeCode = spaceTypeCode;
            return this;
        }
        public String getSpaceTypeCode() {
            return this.spaceTypeCode;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setProdCodes(java.util.List<String> prodCodes) {
            this.prodCodes = prodCodes;
            return this;
        }
        public java.util.List<String> getProdCodes() {
            return this.prodCodes;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg setAppNames(java.util.List<String> appNames) {
            this.appNames = appNames;
            return this;
        }
        public java.util.List<String> getAppNames() {
            return this.appNames;
        }

    }

    public static class QueryHasDiagnosisRuleResponseBodyResultContentData extends TeaModel {
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
        public String referenceCount;

        @NameInMap("RuleArg")
        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg ruleArg;

        public static QueryHasDiagnosisRuleResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisRuleResponseBodyResultContentData self = new QueryHasDiagnosisRuleResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentData setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentData setIsReferenced(Boolean isReferenced) {
            this.isReferenced = isReferenced;
            return this;
        }
        public Boolean getIsReferenced() {
            return this.isReferenced;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentData setReferenceCount(String referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public String getReferenceCount() {
            return this.referenceCount;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentData setRuleArg(QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg ruleArg) {
            this.ruleArg = ruleArg;
            return this;
        }
        public QueryHasDiagnosisRuleResponseBodyResultContentDataRuleArg getRuleArg() {
            return this.ruleArg;
        }

    }

    public static class QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode self = new QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasDiagnosisRuleResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasDiagnosisRuleResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisRuleResponseBodyResultContentTopErrorReason self = new QueryHasDiagnosisRuleResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasDiagnosisRuleResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Data")
        public java.util.List<QueryHasDiagnosisRuleResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasDiagnosisRuleResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasDiagnosisRuleResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDiagnosisRuleResponseBodyResultContent self = new QueryHasDiagnosisRuleResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasDiagnosisRuleResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContent setData(java.util.List<QueryHasDiagnosisRuleResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasDiagnosisRuleResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContent setTopErrorCode(QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasDiagnosisRuleResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasDiagnosisRuleResponseBodyResultContent setTopErrorReason(QueryHasDiagnosisRuleResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasDiagnosisRuleResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
