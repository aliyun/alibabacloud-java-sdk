// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutUsermenucommonResponseBody extends TeaModel {
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
    public CreateLinkeBahamutUsermenucommonResponseBodyResult result;

    public static CreateLinkeBahamutUsermenucommonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutUsermenucommonResponseBody self = new CreateLinkeBahamutUsermenucommonResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutUsermenucommonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeBahamutUsermenucommonResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLinkeBahamutUsermenucommonResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeBahamutUsermenucommonResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CreateLinkeBahamutUsermenucommonResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateLinkeBahamutUsermenucommonResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeBahamutUsermenucommonResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLinkeBahamutUsermenucommonResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLinkeBahamutUsermenucommonResponseBody setResult(CreateLinkeBahamutUsermenucommonResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateLinkeBahamutUsermenucommonResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateLinkeBahamutUsermenucommonResponseBodyResult extends TeaModel {
        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("UserEmpId")
        public String userEmpId;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("UrlUseMap")
        public String urlUseMap;

        @NameInMap("Created")
        public Long created;

        @NameInMap("MenuUseMap")
        public String menuUseMap;

        @NameInMap("Id")
        public String id;

        public static CreateLinkeBahamutUsermenucommonResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeBahamutUsermenucommonResponseBodyResult self = new CreateLinkeBahamutUsermenucommonResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateLinkeBahamutUsermenucommonResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public CreateLinkeBahamutUsermenucommonResponseBodyResult setUserEmpId(String userEmpId) {
            this.userEmpId = userEmpId;
            return this;
        }
        public String getUserEmpId() {
            return this.userEmpId;
        }

        public CreateLinkeBahamutUsermenucommonResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CreateLinkeBahamutUsermenucommonResponseBodyResult setUrlUseMap(String urlUseMap) {
            this.urlUseMap = urlUseMap;
            return this;
        }
        public String getUrlUseMap() {
            return this.urlUseMap;
        }

        public CreateLinkeBahamutUsermenucommonResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public CreateLinkeBahamutUsermenucommonResponseBodyResult setMenuUseMap(String menuUseMap) {
            this.menuUseMap = menuUseMap;
            return this;
        }
        public String getMenuUseMap() {
            return this.menuUseMap;
        }

        public CreateLinkeBahamutUsermenucommonResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
