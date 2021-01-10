// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppgroupssearchResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutAppgroupssearchResponseBodyResult> result;

    public static QueryLinkeBahamutAppgroupssearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppgroupssearchResponseBody self = new QueryLinkeBahamutAppgroupssearchResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppgroupssearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutAppgroupssearchResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutAppgroupssearchResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutAppgroupssearchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutAppgroupssearchResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutAppgroupssearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutAppgroupssearchResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutAppgroupssearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutAppgroupssearchResponseBody setResult(java.util.List<QueryLinkeBahamutAppgroupssearchResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutAppgroupssearchResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutAppgroupssearchResponseBodyResult extends TeaModel {
        @NameInMap("Created")
        public Long created;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("ModifiyUser")
        public String modifiyUser;

        @NameInMap("Name")
        public String name;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("Type")
        public String type;

        @NameInMap("Admins")
        public java.util.List<String> admins;

        @NameInMap("AppList")
        public java.util.List<String> appList;

        public static QueryLinkeBahamutAppgroupssearchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutAppgroupssearchResponseBodyResult self = new QueryLinkeBahamutAppgroupssearchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutAppgroupssearchResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public QueryLinkeBahamutAppgroupssearchResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryLinkeBahamutAppgroupssearchResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeBahamutAppgroupssearchResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutAppgroupssearchResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public QueryLinkeBahamutAppgroupssearchResponseBodyResult setModifiyUser(String modifiyUser) {
            this.modifiyUser = modifiyUser;
            return this;
        }
        public String getModifiyUser() {
            return this.modifiyUser;
        }

        public QueryLinkeBahamutAppgroupssearchResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutAppgroupssearchResponseBodyResult setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryLinkeBahamutAppgroupssearchResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryLinkeBahamutAppgroupssearchResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLinkeBahamutAppgroupssearchResponseBodyResult setAdmins(java.util.List<String> admins) {
            this.admins = admins;
            return this;
        }
        public java.util.List<String> getAdmins() {
            return this.admins;
        }

        public QueryLinkeBahamutAppgroupssearchResponseBodyResult setAppList(java.util.List<String> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<String> getAppList() {
            return this.appList;
        }

    }

}
