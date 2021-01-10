// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAppgroupResponseBody extends TeaModel {
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
    public DeleteLinkeBahamutAppgroupResponseBodyResult result;

    public static DeleteLinkeBahamutAppgroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAppgroupResponseBody self = new DeleteLinkeBahamutAppgroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAppgroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkeBahamutAppgroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteLinkeBahamutAppgroupResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkeBahamutAppgroupResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public DeleteLinkeBahamutAppgroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteLinkeBahamutAppgroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkeBahamutAppgroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteLinkeBahamutAppgroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteLinkeBahamutAppgroupResponseBody setResult(DeleteLinkeBahamutAppgroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteLinkeBahamutAppgroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteLinkeBahamutAppgroupResponseBodyResult extends TeaModel {
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

        public static DeleteLinkeBahamutAppgroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteLinkeBahamutAppgroupResponseBodyResult self = new DeleteLinkeBahamutAppgroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteLinkeBahamutAppgroupResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DeleteLinkeBahamutAppgroupResponseBodyResult setAdmins(java.util.List<String> admins) {
            this.admins = admins;
            return this;
        }
        public java.util.List<String> getAdmins() {
            return this.admins;
        }

        public DeleteLinkeBahamutAppgroupResponseBodyResult setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DeleteLinkeBahamutAppgroupResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DeleteLinkeBahamutAppgroupResponseBodyResult setAppList(java.util.List<String> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<String> getAppList() {
            return this.appList;
        }

        public DeleteLinkeBahamutAppgroupResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public DeleteLinkeBahamutAppgroupResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public DeleteLinkeBahamutAppgroupResponseBodyResult setModifiyUser(String modifiyUser) {
            this.modifiyUser = modifiyUser;
            return this;
        }
        public String getModifiyUser() {
            return this.modifiyUser;
        }

        public DeleteLinkeBahamutAppgroupResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public DeleteLinkeBahamutAppgroupResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteLinkeBahamutAppgroupResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public DeleteLinkeBahamutAppgroupResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
