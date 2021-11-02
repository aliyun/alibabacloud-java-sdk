// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryUserResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserResponseBody self = new QueryUserResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUserResponseBody setModel(QueryUserResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryUserResponseBodyModel getModel() {
        return this.model;
    }

    public QueryUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserResponseBodyModel extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("GmtCreateTime")
        public Long gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public Long gmtModifiedTime;

        @NameInMap("IsDeleteTag")
        public String isDeleteTag;

        @NameInMap("MobilePhone")
        public String mobilePhone;

        @NameInMap("RoleCode")
        public String roleCode;

        @NameInMap("SspUserId")
        public String sspUserId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantUserId")
        public String tenantUserId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("YunPersonsId")
        public String yunPersonsId;

        @NameInMap("YunUid")
        public String yunUid;

        public static QueryUserResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryUserResponseBodyModel self = new QueryUserResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryUserResponseBodyModel setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryUserResponseBodyModel setGmtCreateTime(Long gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public QueryUserResponseBodyModel setGmtModifiedTime(Long gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public Long getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public QueryUserResponseBodyModel setIsDeleteTag(String isDeleteTag) {
            this.isDeleteTag = isDeleteTag;
            return this;
        }
        public String getIsDeleteTag() {
            return this.isDeleteTag;
        }

        public QueryUserResponseBodyModel setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public QueryUserResponseBodyModel setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public QueryUserResponseBodyModel setSspUserId(String sspUserId) {
            this.sspUserId = sspUserId;
            return this;
        }
        public String getSspUserId() {
            return this.sspUserId;
        }

        public QueryUserResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryUserResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryUserResponseBodyModel setTenantUserId(String tenantUserId) {
            this.tenantUserId = tenantUserId;
            return this;
        }
        public String getTenantUserId() {
            return this.tenantUserId;
        }

        public QueryUserResponseBodyModel setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public QueryUserResponseBodyModel setYunPersonsId(String yunPersonsId) {
            this.yunPersonsId = yunPersonsId;
            return this;
        }
        public String getYunPersonsId() {
            return this.yunPersonsId;
        }

        public QueryUserResponseBodyModel setYunUid(String yunUid) {
            this.yunUid = yunUid;
            return this;
        }
        public String getYunUid() {
            return this.yunUid;
        }

    }

}
