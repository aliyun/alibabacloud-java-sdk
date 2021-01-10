// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasInspectProbpageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateHasInspectProbpageResponseBodyResultContent resultContent;

    public static CreateHasInspectProbpageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHasInspectProbpageResponseBody self = new CreateHasInspectProbpageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHasInspectProbpageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHasInspectProbpageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateHasInspectProbpageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateHasInspectProbpageResponseBody setResultContent(CreateHasInspectProbpageResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateHasInspectProbpageResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class CreateHasInspectProbpageResponseBodyResultContentDataCheckRule extends TeaModel {
        @NameInMap("CheckElementTimeout")
        public Long checkElementTimeout;

        @NameInMap("DefineTimeFlag")
        public Boolean defineTimeFlag;

        @NameInMap("Element")
        public String element;

        @NameInMap("PageLoadTimeout")
        public Long pageLoadTimeout;

        @NameInMap("OtherCheckElement")
        public java.util.List<String> otherCheckElement;

        public static CreateHasInspectProbpageResponseBodyResultContentDataCheckRule build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectProbpageResponseBodyResultContentDataCheckRule self = new CreateHasInspectProbpageResponseBodyResultContentDataCheckRule();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectProbpageResponseBodyResultContentDataCheckRule setCheckElementTimeout(Long checkElementTimeout) {
            this.checkElementTimeout = checkElementTimeout;
            return this;
        }
        public Long getCheckElementTimeout() {
            return this.checkElementTimeout;
        }

        public CreateHasInspectProbpageResponseBodyResultContentDataCheckRule setDefineTimeFlag(Boolean defineTimeFlag) {
            this.defineTimeFlag = defineTimeFlag;
            return this;
        }
        public Boolean getDefineTimeFlag() {
            return this.defineTimeFlag;
        }

        public CreateHasInspectProbpageResponseBodyResultContentDataCheckRule setElement(String element) {
            this.element = element;
            return this;
        }
        public String getElement() {
            return this.element;
        }

        public CreateHasInspectProbpageResponseBodyResultContentDataCheckRule setPageLoadTimeout(Long pageLoadTimeout) {
            this.pageLoadTimeout = pageLoadTimeout;
            return this;
        }
        public Long getPageLoadTimeout() {
            return this.pageLoadTimeout;
        }

        public CreateHasInspectProbpageResponseBodyResultContentDataCheckRule setOtherCheckElement(java.util.List<String> otherCheckElement) {
            this.otherCheckElement = otherCheckElement;
            return this;
        }
        public java.util.List<String> getOtherCheckElement() {
            return this.otherCheckElement;
        }

    }

    public static class CreateHasInspectProbpageResponseBodyResultContentData extends TeaModel {
        @NameInMap("CheckRule")
        public CreateHasInspectProbpageResponseBodyResultContentDataCheckRule checkRule;

        @NameInMap("NeedLogin")
        public Boolean needLogin;

        @NameInMap("ProdCode")
        public String prodCode;

        @NameInMap("Gid")
        public String gid;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("Url")
        public String url;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DeleteAt")
        public String deleteAt;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("DeleteDtatus")
        public Long deleteDtatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("Cookies")
        public String cookies;

        @NameInMap("TenantId")
        public String tenantId;

        public static CreateHasInspectProbpageResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectProbpageResponseBodyResultContentData self = new CreateHasInspectProbpageResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectProbpageResponseBodyResultContentData setCheckRule(CreateHasInspectProbpageResponseBodyResultContentDataCheckRule checkRule) {
            this.checkRule = checkRule;
            return this;
        }
        public CreateHasInspectProbpageResponseBodyResultContentDataCheckRule getCheckRule() {
            return this.checkRule;
        }

        public CreateHasInspectProbpageResponseBodyResultContentData setNeedLogin(Boolean needLogin) {
            this.needLogin = needLogin;
            return this;
        }
        public Boolean getNeedLogin() {
            return this.needLogin;
        }

        public CreateHasInspectProbpageResponseBodyResultContentData setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public CreateHasInspectProbpageResponseBodyResultContentData setGid(String gid) {
            this.gid = gid;
            return this;
        }
        public String getGid() {
            return this.gid;
        }

        public CreateHasInspectProbpageResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public CreateHasInspectProbpageResponseBodyResultContentData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateHasInspectProbpageResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateHasInspectProbpageResponseBodyResultContentData setDeleteAt(String deleteAt) {
            this.deleteAt = deleteAt;
            return this;
        }
        public String getDeleteAt() {
            return this.deleteAt;
        }

        public CreateHasInspectProbpageResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public CreateHasInspectProbpageResponseBodyResultContentData setDeleteDtatus(Long deleteDtatus) {
            this.deleteDtatus = deleteDtatus;
            return this;
        }
        public Long getDeleteDtatus() {
            return this.deleteDtatus;
        }

        public CreateHasInspectProbpageResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateHasInspectProbpageResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateHasInspectProbpageResponseBodyResultContentData setCookies(String cookies) {
            this.cookies = cookies;
            return this;
        }
        public String getCookies() {
            return this.cookies;
        }

        public CreateHasInspectProbpageResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class CreateHasInspectProbpageResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("Version")
        public String version;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Level")
        public String level;

        @NameInMap("Scene")
        public String scene;

        public static CreateHasInspectProbpageResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectProbpageResponseBodyResultContentTopErrorCode self = new CreateHasInspectProbpageResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectProbpageResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateHasInspectProbpageResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public CreateHasInspectProbpageResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateHasInspectProbpageResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public CreateHasInspectProbpageResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateHasInspectProbpageResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public CreateHasInspectProbpageResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateHasInspectProbpageResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class CreateHasInspectProbpageResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static CreateHasInspectProbpageResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectProbpageResponseBodyResultContentTopErrorReason self = new CreateHasInspectProbpageResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectProbpageResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasInspectProbpageResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateHasInspectProbpageResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public CreateHasInspectProbpageResponseBodyResultContentData data;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TopErrorCode")
        public CreateHasInspectProbpageResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("TopErrorReason")
        public CreateHasInspectProbpageResponseBodyResultContentTopErrorReason topErrorReason;

        public static CreateHasInspectProbpageResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateHasInspectProbpageResponseBodyResultContent self = new CreateHasInspectProbpageResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateHasInspectProbpageResponseBodyResultContent setData(CreateHasInspectProbpageResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public CreateHasInspectProbpageResponseBodyResultContentData getData() {
            return this.data;
        }

        public CreateHasInspectProbpageResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateHasInspectProbpageResponseBodyResultContent setTopErrorCode(CreateHasInspectProbpageResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public CreateHasInspectProbpageResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public CreateHasInspectProbpageResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateHasInspectProbpageResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateHasInspectProbpageResponseBodyResultContent setTopErrorReason(CreateHasInspectProbpageResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public CreateHasInspectProbpageResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
