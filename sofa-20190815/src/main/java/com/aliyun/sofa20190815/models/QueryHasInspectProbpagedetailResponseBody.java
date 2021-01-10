// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectProbpagedetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasInspectProbpagedetailResponseBodyResultContent resultContent;

    public static QueryHasInspectProbpagedetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectProbpagedetailResponseBody self = new QueryHasInspectProbpagedetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectProbpagedetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasInspectProbpagedetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasInspectProbpagedetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasInspectProbpagedetailResponseBody setResultContent(QueryHasInspectProbpagedetailResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasInspectProbpagedetailResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasInspectProbpagedetailResponseBodyResultContentDataCheckRule extends TeaModel {
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

        public static QueryHasInspectProbpagedetailResponseBodyResultContentDataCheckRule build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectProbpagedetailResponseBodyResultContentDataCheckRule self = new QueryHasInspectProbpagedetailResponseBodyResultContentDataCheckRule();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentDataCheckRule setElement(String element) {
            this.element = element;
            return this;
        }
        public String getElement() {
            return this.element;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentDataCheckRule setDefineTimeFlag(Boolean defineTimeFlag) {
            this.defineTimeFlag = defineTimeFlag;
            return this;
        }
        public Boolean getDefineTimeFlag() {
            return this.defineTimeFlag;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentDataCheckRule setPageLoadTimeout(Long pageLoadTimeout) {
            this.pageLoadTimeout = pageLoadTimeout;
            return this;
        }
        public Long getPageLoadTimeout() {
            return this.pageLoadTimeout;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentDataCheckRule setCheckElementTimeout(Long checkElementTimeout) {
            this.checkElementTimeout = checkElementTimeout;
            return this;
        }
        public Long getCheckElementTimeout() {
            return this.checkElementTimeout;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentDataCheckRule setOtherCheckElement(java.util.List<String> otherCheckElement) {
            this.otherCheckElement = otherCheckElement;
            return this;
        }
        public java.util.List<String> getOtherCheckElement() {
            return this.otherCheckElement;
        }

    }

    public static class QueryHasInspectProbpagedetailResponseBodyResultContentData extends TeaModel {
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
        public QueryHasInspectProbpagedetailResponseBodyResultContentDataCheckRule checkRule;

        public static QueryHasInspectProbpagedetailResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectProbpagedetailResponseBodyResultContentData self = new QueryHasInspectProbpagedetailResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentData setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentData setNeedLogin(Boolean needLogin) {
            this.needLogin = needLogin;
            return this;
        }
        public Boolean getNeedLogin() {
            return this.needLogin;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentData setCookies(String cookies) {
            this.cookies = cookies;
            return this;
        }
        public String getCookies() {
            return this.cookies;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentData setDeleteDtatus(Long deleteDtatus) {
            this.deleteDtatus = deleteDtatus;
            return this;
        }
        public Long getDeleteDtatus() {
            return this.deleteDtatus;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentData setDeleteAt(String deleteAt) {
            this.deleteAt = deleteAt;
            return this;
        }
        public String getDeleteAt() {
            return this.deleteAt;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentData setGid(String gid) {
            this.gid = gid;
            return this;
        }
        public String getGid() {
            return this.gid;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentData setCheckRule(QueryHasInspectProbpagedetailResponseBodyResultContentDataCheckRule checkRule) {
            this.checkRule = checkRule;
            return this;
        }
        public QueryHasInspectProbpagedetailResponseBodyResultContentDataCheckRule getCheckRule() {
            return this.checkRule;
        }

    }

    public static class QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode self = new QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorReason self = new QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasInspectProbpagedetailResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryHasInspectProbpagedetailResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasInspectProbpagedetailResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectProbpagedetailResponseBodyResultContent self = new QueryHasInspectProbpagedetailResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContent setData(QueryHasInspectProbpagedetailResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryHasInspectProbpagedetailResponseBodyResultContentData getData() {
            return this.data;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContent setTopErrorCode(QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasInspectProbpagedetailResponseBodyResultContent setTopErrorReason(QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasInspectProbpagedetailResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
