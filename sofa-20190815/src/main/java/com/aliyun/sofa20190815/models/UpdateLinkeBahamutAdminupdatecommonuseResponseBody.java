// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminupdatecommonuseResponseBody extends TeaModel {
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
    public UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult result;

    public static UpdateLinkeBahamutAdminupdatecommonuseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminupdatecommonuseResponseBody self = new UpdateLinkeBahamutAdminupdatecommonuseResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminupdatecommonuseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeBahamutAdminupdatecommonuseResponseBody setResult(UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult extends TeaModel {
        @NameInMap("Cat")
        public String cat;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Sort")
        public Long sort;

        @NameInMap("Url")
        public String url;

        public static UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult self = new UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult setCat(String cat) {
            this.cat = cat;
            return this;
        }
        public String getCat() {
            return this.cat;
        }

        public UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult setSort(Long sort) {
            this.sort = sort;
            return this;
        }
        public Long getSort() {
            return this.sort;
        }

        public UpdateLinkeBahamutAdminupdatecommonuseResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
