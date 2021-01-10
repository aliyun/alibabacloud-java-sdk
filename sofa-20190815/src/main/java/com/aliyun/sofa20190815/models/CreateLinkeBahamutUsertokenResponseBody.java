// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutUsertokenResponseBody extends TeaModel {
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
    public CreateLinkeBahamutUsertokenResponseBodyResult result;

    public static CreateLinkeBahamutUsertokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutUsertokenResponseBody self = new CreateLinkeBahamutUsertokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutUsertokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeBahamutUsertokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLinkeBahamutUsertokenResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeBahamutUsertokenResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CreateLinkeBahamutUsertokenResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateLinkeBahamutUsertokenResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeBahamutUsertokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLinkeBahamutUsertokenResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLinkeBahamutUsertokenResponseBody setResult(CreateLinkeBahamutUsertokenResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateLinkeBahamutUsertokenResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateLinkeBahamutUsertokenResponseBodyResult extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Token")
        public String token;

        @NameInMap("User")
        public String user;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Id")
        public String id;

        public static CreateLinkeBahamutUsertokenResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeBahamutUsertokenResponseBodyResult self = new CreateLinkeBahamutUsertokenResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateLinkeBahamutUsertokenResponseBodyResult setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public CreateLinkeBahamutUsertokenResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public CreateLinkeBahamutUsertokenResponseBodyResult setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public CreateLinkeBahamutUsertokenResponseBodyResult setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public CreateLinkeBahamutUsertokenResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CreateLinkeBahamutUsertokenResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public CreateLinkeBahamutUsertokenResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
