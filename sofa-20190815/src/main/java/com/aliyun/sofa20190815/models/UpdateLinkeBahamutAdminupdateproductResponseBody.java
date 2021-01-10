// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminupdateproductResponseBody extends TeaModel {
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
    public UpdateLinkeBahamutAdminupdateproductResponseBodyResult result;

    public static UpdateLinkeBahamutAdminupdateproductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminupdateproductResponseBody self = new UpdateLinkeBahamutAdminupdateproductResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminupdateproductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeBahamutAdminupdateproductResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeBahamutAdminupdateproductResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeBahamutAdminupdateproductResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateLinkeBahamutAdminupdateproductResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public UpdateLinkeBahamutAdminupdateproductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLinkeBahamutAdminupdateproductResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeBahamutAdminupdateproductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeBahamutAdminupdateproductResponseBody setResult(UpdateLinkeBahamutAdminupdateproductResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateLinkeBahamutAdminupdateproductResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateLinkeBahamutAdminupdateproductResponseBodyResult extends TeaModel {
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

        public static UpdateLinkeBahamutAdminupdateproductResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeBahamutAdminupdateproductResponseBodyResult self = new UpdateLinkeBahamutAdminupdateproductResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setCat(String cat) {
            this.cat = cat;
            return this;
        }
        public String getCat() {
            return this.cat;
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setFixed(Boolean fixed) {
            this.fixed = fixed;
            return this;
        }
        public Boolean getFixed() {
            return this.fixed;
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setIconTheme(String iconTheme) {
            this.iconTheme = iconTheme;
            return this;
        }
        public String getIconTheme() {
            return this.iconTheme;
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setOpenBlank(Boolean openBlank) {
            this.openBlank = openBlank;
            return this;
        }
        public Boolean getOpenBlank() {
            return this.openBlank;
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setSort(Long sort) {
            this.sort = sort;
            return this;
        }
        public Long getSort() {
            return this.sort;
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateLinkeBahamutAdminupdateproductResponseBodyResult setMenus(java.util.List<String> menus) {
            this.menus = menus;
            return this;
        }
        public java.util.List<String> getMenus() {
            return this.menus;
        }

    }

}
