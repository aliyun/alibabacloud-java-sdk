// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ChangeTenantUserStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ChangeTenantUserStatusResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ChangeTenantUserStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeTenantUserStatusResponseBody self = new ChangeTenantUserStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeTenantUserStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChangeTenantUserStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeTenantUserStatusResponseBody setModel(ChangeTenantUserStatusResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ChangeTenantUserStatusResponseBodyModel getModel() {
        return this.model;
    }

    public ChangeTenantUserStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeTenantUserStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChangeTenantUserStatusResponseBodyModel extends TeaModel {
        @NameInMap("Business")
        public String business;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("OriginSite")
        public String originSite;

        @NameInMap("OriginSiteUserId")
        public String originSiteUserId;

        @NameInMap("OriginSiteUserName")
        public String originSiteUserName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Version")
        public Long version;

        public static ChangeTenantUserStatusResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ChangeTenantUserStatusResponseBodyModel self = new ChangeTenantUserStatusResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ChangeTenantUserStatusResponseBodyModel setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public ChangeTenantUserStatusResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ChangeTenantUserStatusResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ChangeTenantUserStatusResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ChangeTenantUserStatusResponseBodyModel setOriginSite(String originSite) {
            this.originSite = originSite;
            return this;
        }
        public String getOriginSite() {
            return this.originSite;
        }

        public ChangeTenantUserStatusResponseBodyModel setOriginSiteUserId(String originSiteUserId) {
            this.originSiteUserId = originSiteUserId;
            return this;
        }
        public String getOriginSiteUserId() {
            return this.originSiteUserId;
        }

        public ChangeTenantUserStatusResponseBodyModel setOriginSiteUserName(String originSiteUserName) {
            this.originSiteUserName = originSiteUserName;
            return this;
        }
        public String getOriginSiteUserName() {
            return this.originSiteUserName;
        }

        public ChangeTenantUserStatusResponseBodyModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ChangeTenantUserStatusResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ChangeTenantUserStatusResponseBodyModel setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public ChangeTenantUserStatusResponseBodyModel setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ChangeTenantUserStatusResponseBodyModel setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ChangeTenantUserStatusResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
