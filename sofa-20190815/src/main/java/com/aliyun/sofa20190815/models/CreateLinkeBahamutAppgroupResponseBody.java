// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutAppgroupResponseBody extends TeaModel {
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
    public CreateLinkeBahamutAppgroupResponseBodyResult result;

    public static CreateLinkeBahamutAppgroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutAppgroupResponseBody self = new CreateLinkeBahamutAppgroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutAppgroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeBahamutAppgroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLinkeBahamutAppgroupResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeBahamutAppgroupResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CreateLinkeBahamutAppgroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateLinkeBahamutAppgroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeBahamutAppgroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLinkeBahamutAppgroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLinkeBahamutAppgroupResponseBody setResult(CreateLinkeBahamutAppgroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateLinkeBahamutAppgroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateLinkeBahamutAppgroupResponseBodyResult extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Admins")
        public java.util.List<String> admins;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("AppList")
        public java.util.List<String> appList;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("ModifiyUser")
        public String modifiyUser;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Name")
        public String name;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Id")
        public String id;

        public static CreateLinkeBahamutAppgroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeBahamutAppgroupResponseBodyResult self = new CreateLinkeBahamutAppgroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateLinkeBahamutAppgroupResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateLinkeBahamutAppgroupResponseBodyResult setAdmins(java.util.List<String> admins) {
            this.admins = admins;
            return this;
        }
        public java.util.List<String> getAdmins() {
            return this.admins;
        }

        public CreateLinkeBahamutAppgroupResponseBodyResult setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateLinkeBahamutAppgroupResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateLinkeBahamutAppgroupResponseBodyResult setAppList(java.util.List<String> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<String> getAppList() {
            return this.appList;
        }

        public CreateLinkeBahamutAppgroupResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public CreateLinkeBahamutAppgroupResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public CreateLinkeBahamutAppgroupResponseBodyResult setModifiyUser(String modifiyUser) {
            this.modifiyUser = modifiyUser;
            return this;
        }
        public String getModifiyUser() {
            return this.modifiyUser;
        }

        public CreateLinkeBahamutAppgroupResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CreateLinkeBahamutAppgroupResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeBahamutAppgroupResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public CreateLinkeBahamutAppgroupResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
