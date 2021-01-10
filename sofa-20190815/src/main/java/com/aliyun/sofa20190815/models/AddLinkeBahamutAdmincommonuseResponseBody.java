// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdmincommonuseResponseBody extends TeaModel {
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
    public AddLinkeBahamutAdmincommonuseResponseBodyResult result;

    public static AddLinkeBahamutAdmincommonuseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdmincommonuseResponseBody self = new AddLinkeBahamutAdmincommonuseResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdmincommonuseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeBahamutAdmincommonuseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLinkeBahamutAdmincommonuseResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeBahamutAdmincommonuseResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public AddLinkeBahamutAdmincommonuseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeBahamutAdmincommonuseResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeBahamutAdmincommonuseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeBahamutAdmincommonuseResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeBahamutAdmincommonuseResponseBody setResult(AddLinkeBahamutAdmincommonuseResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddLinkeBahamutAdmincommonuseResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddLinkeBahamutAdmincommonuseResponseBodyResult extends TeaModel {
        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Cat")
        public String cat;

        @NameInMap("Sort")
        public Long sort;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Url")
        public String url;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Name")
        public String name;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Id")
        public String id;

        public static AddLinkeBahamutAdmincommonuseResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeBahamutAdmincommonuseResponseBodyResult self = new AddLinkeBahamutAdmincommonuseResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeBahamutAdmincommonuseResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public AddLinkeBahamutAdmincommonuseResponseBodyResult setCat(String cat) {
            this.cat = cat;
            return this;
        }
        public String getCat() {
            return this.cat;
        }

        public AddLinkeBahamutAdmincommonuseResponseBodyResult setSort(Long sort) {
            this.sort = sort;
            return this;
        }
        public Long getSort() {
            return this.sort;
        }

        public AddLinkeBahamutAdmincommonuseResponseBodyResult setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public AddLinkeBahamutAdmincommonuseResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public AddLinkeBahamutAdmincommonuseResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public AddLinkeBahamutAdmincommonuseResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddLinkeBahamutAdmincommonuseResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public AddLinkeBahamutAdmincommonuseResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
