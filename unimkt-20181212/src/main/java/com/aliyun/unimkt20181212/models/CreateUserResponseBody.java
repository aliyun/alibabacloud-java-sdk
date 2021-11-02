// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreateUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CreateUserResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserResponseBody self = new CreateUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateUserResponseBody setModel(CreateUserResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreateUserResponseBodyModel getModel() {
        return this.model;
    }

    public CreateUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateUserResponseBodyModel extends TeaModel {
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

        public static CreateUserResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateUserResponseBodyModel self = new CreateUserResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateUserResponseBodyModel setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateUserResponseBodyModel setGmtCreateTime(Long gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public CreateUserResponseBodyModel setGmtModifiedTime(Long gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public Long getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public CreateUserResponseBodyModel setIsDeleteTag(String isDeleteTag) {
            this.isDeleteTag = isDeleteTag;
            return this;
        }
        public String getIsDeleteTag() {
            return this.isDeleteTag;
        }

        public CreateUserResponseBodyModel setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public CreateUserResponseBodyModel setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public CreateUserResponseBodyModel setSspUserId(String sspUserId) {
            this.sspUserId = sspUserId;
            return this;
        }
        public String getSspUserId() {
            return this.sspUserId;
        }

        public CreateUserResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateUserResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreateUserResponseBodyModel setTenantUserId(String tenantUserId) {
            this.tenantUserId = tenantUserId;
            return this;
        }
        public String getTenantUserId() {
            return this.tenantUserId;
        }

        public CreateUserResponseBodyModel setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public CreateUserResponseBodyModel setYunPersonsId(String yunPersonsId) {
            this.yunPersonsId = yunPersonsId;
            return this;
        }
        public String getYunPersonsId() {
            return this.yunPersonsId;
        }

        public CreateUserResponseBodyModel setYunUid(String yunUid) {
            this.yunUid = yunUid;
            return this;
        }
        public String getYunUid() {
            return this.yunUid;
        }

    }

}
