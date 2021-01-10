// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminuserroleResponseBody extends TeaModel {
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
    public UpdateLinkeBahamutAdminuserroleResponseBodyResult result;

    public static UpdateLinkeBahamutAdminuserroleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminuserroleResponseBody self = new UpdateLinkeBahamutAdminuserroleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminuserroleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeBahamutAdminuserroleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeBahamutAdminuserroleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeBahamutAdminuserroleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateLinkeBahamutAdminuserroleResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public UpdateLinkeBahamutAdminuserroleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLinkeBahamutAdminuserroleResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeBahamutAdminuserroleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeBahamutAdminuserroleResponseBody setResult(UpdateLinkeBahamutAdminuserroleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateLinkeBahamutAdminuserroleResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateLinkeBahamutAdminuserroleResponseBodyResult extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Role")
        public String role;

        @NameInMap("Tenant")
        public String tenant;

        public static UpdateLinkeBahamutAdminuserroleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeBahamutAdminuserroleResponseBodyResult self = new UpdateLinkeBahamutAdminuserroleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeBahamutAdminuserroleResponseBodyResult setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public UpdateLinkeBahamutAdminuserroleResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public UpdateLinkeBahamutAdminuserroleResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public UpdateLinkeBahamutAdminuserroleResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateLinkeBahamutAdminuserroleResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public UpdateLinkeBahamutAdminuserroleResponseBodyResult setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public UpdateLinkeBahamutAdminuserroleResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

    }

}
