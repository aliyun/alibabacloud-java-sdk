// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAdminproductsResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutAdminproductsResponseBodyResult> result;

    public static GetLinkeBahamutAdminproductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAdminproductsResponseBody self = new GetLinkeBahamutAdminproductsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAdminproductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutAdminproductsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutAdminproductsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutAdminproductsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutAdminproductsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutAdminproductsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutAdminproductsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutAdminproductsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutAdminproductsResponseBody setResult(java.util.List<GetLinkeBahamutAdminproductsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutAdminproductsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutAdminproductsResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutAdminproductsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutAdminproductsResponseBodyResult self = new GetLinkeBahamutAdminproductsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setCat(String cat) {
            this.cat = cat;
            return this;
        }
        public String getCat() {
            return this.cat;
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setFixed(Boolean fixed) {
            this.fixed = fixed;
            return this;
        }
        public Boolean getFixed() {
            return this.fixed;
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setIconTheme(String iconTheme) {
            this.iconTheme = iconTheme;
            return this;
        }
        public String getIconTheme() {
            return this.iconTheme;
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setOpenBlank(Boolean openBlank) {
            this.openBlank = openBlank;
            return this;
        }
        public Boolean getOpenBlank() {
            return this.openBlank;
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setSort(Long sort) {
            this.sort = sort;
            return this;
        }
        public Long getSort() {
            return this.sort;
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetLinkeBahamutAdminproductsResponseBodyResult setMenus(java.util.List<String> menus) {
            this.menus = menus;
            return this;
        }
        public java.util.List<String> getMenus() {
            return this.menus;
        }

    }

}
