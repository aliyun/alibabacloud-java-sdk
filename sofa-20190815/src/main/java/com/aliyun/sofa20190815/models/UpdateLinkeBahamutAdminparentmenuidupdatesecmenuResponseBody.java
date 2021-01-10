// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult result;

    public static UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody self = new UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBody setResult(UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult extends TeaModel {
        @NameInMap("Created")
        public Long created;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameEn")
        public String nameEn;

        @NameInMap("ParentMenuId")
        public String parentMenuId;

        @NameInMap("Url")
        public String url;

        @NameInMap("Children")
        public java.util.List<String> children;

        public static UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult self = new UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult setParentMenuId(String parentMenuId) {
            this.parentMenuId = parentMenuId;
            return this;
        }
        public String getParentMenuId() {
            return this.parentMenuId;
        }

        public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseBodyResult setChildren(java.util.List<String> children) {
            this.children = children;
            return this;
        }
        public java.util.List<String> getChildren() {
            return this.children;
        }

    }

}
