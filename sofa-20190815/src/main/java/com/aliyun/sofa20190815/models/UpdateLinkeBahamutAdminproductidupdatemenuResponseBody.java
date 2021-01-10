// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminproductidupdatemenuResponseBody extends TeaModel {
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
    public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult result;

    public static UpdateLinkeBahamutAdminproductidupdatemenuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminproductidupdatemenuResponseBody self = new UpdateLinkeBahamutAdminproductidupdatemenuResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminproductidupdatemenuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeBahamutAdminproductidupdatemenuResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeBahamutAdminproductidupdatemenuResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeBahamutAdminproductidupdatemenuResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateLinkeBahamutAdminproductidupdatemenuResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public UpdateLinkeBahamutAdminproductidupdatemenuResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLinkeBahamutAdminproductidupdatemenuResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeBahamutAdminproductidupdatemenuResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeBahamutAdminproductidupdatemenuResponseBody setResult(UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult extends TeaModel {
        @NameInMap("Cat")
        public String cat;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Fixed")
        public Boolean fixed;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("IconTheme")
        public String iconTheme;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("OpenBlank")
        public Boolean openBlank;

        @NameInMap("Show")
        public Boolean show;

        @NameInMap("Sort")
        public Long sort;

        @NameInMap("Url")
        public String url;

        @NameInMap("Menus")
        public java.util.List<String> menus;

        public static UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult self = new UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setCat(String cat) {
            this.cat = cat;
            return this;
        }
        public String getCat() {
            return this.cat;
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setFixed(Boolean fixed) {
            this.fixed = fixed;
            return this;
        }
        public Boolean getFixed() {
            return this.fixed;
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setIconTheme(String iconTheme) {
            this.iconTheme = iconTheme;
            return this;
        }
        public String getIconTheme() {
            return this.iconTheme;
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setOpenBlank(Boolean openBlank) {
            this.openBlank = openBlank;
            return this;
        }
        public Boolean getOpenBlank() {
            return this.openBlank;
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setSort(Long sort) {
            this.sort = sort;
            return this;
        }
        public Long getSort() {
            return this.sort;
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateLinkeBahamutAdminproductidupdatemenuResponseBodyResult setMenus(java.util.List<String> menus) {
            this.menus = menus;
            return this;
        }
        public java.util.List<String> getMenus() {
            return this.menus;
        }

    }

}
