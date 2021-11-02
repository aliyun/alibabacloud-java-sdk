// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class UpdateUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public UpdateUserResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserResponseBody self = new UpdateUserResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateUserResponseBody setModel(UpdateUserResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public UpdateUserResponseBodyModel getModel() {
        return this.model;
    }

    public UpdateUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateUserResponseBodyModel extends TeaModel {
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

        public static UpdateUserResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserResponseBodyModel self = new UpdateUserResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public UpdateUserResponseBodyModel setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateUserResponseBodyModel setGmtCreateTime(Long gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public UpdateUserResponseBodyModel setGmtModifiedTime(Long gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public Long getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public UpdateUserResponseBodyModel setIsDeleteTag(String isDeleteTag) {
            this.isDeleteTag = isDeleteTag;
            return this;
        }
        public String getIsDeleteTag() {
            return this.isDeleteTag;
        }

        public UpdateUserResponseBodyModel setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public UpdateUserResponseBodyModel setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public UpdateUserResponseBodyModel setSspUserId(String sspUserId) {
            this.sspUserId = sspUserId;
            return this;
        }
        public String getSspUserId() {
            return this.sspUserId;
        }

        public UpdateUserResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateUserResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public UpdateUserResponseBodyModel setTenantUserId(String tenantUserId) {
            this.tenantUserId = tenantUserId;
            return this;
        }
        public String getTenantUserId() {
            return this.tenantUserId;
        }

        public UpdateUserResponseBodyModel setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public UpdateUserResponseBodyModel setYunPersonsId(String yunPersonsId) {
            this.yunPersonsId = yunPersonsId;
            return this;
        }
        public String getYunPersonsId() {
            return this.yunPersonsId;
        }

        public UpdateUserResponseBodyModel setYunUid(String yunUid) {
            this.yunUid = yunUid;
            return this;
        }
        public String getYunUid() {
            return this.yunUid;
        }

    }

}
