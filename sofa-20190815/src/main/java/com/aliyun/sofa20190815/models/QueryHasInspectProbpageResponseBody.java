// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectProbpageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasInspectProbpageResponseBodyResultContent resultContent;

    public static QueryHasInspectProbpageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectProbpageResponseBody self = new QueryHasInspectProbpageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectProbpageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasInspectProbpageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasInspectProbpageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasInspectProbpageResponseBody setResultContent(QueryHasInspectProbpageResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasInspectProbpageResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasInspectProbpageResponseBodyResultContentDataCheckRule extends TeaModel {
        @NameInMap("Element")
        public String element;

        @NameInMap("DefineTimeFlag")
        public Boolean defineTimeFlag;

        @NameInMap("PageLoadTimeout")
        public Long pageLoadTimeout;

        @NameInMap("CheckElementTimeout")
        public Long checkElementTimeout;

        @NameInMap("OtherCheckElement")
        public java.util.List<String> otherCheckElement;

        public static QueryHasInspectProbpageResponseBodyResultContentDataCheckRule build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectProbpageResponseBodyResultContentDataCheckRule self = new QueryHasInspectProbpageResponseBodyResultContentDataCheckRule();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectProbpageResponseBodyResultContentDataCheckRule setElement(String element) {
            this.element = element;
            return this;
        }
        public String getElement() {
            return this.element;
        }

        public QueryHasInspectProbpageResponseBodyResultContentDataCheckRule setDefineTimeFlag(Boolean defineTimeFlag) {
            this.defineTimeFlag = defineTimeFlag;
            return this;
        }
        public Boolean getDefineTimeFlag() {
            return this.defineTimeFlag;
        }

        public QueryHasInspectProbpageResponseBodyResultContentDataCheckRule setPageLoadTimeout(Long pageLoadTimeout) {
            this.pageLoadTimeout = pageLoadTimeout;
            return this;
        }
        public Long getPageLoadTimeout() {
            return this.pageLoadTimeout;
        }

        public QueryHasInspectProbpageResponseBodyResultContentDataCheckRule setCheckElementTimeout(Long checkElementTimeout) {
            this.checkElementTimeout = checkElementTimeout;
            return this;
        }
        public Long getCheckElementTimeout() {
            return this.checkElementTimeout;
        }

        public QueryHasInspectProbpageResponseBodyResultContentDataCheckRule setOtherCheckElement(java.util.List<String> otherCheckElement) {
            this.otherCheckElement = otherCheckElement;
            return this;
        }
        public java.util.List<String> getOtherCheckElement() {
            return this.otherCheckElement;
        }

    }

    public static class QueryHasInspectProbpageResponseBodyResultContentData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("ProdCode")
        public String prodCode;

        @NameInMap("Url")
        public String url;

        @NameInMap("NeedLogin")
        public Boolean needLogin;

        @NameInMap("Cookies")
        public String cookies;

        @NameInMap("DeleteDtatus")
        public Long deleteDtatus;

        @NameInMap("DeleteAt")
        public String deleteAt;

        @NameInMap("Gid")
        public String gid;

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

        @NameInMap("CheckRule")
        public QueryHasInspectProbpageResponseBodyResultContentDataCheckRule checkRule;

        public static QueryHasInspectProbpageResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectProbpageResponseBodyResultContentData self = new QueryHasInspectProbpageResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectProbpageResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasInspectProbpageResponseBodyResultContentData setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public QueryHasInspectProbpageResponseBodyResultContentData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryHasInspectProbpageResponseBodyResultContentData setNeedLogin(Boolean needLogin) {
            this.needLogin = needLogin;
            return this;
        }
        public Boolean getNeedLogin() {
            return this.needLogin;
        }

        public QueryHasInspectProbpageResponseBodyResultContentData setCookies(String cookies) {
            this.cookies = cookies;
            return this;
        }
        public String getCookies() {
            return this.cookies;
        }

        public QueryHasInspectProbpageResponseBodyResultContentData setDeleteDtatus(Long deleteDtatus) {
            this.deleteDtatus = deleteDtatus;
            return this;
        }
        public Long getDeleteDtatus() {
            return this.deleteDtatus;
        }

        public QueryHasInspectProbpageResponseBodyResultContentData setDeleteAt(String deleteAt) {
            this.deleteAt = deleteAt;
            return this;
        }
        public String getDeleteAt() {
            return this.deleteAt;
        }

        public QueryHasInspectProbpageResponseBodyResultContentData setGid(String gid) {
            this.gid = gid;
            return this;
        }
        public String getGid() {
            return this.gid;
        }

        public QueryHasInspectProbpageResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasInspectProbpageResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasInspectProbpageResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasInspectProbpageResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasInspectProbpageResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasInspectProbpageResponseBodyResultContentData setCheckRule(QueryHasInspectProbpageResponseBodyResultContentDataCheckRule checkRule) {
            this.checkRule = checkRule;
            return this;
        }
        public QueryHasInspectProbpageResponseBodyResultContentDataCheckRule getCheckRule() {
            return this.checkRule;
        }

    }

    public static class QueryHasInspectProbpageResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasInspectProbpageResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectProbpageResponseBodyResultContentTopErrorCode self = new QueryHasInspectProbpageResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectProbpageResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasInspectProbpageResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasInspectProbpageResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasInspectProbpageResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasInspectProbpageResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasInspectProbpageResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasInspectProbpageResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasInspectProbpageResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasInspectProbpageResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasInspectProbpageResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectProbpageResponseBodyResultContentTopErrorReason self = new QueryHasInspectProbpageResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectProbpageResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectProbpageResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasInspectProbpageResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasInspectProbpageResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasInspectProbpageResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasInspectProbpageResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasInspectProbpageResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectProbpageResponseBodyResultContent self = new QueryHasInspectProbpageResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectProbpageResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectProbpageResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasInspectProbpageResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasInspectProbpageResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasInspectProbpageResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasInspectProbpageResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasInspectProbpageResponseBodyResultContent setData(java.util.List<QueryHasInspectProbpageResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasInspectProbpageResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasInspectProbpageResponseBodyResultContent setTopErrorCode(QueryHasInspectProbpageResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasInspectProbpageResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasInspectProbpageResponseBodyResultContent setTopErrorReason(QueryHasInspectProbpageResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasInspectProbpageResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
