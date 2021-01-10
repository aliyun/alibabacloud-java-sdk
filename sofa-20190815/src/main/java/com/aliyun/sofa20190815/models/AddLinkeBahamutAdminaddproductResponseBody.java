// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdminaddproductResponseBody extends TeaModel {
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
    public AddLinkeBahamutAdminaddproductResponseBodyResult result;

    public static AddLinkeBahamutAdminaddproductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdminaddproductResponseBody self = new AddLinkeBahamutAdminaddproductResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdminaddproductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeBahamutAdminaddproductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLinkeBahamutAdminaddproductResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeBahamutAdminaddproductResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public AddLinkeBahamutAdminaddproductResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeBahamutAdminaddproductResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeBahamutAdminaddproductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeBahamutAdminaddproductResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeBahamutAdminaddproductResponseBody setResult(AddLinkeBahamutAdminaddproductResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddLinkeBahamutAdminaddproductResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddLinkeBahamutAdminaddproductResponseBodyResult extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Sort")
        public Long sort;

        @NameInMap("Fixed")
        public Boolean fixed;

        @NameInMap("Show")
        public Boolean show;

        @NameInMap("Menus")
        public java.util.List<String> menus;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Url")
        public String url;

        @NameInMap("IconTheme")
        public String iconTheme;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Cat")
        public String cat;

        @NameInMap("OpenBlank")
        public Boolean openBlank;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static AddLinkeBahamutAdminaddproductResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeBahamutAdminaddproductResponseBodyResult self = new AddLinkeBahamutAdminaddproductResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setSort(Long sort) {
            this.sort = sort;
            return this;
        }
        public Long getSort() {
            return this.sort;
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setFixed(Boolean fixed) {
            this.fixed = fixed;
            return this;
        }
        public Boolean getFixed() {
            return this.fixed;
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setMenus(java.util.List<String> menus) {
            this.menus = menus;
            return this;
        }
        public java.util.List<String> getMenus() {
            return this.menus;
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setIconTheme(String iconTheme) {
            this.iconTheme = iconTheme;
            return this;
        }
        public String getIconTheme() {
            return this.iconTheme;
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setCat(String cat) {
            this.cat = cat;
            return this;
        }
        public String getCat() {
            return this.cat;
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setOpenBlank(Boolean openBlank) {
            this.openBlank = openBlank;
            return this;
        }
        public Boolean getOpenBlank() {
            return this.openBlank;
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddLinkeBahamutAdminaddproductResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
