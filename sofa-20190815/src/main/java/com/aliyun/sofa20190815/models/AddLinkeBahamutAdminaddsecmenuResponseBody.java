// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdminaddsecmenuResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public AddLinkeBahamutAdminaddsecmenuResponseBodyResult result;

    public static AddLinkeBahamutAdminaddsecmenuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdminaddsecmenuResponseBody self = new AddLinkeBahamutAdminaddsecmenuResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdminaddsecmenuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeBahamutAdminaddsecmenuResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLinkeBahamutAdminaddsecmenuResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeBahamutAdminaddsecmenuResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public AddLinkeBahamutAdminaddsecmenuResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeBahamutAdminaddsecmenuResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeBahamutAdminaddsecmenuResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeBahamutAdminaddsecmenuResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeBahamutAdminaddsecmenuResponseBody setResult(AddLinkeBahamutAdminaddsecmenuResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddLinkeBahamutAdminaddsecmenuResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddLinkeBahamutAdminaddsecmenuResponseBodyResult extends TeaModel {
        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Children")
        public java.util.List<String> children;

        @NameInMap("ParentMenuId")
        public String parentMenuId;

        @NameInMap("NameEn")
        public String nameEn;

        @NameInMap("Url")
        public String url;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Name")
        public String name;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Id")
        public String id;

        public static AddLinkeBahamutAdminaddsecmenuResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeBahamutAdminaddsecmenuResponseBodyResult self = new AddLinkeBahamutAdminaddsecmenuResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeBahamutAdminaddsecmenuResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public AddLinkeBahamutAdminaddsecmenuResponseBodyResult setChildren(java.util.List<String> children) {
            this.children = children;
            return this;
        }
        public java.util.List<String> getChildren() {
            return this.children;
        }

        public AddLinkeBahamutAdminaddsecmenuResponseBodyResult setParentMenuId(String parentMenuId) {
            this.parentMenuId = parentMenuId;
            return this;
        }
        public String getParentMenuId() {
            return this.parentMenuId;
        }

        public AddLinkeBahamutAdminaddsecmenuResponseBodyResult setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public AddLinkeBahamutAdminaddsecmenuResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public AddLinkeBahamutAdminaddsecmenuResponseBodyResult setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public AddLinkeBahamutAdminaddsecmenuResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public AddLinkeBahamutAdminaddsecmenuResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddLinkeBahamutAdminaddsecmenuResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public AddLinkeBahamutAdminaddsecmenuResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
