// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<ListUserResponseBodyModel> model;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserResponseBody self = new ListUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserResponseBody setModel(java.util.List<ListUserResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListUserResponseBodyModel> getModel() {
        return this.model;
    }

    public ListUserResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListUserResponseBodyModel extends TeaModel {
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

        public static ListUserResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListUserResponseBodyModel self = new ListUserResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListUserResponseBodyModel setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUserResponseBodyModel setGmtCreateTime(Long gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListUserResponseBodyModel setGmtModifiedTime(Long gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public Long getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListUserResponseBodyModel setIsDeleteTag(String isDeleteTag) {
            this.isDeleteTag = isDeleteTag;
            return this;
        }
        public String getIsDeleteTag() {
            return this.isDeleteTag;
        }

        public ListUserResponseBodyModel setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public ListUserResponseBodyModel setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public ListUserResponseBodyModel setSspUserId(String sspUserId) {
            this.sspUserId = sspUserId;
            return this;
        }
        public String getSspUserId() {
            return this.sspUserId;
        }

        public ListUserResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListUserResponseBodyModel setTenantUserId(String tenantUserId) {
            this.tenantUserId = tenantUserId;
            return this;
        }
        public String getTenantUserId() {
            return this.tenantUserId;
        }

        public ListUserResponseBodyModel setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListUserResponseBodyModel setYunPersonsId(String yunPersonsId) {
            this.yunPersonsId = yunPersonsId;
            return this;
        }
        public String getYunPersonsId() {
            return this.yunPersonsId;
        }

        public ListUserResponseBodyModel setYunUid(String yunUid) {
            this.yunUid = yunUid;
            return this;
        }
        public String getYunUid() {
            return this.yunUid;
        }

    }

}
